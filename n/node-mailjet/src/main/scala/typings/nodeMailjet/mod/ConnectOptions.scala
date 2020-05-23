package typings.nodeMailjet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  val perform_api_call: js.UndefOr[Boolean] = js.undefined
  val proxyUrl: js.UndefOr[String] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
  val url: js.UndefOr[String] = js.undefined
  val version: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    perform_api_call: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    url: String = null,
    version: String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(perform_api_call)) __obj.updateDynamic("perform_api_call")(perform_api_call.get.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

