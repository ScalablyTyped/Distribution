package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.CallbackDatasetId
import typings.maximMazurokGapiClientHealthcare.anon.DatasetId
import typings.maximMazurokGapiClientHealthcare.anon.FieldsKey
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.NameOauthtokenPrettyPrint
import typings.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientHealthcare.anon.PageSize
import typings.maximMazurokGapiClientHealthcare.anon.QuotaUserSourceDataset
import typings.maximMazurokGapiClientHealthcare.anon.SourceDataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetsResource extends StObject {
  
  var consentStores: ConsentStoresResource = js.native
  
  def create(request: CallbackDatasetId, body: Dataset): Request[Operation] = js.native
  /**
    * Creates a new health dataset. Results are returned through the Operation interface which returns either an `Operation.response` which contains a Dataset or `Operation.error`. The
    * metadata field type is OperationMetadata.
    */
  def create(request: DatasetId): Request[Operation] = js.native
  
  def deidentify(request: QuotaUserSourceDataset, body: DeidentifyDatasetRequest): Request[Operation] = js.native
  /**
    * Creates a new dataset containing de-identified data from the source dataset. The metadata field type is OperationMetadata. If the request is successful, the response field type is
    * DeidentifySummary. If errors occur, error is set. The LRO result may still be successful if de-identification fails for some DICOM instances. The new de-identified dataset will not
    * contain these failed resources. Failed resource totals are tracked in Operation.metadata. Error details are also logged to Cloud Logging. For more information, see [Viewing error
    * logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
    */
  def deidentify(request: SourceDataset): Request[Operation] = js.native
  
  /** Deletes the specified health dataset and all data contained in the dataset. Deleting a dataset does not affect the sources from which the dataset was imported (if any). */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  var dicomStores: DicomStoresResource = js.native
  
  var fhirStores: FhirStoresResource = js.native
  
  /** Gets any metadata associated with a dataset. */
  def get(): Request[Dataset] = js.native
  def get(request: Callback): Request[Dataset] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  var hl7V2Stores: Hl7V2StoresResource = js.native
  
  /** Lists the health datasets in the current project. */
  def list(): Request[ListDatasetsResponse] = js.native
  def list(request: PageSize): Request[ListDatasetsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /** Updates dataset metadata. */
  def patch(request: NameOauthtokenPrettyPrint): Request[Dataset] = js.native
  def patch(request: Name, body: Dataset): Request[Dataset] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: FieldsKey, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: FieldsKey, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
