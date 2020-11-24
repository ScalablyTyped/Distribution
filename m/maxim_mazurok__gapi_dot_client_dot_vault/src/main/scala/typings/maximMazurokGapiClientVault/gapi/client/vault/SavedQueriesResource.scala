package typings.maximMazurokGapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVault.anon.Alt
import typings.maximMazurokGapiClientVault.anon.Fields
import typings.maximMazurokGapiClientVault.anon.SavedQueryId
import typings.maximMazurokGapiClientVault.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQueriesResource extends js.Object {
  
  def create(request: Alt, body: SavedQuery): Request[SavedQuery] = js.native
  /** Creates a saved query. */
  def create(request: UploadType): Request[SavedQuery] = js.native
  
  /** Deletes a saved query by Id. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SavedQueryId): Request[js.Object] = js.native
  
  /** Retrieves a saved query by Id. */
  def get(): Request[SavedQuery] = js.native
  def get(request: SavedQueryId): Request[SavedQuery] = js.native
  
  /** Lists saved queries within a matter. An empty page token in ListSavedQueriesResponse denotes no more saved queries to list. */
  def list(): Request[ListSavedQueriesResponse] = js.native
  def list(request: Fields): Request[ListSavedQueriesResponse] = js.native
}
