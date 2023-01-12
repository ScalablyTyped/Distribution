package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301403` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDefaultbranch
  
  var `301`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
}
object `200301403` {
  
  inline def apply(`200`: ContentApplicationjsonDefaultbranch, `301`: Content48, `403`: Content48, `404`: Content48): `200301403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200301403`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content48): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
