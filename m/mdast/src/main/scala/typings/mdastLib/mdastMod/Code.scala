package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code
  extends Literal
     with BlockContent {
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Code: mdastLib.mdastLibStrings.code
}

object Code {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.code,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    lang: java.lang.String = null,
    meta: java.lang.String = null,
    position: unistLib.unistMod.Position = null
  ): Code = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Code]
  }
}

