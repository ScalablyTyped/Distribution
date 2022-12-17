package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonExcludeownerprojects304Unknown` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonExcludeownerprojects
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `422`: Content397
}
object `201ContentApplicationjsonExcludeownerprojects304Unknown` {
  
  inline def apply(
    `201`: ContentApplicationjsonExcludeownerprojects,
    `304`: Any,
    `401`: Content48,
    `403`: Content48,
    `422`: Content397
  ): `201ContentApplicationjsonExcludeownerprojects304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonExcludeownerprojects304Unknown`]
  }
  
  extension [Self <: `201ContentApplicationjsonExcludeownerprojects304Unknown`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonExcludeownerprojects): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
