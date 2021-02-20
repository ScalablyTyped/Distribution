package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector2 extends StObject {
  
  def length(): Double = js.native
  
  def normalize(): this.type = js.native
  
  def set(x: Double, y: Double): Vector2 = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Vector2 {
  
  @scala.inline
  def apply(
    length: () => Double,
    normalize: () => Vector2,
    set: (Double, Double) => Vector2,
    x: Double,
    y: Double
  ): Vector2 = {
    val __obj = js.Dynamic.literal(length = js.Any.fromFunction0(length), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction2(set), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2]
  }
  
  @scala.inline
  implicit class Vector2MutableBuilder[Self <: Vector2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalize(value: () => Vector2): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double) => Vector2): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
