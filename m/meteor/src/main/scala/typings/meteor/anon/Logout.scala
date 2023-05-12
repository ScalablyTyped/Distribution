package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logout extends StObject {
  
  var logout: js.UndefOr[Boolean] = js.undefined
}
object Logout {
  
  inline def apply(): Logout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logout] (val x: Self) extends AnyVal {
    
    inline def setLogout(value: Boolean): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
    
    inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
  }
}
