package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizations extends StObject {
  
  var organizations: js.Array[Description]
  
  var total_count: Double
}
object Organizations {
  
  inline def apply(organizations: js.Array[Description], total_count: Double): Organizations = {
    val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizations]
  }
  
  extension [Self <: Organizations](x: Self) {
    
    inline def setOrganizations(value: js.Array[Description]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(value: Description*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
