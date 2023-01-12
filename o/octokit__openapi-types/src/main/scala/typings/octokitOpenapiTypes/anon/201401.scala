package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201401` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonSinglefilepaths
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `422`: Content397
}
object `201401` {
  
  inline def apply(
    `201`: ContentApplicationjsonSinglefilepaths,
    `401`: Content48,
    `403`: Content48,
    `404`: Content48,
    `422`: Content397
  ): `201401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201401`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201401`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonSinglefilepaths): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
