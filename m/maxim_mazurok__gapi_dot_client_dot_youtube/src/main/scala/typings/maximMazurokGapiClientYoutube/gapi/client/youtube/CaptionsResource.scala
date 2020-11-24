package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Fields
import typings.maximMazurokGapiClientYoutube.anon.Id
import typings.maximMazurokGapiClientYoutube.anon.Key
import typings.maximMazurokGapiClientYoutube.anon.Oauthtoken
import typings.maximMazurokGapiClientYoutube.anon.OnBehalfOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionsResource extends js.Object {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: Fields): Request[Unit] = js.native
  
  /** Downloads a caption track. */
  def download(): Request[Unit] = js.native
  def download(request: Id): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: Key): Request[Caption] = js.native
  def insert(request: Oauthtoken, body: Caption): Request[Caption] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[CaptionListResponse] = js.native
  def list(request: OnBehalfOf): Request[CaptionListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: Key): Request[Caption] = js.native
  def update(request: Oauthtoken, body: Caption): Request[Caption] = js.native
}
