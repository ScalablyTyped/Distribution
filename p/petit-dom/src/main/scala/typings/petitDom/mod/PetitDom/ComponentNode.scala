package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentNode[P /* <: ComponentProps */] extends VNode {
  @JSName("props")
  val props_ComponentNode: P with IntrinsicProps = js.native
  @JSName("type")
  val type_ComponentNode: Component[P] = js.native
}

object ComponentNode {
  @scala.inline
  def apply[/* <: typings.petitDom.mod.PetitDom.ComponentProps */ P](content: js.Array[VNode], isSVG: Boolean, props: P with IntrinsicProps, `type`: Component[P]): ComponentNode[P] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNode[P]]
  }
  @scala.inline
  implicit class ComponentNodeOps[Self <: ComponentNode[_], /* <: typings.petitDom.mod.PetitDom.ComponentProps */ P] (val x: Self with ComponentNode[P]) extends AnyVal {
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
    def setProps(value: P with IntrinsicProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Component[P]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

