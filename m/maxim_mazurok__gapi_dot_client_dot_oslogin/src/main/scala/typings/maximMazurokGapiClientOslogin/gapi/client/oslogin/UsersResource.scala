package typings.maximMazurokGapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOslogin.anon.Fields
import typings.maximMazurokGapiClientOslogin.anon.Key
import typings.maximMazurokGapiClientOslogin.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends js.Object {
  
  /** Retrieves the profile information used for logging in to a virtual machine on Google Compute Engine. */
  def getLoginProfile(): Request[LoginProfile] = js.native
  def getLoginProfile(request: Fields): Request[LoginProfile] = js.native
  
  /** Adds an SSH public key and returns the profile information. Default POSIX account information is set when no username and UID exist as part of the login profile. */
  def importSshPublicKey(request: Key): Request[ImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(request: Oauthtoken, body: SshPublicKey): Request[ImportSshPublicKeyResponse] = js.native
  
  var projects: ProjectsResource = js.native
  
  var sshPublicKeys: SshPublicKeysResource = js.native
}
