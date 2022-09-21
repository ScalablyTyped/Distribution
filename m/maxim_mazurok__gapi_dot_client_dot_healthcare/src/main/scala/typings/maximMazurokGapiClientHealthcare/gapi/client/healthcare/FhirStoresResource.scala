package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.CallbackFhirStoreId
import typings.maximMazurokGapiClientHealthcare.anon.FhirStoreId
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.FieldsKey
import typings.maximMazurokGapiClientHealthcare.anon.KeyOauthtoken
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientHealthcare.anon.ResourceSourceStore
import typings.maximMazurokGapiClientHealthcare.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientHealthcare.anon.ResourceUploadType
import typings.maximMazurokGapiClientHealthcare.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FhirStoresResource extends StObject {
  
  def create(request: CallbackFhirStoreId, body: FhirStore): Request[FhirStore] = js.native
  /** Creates a new FHIR store within the parent dataset. */
  def create(request: FhirStoreId): Request[FhirStore] = js.native
  
  def deidentify(request: KeyOauthtoken, body: DeidentifyFhirStoreRequest): Request[Operation] = js.native
  /**
    * De-identifies data from the source store and writes it to the destination store. The metadata field type is OperationMetadata. If the request is successful, the response field type
    * is DeidentifyFhirStoreSummary. If errors occur, error is set. Error details are also logged to Cloud Logging (see [Viewing error logs in Cloud
    * Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
    */
  def deidentify(request: ResourceSourceStore): Request[Operation] = js.native
  
  /** Deletes the specified FHIR store and removes all resources within it. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  def `export`(request: Callback, body: ExportResourcesRequest): Request[Operation] = js.native
  /**
    * Export resources from the FHIR store to the specified destination. This method returns an Operation that can be used to track the status of the export by calling GetOperation.
    * Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud
    * Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type ExportResourcesResponse is returned in the
    * response field. The metadata field type for this operation is OperationMetadata.
    */
  def `export`(request: ResourceUploadType): Request[Operation] = js.native
  
  var fhir: FhirResource = js.native
  
  /** Gets the configuration of the specified FHIR store. */
  def get(): Request[FhirStore] = js.native
  def get(request: Callback): Request[FhirStore] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  def `import`(request: Callback, body: ImportResourcesRequest): Request[Operation] = js.native
  /**
    * Imports resources to the FHIR store by loading data from the specified sources. This method is optimized to load large quantities of data using import semantics that ignore some
    * FHIR store configuration options and are not suitable for all use cases. It is primarily intended to load data into an empty FHIR store that is not being used by other clients. In
    * cases where this method is not appropriate, consider using ExecuteBundle to load data. Every resource in the input must contain a client-supplied ID. Each resource is stored using
    * the supplied ID regardless of the enable_update_create setting on the FHIR store. It is strongly advised not to include or encode any sensitive data such as patient identifiers in
    * client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud Audit Logs and Cloud Pub/Sub notifications. Those IDs can also be contained in
    * reference fields within other resources. The import process does not enforce referential integrity, regardless of the disable_referential_integrity setting on the FHIR store. This
    * allows the import of resources with arbitrary interdependencies without considering grouping or ordering, but if the input data contains invalid references or if some resources fail
    * to be imported, the FHIR store might be left in a state that violates referential integrity. The import process does not trigger Pub/Sub notification or BigQuery streaming update,
    * regardless of how those are configured on the FHIR store. If a resource with the specified ID already exists, the most recent version of the resource is overwritten without creating
    * a new historical version, regardless of the disable_resource_versioning setting on the FHIR store. If transient failures occur during the import, it's possible that successfully
    * imported resources will be overwritten more than once. The import operation is idempotent unless the input data contains multiple valid resources with the same ID but different
    * contents. In that case, after the import completes, the store contains exactly one resource with that ID but there is no ordering guarantee on which version of the contents it will
    * have. The operation result counters do not count duplicate IDs as an error and count one success for each resource in the input, which might result in a success count larger than
    * the number of resources in the FHIR store. This often occurs when importing data organized in bundles produced by Patient-everything where each bundle contains its own copy of a
    * resource such as Practitioner that might be referred to by many patients. If some resources fail to import, for example due to parsing errors, successfully imported resources are
    * not rolled back. The location and format of the input data is specified by the parameters in ImportResourcesRequest. Note that if no format is specified, this method assumes the
    * `BUNDLE` format. When using the `BUNDLE` format this method ignores the `Bundle.type` field, except that `history` bundles are rejected, and does not apply any of the bundle
    * processing semantics for batch or transaction bundles. Unlike in ExecuteBundle, transaction bundles are not executed as a single transaction and bundle-internal references are not
    * rewritten. The bundle is treated as a collection of resources to be written as provided in `Bundle.entry.resource`, ignoring `Bundle.entry.request`. As an example, this allows the
    * import of `searchset` bundles produced by a FHIR search or Patient-everything operation. This method returns an Operation that can be used to track the status of the import by
    * calling GetOperation. Immediate fatal errors appear in the error field, errors are also logged to Cloud Logging (see [Viewing error logs in Cloud
    * Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a detailed response of type ImportResourcesResponse is returned in the
    * response field. The metadata field type for this operation is OperationMetadata.
    */
  def `import`(request: UploadTypeUploadprotocol): Request[Operation] = js.native
  
  /** Lists the FHIR stores in the given dataset. */
  def list(): Request[ListFhirStoresResponse] = js.native
  def list(request: Fields): Request[ListFhirStoresResponse] = js.native
  
  def patch(request: Name, body: FhirStore): Request[FhirStore] = js.native
  /** Updates the configuration of the specified FHIR store. */
  def patch(request: ResourceUpdateMask): Request[FhirStore] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: FieldsKey, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: FieldsKey, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
