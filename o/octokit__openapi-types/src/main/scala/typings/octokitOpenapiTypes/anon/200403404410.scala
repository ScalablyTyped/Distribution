package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200403404410` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonReviewrequester
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `410`: Content36
}
object `200403404410` {
  
  inline def apply(`200`: ContentApplicationjsonReviewrequester, `403`: Content36, `404`: Content36, `410`: Content36): `200403404410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200403404410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200403404410`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonReviewrequester): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
