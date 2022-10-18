package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizationpermission
  
  var `304`: Any
  
  var `401`: Content6
  
  /** Forbidden */
  var `403`: ContentApplicationjsonDocumentationurlErrors
  
  /** Not Found if the authenticated user does not have access to the project */
  var `404`: Any
  
  var `410`: Content6
  
  var `422`: Content7
}
object `410422` {
  
  inline def apply(
    `200`: ContentApplicationjsonOrganizationpermission,
    `304`: Any,
    `401`: Content6,
    `403`: ContentApplicationjsonDocumentationurlErrors,
    `404`: Any,
    `410`: Content6,
    `422`: Content7
  ): `410422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`410422`]
  }
  
  extension [Self <: `410422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOrganizationpermission): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurlErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
