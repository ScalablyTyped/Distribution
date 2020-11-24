package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Mockjs.Random - Color
// see https://github.com/nuysoft/Mock/wiki/Color
@js.native
trait MockjsRandomColor extends js.Object {
  
  // Random.color
  def color(): S = js.native
  
  // Random.hex
  def hex(): S = js.native
  
  // Random.hsl
  def hsl(): S = js.native
  
  // Random.rgb
  def rgb(): S = js.native
  
  // Random.rgba
  def rgba(): S = js.native
}
object MockjsRandomColor {
  
  @scala.inline
  def apply(color: () => S, hex: () => S, hsl: () => S, rgb: () => S, rgba: () => S): MockjsRandomColor = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), hex = js.Any.fromFunction0(hex), hsl = js.Any.fromFunction0(hsl), rgb = js.Any.fromFunction0(rgb), rgba = js.Any.fromFunction0(rgba))
    __obj.asInstanceOf[MockjsRandomColor]
  }
  
  @scala.inline
  implicit class MockjsRandomColorOps[Self <: MockjsRandomColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: () => S): Self = this.set("color", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHex(value: () => S): Self = this.set("hex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHsl(value: () => S): Self = this.set("hsl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRgb(value: () => S): Self = this.set("rgb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRgba(value: () => S): Self = this.set("rgba", js.Any.fromFunction0(value))
  }
}
