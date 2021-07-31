package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logout extends StObject {
  
  var logout: js.UndefOr[js.Object] = js.undefined
}
object Logout {
  
  @scala.inline
  def apply(): Logout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logout]
  }
  
  @scala.inline
  implicit class LogoutMutableBuilder[Self <: Logout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogout(value: js.Object): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
  }
}
