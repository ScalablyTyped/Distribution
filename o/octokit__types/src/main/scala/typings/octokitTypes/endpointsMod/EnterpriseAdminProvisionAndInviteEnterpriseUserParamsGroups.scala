package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups {
  
  inline def apply(): EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups]
  }
  
  extension [Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
