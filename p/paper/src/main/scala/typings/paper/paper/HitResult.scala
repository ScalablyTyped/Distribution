package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.HitResult")
@js.native
class HitResult () extends Base {
  /**
    * If the HitResult has a type of 'pixel', this property refers to the color of the pixel on the Raster that was hit.
    */
  var color: Color = js.native
  /**
    * The item that was hit.
    */
  var item: Item = js.native
  /**
    * If the HitResult has a type of 'curve' or 'stroke', this property gives more information about the exact position that was hit on the path.
    */
  var location: CurveLocation = js.native
  /**
    * If the HitResult has a hitResult.type of 'bounds', this property describes which corner of the bounding rectangle was hit.
    * type String('top-left', 'top-right', 'bottom-left', 'bottom-right', 'left-center', 'top-center', 'right-center', 'bottom-center')
    */
  var name: String = js.native
  /**
    * Describes the actual coordinates of the segment, handle or bounding box corner that was hit
    */
  var point: Point = js.native
  /**
    * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or 'handle-out', this property refers to the segment that was hit or that is closest to the hitResult.location on the curve.
    */
  var segment: Segment = js.native
  /**
    * Describes the type of the hit result. For example, if you hit a segment point, the type would be 'segment'.
    * type String('segment', 'handle-in', 'handle-out', 'curve', 'stroke', 'fill', 'bounds', 'center', 'pixel')
    */
  var `type`: String = js.native
}

