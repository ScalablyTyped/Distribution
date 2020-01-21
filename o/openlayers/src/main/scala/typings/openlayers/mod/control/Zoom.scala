package typings.openlayers.mod.control

import typings.openlayers.mod.olx.control.ZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A control with 2 buttons, one for zoom in and one for zoom out.
  * This control is one of the default controls of a map. To style this control
  * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
  *
  * @param opt_options Zoom options.
  * @api stable
  */
@JSImport("openlayers", "control.Zoom")
@js.native
/**
  * @classdesc
  * A control with 2 buttons, one for zoom in and one for zoom out.
  * This control is one of the default controls of a map. To style this control
  * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
  *
  * @param opt_options Zoom options.
  * @api stable
  */
class Zoom () extends Control {
  def this(opt_options: ZoomOptions) = this()
}

