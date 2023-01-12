package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403404409422` extends StObject {
  
  /** Successful Response (The resulting merge commit) */
  var `201`: ContentApplicationjsonAuthorCommentsurl
  
  var `403`: Content48
  
  /** Not Found when the base or head does not exist */
  var `404`: Any
  
  /** Conflict when there is a merge conflict */
  var `409`: Any
  
  var `422`: Content397
}
object `403404409422` {
  
  inline def apply(
    `201`: ContentApplicationjsonAuthorCommentsurl,
    `403`: Content48,
    `404`: Any,
    `409`: Any,
    `422`: Content397
  ): `403404409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403404409422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403404409422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonAuthorCommentsurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
