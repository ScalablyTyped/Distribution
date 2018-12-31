package typings
package olLib.controlMousepositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A control to show the 2D coordinates of the mouse cursor. By default, these
  * are in the view projection, but can be in any supported projection.
  * By default the control is shown in the top right corner of the map, but this
  * can be changed by using the css selector `.ol-mouse-position`.
  *
  * @param opt_options Mouse position
  *     options.
  * @api stable
  */
@JSImport("ol/control/mouseposition", JSImport.Default)
@js.native
/**
  * @classdesc
  * A control to show the 2D coordinates of the mouse cursor. By default, these
  * are in the view projection, but can be in any supported projection.
  * By default the control is shown in the top right corner of the map, but this
  * can be changed by using the css selector `.ol-mouse-position`.
  *
  * @param opt_options Mouse position
  *     options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.controlNs.MousePosition {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.MousePositionOptions) = this()
}

/**
  * @classdesc
  * A control to show the 2D coordinates of the mouse cursor. By default, these
  * are in the view projection, but can be in any supported projection.
  * By default the control is shown in the top right corner of the map, but this
  * can be changed by using the css selector `.ol-mouse-position`.
  *
  * @param opt_options Mouse position
  *     options.
  * @api stable
  */
@JSImport("ol/control/mouseposition", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Update the mouseposition element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}

