package typings.openlayers.mod.interaction

import typings.openlayers.mod.olx.interaction.DragRotateAndZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Allows the user to zoom and rotate the map by clicking and dragging
  * on the map.  By default, this interaction is limited to when the shift
  * key is held down.
  *
  * This interaction is only supported for mouse devices.
  *
  * And this interaction is not included in the default interactions.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragRotateAndZoom")
@js.native
/**
  * @classdesc
  * Allows the user to zoom and rotate the map by clicking and dragging
  * on the map.  By default, this interaction is limited to when the shift
  * key is held down.
  *
  * This interaction is only supported for mouse devices.
  *
  * And this interaction is not included in the default interactions.
  *
  * @param opt_options Options.
  * @api stable
  */
class DragRotateAndZoom () extends Pointer {
  def this(opt_options: DragRotateAndZoomOptions) = this()
}
