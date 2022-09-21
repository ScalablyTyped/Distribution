package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201304403404422` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonForks
  
  var `304`: Any
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `201304403404422` {
  
  inline def apply(
    `201`: ContentApplicationjsonForks,
    `304`: Any,
    `403`: Content55,
    `404`: Content55,
    `422`: Content421
  ): `201304403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201304403404422`]
  }
  
  extension [Self <: `201304403404422`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonForks): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
