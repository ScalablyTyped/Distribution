package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Color")
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

/* static members */
@JSGlobal("spine.Color")
@js.native
object Color extends js.Object {
  var BLUE: phaserLib.spineNs.Color = js.native
  var GREEN: phaserLib.spineNs.Color = js.native
  var MAGENTA: phaserLib.spineNs.Color = js.native
  var RED: phaserLib.spineNs.Color = js.native
  var WHITE: phaserLib.spineNs.Color = js.native
}

