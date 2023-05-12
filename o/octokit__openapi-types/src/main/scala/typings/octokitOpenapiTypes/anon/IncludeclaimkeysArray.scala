package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeclaimkeysArray extends StObject {
  
  /** @description Array of unique strings. Each claim key can only contain alphanumeric characters and underscores. */
  var include_claim_keys: js.Array[String]
}
object IncludeclaimkeysArray {
  
  inline def apply(include_claim_keys: js.Array[String]): IncludeclaimkeysArray = {
    val __obj = js.Dynamic.literal(include_claim_keys = include_claim_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeclaimkeysArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeclaimkeysArray] (val x: Self) extends AnyVal {
    
    inline def setInclude_claim_keys(value: js.Array[String]): Self = StObject.set(x, "include_claim_keys", value.asInstanceOf[js.Any])
    
    inline def setInclude_claim_keysVarargs(value: String*): Self = StObject.set(x, "include_claim_keys", js.Array(value*))
  }
}
