package typings.neverbounce.neverbounceMod

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
  def apply(apiKey: js.Any = null, opts: ConfigOptions = null, timeout: Int | Double = null): Config = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

