package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRoleid extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the role. */
  var role_id: Double
}
object OrgRoleid {
  
  inline def apply(org_ : String, role_id: Double): OrgRoleid = {
    val __obj = js.Dynamic.literal(role_id = role_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRoleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgRoleid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRole_id(value: Double): Self = StObject.set(x, "role_id", value.asInstanceOf[js.Any])
  }
}
