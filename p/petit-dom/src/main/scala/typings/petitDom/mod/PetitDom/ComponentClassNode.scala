package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClassNode[P /* <: ComponentProps */] extends VNode {
  
  @JSName("props")
  val props_ComponentClassNode: P with IntrinsicProps = js.native
  
  @JSName("type")
  val type_ComponentClassNode: ComponentClass[P] = js.native
}
object ComponentClassNode {
  
  @scala.inline
  def apply[P /* <: ComponentProps */](content: js.Array[VNode], isSVG: Boolean, props: P with IntrinsicProps, `type`: ComponentClass[P]): ComponentClassNode[P] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentClassNode[P]]
  }
  
  @scala.inline
  implicit class ComponentClassNodeOps[Self <: ComponentClassNode[_], P /* <: ComponentProps */] (val x: Self with ComponentClassNode[P]) extends AnyVal {
    
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
    def setType(value: ComponentClass[P]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
