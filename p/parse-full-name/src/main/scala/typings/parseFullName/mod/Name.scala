package typings.parseFullName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var error: js.UndefOr[js.Array[js.Any]] = js.undefined
  var first: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var middle: js.UndefOr[String] = js.undefined
  var nick: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(
    error: js.Array[js.Any] = null,
    first: String = null,
    last: String = null,
    middle: String = null,
    nick: String = null,
    suffix: String = null,
    title: String = null
  ): Name = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (nick != null) __obj.updateDynamic("nick")(nick.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

