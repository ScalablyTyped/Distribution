package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  def error(obj: js.Object): Unit = js.native
  
  var headers: js.Object = js.native
  
  var responseType: String = js.native
  
  def success(obj: js.Object): Unit = js.native
  
  var url: String = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object Error {
  
  @scala.inline
  def apply(
    error: js.Object => Unit,
    headers: js.Object,
    responseType: String,
    success: js.Object => Unit,
    url: String
  ): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), headers = headers.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Object => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Object => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
