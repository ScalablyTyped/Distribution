package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var a: Double
  var b: Double
  var g: Double
  var r: Double
  def add(r: Double, g: Double, b: Double, a: Double): this.type
  def clamp(): this.type
  def set(r: Double, g: Double, b: Double, a: Double): this.type
  def setFromColor(c: Color): this.type
  def setFromString(hex: String): this.type
}

object Color {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double, Double) => Color,
    b: Double,
    clamp: () => Color,
    g: Double,
    r: Double,
    set: (Double, Double, Double, Double) => Color,
    setFromColor: Color => Color,
    setFromString: String => Color
  ): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction4(add), b = b.asInstanceOf[js.Any], clamp = js.Any.fromFunction0(clamp), g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], set = js.Any.fromFunction4(set), setFromColor = js.Any.fromFunction1(setFromColor), setFromString = js.Any.fromFunction1(setFromString))
    __obj.asInstanceOf[Color]
  }
}

