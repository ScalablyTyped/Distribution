package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200585` extends StObject {
  
  /** @description Response */
  var `200`: `585`
  
  var `404`: Content36
  
  var `422`: Content346
}
object `200585` {
  
  inline def apply(`200`: `585`, `404`: Content36, `422`: Content346): `200585` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200585`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200585`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `585`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
