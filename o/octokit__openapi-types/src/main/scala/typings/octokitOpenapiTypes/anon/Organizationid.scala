package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizationid extends StObject {
  
  /** The unique identifier of the organization. */
  var organization_id: String
}
object Organizationid {
  
  inline def apply(organization_id: String): Organizationid = {
    val __obj = js.Dynamic.literal(organization_id = organization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationid]
  }
  
  extension [Self <: Organizationid](x: Self) {
    
    inline def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
  }
}
