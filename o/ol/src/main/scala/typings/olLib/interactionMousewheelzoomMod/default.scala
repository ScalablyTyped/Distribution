package typings
package olLib.interactionMousewheelzoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to zoom the map by scrolling the mouse wheel.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/mousewheelzoom", JSImport.Default)
@js.native
/**
  * @classdesc
  * Allows the user to zoom the map by scrolling the mouse wheel.
  *
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.MouseWheelZoom {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.MouseWheelZoomOptions) = this()
}

/**
  * @classdesc
  * Allows the user to zoom the map by scrolling the mouse wheel.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/mousewheelzoom", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
    * mousewheel-event) and eventually zooms the map.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
}

