package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsTotalcount extends StObject {
  
  var organizations: js.Array[Hooksurl]
  
  var total_count: Double
}
object OrganizationsTotalcount {
  
  inline def apply(organizations: js.Array[Hooksurl], total_count: Double): OrganizationsTotalcount = {
    val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setOrganizations(value: js.Array[Hooksurl]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(value: Hooksurl*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
