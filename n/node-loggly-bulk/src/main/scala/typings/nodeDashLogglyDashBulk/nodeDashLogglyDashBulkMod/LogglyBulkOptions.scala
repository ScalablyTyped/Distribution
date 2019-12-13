package typings.nodeDashLogglyDashBulk.nodeDashLogglyDashBulkMod

import typings.loggly.Anon_Password
import typings.loggly.logglyMod.LogglyOptions
import typings.nodeDashLogglyDashBulk.Anon_RetriesInMilliSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogglyBulkOptions extends LogglyOptions {
  var bufferOptions: js.UndefOr[Anon_RetriesInMilliSeconds] = js.undefined
  var isBulk: js.UndefOr[Boolean] = js.undefined
  var networkErrorsOnConsole: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var useTagHeader: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object LogglyBulkOptions {
  @scala.inline
  def apply(
    subdomain: String,
    token: String,
    auth: Anon_Password = null,
    bufferOptions: Anon_RetriesInMilliSeconds = null,
    host: String = null,
    isBulk: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    networkErrorsOnConsole: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    tags: js.Array[String] = null,
    useTagHeader: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): LogglyBulkOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (bufferOptions != null) __obj.updateDynamic("bufferOptions")(bufferOptions.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(isBulk)) __obj.updateDynamic("isBulk")(isBulk.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(networkErrorsOnConsole)) __obj.updateDynamic("networkErrorsOnConsole")(networkErrorsOnConsole.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useTagHeader)) __obj.updateDynamic("useTagHeader")(useTagHeader.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyBulkOptions]
  }
}

