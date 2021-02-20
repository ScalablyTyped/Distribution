package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers extends StObject {
  
  var value: String = js.native
}
object EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers {
  
  @scala.inline
  def apply(value: String): EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembersMutableBuilder[Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
