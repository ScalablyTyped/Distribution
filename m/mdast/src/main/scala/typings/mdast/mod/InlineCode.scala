package typings.mdast.mod

import typings.mdast.mdastStrings.inlineCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineCode
  extends Literal
     with StaticPhrasingContent {
  @JSName("type")
  var type_InlineCode: inlineCode = js.native
}

object InlineCode {
  @scala.inline
  def apply(`type`: inlineCode, value: js.Any): InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCode]
  }
  @scala.inline
  implicit class InlineCodeOps[Self <: InlineCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: inlineCode): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

