package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerable extends StObject {
  
  def getLength(): Double
  
  def getValue(index: Double): Value
  
  def setValue(index: Double, value: Value): Unit
}
object Enumerable {
  
  inline def apply(getLength: () => Double, getValue: Double => Value, setValue: (Double, Value) => Unit): Enumerable = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[Enumerable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enumerable] (val x: Self) extends AnyVal {
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: Double => Value): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: (Double, Value) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
