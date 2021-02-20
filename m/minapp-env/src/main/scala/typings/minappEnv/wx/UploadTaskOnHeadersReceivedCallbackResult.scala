package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTaskOnHeadersReceivedCallbackResult extends StObject {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object = js.native
}
object UploadTaskOnHeadersReceivedCallbackResult {
  
  @scala.inline
  def apply(header: js.Object): UploadTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskOnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit class UploadTaskOnHeadersReceivedCallbackResultMutableBuilder[Self <: UploadTaskOnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
