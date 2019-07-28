package typings.mdast.mdastMod

import typings.mdast.mdastStrings.code
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code
  extends Literal
     with BlockContent {
  var lang: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_Code: code
}

object Code {
  @scala.inline
  def apply(
    `type`: code,
    value: String,
    data: Data = null,
    lang: String = null,
    meta: String = null,
    position: Position = null
  ): Code = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Code]
  }
}

