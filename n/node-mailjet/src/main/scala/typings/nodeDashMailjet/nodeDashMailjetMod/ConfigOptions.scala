package typings.nodeDashMailjet.nodeDashMailjetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  val output: js.UndefOr[String] = js.undefined
  val perform_api_call: js.UndefOr[Boolean] = js.undefined
  val secured: js.UndefOr[Boolean] = js.undefined
  val url: js.UndefOr[String] = js.undefined
  val version: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    output: String = null,
    perform_api_call: js.UndefOr[Boolean] = js.undefined,
    secured: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    version: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(perform_api_call)) __obj.updateDynamic("perform_api_call")(perform_api_call.asInstanceOf[js.Any])
    if (!js.isUndefined(secured)) __obj.updateDynamic("secured")(secured.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

