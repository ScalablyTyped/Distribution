package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientNotebooks.anon.AccesstokenAlt
import typings.maximMazurokGapiClientNotebooks.anon.AltCallback
import typings.maximMazurokGapiClientNotebooks.anon.Callback
import typings.maximMazurokGapiClientNotebooks.anon.CallbackFields
import typings.maximMazurokGapiClientNotebooks.anon.Fields
import typings.maximMazurokGapiClientNotebooks.anon.FieldsKey
import typings.maximMazurokGapiClientNotebooks.anon.InstanceId
import typings.maximMazurokGapiClientNotebooks.anon.KeyName
import typings.maximMazurokGapiClientNotebooks.anon.Name
import typings.maximMazurokGapiClientNotebooks.anon.NameOauthtoken
import typings.maximMazurokGapiClientNotebooks.anon.NotebookInstance
import typings.maximMazurokGapiClientNotebooks.anon.Oauthtoken
import typings.maximMazurokGapiClientNotebooks.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientNotebooks.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientNotebooks.anon.Parent
import typings.maximMazurokGapiClientNotebooks.anon.PrettyPrint
import typings.maximMazurokGapiClientNotebooks.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientNotebooks.anon.QuotaUser
import typings.maximMazurokGapiClientNotebooks.anon.Resource
import typings.maximMazurokGapiClientNotebooks.anon.UploadType
import typings.maximMazurokGapiClientNotebooks.anon.Uploadprotocol
import typings.maximMazurokGapiClientNotebooks.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /** Creates a new Instance in a given project and location. */
  def create(request: InstanceId): Request[Operation] = js.native
  def create(request: Oauthtoken, body: Instance): Request[Operation] = js.native
  
  /** Deletes a single Instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Check if a notebook instance is healthy. */
  def getInstanceHealth(): Request[GetInstanceHealthResponse] = js.native
  def getInstanceHealth(request: Callback): Request[GetInstanceHealthResponse] = js.native
  
  /** Check if a notebook instance is upgradable. */
  def isUpgradeable(): Request[IsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(request: NotebookInstance): Request[IsInstanceUpgradeableResponse] = js.native
  
  /** Lists instances in a given project and location. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Fields): Request[ListInstancesResponse] = js.native
  
  /**
    * Registers an existing legacy notebook instance to the Notebooks API server. Legacy instances are instances created with the legacy Compute Engine calls. They are not manageable by
    * the Notebooks API out of the box. This call makes these instances manageable by the Notebooks API.
    */
  def register(request: Parent): Request[Operation] = js.native
  def register(request: PrettyPrint, body: RegisterInstanceRequest): Request[Operation] = js.native
  
  def report(request: Callback, body: ReportInstanceInfoRequest): Request[Operation] = js.native
  /**
    * Allows notebook instances to report their latest instance information to the Notebooks API server. The server will merge the reported information to the instance metadata store. Do
    * not use this method directly.
    */
  def report(request: Name): Request[Operation] = js.native
  
  def reset(request: Callback, body: ResetInstanceRequest): Request[Operation] = js.native
  /** Resets a notebook instance. */
  def reset(request: QuotaUser): Request[Operation] = js.native
  
  def rollback(request: Callback, body: RollbackInstanceRequest): Request[Operation] = js.native
  /** Rollbacks a notebook instance to the previous version. */
  def rollback(request: Resource): Request[Operation] = js.native
  
  def setAccelerator(request: Callback, body: SetInstanceAcceleratorRequest): Request[Operation] = js.native
  /** Updates the guest accelerators of a single Instance. */
  def setAccelerator(request: UploadType): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Uploadprotocol, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def setLabels(request: Callback, body: SetInstanceLabelsRequest): Request[Operation] = js.native
  /** Replaces all the labels of an Instance. */
  def setLabels(request: Xgafv): Request[Operation] = js.native
  
  /** Updates the machine type of a single Instance. */
  def setMachineType(request: AccesstokenAlt): Request[Operation] = js.native
  def setMachineType(request: Callback, body: SetInstanceMachineTypeRequest): Request[Operation] = js.native
  
  /** Starts a notebook instance. */
  def start(request: AltCallback): Request[Operation] = js.native
  def start(request: Callback, body: StartInstanceRequest): Request[Operation] = js.native
  
  /** Stops a notebook instance. */
  def stop(request: CallbackFields): Request[Operation] = js.native
  def stop(request: Callback, body: StopInstanceRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Uploadprotocol, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateConfig(request: Callback, body: UpdateInstanceConfigRequest): Request[Operation] = js.native
  /** Update Notebook Instance configurations. */
  def updateConfig(request: FieldsKey): Request[Operation] = js.native
  
  def updateMetadataItems(request: Callback, body: UpdateInstanceMetadataItemsRequest): Request[UpdateInstanceMetadataItemsResponse] = js.native
  /** Add/update metadata items for an instance. */
  def updateMetadataItems(request: KeyName): Request[UpdateInstanceMetadataItemsResponse] = js.native
  
  def updateShieldedInstanceConfig(request: Callback, body: UpdateShieldedInstanceConfigRequest): Request[Operation] = js.native
  /** Updates the Shielded instance configuration of a single Instance. */
  def updateShieldedInstanceConfig(request: NameOauthtoken): Request[Operation] = js.native
  
  def upgrade(request: Callback, body: UpgradeInstanceRequest): Request[Operation] = js.native
  /** Upgrades a notebook instance to the latest version. */
  def upgrade(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  
  def upgradeInternal(request: Callback, body: UpgradeInstanceInternalRequest): Request[Operation] = js.native
  /** Allows notebook instances to call this endpoint to upgrade themselves. Do not use this method directly. */
  def upgradeInternal(request: PrettyPrintQuotaUser): Request[Operation] = js.native
}
