package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTaskOnHeadersReceivedCallbackResult extends StObject {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
}
object RequestTaskOnHeadersReceivedCallbackResult {
  
  inline def apply(header: js.Object): RequestTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTaskOnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestTaskOnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
