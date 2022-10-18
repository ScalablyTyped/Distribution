package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjson34
  
  /** Reset Content */
  var `205`: Any
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
}
object `205` {
  
  inline def apply(`202`: ContentApplicationjson34, `205`: Any, `304`: Any, `401`: Content6, `403`: Content6): `205` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("205")(`205`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def set202(value: ContentApplicationjson34): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set205(value: Any): Self = StObject.set(x, "205", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
