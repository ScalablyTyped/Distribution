package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301Content6` extends StObject {
  
  var `301`: Content6
  
  var `404`: Content6
  
  var `410`: Content6
}
object `301Content6` {
  
  inline def apply(`301`: Content6, `404`: Content6, `410`: Content6): `301Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301Content6`]
  }
  
  extension [Self <: `301Content6`](x: Self) {
    
    inline def set301(value: Content6): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
