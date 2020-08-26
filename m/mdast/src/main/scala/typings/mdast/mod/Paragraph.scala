package typings.mdast.mod

import typings.mdast.mdastStrings.paragraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paragraph
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Paragraph: js.Array[PhrasingContent] = js.native
  @JSName("type")
  var type_Paragraph: paragraph = js.native
}

object Paragraph {
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: paragraph): Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: PhrasingContent*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: paragraph): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

