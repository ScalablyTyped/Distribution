package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenancePolicy extends StObject {
  
  /** Output only. The time when the resource was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels to represent user provided metadata. Each label is a key-value pair, where both the key and the value are arbitrary strings provided by the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Required. MaintenancePolicy name using the form: `projects/{project_id}/locations/{location_id}/maintenancePolicies/{maintenance_policy_id}` where {project_id} refers to a GCP
    * consumer project ID, {location_id} refers to a GCP region/zone, {maintenance_policy_id} must be 1-63 characters long and match the regular expression
    * `[a-z0-9]([-a-z0-9]*[a-z0-9])?`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. The state of the policy. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Maintenance policy applicable to instance update. */
  var updatePolicy: js.UndefOr[UpdatePolicy] = js.undefined
  
  /** Output only. The time when the resource was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object MaintenancePolicy {
  
  inline def apply(): MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenancePolicy]
  }
  
  extension [Self <: MaintenancePolicy](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdatePolicy(value: UpdatePolicy): Self = StObject.set(x, "updatePolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdatePolicyUndefined: Self = StObject.set(x, "updatePolicy", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
