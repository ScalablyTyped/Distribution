package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.converted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesInstallation extends StObject {
  
  /** @enum {string} */
  var action: converted
  
  var changes: `462`
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: Hooksurl
  
  var projects_v2_item: Contentnodeid
  
  var sender: Avatarurl
}
object ChangesInstallation {
  
  inline def apply(changes: `462`, organization: Hooksurl, projects_v2_item: Contentnodeid, sender: Avatarurl): ChangesInstallation = {
    val __obj = js.Dynamic.literal(action = "converted", changes = changes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], projects_v2_item = projects_v2_item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangesInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: converted): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: `462`): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2_item(value: Contentnodeid): Self = StObject.set(x, "projects_v2_item", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
