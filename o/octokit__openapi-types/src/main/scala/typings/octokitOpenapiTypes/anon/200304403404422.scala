package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304403404422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson593
  
  var `304`: Any
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `200304403404422` {
  
  inline def apply(
    `200`: ContentApplicationjson593,
    `304`: Any,
    `403`: Content55,
    `404`: Content55,
    `422`: Content421
  ): `200304403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304403404422`]
  }
  
  extension [Self <: `200304403404422`](x: Self) {
    
    inline def set200(value: ContentApplicationjson593): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
