package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers extends StObject {
  
  var value: String
}
object EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers {
  
  inline def apply(value: String): EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]
  }
  
  extension [Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
