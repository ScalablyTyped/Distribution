package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirestore.anon.Accesstoken
import typings.maximMazurokGapiClientFirestore.anon.Alt
import typings.maximMazurokGapiClientFirestore.anon.Key
import typings.maximMazurokGapiClientFirestore.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexesResource extends js.Object {
  
  /**
    * Creates a composite index. This returns a google.longrunning.Operation which may be used to track the status of the creation. The metadata for the operation will be the type
    * IndexOperationMetadata.
    */
  def create(request: Key): Request[GoogleLongrunningOperation] = js.native
  def create(request: Oauthtoken, body: GoogleFirestoreAdminV1Index): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes a composite index. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a composite index. */
  def get(): Request[GoogleFirestoreAdminV1Index] = js.native
  def get(request: Accesstoken): Request[GoogleFirestoreAdminV1Index] = js.native
  
  /** Lists composite indexes. */
  def list(): Request[GoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(request: Alt): Request[GoogleFirestoreAdminV1ListIndexesResponse] = js.native
}
