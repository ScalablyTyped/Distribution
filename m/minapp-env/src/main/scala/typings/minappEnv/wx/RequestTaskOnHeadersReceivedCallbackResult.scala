package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestTaskOnHeadersReceivedCallbackResult extends js.Object {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object = js.native
}
object RequestTaskOnHeadersReceivedCallbackResult {
  
  @scala.inline
  def apply(header: js.Object): RequestTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTaskOnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit class RequestTaskOnHeadersReceivedCallbackResultOps[Self <: RequestTaskOnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
