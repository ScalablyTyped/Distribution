package typings.openlayers.mod.interaction

import typings.openlayers.mod.olx.interaction.DragZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Allows the user to zoom the map by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when a key, shift by default, is held down.
  *
  * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
  * your custom one configured with `className`.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragZoom")
@js.native
/**
  * @classdesc
  * Allows the user to zoom the map by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when a key, shift by default, is held down.
  *
  * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
  * your custom one configured with `className`.
  *
  * @param opt_options Options.
  * @api stable
  */
class DragZoom () extends DragBox {
  def this(opt_options: DragZoomOptions) = this()
}
