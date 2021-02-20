package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Alt
import typings.maximMazurokGapiClientYoutube.anon.PageToken
import typings.maximMazurokGapiClientYoutube.anon.PartPrettyPrint
import typings.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatModeratorsResource extends StObject {
  
  /** Deletes a chat moderator. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatModerator): Request[LiveChatModerator] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: PartPrettyPrint): Request[LiveChatModerator] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[LiveChatModeratorListResponse] = js.native
  def list(request: PageToken): Request[LiveChatModeratorListResponse] = js.native
}
