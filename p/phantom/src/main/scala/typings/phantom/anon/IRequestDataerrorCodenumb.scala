package typings.phantom.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phantom.phantom.IRequestData & {  errorCode :number,   errorString :string} */
@js.native
trait IRequestDataerrorCodenumb extends js.Object {
  var errorCode: Double = js.native
  var errorString: String = js.native
  var headers: js.Array[Name] = js.native
  var id: Double = js.native
  var method: String = js.native
  var time: Date = js.native
  var url: String = js.native
}

object IRequestDataerrorCodenumb {
  @scala.inline
  def apply(
    errorCode: Double,
    errorString: String,
    headers: js.Array[Name],
    id: Double,
    method: String,
    time: Date,
    url: String
  ): IRequestDataerrorCodenumb = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestDataerrorCodenumb]
  }
  @scala.inline
  implicit class IRequestDataerrorCodenumbOps[Self <: IRequestDataerrorCodenumb] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorString(value: String): Self = this.set("errorString", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: Name*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Name]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

