package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ODatabaseSessionOptions extends StObject {
  
  var name: String
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ODatabaseSessionOptions {
  
  @scala.inline
  def apply(name: String): ODatabaseSessionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODatabaseSessionOptions]
  }
  
  @scala.inline
  implicit class ODatabaseSessionOptionsMutableBuilder[Self <: ODatabaseSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
