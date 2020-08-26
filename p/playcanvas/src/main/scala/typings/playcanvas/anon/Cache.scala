package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var maxRetryDelay: js.UndefOr[Double] = js.native
  var responseType: js.UndefOr[String] = js.native
  var retry: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object Cache {
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setMaxRetryDelay(value: Double): Self = this.set("maxRetryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetryDelay: Self = this.set("maxRetryDelay", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setRetry(value: Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

