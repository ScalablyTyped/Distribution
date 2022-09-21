package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgPolicyViolationInfo extends StObject {
  
  /**
    * Optional. Resource payload that is currently in scope and is subjected to orgpolicy conditions. This payload may be the subset of the actual Resource that may come in the request.
    * This payload should not contain any core content.
    */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.OrgPolicyViolationInfo & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Optional. Tags referenced on the resource at the time of evaluation. These also include the federated tags, if they are supplied in the CheckOrgPolicy or CheckCustomConstraints
    * Requests. Optional field as of now. These tags are the Cloud tags that are available on the resource during the policy evaluation and will be available as part of the OrgPolicy
    * check response for logging purposes.
    */
  var resourceTags: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.OrgPolicyViolationInfo & TopLevel[Any]
  ] = js.undefined
  
  /** Optional. Resource type that the orgpolicy is checked against. Example: compute.googleapis.com/Instance, store.googleapis.com/bucket */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /** Optional. Policy violations */
  var violationInfo: js.UndefOr[js.Array[ViolationInfo]] = js.undefined
}
object OrgPolicyViolationInfo {
  
  inline def apply(): OrgPolicyViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgPolicyViolationInfo]
  }
  
  extension [Self <: OrgPolicyViolationInfo](x: Self) {
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.OrgPolicyViolationInfo & TopLevel[Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setResourceTags(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.OrgPolicyViolationInfo & TopLevel[Any]
    ): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setViolationInfo(value: js.Array[ViolationInfo]): Self = StObject.set(x, "violationInfo", value.asInstanceOf[js.Any])
    
    inline def setViolationInfoUndefined: Self = StObject.set(x, "violationInfo", js.undefined)
    
    inline def setViolationInfoVarargs(value: ViolationInfo*): Self = StObject.set(x, "violationInfo", js.Array(value*))
  }
}
