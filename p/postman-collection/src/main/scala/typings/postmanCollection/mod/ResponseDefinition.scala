package typings.postmanCollection.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseDefinition extends PropertyDefinition {
  var body: js.UndefOr[String] = js.native
  var code: Double = js.native
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.native
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  var originalRequest: js.UndefOr[RequestDefinition] = js.native
  var responseTime: Double = js.native
  var stream: js.UndefOr[Buffer | Uint8Array] = js.native
}

object ResponseDefinition {
  @scala.inline
  def apply(code: Double, responseTime: Double): ResponseDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDefinition]
  }
  @scala.inline
  implicit class ResponseDefinitionOps[Self <: ResponseDefinition] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseTime(value: Double): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCookieVarargs(value: CookieDefinition*): Self = this.set("cookie", js.Array(value :_*))
    @scala.inline
    def setCookie(value: js.Array[CookieDefinition]): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setHeaderVarargs(value: HeaderDefinition*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[HeaderDefinition]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setOriginalRequest(value: RequestDefinition): Self = this.set("originalRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalRequest: Self = this.set("originalRequest", js.undefined)
    @scala.inline
    def setStream(value: Buffer | Uint8Array): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

