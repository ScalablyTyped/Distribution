package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301Content41404Content41` extends StObject {
  
  var `301`: Content41
  
  var `404`: Content41
  
  var `410`: Content41
}
object `301Content41404Content41` {
  
  inline def apply(`301`: Content41, `404`: Content41, `410`: Content41): `301Content41404Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301Content41404Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301Content41404Content41`] (val x: Self) extends AnyVal {
    
    inline def set301(value: Content41): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
