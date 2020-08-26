package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePerfLoggingPrefs extends js.Object {
  /**
    * Default: 1000. The requested number of milliseconds between DevTools trace buffer usage events. For example, if 1000,
    * then once per second, DevTools will report how full the trace buffer is. If a report indicates the buffer usage is 100%,
    * a warning will be issued.
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.native
  /**
    * Default: true. Whether or not to collect events from Network domain.
    */
  var enableNetwork: js.UndefOr[Boolean] = js.native
  /**
    * Default: true. Whether or not to collect events from Page domain.
    */
  var enablePage: js.UndefOr[Boolean] = js.native
  /**
    * A comma-separated string of Chrome tracing categories for which trace events should be collected.
    * An unspecified or empty string disables tracing.
    */
  var traceCategories: js.UndefOr[String] = js.native
}

object ChromePerfLoggingPrefs {
  @scala.inline
  def apply(): ChromePerfLoggingPrefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePerfLoggingPrefs]
  }
  @scala.inline
  implicit class ChromePerfLoggingPrefsOps[Self <: ChromePerfLoggingPrefs] (val x: Self) extends AnyVal {
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
    def setBufferUsageReportingInterval(value: Double): Self = this.set("bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferUsageReportingInterval: Self = this.set("bufferUsageReportingInterval", js.undefined)
    @scala.inline
    def setEnableNetwork(value: Boolean): Self = this.set("enableNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNetwork: Self = this.set("enableNetwork", js.undefined)
    @scala.inline
    def setEnablePage(value: Boolean): Self = this.set("enablePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePage: Self = this.set("enablePage", js.undefined)
    @scala.inline
    def setTraceCategories(value: String): Self = this.set("traceCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceCategories: Self = this.set("traceCategories", js.undefined)
  }
  
}

