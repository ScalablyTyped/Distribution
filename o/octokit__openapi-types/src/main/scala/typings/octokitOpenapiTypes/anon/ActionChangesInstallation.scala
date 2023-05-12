package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionChangesInstallation extends StObject {
  
  /** @enum {string} */
  var action: edited
  
  var changes: js.UndefOr[OneOf[js.Tuple2[Fieldvalue, BodyFromTo]]] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: Hooksurl
  
  var projects_v2_item: Contentnodeid
  
  var sender: Avatarurl
}
object ActionChangesInstallation {
  
  inline def apply(organization: Hooksurl, projects_v2_item: Contentnodeid, sender: Avatarurl): ActionChangesInstallation = {
    val __obj = js.Dynamic.literal(action = "edited", organization = organization.asInstanceOf[js.Any], projects_v2_item = projects_v2_item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionChangesInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionChangesInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: OneOf[js.Tuple2[Fieldvalue, BodyFromTo]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2_item(value: Contentnodeid): Self = StObject.set(x, "projects_v2_item", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
