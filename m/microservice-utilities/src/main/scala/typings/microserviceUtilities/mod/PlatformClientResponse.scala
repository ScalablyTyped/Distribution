package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformClientResponse[T] extends js.Object {
  var config: js.Object = js.native
  var data: js.UndefOr[T] = js.native
  var headers: js.Any = js.native
  var request: js.UndefOr[js.Any] = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object PlatformClientResponse {
  @scala.inline
  def apply[T](config: js.Object, headers: js.Any, status: Double, statusText: String): PlatformClientResponse[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformClientResponse[T]]
  }
  @scala.inline
  implicit class PlatformClientResponseOps[Self <: PlatformClientResponse[_], T] (val x: Self with PlatformClientResponse[T]) extends AnyVal {
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
    def setConfig(value: js.Object): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

