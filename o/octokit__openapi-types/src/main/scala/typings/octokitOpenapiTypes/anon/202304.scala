package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202304` extends StObject {
  
  var `202`: Content4
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `500`: Content6
}
object `202304` {
  
  inline def apply(`202`: Content4, `304`: Any, `401`: Content6, `403`: Content6, `404`: Content6, `500`: Content6): `202304` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202304`]
  }
  
  extension [Self <: `202304`](x: Self) {
    
    inline def set202(value: Content4): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
