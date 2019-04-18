package typings
package nodeDashMailjetLib.nodeDashMailjetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  val perform_api_call: js.UndefOr[scala.Boolean] = js.undefined
  val proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  val timeout: js.UndefOr[scala.Double] = js.undefined
  val url: js.UndefOr[java.lang.String] = js.undefined
  val version: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    perform_api_call: js.UndefOr[scala.Boolean] = js.undefined,
    proxyUrl: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(perform_api_call)) __obj.updateDynamic("perform_api_call")(perform_api_call)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConnectOptions]
  }
}

