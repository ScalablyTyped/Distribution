package typings.openlayers.mod.interaction

import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.olx.interaction.DoubleClickZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Allows the user to zoom by double-clicking on the map.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DoubleClickZoom")
@js.native
/**
  * @classdesc
  * Allows the user to zoom by double-clicking on the map.
  *
  * @param opt_options Options.
  * @api stable
  */
class DoubleClickZoom () extends Interaction {
  def this(opt_options: DoubleClickZoomOptions) = this()
}
/* static members */
@JSImport("openlayers", "interaction.DoubleClickZoom")
@js.native
object DoubleClickZoom extends js.Object {
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
    * doubleclick) and eventually zooms the map.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = js.native
}
