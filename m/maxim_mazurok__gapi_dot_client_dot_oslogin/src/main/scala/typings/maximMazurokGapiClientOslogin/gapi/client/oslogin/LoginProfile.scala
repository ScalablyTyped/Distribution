package typings.maximMazurokGapiClientOslogin.gapi.client.oslogin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginProfile extends js.Object {
  
  /** Required. A unique user ID. */
  var name: js.UndefOr[String] = js.native
  
  /** The list of POSIX accounts associated with the user. */
  var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.native
  
  /** A map from SSH public key fingerprint to the associated key object. */
  var sshPublicKeys: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
    */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile with TopLevel[js.Any]
  ] = js.native
}
object LoginProfile {
  
  @scala.inline
  def apply(): LoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginProfile]
  }
  
  @scala.inline
  implicit class LoginProfileOps[Self <: LoginProfile] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosixAccountsVarargs(value: PosixAccount*): Self = this.set("posixAccounts", js.Array(value :_*))
    
    @scala.inline
    def setPosixAccounts(value: js.Array[PosixAccount]): Self = this.set("posixAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixAccounts: Self = this.set("posixAccounts", js.undefined)
    
    @scala.inline
    def setSshPublicKeys(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
      */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile with TopLevel[js.Any]
    ): Self = this.set("sshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKeys: Self = this.set("sshPublicKeys", js.undefined)
  }
}
