package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Color")
@js.native
class Color () extends js.Object {
  def this(r: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double, b: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double) = this()
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var g: scala.Double = js.native
  var r: scala.Double = js.native
  def add(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): this.type = js.native
  def clamp(): this.type = js.native
  def set(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): this.type = js.native
  def setFromColor(c: Color): this.type = js.native
  def setFromString(hex: java.lang.String): this.type = js.native
}

@JSGlobal("PIXI.spine.core.Color")
@js.native
object Color extends js.Object {
  var BLUE: pixiDashSpineLib.PIXINs.spineNs.coreNs.Color = js.native
  var GREEN: pixiDashSpineLib.PIXINs.spineNs.coreNs.Color = js.native
  var MAGENTA: pixiDashSpineLib.PIXINs.spineNs.coreNs.Color = js.native
  var RED: pixiDashSpineLib.PIXINs.spineNs.coreNs.Color = js.native
  var WHITE: pixiDashSpineLib.PIXINs.spineNs.coreNs.Color = js.native
}

