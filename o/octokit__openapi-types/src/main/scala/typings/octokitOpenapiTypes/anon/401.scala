package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonRepositoryselection
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `401` {
  
  inline def apply(
    `201`: ContentApplicationjsonRepositoryselection,
    `401`: Content6,
    `403`: Content6,
    `404`: Content6,
    `422`: Content8
  ): `401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`401`]
  }
  
  extension [Self <: `401`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonRepositoryselection): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
