package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.Callback
import typings.maximMazurokGapiClientGmail.anon.Key
import typings.maximMazurokGapiClientGmail.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsResource extends StObject {
  
  def create(request: Alt, body: Label): Request[Label] = js.native
  /** Creates a new label. */
  def create(request: Key): Request[Label] = js.native
  
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets the specified label. */
  def get(): Request[Label] = js.native
  def get(request: Callback): Request[Label] = js.native
  
  /** Lists all labels in the user's mailbox. */
  def list(): Request[ListLabelsResponse] = js.native
  def list(request: Alt): Request[ListLabelsResponse] = js.native
  
  def patch(request: Callback, body: Label): Request[Label] = js.native
  /** Patch the specified label. */
  def patch(request: Oauthtoken): Request[Label] = js.native
  
  def update(request: Callback, body: Label): Request[Label] = js.native
  /** Updates the specified label. */
  def update(request: Oauthtoken): Request[Label] = js.native
}
