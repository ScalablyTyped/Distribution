package typings.mercadopagoSdkJs.bricks

import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.critical
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.non_critical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickError extends StObject {
  
  var cause: String
  
  var message: String
  
  var `type`: non_critical | critical
}
object BrickError {
  
  inline def apply(cause: String, message: String, `type`: non_critical | critical): BrickError = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrickError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickError] (val x: Self) extends AnyVal {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: non_critical | critical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
