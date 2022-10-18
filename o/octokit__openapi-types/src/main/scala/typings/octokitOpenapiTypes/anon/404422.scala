package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404422` extends StObject {
  
  var `200`: ContentApplicationjsonLabelsTotalcount
  
  var `404`: Content6
  
  var `422`: Content7
}
object `404422` {
  
  inline def apply(`200`: ContentApplicationjsonLabelsTotalcount, `404`: Content6, `422`: Content7): `404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404422`]
  }
  
  extension [Self <: `404422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonLabelsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
