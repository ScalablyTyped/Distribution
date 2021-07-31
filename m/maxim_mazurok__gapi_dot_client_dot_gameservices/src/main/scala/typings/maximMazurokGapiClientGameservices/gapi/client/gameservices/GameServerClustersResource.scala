package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGameservices.anon.AccesstokenAlt
import typings.maximMazurokGapiClientGameservices.anon.AltCallback
import typings.maximMazurokGapiClientGameservices.anon.Callback
import typings.maximMazurokGapiClientGameservices.anon.CallbackFields
import typings.maximMazurokGapiClientGameservices.anon.Fields
import typings.maximMazurokGapiClientGameservices.anon.FieldsKey
import typings.maximMazurokGapiClientGameservices.anon.GameServerClusterId
import typings.maximMazurokGapiClientGameservices.anon.Parent
import typings.maximMazurokGapiClientGameservices.anon.QuotaUser
import typings.maximMazurokGapiClientGameservices.anon.UpdateMask
import typings.maximMazurokGapiClientGameservices.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerClustersResource extends StObject {
  
  /** Creates a new game server cluster in a given project and location. */
  def create(request: GameServerClusterId): Request[Operation] = js.native
  def create(request: Parent, body: GameServerCluster): Request[Operation] = js.native
  
  /** Deletes a single game server cluster. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single game server cluster. */
  def get(): Request[GameServerCluster] = js.native
  def get(request: Callback): Request[GameServerCluster] = js.native
  
  /** Lists game server clusters in a given project and location. */
  def list(): Request[ListGameServerClustersResponse] = js.native
  def list(request: Fields): Request[ListGameServerClustersResponse] = js.native
  
  def patch(request: QuotaUser, body: GameServerCluster): Request[Operation] = js.native
  /** Patches a single game server cluster. */
  def patch(request: Xgafv): Request[Operation] = js.native
  
  /** Previews creation of a new game server cluster in a given project and location. */
  def previewCreate(request: AccesstokenAlt): Request[PreviewCreateGameServerClusterResponse] = js.native
  def previewCreate(request: AltCallback, body: GameServerCluster): Request[PreviewCreateGameServerClusterResponse] = js.native
  
  /** Previews deletion of a single game server cluster. */
  def previewDelete(): Request[PreviewDeleteGameServerClusterResponse] = js.native
  def previewDelete(request: CallbackFields): Request[PreviewDeleteGameServerClusterResponse] = js.native
  
  /** Previews updating a GameServerCluster. */
  def previewUpdate(request: FieldsKey): Request[PreviewUpdateGameServerClusterResponse] = js.native
  def previewUpdate(request: UpdateMask, body: GameServerCluster): Request[PreviewUpdateGameServerClusterResponse] = js.native
}
