package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  
  var a: Double = js.native
  
  def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  var b: Double = js.native
  
  def clamp(): this.type = js.native
  
  var g: Double = js.native
  
  var r: Double = js.native
  
  def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  def setFromColor(c: Color): this.type = js.native
  
  def setFromString(hex: String): this.type = js.native
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
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (Double, Double, Double, Double) => Color): Self = this.set("add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClamp(value: () => Color): Self = this.set("clamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (Double, Double, Double, Double) => Color): Self = this.set("set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetFromColor(value: Color => Color): Self = this.set("setFromColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFromString(value: String => Color): Self = this.set("setFromString", js.Any.fromFunction1(value))
  }
}
