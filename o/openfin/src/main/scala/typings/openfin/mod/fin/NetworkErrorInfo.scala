package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkErrorInfo
  extends StObject
     with ErrorInfo {
  
  var networkErrorCode: Double
}
object NetworkErrorInfo {
  
  inline def apply(message: String, networkErrorCode: Double, stack: String): NetworkErrorInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], networkErrorCode = networkErrorCode.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkErrorInfo]
  }
  
  extension [Self <: NetworkErrorInfo](x: Self) {
    
    inline def setNetworkErrorCode(value: Double): Self = StObject.set(x, "networkErrorCode", value.asInstanceOf[js.Any])
  }
}
