package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301404410422` extends StObject {
  
  /** @description Response */
  var `200`: `720`
  
  var `301`: Content41
  
  var `404`: Content41
  
  var `410`: Content41
  
  var `422`: Content414
}
object `301404410422` {
  
  inline def apply(`200`: `720`, `301`: Content41, `404`: Content41, `410`: Content41, `422`: Content414): `301404410422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301404410422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301404410422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `720`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content41): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
