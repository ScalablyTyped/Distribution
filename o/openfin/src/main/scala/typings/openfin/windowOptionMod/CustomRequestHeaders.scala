package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRequestHeaders extends js.Object {
  var headers: js.Array[_] = js.native
  var urlPatterns: js.Array[String] = js.native
}

object CustomRequestHeaders {
  @scala.inline
  def apply(headers: js.Array[_], urlPatterns: js.Array[String]): CustomRequestHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRequestHeaders]
  }
  @scala.inline
  implicit class CustomRequestHeadersOps[Self <: CustomRequestHeaders] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlPatternsVarargs(value: String*): Self = this.set("urlPatterns", js.Array(value :_*))
    @scala.inline
    def setUrlPatterns(value: js.Array[String]): Self = this.set("urlPatterns", value.asInstanceOf[js.Any])
  }
  
}

