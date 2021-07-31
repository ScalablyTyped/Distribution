package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembers extends StObject {
  
  var value: String
}
object EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembers {
  
  @scala.inline
  def apply(value: String): EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembers = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembers]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembersMutableBuilder[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupParamsMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
