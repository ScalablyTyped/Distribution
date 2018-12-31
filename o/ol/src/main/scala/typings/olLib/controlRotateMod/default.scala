package typings
package olLib.controlRotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A button control to reset rotation to 0.
  * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
  * selector is added to the button when the rotation is 0.
  *
  * @param opt_options Rotate options.
  * @api stable
  */
@JSImport("ol/control/rotate", JSImport.Default)
@js.native
/**
  * @classdesc
  * A button control to reset rotation to 0.
  * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
  * selector is added to the button when the rotation is 0.
  *
  * @param opt_options Rotate options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.controlNs.Rotate {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.RotateOptions) = this()
}

/**
  * @classdesc
  * A button control to reset rotation to 0.
  * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
  * selector is added to the button when the rotation is 0.
  *
  * @param opt_options Rotate options.
  * @api stable
  */
@JSImport("ol/control/rotate", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Update the rotate control element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}

