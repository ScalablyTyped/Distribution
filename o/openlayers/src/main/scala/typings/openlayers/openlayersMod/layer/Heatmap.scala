package typings.openlayers.openlayersMod.layer

import typings.openlayers.openlayersMod.olx.layer.HeatmapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer for rendering vector data as a heatmap.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "layer.Heatmap")
@js.native
/**
  * @classdesc
  * Layer for rendering vector data as a heatmap.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api
  */
class Heatmap () extends Vector {
  def this(opt_options: HeatmapOptions) = this()
  /**
    * Return the blur size in pixels.
    * @return Blur size in pixels.
    * @api
    * @observable
    */
  def getBlur(): Double = js.native
  /**
    * Return the gradient colors as array of strings.
    * @return Colors.
    * @api
    * @observable
    */
  def getGradient(): js.Array[String] = js.native
  /**
    * Return the size of the radius in pixels.
    * @return Radius size in pixel.
    * @api
    * @observable
    */
  def getRadius(): Double = js.native
  /**
    * Set the blur size in pixels.
    * @param blur Blur size in pixels.
    * @api
    * @observable
    */
  def setBlur(blur: Double): Unit = js.native
  /**
    * Set the gradient colors as array of strings.
    * @param colors Gradient.
    * @api
    * @observable
    */
  def setGradient(colors: js.Array[String]): Unit = js.native
  /**
    * Set the size of the radius in pixels.
    * @param radius Radius size in pixel.
    * @api
    * @observable
    */
  def setRadius(radius: Double): Unit = js.native
}

