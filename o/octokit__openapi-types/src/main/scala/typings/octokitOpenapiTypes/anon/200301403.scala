package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301403` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonContributorsurl
  
  var `301`: Content36
  
  var `403`: Content36
  
  var `404`: Content36
}
object `200301403` {
  
  inline def apply(`200`: ContentApplicationjsonContributorsurl, `301`: Content36, `403`: Content36, `404`: Content36): `200301403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200301403`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContributorsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
