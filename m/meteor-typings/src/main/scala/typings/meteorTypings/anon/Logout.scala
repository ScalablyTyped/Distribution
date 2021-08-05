package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logout extends StObject {
  
  var logout: js.UndefOr[js.Object] = js.undefined
}
object Logout {
  
  inline def apply(): Logout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logout]
  }
  
  extension [Self <: Logout](x: Self) {
    
    inline def setLogout(value: js.Object): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
    
    inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
  }
}
