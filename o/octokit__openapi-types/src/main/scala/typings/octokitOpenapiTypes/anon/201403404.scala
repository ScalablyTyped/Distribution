package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201403404` extends StObject {
  
  /** Response */
  var `201`: Content4
  
  var `403`: Content6
  
  var `404`: Content6
}
object `201403404` {
  
  inline def apply(`201`: Content4, `403`: Content6, `404`: Content6): `201403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201403404`]
  }
  
  extension [Self <: `201403404`](x: Self) {
    
    inline def set201(value: Content4): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
