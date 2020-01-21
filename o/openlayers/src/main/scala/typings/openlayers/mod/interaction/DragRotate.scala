package typings.openlayers.mod.interaction

import typings.openlayers.mod.olx.interaction.DragRotateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to rotate the map by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the alt and shift keys are held down.
  *
  * This interaction is only supported for mouse devices.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragRotate")
@js.native
/**
  * @classdesc
  * Allows the user to rotate the map by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the alt and shift keys are held down.
  *
  * This interaction is only supported for mouse devices.
  *
  * @param opt_options Options.
  * @api stable
  */
class DragRotate () extends Pointer {
  def this(opt_options: DragRotateOptions) = this()
}

