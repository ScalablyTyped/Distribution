package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfiguration extends StObject {
  
  def get(name: String): String
  
  def list(): Any
  
  def set(key: String, value: String): String
}
object ServerConfiguration {
  
  inline def apply(get: String => String, list: () => Any, set: (String, String) => String): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ServerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setList(value: () => Any): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    inline def setSet(value: (String, String) => String): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
