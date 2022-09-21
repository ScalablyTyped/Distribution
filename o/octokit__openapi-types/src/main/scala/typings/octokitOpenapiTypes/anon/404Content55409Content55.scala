package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content55409Content55` extends StObject {
  
  var `304`: Any
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `409`: Content55
}
object `404Content55409Content55` {
  
  inline def apply(`304`: Any, `403`: Content55, `404`: Content55, `409`: Content55): `404Content55409Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content55409Content55`]
  }
  
  extension [Self <: `404Content55409Content55`](x: Self) {
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content55): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
