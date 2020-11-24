package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOobConfirmationCodeResponse extends js.Object {
  
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
  implicit class GetOobConfirmationCodeResponseOps[Self <: GetOobConfirmationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = this.set("oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOobCode: Self = this.set("oobCode", js.undefined)
  }
}
