package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthentication extends StObject {
  
  /** The password to use when authenticating with the HTTP server. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The username to use when authenticating with the HTTP server. */
  var username: js.UndefOr[String] = js.undefined
}
object BasicAuthentication {
  
  inline def apply(): BasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicAuthentication] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
