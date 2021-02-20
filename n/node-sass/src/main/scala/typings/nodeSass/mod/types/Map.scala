package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends Value
     with Enumerable {
  
  def getKey(index: Double): Value = js.native
  
  def setKey(index: Double, key: Value): Unit = js.native
}
object Map {
  
  @JSImport("node-sass", "types.Map")
  @js.native
  val ^ : MapConstructor = js.native
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetKey(value: Double => Value): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKey(value: (Double, Value) => Unit): Self = StObject.set(x, "setKey", js.Any.fromFunction2(value))
  }
}
