package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content47403Content55` extends StObject {
  
  /** Response */
  var `201`: Content47
  
  var `403`: Content55
  
  var `404`: Content55
}
object `201Content47403Content55` {
  
  inline def apply(`201`: Content47, `403`: Content55, `404`: Content55): `201Content47403Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content47403Content55`]
  }
  
  extension [Self <: `201Content47403Content55`](x: Self) {
    
    inline def set201(value: Content47): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
