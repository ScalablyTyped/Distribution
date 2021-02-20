package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups {
  
  @scala.inline
  def apply(): EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroupsMutableBuilder[Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
