package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonHighlightedcontent` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonHighlightedcontent
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `422`: Content397
}
object `200ContentApplicationjsonHighlightedcontent` {
  
  inline def apply(
    `200`: ContentApplicationjsonHighlightedcontent,
    `403`: Content48,
    `404`: Content48,
    `422`: Content397
  ): `200ContentApplicationjsonHighlightedcontent` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonHighlightedcontent`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonHighlightedcontent`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonHighlightedcontent): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
