package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRequiredconversationresolution` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRequiredconversationresolution
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `422`: Content395
}
object `200ContentApplicationjsonRequiredconversationresolution` {
  
  inline def apply(
    `200`: ContentApplicationjsonRequiredconversationresolution,
    `403`: Content48,
    `404`: Content48,
    `422`: Content395
  ): `200ContentApplicationjsonRequiredconversationresolution` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRequiredconversationresolution`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRequiredconversationresolution`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRequiredconversationresolution): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
