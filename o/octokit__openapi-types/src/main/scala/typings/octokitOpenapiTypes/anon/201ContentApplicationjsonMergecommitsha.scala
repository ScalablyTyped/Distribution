package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonMergecommitsha` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonMergecommitsha
  
  var `403`: Content48
  
  /** Unprocessable Entity if user is not a collaborator */
  var `422`: Any
}
object `201ContentApplicationjsonMergecommitsha` {
  
  inline def apply(`201`: ContentApplicationjsonMergecommitsha, `403`: Content48, `422`: Any): `201ContentApplicationjsonMergecommitsha` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonMergecommitsha`]
  }
  
  extension [Self <: `201ContentApplicationjsonMergecommitsha`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonMergecommitsha): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
