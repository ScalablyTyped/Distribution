package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthentication
  extends StObject
     with ApiAuthenticationConfigurationBase {
  
  // The password. It is not returned in the responses.
  var password: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The username.
  var username: js.UndefOr[NullableOption[String]] = js.undefined
}
object BasicAuthentication {
  
  inline def apply(): BasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAuthentication]
  }
  
  extension [Self <: BasicAuthentication](x: Self) {
    
    inline def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: NullableOption[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
