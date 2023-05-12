package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reopened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projectsv2Sender extends StObject {
  
  /** @enum {string} */
  var action: reopened
  
  var organization: Hooksurl
  
  var projects_v2: Shortdescription
  
  var sender: Avatarurl
}
object Projectsv2Sender {
  
  inline def apply(organization: Hooksurl, projects_v2: Shortdescription, sender: Avatarurl): Projectsv2Sender = {
    val __obj = js.Dynamic.literal(action = "reopened", organization = organization.asInstanceOf[js.Any], projects_v2 = projects_v2.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projectsv2Sender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projectsv2Sender] (val x: Self) extends AnyVal {
    
    inline def setAction(value: reopened): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setProjects_v2(value: Shortdescription): Self = StObject.set(x, "projects_v2", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
