package typings.mdast.mod

import typings.mdast.mdastStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Delete: js.Array[PhrasingContent] = js.native
  @JSName("type")
  var type_Delete: delete = js.native
}

object Delete {
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: delete): Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
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
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

