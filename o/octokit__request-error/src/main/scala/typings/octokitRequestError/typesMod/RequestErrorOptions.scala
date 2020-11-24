package typings.octokitRequestError.typesMod

import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestErrorOptions extends js.Object {
  
  var headers: js.UndefOr[ResponseHeaders] = js.native
  
  var request: RequestOptions = js.native
}
object RequestErrorOptions {
  
  @scala.inline
  def apply(request: RequestOptions): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorOptions]
  }
  
  @scala.inline
  implicit class RequestErrorOptionsOps[Self <: RequestErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: RequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: ResponseHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
