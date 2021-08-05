package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTaskOnErrorCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMsg: String
}
object SocketTaskOnErrorCallbackResult {
  
  inline def apply(errMsg: String): SocketTaskOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnErrorCallbackResult]
  }
  
  extension [Self <: SocketTaskOnErrorCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
