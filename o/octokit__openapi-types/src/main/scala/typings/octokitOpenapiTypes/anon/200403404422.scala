package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200403404422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonEnforceadmins
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content7
}
object `200403404422` {
  
  inline def apply(`200`: ContentApplicationjsonEnforceadmins, `403`: Content6, `404`: Content6, `422`: Content7): `200403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200403404422`]
  }
  
  extension [Self <: `200403404422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonEnforceadmins): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
