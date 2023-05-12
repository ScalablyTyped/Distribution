package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projectsv2itemSender extends StObject {
  
  /** @enum {string} */
  var action: deleted_
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: Hooksurl
  
  var projects_v2_item: Contentnodeid
  
  var sender: Avatarurl
}
object Projectsv2itemSender {
  
  inline def apply(organization: Hooksurl, projects_v2_item: Contentnodeid, sender: Avatarurl): Projectsv2itemSender = {
    val __obj = js.Dynamic.literal(action = "deleted", organization = organization.asInstanceOf[js.Any], projects_v2_item = projects_v2_item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projectsv2itemSender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projectsv2itemSender] (val x: Self) extends AnyVal {
    
    inline def setAction(value: deleted_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2_item(value: Contentnodeid): Self = StObject.set(x, "projects_v2_item", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
