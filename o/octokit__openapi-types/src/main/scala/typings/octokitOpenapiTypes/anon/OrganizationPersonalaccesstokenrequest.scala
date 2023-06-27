package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationPersonalaccesstokenrequest extends StObject {
  
  /** @enum {string} */
  var action: cancelled
  
  var installation: NodeidString
  
  var organization: Hooksurl
  
  var personal_access_token_request: Permissionsresult
  
  var sender: Avatarurl
}
object OrganizationPersonalaccesstokenrequest {
  
  inline def apply(
    installation: NodeidString,
    organization: Hooksurl,
    personal_access_token_request: Permissionsresult,
    sender: Avatarurl
  ): OrganizationPersonalaccesstokenrequest = {
    val __obj = js.Dynamic.literal(action = "cancelled", installation = installation.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], personal_access_token_request = personal_access_token_request.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationPersonalaccesstokenrequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationPersonalaccesstokenrequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: cancelled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setPersonal_access_token_request(value: Permissionsresult): Self = StObject.set(x, "personal_access_token_request", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
