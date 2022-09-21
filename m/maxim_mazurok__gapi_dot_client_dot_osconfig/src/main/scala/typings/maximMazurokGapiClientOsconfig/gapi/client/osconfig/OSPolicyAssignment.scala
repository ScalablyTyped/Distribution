package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignment extends StObject {
  
  /**
    * Output only. Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy
    * assignment, there is only one revision with a value of `true` for this field.
    */
  var baseline: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Indicates that this revision deletes the OS policy assignment. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** OS policy assignment description. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The etag for this OS policy assignment. If this is provided on update, it must match the server's etag. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Required. Filter to select VMs. */
  var instanceFilter: js.UndefOr[OSPolicyAssignmentInstanceFilter] = js.undefined
  
  /** Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. List of OS policies to be applied to the VMs. */
  var osPolicies: js.UndefOr[js.Array[OSPolicy]] = js.undefined
  
  /** Output only. Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING */
  var reconciling: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The timestamp that the revision was created. */
  var revisionCreateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the
    * update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
    */
  var rollout: js.UndefOr[OSPolicyAssignmentRollout] = js.undefined
  
  /** Output only. OS policy assignment rollout state */
  var rolloutState: js.UndefOr[String] = js.undefined
  
  /** Output only. Server generated unique id for the OS policy assignment resource. */
  var uid: js.UndefOr[String] = js.undefined
}
object OSPolicyAssignment {
  
  inline def apply(): OSPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignment]
  }
  
  extension [Self <: OSPolicyAssignment](x: Self) {
    
    inline def setBaseline(value: Boolean): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInstanceFilter(value: OSPolicyAssignmentInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsPolicies(value: js.Array[OSPolicy]): Self = StObject.set(x, "osPolicies", value.asInstanceOf[js.Any])
    
    inline def setOsPoliciesUndefined: Self = StObject.set(x, "osPolicies", js.undefined)
    
    inline def setOsPoliciesVarargs(value: OSPolicy*): Self = StObject.set(x, "osPolicies", js.Array(value*))
    
    inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
    
    inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setRollout(value: OSPolicyAssignmentRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutState(value: String): Self = StObject.set(x, "rolloutState", value.asInstanceOf[js.Any])
    
    inline def setRolloutStateUndefined: Self = StObject.set(x, "rolloutState", js.undefined)
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
