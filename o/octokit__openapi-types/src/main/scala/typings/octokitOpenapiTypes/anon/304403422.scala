package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304403422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonIncompleteresults
  
  var `304`: Any
  
  var `403`: Content6
  
  var `422`: Content8
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `304403422` {
  
  inline def apply(
    `200`: ContentApplicationjsonIncompleteresults,
    `304`: Any,
    `403`: Content6,
    `422`: Content8,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `304403422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304403422`]
  }
  
  extension [Self <: `304403422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonIncompleteresults): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
