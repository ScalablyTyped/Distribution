package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadTaskOnHeadersReceivedCallbackResult extends StObject {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
}
object DownloadTaskOnHeadersReceivedCallbackResult {
  
  inline def apply(header: js.Object): DownloadTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTaskOnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadTaskOnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
