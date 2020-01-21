package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "SideColor")
@js.native
class SideColor () extends AbstractColor {
  def this(border: Double) = this()
  def this(border: Double, inner: Double) = this()
  var BRIGHTNESS_GAIN: Double = js.native
  def getByInnerColor(inner: Double): SideColor = js.native
}

