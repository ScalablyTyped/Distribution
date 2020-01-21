package typings.openlayers.mod.interaction

import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.olx.interaction.MouseWheelZoomOptions
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
@JSImport("openlayers", "interaction.MouseWheelZoom")
@js.native
/**
  * @classdesc
  * Allows the user to zoom the map by scrolling the mouse wheel.
  *
  * @param opt_options Options.
  * @api stable
  */
class MouseWheelZoom () extends Interaction {
  def this(opt_options: MouseWheelZoomOptions) = this()
  /**
    * Enable or disable using the mouse's location as an anchor when zooming
    * @param useAnchor true to zoom to the mouse's location, false
    * to zoom to the center of the map
    * @api
    */
  def setMouseAnchor(useAnchor: Boolean): Unit = js.native
}

/* static members */
@JSImport("openlayers", "interaction.MouseWheelZoom")
@js.native
object MouseWheelZoom extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
    * mousewheel-event) and eventually zooms the map.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = js.native
}

