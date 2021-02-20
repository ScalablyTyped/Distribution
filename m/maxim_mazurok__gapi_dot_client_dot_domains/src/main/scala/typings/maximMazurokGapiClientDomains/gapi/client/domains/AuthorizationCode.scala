package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCode extends StObject {
  
  /** The Authorization Code in ASCII. It can be used to transfer the domain to or from another registrar. */
  var code: js.UndefOr[String] = js.native
}
object AuthorizationCode {
  
  @scala.inline
  def apply(): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationCode]
  }
  
  @scala.inline
  implicit class AuthorizationCodeMutableBuilder[Self <: AuthorizationCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
