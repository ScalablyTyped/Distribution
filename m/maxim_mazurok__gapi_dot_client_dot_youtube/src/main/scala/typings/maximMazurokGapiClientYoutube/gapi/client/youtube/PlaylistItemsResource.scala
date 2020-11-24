package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerPart
import typings.maximMazurokGapiClientYoutube.anon.PlaylistId
import typings.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typings.maximMazurokGapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItemsResource extends js.Object {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: OnBehalfOfContentOwnerPart): Request[PlaylistItem] = js.native
  def insert(request: PrettyPrint, body: PlaylistItem): Request[PlaylistItem] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[PlaylistItemListResponse] = js.native
  def list(request: PlaylistId): Request[PlaylistItemListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: OnBehalfOfContentOwnerPart): Request[PlaylistItem] = js.native
  def update(request: PrettyPrint, body: PlaylistItem): Request[PlaylistItem] = js.native
}
