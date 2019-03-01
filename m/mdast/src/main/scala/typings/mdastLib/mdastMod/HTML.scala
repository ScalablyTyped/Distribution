package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML
  extends Literal
     with BlockContent
     with StaticPhrasingContent {
  @JSName("type")
  var type_HTML: mdastLib.mdastLibStrings.html
}

object HTML {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.html,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): HTML = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[HTML]
  }
}

