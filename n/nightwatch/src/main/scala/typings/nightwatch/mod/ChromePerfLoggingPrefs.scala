package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePerfLoggingPrefs extends js.Object {
  /**
    * Default: 1000. The requested number of milliseconds between DevTools trace buffer usage events. For example, if 1000,
    * then once per second, DevTools will report how full the trace buffer is. If a report indicates the buffer usage is 100%,
    * a warning will be issued.
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.undefined
  /**
    * Default: true. Whether or not to collect events from Network domain.
    */
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true. Whether or not to collect events from Page domain.
    */
  var enablePage: js.UndefOr[Boolean] = js.undefined
  /**
    * A comma-separated string of Chrome tracing categories for which trace events should be collected.
    * An unspecified or empty string disables tracing.
    */
  var traceCategories: js.UndefOr[String] = js.undefined
}

object ChromePerfLoggingPrefs {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: Int | Double = null,
    enableNetwork: js.UndefOr[Boolean] = js.undefined,
    enablePage: js.UndefOr[Boolean] = js.undefined,
    traceCategories: String = null
  ): ChromePerfLoggingPrefs = {
    val __obj = js.Dynamic.literal()
    if (bufferUsageReportingInterval != null) __obj.updateDynamic("bufferUsageReportingInterval")(bufferUsageReportingInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetwork)) __obj.updateDynamic("enableNetwork")(enableNetwork.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePage)) __obj.updateDynamic("enablePage")(enablePage.asInstanceOf[js.Any])
    if (traceCategories != null) __obj.updateDynamic("traceCategories")(traceCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePerfLoggingPrefs]
  }
}

