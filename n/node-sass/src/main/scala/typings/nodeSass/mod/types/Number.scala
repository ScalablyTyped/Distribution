package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends Value {
  
  def getUnit(): java.lang.String = js.native
  
  def getValue(): Double = js.native
  
  def setUnit(u: java.lang.String): Unit = js.native
  
  def setValue(n: Double): Unit = js.native
}
object Number {
  
  @JSImport("node-sass", "types.Number")
  @js.native
  val ^ : NumberConstructor = js.native
  
  @scala.inline
  implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUnit(value: () => java.lang.String): Self = StObject.set(x, "getUnit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUnit(value: java.lang.String => Unit): Self = StObject.set(x, "setUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
