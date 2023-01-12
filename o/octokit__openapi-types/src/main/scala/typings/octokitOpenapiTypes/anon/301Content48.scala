package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonContactemail
  
  var `301`: Content48
  
  var `404`: Content48
}
object `301Content48` {
  
  inline def apply(`200`: ContentApplicationjsonContactemail, `301`: Content48, `404`: Content48): `301Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301Content48`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContactemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content48): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
