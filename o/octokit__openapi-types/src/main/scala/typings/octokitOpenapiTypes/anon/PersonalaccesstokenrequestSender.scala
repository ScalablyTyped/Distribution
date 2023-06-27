package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonalaccesstokenrequestSender extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  var installation: NodeidString
  
  var organization: Hooksurl
  
  var personal_access_token_request: Permissionsresult
  
  var sender: Avatarurl
}
object PersonalaccesstokenrequestSender {
  
  inline def apply(
    installation: NodeidString,
    organization: Hooksurl,
    personal_access_token_request: Permissionsresult,
    sender: Avatarurl
  ): PersonalaccesstokenrequestSender = {
    val __obj = js.Dynamic.literal(action = "created", installation = installation.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], personal_access_token_request = personal_access_token_request.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalaccesstokenrequestSender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonalaccesstokenrequestSender] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setPersonal_access_token_request(value: Permissionsresult): Self = StObject.set(x, "personal_access_token_request", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
