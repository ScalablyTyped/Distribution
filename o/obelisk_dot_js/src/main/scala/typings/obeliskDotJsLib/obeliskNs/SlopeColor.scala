package typings
package obeliskDotJsLib.obeliskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("obelisk.SlopeColor")
@js.native
class SlopeColor protected () extends AbstractColor {
  def this(border: js.UndefOr[scala.Double], borderHighlight: js.UndefOr[scala.Double], left: js.UndefOr[scala.Double], right: js.UndefOr[scala.Double], leftSlope: js.UndefOr[scala.Double], rightSlope: js.UndefOr[scala.Double]) = this()
  var BRIGHTNESS_GAIN: scala.Double = js.native
  def getByHorizontalColor(horizontal: scala.Double): SlopeColor = js.native
}

