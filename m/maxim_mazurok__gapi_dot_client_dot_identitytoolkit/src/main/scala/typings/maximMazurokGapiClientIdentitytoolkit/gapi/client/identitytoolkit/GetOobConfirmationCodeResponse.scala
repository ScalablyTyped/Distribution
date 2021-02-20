package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOobConfirmationCodeResponse extends StObject {
  
  /** The email address that the email is sent to. */
  var email: js.UndefOr[String] = js.native
  
  /** The fixed string "identitytoolkit#GetOobConfirmationCodeResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The code to be send to the user. */
  var oobCode: js.UndefOr[String] = js.native
}
object GetOobConfirmationCodeResponse {
  
  @scala.inline
  def apply(): GetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOobConfirmationCodeResponse]
  }
  
  @scala.inline
  implicit class GetOobConfirmationCodeResponseMutableBuilder[Self <: GetOobConfirmationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
