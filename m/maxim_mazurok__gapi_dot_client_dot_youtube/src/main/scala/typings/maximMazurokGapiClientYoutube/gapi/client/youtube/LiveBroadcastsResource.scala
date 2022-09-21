package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.AltBroadcastStatus
import typings.maximMazurokGapiClientYoutube.anon.BroadcastStatus
import typings.maximMazurokGapiClientYoutube.anon.FieldsId
import typings.maximMazurokGapiClientYoutube.anon.FieldsKey
import typings.maximMazurokGapiClientYoutube.anon.IdKey
import typings.maximMazurokGapiClientYoutube.anon.KeyOauthtoken
import typings.maximMazurokGapiClientYoutube.anon.StreamId
import typings.maximMazurokGapiClientYoutube.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastsResource extends StObject {
  
  /** Bind a broadcast to a stream. */
  def bind(): Request[LiveBroadcast] = js.native
  def bind(request: StreamId): Request[LiveBroadcast] = js.native
  
  /** Delete a given broadcast. */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsId): Request[Unit] = js.native
  
  /** Inserts a new stream for the authenticated user. */
  def insert(request: FieldsKey): Request[LiveBroadcast] = js.native
  def insert(request: UploadType, body: LiveBroadcast): Request[LiveBroadcast] = js.native
  
  /** Insert cuepoints in a broadcast */
  def insertCuepoint(request: IdKey): Request[Cuepoint] = js.native
  def insertCuepoint(request: KeyOauthtoken, body: Cuepoint): Request[Cuepoint] = js.native
  
  /** Retrieve the list of broadcasts associated with the given channel. */
  def list(): Request[LiveBroadcastListResponse] = js.native
  def list(request: BroadcastStatus): Request[LiveBroadcastListResponse] = js.native
  
  /** Transition a broadcast to a given status. */
  def transition(): Request[LiveBroadcast] = js.native
  def transition(request: AltBroadcastStatus): Request[LiveBroadcast] = js.native
  
  /** Updates an existing broadcast for the authenticated user. */
  def update(request: FieldsKey): Request[LiveBroadcast] = js.native
  def update(request: UploadType, body: LiveBroadcast): Request[LiveBroadcast] = js.native
}
