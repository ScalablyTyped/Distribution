package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number
  extends StObject
     with Value {
  
  def getUnit(): java.lang.String
  
  def getValue(): Double
  
  def setUnit(u: java.lang.String): Unit
  
  def setValue(n: Double): Unit
}
object Number {
  
  @JSImport("node-sass", "types.Number")
  @js.native
  val ^ : NumberConstructor = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    inline def setGetUnit(value: () => java.lang.String): Self = StObject.set(x, "getUnit", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetUnit(value: java.lang.String => Unit): Self = StObject.set(x, "setUnit", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
