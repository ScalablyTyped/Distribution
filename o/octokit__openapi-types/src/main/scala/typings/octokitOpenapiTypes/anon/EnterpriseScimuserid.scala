package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseScimuserid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** The unique identifier of the SCIM user. */
  var scim_user_id: String
}
object EnterpriseScimuserid {
  
  inline def apply(enterprise: String, scim_user_id: String): EnterpriseScimuserid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], scim_user_id = scim_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseScimuserid]
  }
  
  extension [Self <: EnterpriseScimuserid](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setScim_user_id(value: String): Self = StObject.set(x, "scim_user_id", value.asInstanceOf[js.Any])
  }
}
