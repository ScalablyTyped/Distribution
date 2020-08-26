package typings.pollyjsCore.anon

import typings.pollyjsCore.mod.Headers
import typings.pollyjsCore.mod.MatchBy
import typings.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: js.UndefOr[Boolean | (MatchBy[_, _])] = js.native
  var headers: js.UndefOr[Boolean | Exclude | (MatchBy[Headers, Headers])] = js.native
  var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  var order: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[Boolean | (MatchBy[String, String]) | Hash] = js.native
}

object Body {
  @scala.inline
  def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setBodyFunction2(value: (_, /* req */ Request) => _): Self = this.set("body", js.Any.fromFunction2(value))
    @scala.inline
    def setBody(value: Boolean | (MatchBy[_, _])): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeadersFunction2(value: (Headers, /* req */ Request) => Headers): Self = this.set("headers", js.Any.fromFunction2(value))
    @scala.inline
    def setHeaders(value: Boolean | Exclude | (MatchBy[Headers, Headers])): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethodFunction2(value: (String, /* req */ Request) => String): Self = this.set("method", js.Any.fromFunction2(value))
    @scala.inline
    def setMethod(value: Boolean | (MatchBy[String, String])): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOrder(value: Boolean): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setUrlFunction2(value: (String, /* req */ Request) => String): Self = this.set("url", js.Any.fromFunction2(value))
    @scala.inline
    def setUrl(value: Boolean | (MatchBy[String, String]) | Hash): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

