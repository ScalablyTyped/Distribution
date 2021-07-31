package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.FieldsId
import typings.maximMazurokGapiClientYoutube.anon.Mine
import typings.maximMazurokGapiClientYoutube.anon.OauthtokenOnBehalfOfContentOwner
import typings.maximMazurokGapiClientYoutube.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStreamsResource extends StObject {
  
  /** Deletes an existing stream for the authenticated user. */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsId): Request[Unit] = js.native
  
  /** Inserts a new stream for the authenticated user. */
  def insert(request: OauthtokenOnBehalfOfContentOwner): Request[LiveStream] = js.native
  def insert(request: UploadType, body: LiveStream): Request[LiveStream] = js.native
  
  /** Retrieve the list of streams associated with the given channel. -- */
  def list(): Request[LiveStreamListResponse] = js.native
  def list(request: Mine): Request[LiveStreamListResponse] = js.native
  
  /** Updates an existing stream for the authenticated user. */
  def update(request: OauthtokenOnBehalfOfContentOwner): Request[LiveStream] = js.native
  def update(request: UploadType, body: LiveStream): Request[LiveStream] = js.native
}
