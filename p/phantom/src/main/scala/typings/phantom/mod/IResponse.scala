package typings.phantom.mod

import typings.phantom.anon.Name
import typings.phantom.phantomStrings.end
import typings.phantom.phantomStrings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResponse extends js.Object {
  
  var bodySize: Double = js.native
  
  var contentType: String = js.native
  
  var headers: js.Array[Name] = js.native
  
  var id: String = js.native
  
  var redirectURL: String = js.native
  
  var stage: start | end = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
  
  var time: Date = js.native
  
  var url: String = js.native
}
object IResponse {
  
  @scala.inline
  def apply(
    bodySize: Double,
    contentType: String,
    headers: js.Array[Name],
    id: String,
    redirectURL: String,
    stage: start | end,
    status: Double,
    statusText: String,
    time: Date,
    url: String
  ): IResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponse]
  }
  
  @scala.inline
  implicit class IResponseOps[Self <: IResponse] (val x: Self) extends AnyVal {
    
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
    def setBodySize(value: Double): Self = this.set("bodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Name*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Name]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: String): Self = this.set("redirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: start | end): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
