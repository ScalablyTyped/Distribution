package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.FieldsHl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperChatEventsResource extends js.Object {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[SuperChatEventListResponse] = js.native
  def list(request: FieldsHl): Request[SuperChatEventListResponse] = js.native
}
