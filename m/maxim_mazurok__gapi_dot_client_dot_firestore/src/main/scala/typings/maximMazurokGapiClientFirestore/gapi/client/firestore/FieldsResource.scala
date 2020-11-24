package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirestore.anon.Accesstoken
import typings.maximMazurokGapiClientFirestore.anon.Alt
import typings.maximMazurokGapiClientFirestore.anon.Callback
import typings.maximMazurokGapiClientFirestore.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsResource extends js.Object {
  
  /** Gets the metadata and configuration for a Field. */
  def get(): Request[GoogleFirestoreAdminV1Field] = js.native
  def get(request: Accesstoken): Request[GoogleFirestoreAdminV1Field] = js.native
  
  /**
    * Lists the field configuration and metadata for this database. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this
    * query, call FirestoreAdmin.ListFields with the filter set to `indexConfig.usesAncestorConfig:false`.
    */
  def list(): Request[GoogleFirestoreAdminV1ListFieldsResponse] = js.native
  def list(request: Alt): Request[GoogleFirestoreAdminV1ListFieldsResponse] = js.native
  
  /**
    * Updates a field configuration. Currently, field updates apply only to single field index configuration. However, calls to FirestoreAdmin.UpdateField should provide a field mask to
    * avoid changing any configuration that the caller isn't aware of. The field mask should be specified as: `{ paths: "index_config" }`. This call returns a google.longrunning.Operation
    * which may be used to track the status of the field update. The metadata for the operation will be the type FieldOperationMetadata. To configure the default field settings for the
    * database, use the special `Field` with resource name: `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/ *`.
    */
  def patch(request: Callback): Request[GoogleLongrunningOperation] = js.native
  def patch(request: Fields, body: GoogleFirestoreAdminV1Field): Request[GoogleLongrunningOperation] = js.native
}
