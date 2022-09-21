package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `493` extends StObject {
  
  /** Response */
  var `201`: Content47
  
  var `403`: Content55
}
object `493` {
  
  inline def apply(`201`: Content47, `403`: Content55): `493` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`493`]
  }
  
  extension [Self <: `493`](x: Self) {
    
    inline def set201(value: Content47): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
