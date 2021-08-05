package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationCode extends StObject {
  
  /** The Authorization Code in ASCII. It can be used to transfer the domain to or from another registrar. */
  var code: js.UndefOr[String] = js.undefined
}
object AuthorizationCode {
  
  inline def apply(): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationCode]
  }
  
  extension [Self <: AuthorizationCode](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
