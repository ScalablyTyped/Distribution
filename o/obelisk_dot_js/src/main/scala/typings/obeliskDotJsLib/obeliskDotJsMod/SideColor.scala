package typings
package obeliskDotJsLib.obeliskDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "SideColor")
@js.native
class SideColor () extends AbstractColor {
  def this(border: scala.Double) = this()
  def this(border: scala.Double, inner: scala.Double) = this()
  var BRIGHTNESS_GAIN: scala.Double = js.native
  def getByInnerColor(inner: scala.Double): SideColor = js.native
}

