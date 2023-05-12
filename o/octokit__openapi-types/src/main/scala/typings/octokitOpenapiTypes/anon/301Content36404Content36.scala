package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301Content36404Content36` extends StObject {
  
  var `301`: Content36
  
  var `404`: Content36
  
  var `410`: Content36
}
object `301Content36404Content36` {
  
  inline def apply(`301`: Content36, `404`: Content36, `410`: Content36): `301Content36404Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301Content36404Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301Content36404Content36`] (val x: Self) extends AnyVal {
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
