package typings.mdast.mod

import typings.mdast.mdastStrings.linkReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkReference
  extends Parent
     with Reference
     with PhrasingContent {
  @JSName("children")
  var children_LinkReference: js.Array[StaticPhrasingContent] = js.native
  @JSName("type")
  var type_LinkReference: linkReference = js.native
}

object LinkReference {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference
  ): LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkReference]
  }
  @scala.inline
  implicit class LinkReferenceOps[Self <: LinkReference] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: StaticPhrasingContent*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[StaticPhrasingContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: linkReference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

