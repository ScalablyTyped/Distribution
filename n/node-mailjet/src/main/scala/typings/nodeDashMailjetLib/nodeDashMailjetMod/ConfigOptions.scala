package typings
package nodeDashMailjetLib.nodeDashMailjetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  val output: js.UndefOr[java.lang.String] = js.undefined
  val perform_api_call: js.UndefOr[scala.Boolean] = js.undefined
  val secured: js.UndefOr[scala.Boolean] = js.undefined
  val url: js.UndefOr[java.lang.String] = js.undefined
  val version: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    output: java.lang.String = null,
    perform_api_call: js.UndefOr[scala.Boolean] = js.undefined,
    secured: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(perform_api_call)) __obj.updateDynamic("perform_api_call")(perform_api_call)
    if (!js.isUndefined(secured)) __obj.updateDynamic("secured")(secured)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConfigOptions]
  }
}

