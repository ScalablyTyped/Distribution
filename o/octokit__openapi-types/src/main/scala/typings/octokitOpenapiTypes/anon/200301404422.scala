package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301404422` extends StObject {
  
  /** Response */
  var `200`: Content442
  
  var `301`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `200301404422` {
  
  inline def apply(`200`: Content442, `301`: Content55, `404`: Content55, `422`: Content421): `200301404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301404422`]
  }
  
  extension [Self <: `200301404422`](x: Self) {
    
    inline def set200(value: Content442): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content55): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
