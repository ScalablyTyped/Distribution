package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningObjectSummary
  extends StObject
     with Entity {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var activityDateTime: js.UndefOr[String] = js.undefined
  
  // Unique ID of this change in this cycle.
  var changeId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique ID per job iteration.
  var cycleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates how long this provisioning action took to finish. Measured in milliseconds.
  var durationInMilliseconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Details of who initiated this provisioning.
  var initiatedBy: js.UndefOr[NullableOption[Initiator]] = js.undefined
  
  // The unique ID for the whole provisioning job.
  var jobId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Details of each property that was modified in this provisioning action on this object.
  var modifiedProperties: js.UndefOr[NullableOption[js.Array[ModifiedProperty]]] = js.undefined
  
  /**
    * Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable,
    * other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list.
    */
  var provisioningAction: js.UndefOr[NullableOption[ProvisioningAction]] = js.undefined
  
  // Details of provisioning status.
  var provisioningStatusInfo: js.UndefOr[NullableOption[ProvisioningStatusInfo]] = js.undefined
  
  // Details of each step in provisioning.
  var provisioningSteps: js.UndefOr[NullableOption[js.Array[ProvisioningStep]]] = js.undefined
  
  // Represents the service principal used for provisioning.
  var servicePrincipal: js.UndefOr[NullableOption[ProvisioningServicePrincipal]] = js.undefined
  
  // Details of source object being provisioned.
  var sourceIdentity: js.UndefOr[NullableOption[ProvisionedIdentity]] = js.undefined
  
  // Details of source system of the object being provisioned.
  var sourceSystem: js.UndefOr[NullableOption[ProvisioningSystem]] = js.undefined
  
  // Details of target object being provisioned.
  var targetIdentity: js.UndefOr[NullableOption[ProvisionedIdentity]] = js.undefined
  
  // Details of target system of the object being provisioned.
  var targetSystem: js.UndefOr[NullableOption[ProvisioningSystem]] = js.undefined
  
  // Unique Azure AD tenant ID.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProvisioningObjectSummary {
  
  inline def apply(): ProvisioningObjectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningObjectSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningObjectSummary] (val x: Self) extends AnyVal {
    
    inline def setActivityDateTime(value: String): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    inline def setChangeId(value: NullableOption[String]): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdNull: Self = StObject.set(x, "changeId", null)
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "changeId", js.undefined)
    
    inline def setCycleId(value: NullableOption[String]): Self = StObject.set(x, "cycleId", value.asInstanceOf[js.Any])
    
    inline def setCycleIdNull: Self = StObject.set(x, "cycleId", null)
    
    inline def setCycleIdUndefined: Self = StObject.set(x, "cycleId", js.undefined)
    
    inline def setDurationInMilliseconds(value: NullableOption[Double]): Self = StObject.set(x, "durationInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInMillisecondsNull: Self = StObject.set(x, "durationInMilliseconds", null)
    
    inline def setDurationInMillisecondsUndefined: Self = StObject.set(x, "durationInMilliseconds", js.undefined)
    
    inline def setInitiatedBy(value: NullableOption[Initiator]): Self = StObject.set(x, "initiatedBy", value.asInstanceOf[js.Any])
    
    inline def setInitiatedByNull: Self = StObject.set(x, "initiatedBy", null)
    
    inline def setInitiatedByUndefined: Self = StObject.set(x, "initiatedBy", js.undefined)
    
    inline def setJobId(value: NullableOption[String]): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setModifiedProperties(value: NullableOption[js.Array[ModifiedProperty]]): Self = StObject.set(x, "modifiedProperties", value.asInstanceOf[js.Any])
    
    inline def setModifiedPropertiesNull: Self = StObject.set(x, "modifiedProperties", null)
    
    inline def setModifiedPropertiesUndefined: Self = StObject.set(x, "modifiedProperties", js.undefined)
    
    inline def setModifiedPropertiesVarargs(value: ModifiedProperty*): Self = StObject.set(x, "modifiedProperties", js.Array(value*))
    
    inline def setProvisioningAction(value: NullableOption[ProvisioningAction]): Self = StObject.set(x, "provisioningAction", value.asInstanceOf[js.Any])
    
    inline def setProvisioningActionNull: Self = StObject.set(x, "provisioningAction", null)
    
    inline def setProvisioningActionUndefined: Self = StObject.set(x, "provisioningAction", js.undefined)
    
    inline def setProvisioningStatusInfo(value: NullableOption[ProvisioningStatusInfo]): Self = StObject.set(x, "provisioningStatusInfo", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStatusInfoNull: Self = StObject.set(x, "provisioningStatusInfo", null)
    
    inline def setProvisioningStatusInfoUndefined: Self = StObject.set(x, "provisioningStatusInfo", js.undefined)
    
    inline def setProvisioningSteps(value: NullableOption[js.Array[ProvisioningStep]]): Self = StObject.set(x, "provisioningSteps", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStepsNull: Self = StObject.set(x, "provisioningSteps", null)
    
    inline def setProvisioningStepsUndefined: Self = StObject.set(x, "provisioningSteps", js.undefined)
    
    inline def setProvisioningStepsVarargs(value: ProvisioningStep*): Self = StObject.set(x, "provisioningSteps", js.Array(value*))
    
    inline def setServicePrincipal(value: NullableOption[ProvisioningServicePrincipal]): Self = StObject.set(x, "servicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalNull: Self = StObject.set(x, "servicePrincipal", null)
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "servicePrincipal", js.undefined)
    
    inline def setSourceIdentity(value: NullableOption[ProvisionedIdentity]): Self = StObject.set(x, "sourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityNull: Self = StObject.set(x, "sourceIdentity", null)
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "sourceIdentity", js.undefined)
    
    inline def setSourceSystem(value: NullableOption[ProvisioningSystem]): Self = StObject.set(x, "sourceSystem", value.asInstanceOf[js.Any])
    
    inline def setSourceSystemNull: Self = StObject.set(x, "sourceSystem", null)
    
    inline def setSourceSystemUndefined: Self = StObject.set(x, "sourceSystem", js.undefined)
    
    inline def setTargetIdentity(value: NullableOption[ProvisionedIdentity]): Self = StObject.set(x, "targetIdentity", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentityNull: Self = StObject.set(x, "targetIdentity", null)
    
    inline def setTargetIdentityUndefined: Self = StObject.set(x, "targetIdentity", js.undefined)
    
    inline def setTargetSystem(value: NullableOption[ProvisioningSystem]): Self = StObject.set(x, "targetSystem", value.asInstanceOf[js.Any])
    
    inline def setTargetSystemNull: Self = StObject.set(x, "targetSystem", null)
    
    inline def setTargetSystemUndefined: Self = StObject.set(x, "targetSystem", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
