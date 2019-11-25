package typings.openlayers.openlayersMod.style

import typings.openlayers.openlayersMod.olx.style.CircleOptions
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set circle style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Circle")
@js.native
/**
  * @classdesc
  * Set circle style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
class Circle ()
  extends typings.openlayers.openlayersMod.style.Image {
  def this(opt_options: CircleOptions) = this()
  /**
    * Get the fill style for the circle.
    * @return Fill style.
    * @api
    */
  def getFill(): Fill = js.native
  /**
    * Get the image used to render the circle.
    * @param pixelRatio Pixel ratio.
    * @return Canvas element.
    * @api
    */
  def getImage(pixelRatio: Double): HTMLCanvasElement = js.native
  /**
    * Get the circle radius.
    * @return Radius.
    * @api
    */
  def getRadius(): Double = js.native
  /**
    * Get the stroke style for the circle.
    * @return Stroke style.
    * @api
    */
  def getStroke(): Stroke = js.native
  /**
    * Set the circle radius.
    *
    * @param radius Circle radius.
    * @api
    */
  def setRadius(radius: Double): Unit = js.native
}

