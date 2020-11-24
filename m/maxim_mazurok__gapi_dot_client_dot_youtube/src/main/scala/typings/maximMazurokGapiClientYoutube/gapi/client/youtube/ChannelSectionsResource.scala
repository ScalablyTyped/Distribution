package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Hl
import typings.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typings.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typings.maximMazurokGapiClientYoutube.anon.QuotaUser
import typings.maximMazurokGapiClientYoutube.anon.Resource
import typings.maximMazurokGapiClientYoutube.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSectionsResource extends js.Object {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[ChannelSection] = js.native
  def insert(request: UploadType, body: ChannelSection): Request[ChannelSection] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ChannelSectionListResponse] = js.native
  def list(request: Hl): Request[ChannelSectionListResponse] = js.native
  
  def update(request: PrettyPrint, body: ChannelSection): Request[ChannelSection] = js.native
  /** Updates an existing resource. */
  def update(request: Resource): Request[ChannelSection] = js.native
}
