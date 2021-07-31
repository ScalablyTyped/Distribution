package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Accesstoken
import typings.maximMazurokGapiClientSpanner.anon.Callback
import typings.maximMazurokGapiClientSpanner.anon.FieldMask
import typings.maximMazurokGapiClientSpanner.anon.KeyName
import typings.maximMazurokGapiClientSpanner.anon.Oauthtoken
import typings.maximMazurokGapiClientSpanner.anon.OauthtokenParent
import typings.maximMazurokGapiClientSpanner.anon.PrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  var backupOperations: BackupOperationsResource = js.native
  
  var backups: BackupsResource = js.native
  
  def create(request: OauthtokenParent, body: CreateInstanceRequest): Request[Operation] = js.native
  /**
    * Creates an instance and begins preparing it to begin serving. The returned long-running operation can be used to track the progress of preparing the new instance. The instance name
    * is assigned by the caller. If the named instance already exists, `CreateInstance` returns `ALREADY_EXISTS`. Immediately upon completion of this request: * The instance is readable
    * via the API, with all requested attributes but no allocated resources. Its state is `CREATING`. Until completion of the returned operation: * Cancelling the operation renders the
    * instance immediately unreadable via the API. * The instance can be deleted. * All other attempts to modify the instance are rejected. Upon completion of the returned operation: *
    * Billing for all successfully-allocated resources begins (some types may have lower than the requested levels). * Databases can be created in the instance. * The instance's allocated
    * resource levels are readable via the API. * The instance's state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used
    * to track creation of the instance. The metadata field type is CreateInstanceMetadata. The response field type is Instance, if successful.
    */
  def create(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  
  var databaseOperations: DatabaseOperationsResource = js.native
  
  var databases: DatabasesResource = js.native
  
  /**
    * Deletes an instance. Immediately upon completion of the request: * Billing ceases for all of the instance's reserved resources. Soon afterward: * The instance and *all of its
    * databases* immediately and irrevocably disappear from the API. All data in the databases is permanently deleted.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets information about a particular instance. */
  def get(): Request[Instance] = js.native
  def get(request: FieldMask): Request[Instance] = js.native
  
  /**
    * Gets the access control policy for an instance resource. Returns an empty policy if an instance exists but does not have a policy set. Authorization requires
    * `spanner.instances.getIamPolicy` on resource.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all instances in the given project. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Callback): Request[ListInstancesResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def patch(request: Accesstoken, body: UpdateInstanceRequest): Request[Operation] = js.native
  /**
    * Updates an instance, and begins allocating or releasing resources as requested. The returned long-running operation can be used to track the progress of updating the instance. If
    * the named instance does not exist, returns `NOT_FOUND`. Immediately upon completion of this request: * For resource types for which a decrease in the instance's allocation has been
    * requested, billing is based on the newly-requested level. Until completion of the returned operation: * Cancelling the operation sets its metadata's cancel_time, and begins
    * restoring resources to their pre-request values. The operation is guaranteed to succeed at undoing all resource changes, after which point it terminates with a `CANCELLED` status. *
    * All other attempts to modify the instance are rejected. * Reading the instance via the API continues to give the pre-request resource levels. Upon completion of the returned
    * operation: * Billing begins for all successfully-allocated resources (some types may have lower than the requested levels). * All newly-reserved resources are available for serving
    * the instance's tables. * The instance's new resource levels are readable via the API. The returned long-running operation will have a name of the format `/operations/` and can be
    * used to track the instance modification. The metadata field type is UpdateInstanceMetadata. The response field type is Instance, if successful. Authorization requires
    * `spanner.instances.update` permission on resource name.
    */
  def patch(request: KeyName): Request[Operation] = js.native
  
  /** Sets the access control policy on an instance resource. Replaces any existing policy. Authorization requires `spanner.instances.setIamPolicy` on resource. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that the caller has on the specified instance resource. Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a NOT_FOUND error if
    * the user has `spanner.instances.list` permission on the containing Google Cloud Project. Otherwise returns an empty set of permissions.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
