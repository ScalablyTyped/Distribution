package typings.openlayers.openlayersMod.control

import typings.openlayers.openlayersMod.MapEvent
import typings.openlayers.openlayersMod.olx.control.RotateOptions
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
@JSImport("openlayers", "control.Rotate")
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
class Rotate () extends Control {
  def this(opt_options: RotateOptions) = this()
}

/* static members */
@JSImport("openlayers", "control.Rotate")
@js.native
object Rotate extends js.Object {
  /**
    * Update the rotate control element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: MapEvent): Unit = js.native
}

