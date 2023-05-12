package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includeclaimkeys extends StObject {
  
  /** @description Array of unique strings. Each claim key can only contain alphanumeric characters and underscores. */
  var include_claim_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored. */
  var use_default: Boolean
}
object Includeclaimkeys {
  
  inline def apply(use_default: Boolean): Includeclaimkeys = {
    val __obj = js.Dynamic.literal(use_default = use_default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includeclaimkeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includeclaimkeys] (val x: Self) extends AnyVal {
    
    inline def setInclude_claim_keys(value: js.Array[String]): Self = StObject.set(x, "include_claim_keys", value.asInstanceOf[js.Any])
    
    inline def setInclude_claim_keysUndefined: Self = StObject.set(x, "include_claim_keys", js.undefined)
    
    inline def setInclude_claim_keysVarargs(value: String*): Self = StObject.set(x, "include_claim_keys", js.Array(value*))
    
    inline def setUse_default(value: Boolean): Self = StObject.set(x, "use_default", value.asInstanceOf[js.Any])
  }
}
