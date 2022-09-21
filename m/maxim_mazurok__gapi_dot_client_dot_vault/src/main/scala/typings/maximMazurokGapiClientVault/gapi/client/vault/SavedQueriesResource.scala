package typings.maximMazurokGapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVault.anon.Alt
import typings.maximMazurokGapiClientVault.anon.Fields
import typings.maximMazurokGapiClientVault.anon.SavedQueryId
import typings.maximMazurokGapiClientVault.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQueriesResource extends StObject {
  
  def create(request: Alt, body: SavedQuery): Request[SavedQuery] = js.native
  /** Creates a saved query. */
  def create(request: UploadType): Request[SavedQuery] = js.native
  
  /** Deletes the specified saved query. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SavedQueryId): Request[js.Object] = js.native
  
  /** Retrieves the specified saved query. */
  def get(): Request[SavedQuery] = js.native
  def get(request: SavedQueryId): Request[SavedQuery] = js.native
  
  /** Lists the saved queries in a matter. */
  def list(): Request[ListSavedQueriesResponse] = js.native
  def list(request: Fields): Request[ListSavedQueriesResponse] = js.native
}
