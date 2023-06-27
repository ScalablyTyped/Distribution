package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201401403404` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonBodyColumnsurl
  
  var `401`: Content41
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `410`: Content41
  
  var `422`: Content549
}
object `201401403404` {
  
  inline def apply(
    `201`: ContentApplicationjsonBodyColumnsurl,
    `401`: Content41,
    `403`: Content41,
    `404`: Content41,
    `410`: Content41,
    `422`: Content549
  ): `201401403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201401403404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201401403404`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonBodyColumnsurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
