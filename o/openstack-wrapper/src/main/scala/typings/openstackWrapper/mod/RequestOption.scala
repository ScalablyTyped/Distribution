package typings.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOption extends js.Object {
  var headers: js.UndefOr[js.Any] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var metricLogger: js.UndefOr[js.Any] = js.native
  var metricRequestID: js.UndefOr[String] = js.native
  var metricUserName: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[js.Any] = js.native
  var uri: js.UndefOr[String] = js.native
}

object RequestOption {
  @scala.inline
  def apply(): RequestOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOption]
  }
  @scala.inline
  implicit class RequestOptionOps[Self <: RequestOption] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMetricLogger(value: js.Any): Self = this.set("metricLogger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricLogger: Self = this.set("metricLogger", js.undefined)
    @scala.inline
    def setMetricRequestID(value: String): Self = this.set("metricRequestID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricRequestID: Self = this.set("metricRequestID", js.undefined)
    @scala.inline
    def setMetricUserName(value: String): Self = this.set("metricUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricUserName: Self = this.set("metricUserName", js.undefined)
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

