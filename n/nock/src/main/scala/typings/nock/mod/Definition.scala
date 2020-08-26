package typings.nock.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var body: js.UndefOr[RequestBodyMatcher] = js.native
  var headers: js.UndefOr[ReplyHeaders] = js.native
  var method: js.UndefOr[String] = js.native
  var options: js.UndefOr[Options] = js.native
  var path: String = js.native
  var port: js.UndefOr[Double | String] = js.native
  var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.native
  var response: js.UndefOr[ReplyBody] = js.native
  var scope: String = js.native
  var status: js.UndefOr[Double] = js.native
}

object Definition {
  @scala.inline
  def apply(path: String, scope: String): Definition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFunction1(value: /* body */ js.Any => Boolean): Self = this.set("body", js.Any.fromFunction1(value))
    @scala.inline
    def setBody(value: RequestBodyMatcher): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: ReplyHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = this.set("reqheaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqheaders: Self = this.set("reqheaders", js.undefined)
    @scala.inline
    def setResponse(value: ReplyBody): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

