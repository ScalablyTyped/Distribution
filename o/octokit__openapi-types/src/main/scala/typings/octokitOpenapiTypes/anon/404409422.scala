package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404409422` extends StObject {
  
  /** Successful Response (The resulting merge commit) */
  var `201`: ContentApplicationjsonStats
  
  var `403`: Content6
  
  /** Not Found when the base or head does not exist */
  var `404`: Any
  
  /** Conflict when there is a merge conflict */
  var `409`: Any
  
  var `422`: Content8
}
object `404409422` {
  
  inline def apply(`201`: ContentApplicationjsonStats, `403`: Content6, `404`: Any, `409`: Any, `422`: Content8): `404409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404409422`]
  }
  
  extension [Self <: `404409422`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonStats): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
