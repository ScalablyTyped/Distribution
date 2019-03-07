package typings
package olLib.controlZoomSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A slider type of control for zooming.
  *
  * Example:
  *
  *     map.addControl(new ol.control.ZoomSlider());
  *
  * @param opt_options Zoom slider options.
  * @api stable
  */
@JSImport("ol/control/ZoomSlider", JSImport.Default)
@js.native
/**
  * @classdesc
  * A slider type of control for zooming.
  *
  * Example:
  *
  *     map.addControl(new ol.control.ZoomSlider());
  *
  * @param opt_options Zoom slider options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.controlNs.ZoomSlider {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomSliderOptions) = this()
}

/* static members */
@JSImport("ol/control/ZoomSlider", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Update the zoomslider element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}

