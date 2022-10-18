package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403500` extends StObject {
  
  var `403`: Content6
  
  var `500`: Content6
}
object `403500` {
  
  inline def apply(`403`: Content6, `500`: Content6): `403500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403500`]
  }
  
  extension [Self <: `403500`](x: Self) {
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
