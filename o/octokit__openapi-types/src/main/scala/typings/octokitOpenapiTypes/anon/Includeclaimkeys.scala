package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includeclaimkeys extends StObject {
  
  var include_claim_keys: js.Array[String]
}
object Includeclaimkeys {
  
  inline def apply(include_claim_keys: js.Array[String]): Includeclaimkeys = {
    val __obj = js.Dynamic.literal(include_claim_keys = include_claim_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includeclaimkeys]
  }
  
  extension [Self <: Includeclaimkeys](x: Self) {
    
    inline def setInclude_claim_keys(value: js.Array[String]): Self = StObject.set(x, "include_claim_keys", value.asInstanceOf[js.Any])
    
    inline def setInclude_claim_keysVarargs(value: String*): Self = StObject.set(x, "include_claim_keys", js.Array(value*))
  }
}
