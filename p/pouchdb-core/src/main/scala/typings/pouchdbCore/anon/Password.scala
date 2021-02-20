package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Password extends StObject {
  
  var password: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Password {
  
  @scala.inline
  def apply(): Password = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Password]
  }
  
  @scala.inline
  implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
    
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
