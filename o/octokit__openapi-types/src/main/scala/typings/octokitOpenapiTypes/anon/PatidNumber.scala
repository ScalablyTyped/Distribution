package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatidNumber extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /** @description Unique identifier of the fine-grained personal access token. */
  var pat_id: Double
}
object PatidNumber {
  
  inline def apply(org_ : String, pat_id: Double): PatidNumber = {
    val __obj = js.Dynamic.literal(pat_id = pat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatidNumber] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPat_id(value: Double): Self = StObject.set(x, "pat_id", value.asInstanceOf[js.Any])
  }
}
