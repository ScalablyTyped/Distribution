package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRequiredconversationresolution` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRequiredconversationresolution
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content418
}
object `200ContentApplicationjsonRequiredconversationresolution` {
  
  inline def apply(
    `200`: ContentApplicationjsonRequiredconversationresolution,
    `403`: Content55,
    `404`: Content55,
    `422`: Content418
  ): `200ContentApplicationjsonRequiredconversationresolution` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRequiredconversationresolution`]
  }
  
  extension [Self <: `200ContentApplicationjsonRequiredconversationresolution`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRequiredconversationresolution): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content418): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
