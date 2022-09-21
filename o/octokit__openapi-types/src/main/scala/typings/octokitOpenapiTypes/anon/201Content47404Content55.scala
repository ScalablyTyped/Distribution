package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content47404Content55` extends StObject {
  
  /** Response after successfully creaing a secret */
  var `201`: Content47
  
  var `404`: Content55
  
  var `422`: Content421
}
object `201Content47404Content55` {
  
  inline def apply(`201`: Content47, `404`: Content55, `422`: Content421): `201Content47404Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content47404Content55`]
  }
  
  extension [Self <: `201Content47404Content55`](x: Self) {
    
    inline def set201(value: Content47): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
