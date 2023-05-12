package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionOrganization extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  var organization: Hooksurl
  
  var projects_v2: Shortdescription
  
  var sender: Avatarurl
}
object ActionOrganization {
  
  inline def apply(organization: Hooksurl, projects_v2: Shortdescription, sender: Avatarurl): ActionOrganization = {
    val __obj = js.Dynamic.literal(action = "created", organization = organization.asInstanceOf[js.Any], projects_v2 = projects_v2.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionOrganization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2(value: Shortdescription): Self = StObject.set(x, "projects_v2", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
