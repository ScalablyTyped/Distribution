package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerConfiguration extends StObject {
  
  def get(name: String): String = js.native
  
  def list(): js.Any = js.native
  
  def set(key: String, value: String): String = js.native
}
object ServerConfiguration {
  
  @scala.inline
  def apply(get: String => String, list: () => js.Any, set: (String, String) => String): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ServerConfiguration]
  }
  
  @scala.inline
  implicit class ServerConfigurationMutableBuilder[Self <: ServerConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Any): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, String) => String): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
