package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDefaults` extends StObject {
  
  /** Response when a user is able to create codespaces from the repository. */
  var `200`: ContentApplicationjsonDefaults
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
}
object `200ContentApplicationjsonDefaults` {
  
  inline def apply(`200`: ContentApplicationjsonDefaults, `401`: Content48, `403`: Content48, `404`: Content48): `200ContentApplicationjsonDefaults` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDefaults`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonDefaults`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDefaults): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
