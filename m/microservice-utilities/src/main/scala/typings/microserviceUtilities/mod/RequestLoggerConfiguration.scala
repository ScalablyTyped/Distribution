package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLoggerConfiguration extends js.Object {
  var extendErrorObjects: js.UndefOr[Boolean] = js.native
  var jsonSpace: js.UndefOr[Double] = js.native
  var logFunction: js.UndefOr[js.Function1[/* msg */ js.Any, Unit]] = js.native
}

object RequestLoggerConfiguration {
  @scala.inline
  def apply(): RequestLoggerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerConfiguration]
  }
  @scala.inline
  implicit class RequestLoggerConfigurationOps[Self <: RequestLoggerConfiguration] (val x: Self) extends AnyVal {
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
    def setExtendErrorObjects(value: Boolean): Self = this.set("extendErrorObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendErrorObjects: Self = this.set("extendErrorObjects", js.undefined)
    @scala.inline
    def setJsonSpace(value: Double): Self = this.set("jsonSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonSpace: Self = this.set("jsonSpace", js.undefined)
    @scala.inline
    def setLogFunction(value: /* msg */ js.Any => Unit): Self = this.set("logFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogFunction: Self = this.set("logFunction", js.undefined)
  }
  
}

