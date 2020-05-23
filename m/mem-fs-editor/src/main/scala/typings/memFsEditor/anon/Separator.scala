package typings.memFsEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var trimEnd: js.UndefOr[Boolean] = js.undefined
}

object Separator {
  @scala.inline
  def apply(separator: String = null, trimEnd: js.UndefOr[Boolean] = js.undefined): Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(trimEnd)) __obj.updateDynamic("trimEnd")(trimEnd.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
}

