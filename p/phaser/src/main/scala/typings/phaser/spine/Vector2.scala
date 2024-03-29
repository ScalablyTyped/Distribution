package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector2 extends StObject {
  
  def length(): Double
  
  def normalize(): this.type
  
  def set(x: Double, y: Double): Vector2
  
  var x: Double
  
  var y: Double
}
object Vector2 {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Vector2] (val x: Self) extends AnyVal {
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setNormalize(value: () => Vector2): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, Double) => Vector2): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
