package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  var configurable: Boolean
  
  var enumerable: Boolean
  
  def get(): js.Any
  
  def set(): Unit
  @JSName("set")
  var set_Original: js.Function0[Unit]
}
object Get {
  
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, get: () => js.Any, set: () => Unit): Get = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction0(set))
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: () => Unit): Self = StObject.set(x, "set", js.Any.fromFunction0(value))
  }
}
