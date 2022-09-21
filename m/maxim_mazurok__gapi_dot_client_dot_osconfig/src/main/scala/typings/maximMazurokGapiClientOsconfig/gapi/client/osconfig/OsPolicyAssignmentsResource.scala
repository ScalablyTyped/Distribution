package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOsconfig.anon.Callback
import typings.maximMazurokGapiClientOsconfig.anon.Key
import typings.maximMazurokGapiClientOsconfig.anon.Name
import typings.maximMazurokGapiClientOsconfig.anon.Oauthtoken
import typings.maximMazurokGapiClientOsconfig.anon.PageSize
import typings.maximMazurokGapiClientOsconfig.anon.PrettyPrint
import typings.maximMazurokGapiClientOsconfig.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OsPolicyAssignmentsResource extends StObject {
  
  /**
    * Create an OS policy assignment. This method also creates the first revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout
    * details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method:
    * projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
    */
  def create(request: Key): Request[Operation] = js.native
  def create(request: Oauthtoken, body: OSPolicyAssignment): Request[Operation] = js.native
  
  /**
    * Delete the OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout
    * details. The rollout can be cancelled by cancelling the LRO. If the LRO completes and is not cancelled, all revisions associated with the OS policy assignment are deleted. For more
    * information, see [Method:
    * projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /**
    * Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID
    * in the `name` parameter.
    */
  def get(): Request[OSPolicyAssignment] = js.native
  def get(request: Callback): Request[OSPolicyAssignment] = js.native
  
  /** List the OS policy assignments under the parent resource. For each OS policy assignment, the latest revision is returned. */
  def list(): Request[ListOSPolicyAssignmentsResponse] = js.native
  def list(request: PageSize): Request[ListOSPolicyAssignmentsResponse] = js.native
  
  /** List the OS policy assignment revisions for a given OS policy assignment. */
  def listRevisions(): Request[ListOSPolicyAssignmentRevisionsResponse] = js.native
  def listRevisions(request: Name): Request[ListOSPolicyAssignmentRevisionsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /**
    * Update an existing OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout
    * details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method:
    * projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
    */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: OSPolicyAssignment): Request[Operation] = js.native
  
  var reports: ReportsResource = js.native
}
