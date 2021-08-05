package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDelegationSettings extends StObject {
  
  /** Permission to check in IAM. */
  var iamPermission: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS name of the service (e.g. "resourcemanager.googleapis.com"). This should be the domain name part of the full resource names (see https://aip.dev/122#full-resource-names),
    * which is usually the same as IamServiceSpec.service of the service where the resource type is defined.
    */
  var iamServiceName: js.UndefOr[String] = js.undefined
  
  /** Policy name to be checked */
  var policyName: js.UndefOr[PolicyName] = js.undefined
  
  /** IAM resource to check permission on */
  var resource: js.UndefOr[Resource] = js.undefined
}
object PolicyDelegationSettings {
  
  inline def apply(): PolicyDelegationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelegationSettings]
  }
  
  extension [Self <: PolicyDelegationSettings](x: Self) {
    
    inline def setIamPermission(value: String): Self = StObject.set(x, "iamPermission", value.asInstanceOf[js.Any])
    
    inline def setIamPermissionUndefined: Self = StObject.set(x, "iamPermission", js.undefined)
    
    inline def setIamServiceName(value: String): Self = StObject.set(x, "iamServiceName", value.asInstanceOf[js.Any])
    
    inline def setIamServiceNameUndefined: Self = StObject.set(x, "iamServiceName", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
