package typings
package olLib.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to draw a vector box by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the shift or other key is held down. This is used, for example,
  * for zooming to a specific area of the map
  * (see {@link ol.interaction.DragZoom} and
  * {@link ol.interaction.DragRotateAndZoom}).
  *
  * This interaction is only supported for mouse devices.
  *
  * @fires ol.DragBoxEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/DragBox", JSImport.Default)
@js.native
/**
  * @classdesc
  * Allows the user to draw a vector box by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the shift or other key is held down. This is used, for example,
  * for zooming to a specific area of the map
  * (see {@link ol.interaction.DragZoom} and
  * {@link ol.interaction.DragRotateAndZoom}).
  *
  * This interaction is only supported for mouse devices.
  *
  * @fires ol.DragBoxEvent
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.DragBox {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragBoxOptions) = this()
}

