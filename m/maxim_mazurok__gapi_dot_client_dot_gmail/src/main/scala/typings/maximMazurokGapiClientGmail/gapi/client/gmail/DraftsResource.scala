package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Accesstoken
import typings.maximMazurokGapiClientGmail.anon.Alt
import typings.maximMazurokGapiClientGmail.anon.Callback
import typings.maximMazurokGapiClientGmail.anon.Fields
import typings.maximMazurokGapiClientGmail.anon.Id
import typings.maximMazurokGapiClientGmail.anon.IncludeSpamTrash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraftsResource extends StObject {
  
  /** Creates a new draft with the `DRAFT` label. */
  def create(request: Accesstoken): Request[Draft] = js.native
  def create(request: Alt, body: Draft): Request[Draft] = js.native
  
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets the specified draft. */
  def get(): Request[Draft] = js.native
  def get(request: Fields): Request[Draft] = js.native
  
  /** Lists the drafts in the user's mailbox. */
  def list(): Request[ListDraftsResponse] = js.native
  def list(request: IncludeSpamTrash): Request[ListDraftsResponse] = js.native
  
  /** Sends the specified, existing draft to the recipients in the `To`, `Cc`, and `Bcc` headers. */
  def send(request: Accesstoken): Request[Message] = js.native
  def send(request: Alt, body: Draft): Request[Message] = js.native
  
  def update(request: Callback, body: Draft): Request[Draft] = js.native
  /** Replaces a draft's content. */
  def update(request: Id): Request[Draft] = js.native
}
