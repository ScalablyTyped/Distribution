package typings.mdast.mod

import typings.mdast.mdastStrings.text
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends Literal
     with StaticPhrasingContent {
  @JSName("type")
  var type_Text: text
}

object Text {
  @scala.inline
  def apply(`type`: text, value: js.Any, data: Data = null, position: Position = null): Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

