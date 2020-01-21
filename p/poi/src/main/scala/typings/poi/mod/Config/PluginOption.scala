package typings.poi.mod.Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOption extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var resolve: String
}

object PluginOption {
  @scala.inline
  def apply(resolve: String, options: js.Any = null): PluginOption = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOption]
  }
}

