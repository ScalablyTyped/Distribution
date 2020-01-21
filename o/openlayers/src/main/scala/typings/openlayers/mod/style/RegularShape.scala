package typings.openlayers.mod.style

import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.style.RegularShapeOptions
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set regular shape style for vector features. The resulting shape will be
  * a regular polygon when `radius` is provided, or a star when `radius1` and
  * `radius2` are provided.
  *
  * @param options Options.
  * @api
  */
@JSImport("openlayers", "style.RegularShape")
@js.native
class RegularShape protected () extends Image {
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    *
    * @param options Options.
    * @api
    */
  def this(options: RegularShapeOptions) = this()
  /**
    * @inheritDoc
    * @api
    */
  def getAnchor(): js.Array[Double] = js.native
  /**
    * Get the angle used in generating the shape.
    * @return Shape's rotation in radians.
    * @api
    */
  def getAngle(): Double = js.native
  /**
    * Get the fill style for the shape.
    * @return Fill style.
    * @api
    */
  def getFill(): Fill = js.native
  /**
    * @inheritDoc
    * @api
    */
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | Image = js.native
  /**
    * @inheritDoc
    * @api
    */
  def getOrigin(): js.Array[Double] = js.native
  /**
    * Get the number of points for generating the shape.
    * @return Number of points for stars and regular polygons.
    * @api
    */
  def getPoints(): Double = js.native
  /**
    * Get the (primary) radius for the shape.
    * @return Radius.
    * @api
    */
  def getRadius(): Double = js.native
  /**
    * Get the secondary radius for the shape.
    * @return Radius2.
    * @api
    */
  def getRadius2(): Double = js.native
  /**
    * @inheritDoc
    * @api
    */
  def getSize(): Size = js.native
  /**
    * Get the stroke style for the shape.
    * @return Stroke style.
    * @api
    */
  def getStroke(): Stroke = js.native
}

