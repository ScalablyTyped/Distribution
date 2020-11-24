package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.MessageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsResource extends js.Object {
  
  /** Gets the specified message attachment. */
  def get(): Request[MessagePartBody] = js.native
  def get(request: MessageId): Request[MessagePartBody] = js.native
}
