package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.AltCallback
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.CallbackConsentStore
import typings.maximMazurokGapiClientHealthcare.anon.CallbackConsentStoreId
import typings.maximMazurokGapiClientHealthcare.anon.CallbackFields
import typings.maximMazurokGapiClientHealthcare.anon.ConsentStoreFields
import typings.maximMazurokGapiClientHealthcare.anon.ConsentStoreId
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.FieldsKey
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsentStoresResource extends StObject {
  
  var attributeDefinitions: AttributeDefinitionsResource = js.native
  
  def checkDataAccess(request: AltCallback, body: CheckDataAccessRequest): Request[CheckDataAccessResponse] = js.native
  /** Checks if a particular data_id of a User data mapping in the specified consent store is consented for the specified use. */
  def checkDataAccess(request: typings.maximMazurokGapiClientHealthcare.anon.ConsentStore): Request[CheckDataAccessResponse] = js.native
  
  var consentArtifacts: ConsentArtifactsResource = js.native
  
  var consents: ConsentsResource = js.native
  
  def create(request: CallbackConsentStoreId, body: ConsentStore): Request[ConsentStore] = js.native
  /** Creates a new consent store in the parent dataset. Attempting to create a consent store with the same ID as an existing store fails with an ALREADY_EXISTS error. */
  def create(request: ConsentStoreId): Request[ConsentStore] = js.native
  
  /** Deletes the specified consent store and removes all the consent store's data. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  def evaluateUserConsents(request: AltCallback, body: EvaluateUserConsentsRequest): Request[EvaluateUserConsentsResponse] = js.native
  /**
    * Evaluates the user's Consents for all matching User data mappings. Note: User data mappings are indexed asynchronously, which can cause a slight delay between the time mappings are
    * created or updated and when they are included in EvaluateUserConsents results.
    */
  def evaluateUserConsents(request: CallbackConsentStore): Request[EvaluateUserConsentsResponse] = js.native
  
  /** Gets the specified consent store. */
  def get(): Request[ConsentStore] = js.native
  def get(request: Callback): Request[ConsentStore] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists the consent stores in the specified dataset. */
  def list(): Request[ListConsentStoresResponse] = js.native
  def list(request: Fields): Request[ListConsentStoresResponse] = js.native
  
  /** Updates the specified consent store. */
  def patch(request: CallbackFields): Request[ConsentStore] = js.native
  def patch(request: Name, body: ConsentStore): Request[ConsentStore] = js.native
  
  def queryAccessibleData(request: AltCallback, body: QueryAccessibleDataRequest): Request[Operation] = js.native
  /**
    * Queries all data_ids that are consented for a specified use in the given consent store and writes them to a specified destination. The returned Operation includes a progress counter
    * for the number of User data mappings processed. If the request is successful, a detailed response is returned of type QueryAccessibleDataResponse, contained in the response field
    * when the operation finishes. The metadata field type is OperationMetadata. Errors are logged to Cloud Logging (see [Viewing error logs in Cloud
    * Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). For example, the following sample log entry shows a `failed to evaluate consent policy` error that occurred
    * during a QueryAccessibleData call to consent store `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. ```json jsonPayload: {
    * @‍type: "type.googleapis.com/google.cloud.healthcare.logging.QueryAccessibleDataLogEntry" error: { code: 9 message: "failed to evaluate consent policy" } resourceName:
    * "projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}" } logName:
    * "projects/{project_id}/logs/healthcare.googleapis.com%2Fquery_accessible_data" operation: { id:
    * "projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/operations/{operation_id}" producer: "healthcare.googleapis.com/QueryAccessibleData" } receiveTimestamp:
    * "TIMESTAMP" resource: { labels: { consent_store_id: "{consent_store_id}" dataset_id: "{dataset_id}" location: "{location_id}" project_id: "{project_id}" } type:
    * "healthcare_consent_store" } severity: "ERROR" timestamp: "TIMESTAMP" ```
    */
  def queryAccessibleData(request: ConsentStoreFields): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: FieldsKey, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: FieldsKey, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  var userDataMappings: UserDataMappingsResource = js.native
}
