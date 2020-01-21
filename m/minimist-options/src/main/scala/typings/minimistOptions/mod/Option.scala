package typings.minimistOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object Option {
  @scala.inline
  def apply(alias: String | js.Array[String] = null, default: js.Any = null, `type`: Type = null): Option = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

