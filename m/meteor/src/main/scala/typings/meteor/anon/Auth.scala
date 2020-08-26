package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  var auth: js.UndefOr[String] = js.native
  var beforeSend: js.UndefOr[js.Function] = js.native
  var content: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Object] = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var npmRequestOptions: js.UndefOr[js.Object] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var query: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Auth {
  @scala.inline
  def apply(): Auth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth]
  }
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBeforeSend(value: js.Function): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setNpmRequestOptions(value: js.Object): Self = this.set("npmRequestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpmRequestOptions: Self = this.set("npmRequestOptions", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

