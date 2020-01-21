package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "ColorGeom")
@js.native
class ColorGeom () extends js.Object

/* static members */
@JSImport("obelisk.js", "ColorGeom")
@js.native
object ColorGeom extends js.Object {
  def applyBrightness(color: Double, brightness: Double): Double = js.native
  def applyBrightness(color: Double, brightness: Double, highlight: Boolean): Double = js.native
  def get32(color: Double): Double = js.native
}

