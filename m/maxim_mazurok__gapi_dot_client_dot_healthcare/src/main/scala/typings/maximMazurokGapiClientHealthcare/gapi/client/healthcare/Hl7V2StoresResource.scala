package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.AltCallbackFields
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.FieldsHl7V2StoreId
import typings.maximMazurokGapiClientHealthcare.anon.FieldsKey
import typings.maximMazurokGapiClientHealthcare.anon.FieldsKeyName
import typings.maximMazurokGapiClientHealthcare.anon.Hl7V2StoreId
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hl7V2StoresResource extends StObject {
  
  def create(request: FieldsHl7V2StoreId, body: Hl7V2Store): Request[Hl7V2Store] = js.native
  /** Creates a new HL7v2 store within the parent dataset. */
  def create(request: Hl7V2StoreId): Request[Hl7V2Store] = js.native
  
  /** Deletes the specified HL7v2 store and removes all messages that it contains. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /**
    * Exports the messages to a destination. To filter messages to be exported, define a filter using the start and end time, relative to the message generation time (MSH.7). This API
    * returns an Operation that can be used to track the status of the job by calling GetOperation. Immediate fatal errors appear in the error field. Otherwise, when the operation
    * finishes, a detailed response of type ExportMessagesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
    */
  def `export`(request: AltCallbackFields): Request[Operation] = js.native
  def `export`(request: Callback, body: ExportMessagesRequest): Request[Operation] = js.native
  
  /** Gets the specified HL7v2 store. */
  def get(): Request[Hl7V2Store] = js.native
  def get(request: Callback): Request[Hl7V2Store] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /**
    * Import messages to the HL7v2 store by loading data from the specified sources. This method is optimized to load large quantities of data using import semantics that ignore some
    * HL7v2 store configuration options and are not suitable for all use cases. It is primarily intended to load data into an empty HL7v2 store that is not being used by other clients. An
    * existing message will be overwritten if a duplicate message is imported. A duplicate message is a message with the same raw bytes as a message that already exists in this HL7v2
    * store. When a message is overwritten, its labels will also be overwritten. The import operation is idempotent unless the input data contains multiple valid messages with the same
    * raw bytes but different labels. In that case, after the import completes, the store contains exactly one message with those raw bytes but there is no ordering guarantee on which
    * version of the labels it has. The operation result counters do not count duplicated raw bytes as an error and count one success for each message in the input, which might result in
    * a success count larger than the number of messages in the HL7v2 store. If some messages fail to import, for example due to parsing errors, successfully imported messages are not
    * rolled back. This method returns an Operation that can be used to track the status of the import by calling GetOperation. Immediate fatal errors appear in the error field, errors
    * are also logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). Otherwise, when the operation finishes, a
    * response of type ImportMessagesResponse is returned in the response field. The metadata field type for this operation is OperationMetadata.
    */
  def `import`(request: CallbackFieldsKey): Request[Operation] = js.native
  def `import`(request: Callback, body: ImportMessagesRequest): Request[Operation] = js.native
  
  /** Lists the HL7v2 stores in the given dataset. */
  def list(): Request[ListHl7V2StoresResponse] = js.native
  def list(request: Fields): Request[ListHl7V2StoresResponse] = js.native
  
  var messages: MessagesResource = js.native
  
  /** Updates the HL7v2 store. */
  def patch(request: FieldsKeyName): Request[Hl7V2Store] = js.native
  def patch(request: Name, body: Hl7V2Store): Request[Hl7V2Store] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: FieldsKey, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: FieldsKey, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
