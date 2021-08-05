package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  var configurable: Boolean
  
  var enumerable: Boolean
  
  def get(): Unit
  
  def set(v: js.Any): Unit
}
object Set {
  
  inline def apply(configurable: Boolean, enumerable: Boolean, get: () => Unit, set: js.Any => Unit): Set = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setGet(value: () => Unit): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
