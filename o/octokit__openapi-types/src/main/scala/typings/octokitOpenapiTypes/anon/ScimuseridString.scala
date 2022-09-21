package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimuseridString extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the SCIM user. */
  var scim_user_id: String
}
object ScimuseridString {
  
  inline def apply(org_ : String, scim_user_id: String): ScimuseridString = {
    val __obj = js.Dynamic.literal(scim_user_id = scim_user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimuseridString]
  }
  
  extension [Self <: ScimuseridString](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setScim_user_id(value: String): Self = StObject.set(x, "scim_user_id", value.asInstanceOf[js.Any])
  }
}
