package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName extends StObject {
  
  var familyName: String
  
  var givenName: String
}
object EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName {
  
  inline def apply(familyName: String, givenName: String): EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName]
  }
  
  extension [Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
  }
}
