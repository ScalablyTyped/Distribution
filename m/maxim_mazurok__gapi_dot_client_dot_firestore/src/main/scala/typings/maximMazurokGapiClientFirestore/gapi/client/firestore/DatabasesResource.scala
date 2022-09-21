package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirestore.anon.Accesstoken
import typings.maximMazurokGapiClientFirestore.anon.CallbackDatabaseId
import typings.maximMazurokGapiClientFirestore.anon.DatabaseId
import typings.maximMazurokGapiClientFirestore.anon.Fields
import typings.maximMazurokGapiClientFirestore.anon.FieldsKey
import typings.maximMazurokGapiClientFirestore.anon.KeyName
import typings.maximMazurokGapiClientFirestore.anon.Oauthtoken
import typings.maximMazurokGapiClientFirestore.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabasesResource extends StObject {
  
  var collectionGroups: CollectionGroupsResource = js.native
  
  def create(request: CallbackDatabaseId, body: GoogleFirestoreAdminV1Database): Request[GoogleLongrunningOperation] = js.native
  /** Create a database. */
  def create(request: DatabaseId): Request[GoogleLongrunningOperation] = js.native
  
  var documents: DocumentsResource = js.native
  
  def exportDocuments(request: Accesstoken, body: GoogleFirestoreAdminV1ExportDocumentsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Exports a copy of all or a subset of documents from Google Cloud Firestore to another storage system, such as Google Cloud Storage. Recent updates to documents may not be reflected
    * in the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used
    * once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage. For more details on export
    * behavior and output format, refer to: https://cloud.google.com/firestore/docs/manage-data/export-import
    */
  def exportDocuments(request: FieldsKey): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets information about a database. */
  def get(): Request[GoogleFirestoreAdminV1Database] = js.native
  def get(request: Accesstoken): Request[GoogleFirestoreAdminV1Database] = js.native
  
  def importDocuments(request: Accesstoken, body: GoogleFirestoreAdminV1ImportDocumentsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Imports documents into Google Cloud Firestore. Existing documents with the same name are overwritten. The import occurs in the background and its progress can be monitored and
    * managed via the Operation resource that is created. If an ImportDocuments operation is cancelled, it is possible that a subset of the data has already been imported to Cloud
    * Firestore.
    */
  def importDocuments(request: KeyName): Request[GoogleLongrunningOperation] = js.native
  
  /** List all the databases in the project. */
  def list(): Request[GoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  def list(request: Oauthtoken): Request[GoogleFirestoreAdminV1ListDatabasesResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def patch(request: Fields, body: GoogleFirestoreAdminV1Database): Request[GoogleLongrunningOperation] = js.native
  /** Updates a database. */
  def patch(request: UpdateMask): Request[GoogleLongrunningOperation] = js.native
}
