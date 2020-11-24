package typings.maximMazurokGapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOslogin.anon.Accesstoken
import typings.maximMazurokGapiClientOslogin.anon.Alt
import typings.maximMazurokGapiClientOslogin.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SshPublicKeysResource extends js.Object {
  
  /** Deletes an SSH public key. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves an SSH public key. */
  def get(): Request[SshPublicKey] = js.native
  def get(request: Accesstoken): Request[SshPublicKey] = js.native
  
  /** Updates an SSH public key and returns the profile information. This method supports patch semantics. */
  def patch(request: Alt): Request[SshPublicKey] = js.native
  def patch(request: Callback, body: SshPublicKey): Request[SshPublicKey] = js.native
}
