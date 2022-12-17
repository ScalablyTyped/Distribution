package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgidNumber extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** The unique identifier of the organization. */
  var org_id: Double
}
object OrgidNumber {
  
  inline def apply(enterprise: String, org_id: Double): OrgidNumber = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], org_id = org_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgidNumber]
  }
  
  extension [Self <: OrgidNumber](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setOrg_id(value: Double): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
  }
}
