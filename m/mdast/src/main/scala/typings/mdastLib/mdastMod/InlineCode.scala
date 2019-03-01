package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCode
  extends Literal
     with StaticPhrasingContent {
  @JSName("type")
  var type_InlineCode: mdastLib.mdastLibStrings.inlineCode
}

object InlineCode {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.inlineCode,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): InlineCode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[InlineCode]
  }
}

