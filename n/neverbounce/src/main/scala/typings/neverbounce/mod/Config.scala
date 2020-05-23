package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var apiKey: js.UndefOr[js.Any] = js.undefined
  var opts: js.UndefOr[ConfigOptions] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(apiKey: js.Any = null, opts: ConfigOptions = null, timeout: js.UndefOr[Double] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

