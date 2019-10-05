package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Color")
@js.native
class Color () extends js.Object {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  var a: Double = js.native
  var b: Double = js.native
  var g: Double = js.native
  var r: Double = js.native
  def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  def clamp(): this.type = js.native
  def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  def setFromColor(c: Color): this.type = js.native
  def setFromString(hex: String): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Color")
@js.native
object Color extends js.Object {
  var BLUE: Color = js.native
  var GREEN: Color = js.native
  var MAGENTA: Color = js.native
  var RED: Color = js.native
  var WHITE: Color = js.native
  def rgb888ToColor(color: Color, value: Double): Unit = js.native
  def rgba8888ToColor(color: Color, value: Double): Unit = js.native
}

