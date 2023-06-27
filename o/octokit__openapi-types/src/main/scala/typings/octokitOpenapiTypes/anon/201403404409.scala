package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201403404409` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonShaString
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `409`: Content41
  
  var `422`: Content414
}
object `201403404409` {
  
  inline def apply(
    `201`: ContentApplicationjsonShaString,
    `403`: Content41,
    `404`: Content41,
    `409`: Content41,
    `422`: Content414
  ): `201403404409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201403404409`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201403404409`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonShaString): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content41): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
