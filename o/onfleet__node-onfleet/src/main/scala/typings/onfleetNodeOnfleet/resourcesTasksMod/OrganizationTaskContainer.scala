package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.ORGANIZATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationTaskContainer
  extends StObject
     with TaskContainer {
  
  var organization: String
  
  var `type`: ORGANIZATION
}
object OrganizationTaskContainer {
  
  inline def apply(organization: String): OrganizationTaskContainer = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ORGANIZATION")
    __obj.asInstanceOf[OrganizationTaskContainer]
  }
  
  extension [Self <: OrganizationTaskContainer](x: Self) {
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setType(value: ORGANIZATION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
