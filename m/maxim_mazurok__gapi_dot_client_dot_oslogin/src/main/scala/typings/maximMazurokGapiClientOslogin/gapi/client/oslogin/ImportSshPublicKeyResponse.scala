package typings.maximMazurokGapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSshPublicKeyResponse extends js.Object {
  
  /** Detailed information about import results. */
  var details: js.UndefOr[String] = js.native
  
  /** The login profile information for the user. */
  var loginProfile: js.UndefOr[LoginProfile] = js.native
}
object ImportSshPublicKeyResponse {
  
  @scala.inline
  def apply(): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
  
  @scala.inline
  implicit class ImportSshPublicKeyResponseOps[Self <: ImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setLoginProfile(value: LoginProfile): Self = this.set("loginProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginProfile: Self = this.set("loginProfile", js.undefined)
  }
}
