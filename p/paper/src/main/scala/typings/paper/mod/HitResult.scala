package typings.paper.mod

import typings.paper.paper.Color
import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "HitResult")
@js.native
class HitResult ()
  extends typings.paper.paper.HitResult {
  /** 
    * If the HitResult has a type of 'pixel', this property refers to the color
    * of the pixel on the {@link Raster} that was hit.
    */
  /* CompleteClass */
  override var color: Color | Null = js.native
  /** 
    * The item that was hit.
    */
  /* CompleteClass */
  override var item: typings.paper.paper.Item = js.native
  /** 
    * If the HitResult has a type of 'curve' or 'stroke', this property gives
    * more information about the exact position that was hit on the path.
    */
  /* CompleteClass */
  override var location: typings.paper.paper.CurveLocation = js.native
  /** 
    * If the HitResult has a {@link HitResult#type} of `'bounds'`, this
    * property describes which corner of the bounding rectangle was hit.
    */
  /* CompleteClass */
  override var name: String = js.native
  /** 
    * Describes the actual coordinates of the segment, handle or bounding box
    * corner that was hit.
    */
  /* CompleteClass */
  override var point: Point = js.native
  /** 
    * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or
    * 'handle-out', this property refers to the segment that was hit or that
    * is closest to the hitResult.location on the curve.
    */
  /* CompleteClass */
  override var segment: typings.paper.paper.Segment = js.native
  /** 
    * Describes the type of the hit result. For example, if you hit a segment
    * point, the type would be `'segment'`.
    */
  /* CompleteClass */
  override var `type`: String = js.native
}

