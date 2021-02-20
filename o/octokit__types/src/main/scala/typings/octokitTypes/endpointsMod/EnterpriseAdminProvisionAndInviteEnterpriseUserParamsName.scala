package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName extends StObject {
  
  var familyName: String = js.native
  
  var givenName: String = js.native
}
object EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName {
  
  @scala.inline
  def apply(familyName: String, givenName: String): EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseUserParamsNameMutableBuilder[Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
  }
}
