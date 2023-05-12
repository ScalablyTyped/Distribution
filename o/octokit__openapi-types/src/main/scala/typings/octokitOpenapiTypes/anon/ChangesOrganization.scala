package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesOrganization extends StObject {
  
  /** @enum {string} */
  var action: edited
  
  var changes: DescriptionPublic
  
  var organization: Hooksurl
  
  var projects_v2: Shortdescription
  
  var sender: Avatarurl
}
object ChangesOrganization {
  
  inline def apply(
    changes: DescriptionPublic,
    organization: Hooksurl,
    projects_v2: Shortdescription,
    sender: Avatarurl
  ): ChangesOrganization = {
    val __obj = js.Dynamic.literal(action = "edited", changes = changes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], projects_v2 = projects_v2.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangesOrganization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: DescriptionPublic): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2(value: Shortdescription): Self = StObject.set(x, "projects_v2", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
