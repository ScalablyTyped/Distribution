package typings.memFsEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var defaults: String
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Defaults {
  @scala.inline
  def apply(defaults: String, raw: js.UndefOr[Boolean] = js.undefined): Defaults = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults]
  }
}

