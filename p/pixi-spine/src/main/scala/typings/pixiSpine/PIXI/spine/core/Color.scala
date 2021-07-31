package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var a: Double
  
  def add(r: Double, g: Double, b: Double, a: Double): this.type
  
  var b: Double
  
  def clamp(): this.type
  
  var g: Double
  
  var r: Double
  
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
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (Double, Double, Double, Double) => Color): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClamp(value: () => Color): Self = StObject.set(x, "clamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (Double, Double, Double, Double) => Color): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetFromColor(value: Color => Color): Self = StObject.set(x, "setFromColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFromString(value: String => Color): Self = StObject.set(x, "setFromString", js.Any.fromFunction1(value))
  }
}
