package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientNotebooks.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientNotebooks.anon.AltCallbackFields
import typings.maximMazurokGapiClientNotebooks.anon.Callback
import typings.maximMazurokGapiClientNotebooks.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientNotebooks.anon.Fields
import typings.maximMazurokGapiClientNotebooks.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientNotebooks.anon.QuotaUserRequestId
import typings.maximMazurokGapiClientNotebooks.anon.RequestId
import typings.maximMazurokGapiClientNotebooks.anon.RequestIdUpdateMask
import typings.maximMazurokGapiClientNotebooks.anon.ResourceUploadType
import typings.maximMazurokGapiClientNotebooks.anon.RuntimeId
import typings.maximMazurokGapiClientNotebooks.anon.UpdateMask
import typings.maximMazurokGapiClientNotebooks.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientNotebooks.anon.Uploadprotocol
import typings.maximMazurokGapiClientNotebooks.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimesResource extends StObject {
  
  /** Creates a new Runtime in a given project and location. */
  def create(request: RequestId): Request[Operation] = js.native
  def create(request: RuntimeId, body: Runtime): Request[Operation] = js.native
  
  /** Deletes a single Runtime. */
  def delete(): Request[Operation] = js.native
  def delete(request: QuotaUserRequestId): Request[Operation] = js.native
  
  /** Gets details of a single Runtime. The location must be a regional endpoint rather than zonal. */
  def get(): Request[Runtime] = js.native
  def get(request: Callback): Request[Runtime] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists Runtimes in a given project and location. */
  def list(): Request[ListRuntimesResponse] = js.native
  def list(request: Fields): Request[ListRuntimesResponse] = js.native
  
  def patch(request: RequestIdUpdateMask, body: Runtime): Request[Operation] = js.native
  /** Update Notebook Runtime configuration. */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  def refreshRuntimeTokenInternal(request: Callback, body: RefreshRuntimeTokenInternalRequest): Request[RefreshRuntimeTokenInternalResponse] = js.native
  /** Gets an access token for the consumer service account that the customer attached to the runtime. Only accessible from the tenant instance. */
  def refreshRuntimeTokenInternal(request: ResourceUploadType): Request[RefreshRuntimeTokenInternalResponse] = js.native
  
  def reportEvent(request: Callback, body: ReportRuntimeEventRequest): Request[Operation] = js.native
  /** Report and process a runtime event. */
  def reportEvent(request: UploadTypeUploadprotocol): Request[Operation] = js.native
  
  def reset(request: Callback, body: ResetRuntimeRequest): Request[Operation] = js.native
  /** Resets a Managed Notebook Runtime. */
  def reset(request: UploadprotocolXgafv): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Uploadprotocol, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Starts a Managed Notebook Runtime. Perform "Start" on GPU instances; "Resume" on CPU instances See: https://cloud.google.com/compute/docs/instances/stop-start-instance
    * https://cloud.google.com/compute/docs/instances/suspend-resume-instance
    */
  def start(request: AccesstokenAltCallback): Request[Operation] = js.native
  def start(request: Callback, body: StartRuntimeRequest): Request[Operation] = js.native
  
  /**
    * Stops a Managed Notebook Runtime. Perform "Stop" on GPU instances; "Suspend" on CPU instances See: https://cloud.google.com/compute/docs/instances/stop-start-instance
    * https://cloud.google.com/compute/docs/instances/suspend-resume-instance
    */
  def stop(request: AltCallbackFields): Request[Operation] = js.native
  def stop(request: Callback, body: StopRuntimeRequest): Request[Operation] = js.native
  
  /** Switch a Managed Notebook Runtime. */
  def switch(request: CallbackFieldsKey): Request[Operation] = js.native
  def switch(request: Callback, body: SwitchRuntimeRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Uploadprotocol, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
