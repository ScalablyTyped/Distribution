package typings.petitDom.mod.global.JSX

import typings.petitDom.mod.PetitDom.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementChildrenAttribute extends js.Object {
  var content: js.Array[VNode] = js.native
}

object ElementChildrenAttribute {
  @scala.inline
  def apply(content: js.Array[VNode]): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
  @scala.inline
  implicit class ElementChildrenAttributeOps[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: VNode*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[VNode]): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

