package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.Callback
import typings.maximMazurokGapiClientGmail.anon.FieldsId
import typings.maximMazurokGapiClientGmail.anon.Format
import typings.maximMazurokGapiClientGmail.anon.LabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadsResource extends js.Object {
  
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer `threads.trash` instead. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets the specified thread. */
  def get(): Request[Thread] = js.native
  def get(request: Format): Request[Thread] = js.native
  
  /** Lists the threads in the user's mailbox. */
  def list(): Request[ListThreadsResponse] = js.native
  def list(request: LabelIds): Request[ListThreadsResponse] = js.native
  
  def modify(request: Callback, body: ModifyThreadRequest): Request[Thread] = js.native
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: FieldsId): Request[Thread] = js.native
  
  /** Moves the specified thread to the trash. */
  def trash(): Request[Thread] = js.native
  def trash(request: Callback): Request[Thread] = js.native
  
  /** Removes the specified thread from the trash. */
  def untrash(): Request[Thread] = js.native
  def untrash(request: Callback): Request[Thread] = js.native
}
