package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBrickBackUrls extends StObject {
  
  var error: String
  
  var `return`: String
}
object StatusBrickBackUrls {
  
  inline def apply(error: String, `return`: String): StatusBrickBackUrls = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBrickBackUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusBrickBackUrls] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setReturn(value: String): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
  }
}
