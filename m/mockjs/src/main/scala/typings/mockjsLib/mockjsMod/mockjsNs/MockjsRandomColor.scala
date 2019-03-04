package typings
package mockjsLib.mockjsMod.mockjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Color
// see https://github.com/nuysoft/Mock/wiki/Color
trait MockjsRandomColor extends js.Object {
  // Random.color
  def color(): S
  // Random.hex
  def hex(): S
  // Random.hsl
  def hsl(): S
  // Random.rgb
  def rgb(): S
  // Random.rgba
  def rgba(): S
}

object MockjsRandomColor {
  @scala.inline
  def apply(
    color: js.Function0[S],
    hex: js.Function0[S],
    hsl: js.Function0[S],
    rgb: js.Function0[S],
    rgba: js.Function0[S]
  ): MockjsRandomColor = {
    val __obj = js.Dynamic.literal(color = color, hex = hex, hsl = hsl, rgb = rgb, rgba = rgba)
  
    __obj.asInstanceOf[MockjsRandomColor]
  }
}

