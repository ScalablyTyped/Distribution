package typings.mockjs.mockjsMod

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
  def apply(color: () => S, hex: () => S, hsl: () => S, rgb: () => S, rgba: () => S): MockjsRandomColor = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), hex = js.Any.fromFunction0(hex), hsl = js.Any.fromFunction0(hsl), rgb = js.Any.fromFunction0(rgb), rgba = js.Any.fromFunction0(rgba))
  
    __obj.asInstanceOf[MockjsRandomColor]
  }
}

