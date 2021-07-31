package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGameservices.anon.Callback
import typings.maximMazurokGapiClientGameservices.anon.Fields
import typings.maximMazurokGapiClientGameservices.anon.KeyName
import typings.maximMazurokGapiClientGameservices.anon.KeyOauthtoken
import typings.maximMazurokGapiClientGameservices.anon.NameOauthtoken
import typings.maximMazurokGapiClientGameservices.anon.QuotaUser
import typings.maximMazurokGapiClientGameservices.anon.RealmId
import typings.maximMazurokGapiClientGameservices.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealmsResource extends StObject {
  
  def create(request: KeyOauthtoken, body: Realm): Request[Operation] = js.native
  /** Creates a new realm in a given project and location. */
  def create(request: RealmId): Request[Operation] = js.native
  
  /** Deletes a single realm. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  var gameServerClusters: GameServerClustersResource = js.native
  
  /** Gets details of a single realm. */
  def get(): Request[Realm] = js.native
  def get(request: Callback): Request[Realm] = js.native
  
  /** Lists realms in a given project and location. */
  def list(): Request[ListRealmsResponse] = js.native
  def list(request: Fields): Request[ListRealmsResponse] = js.native
  
  /** Patches a single realm. */
  def patch(request: KeyName): Request[Operation] = js.native
  def patch(request: QuotaUser, body: Realm): Request[Operation] = js.native
  
  /** Previews patches to a single realm. */
  def previewUpdate(request: NameOauthtoken): Request[PreviewRealmUpdateResponse] = js.native
  def previewUpdate(request: UpdateMask, body: Realm): Request[PreviewRealmUpdateResponse] = js.native
}
