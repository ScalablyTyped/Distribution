package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentNode[P /* <: ComponentProps */] extends VNode {
  @JSName("props")
  val props_ComponentNode: P with IntrinsicProps
  @JSName("type")
  val type_ComponentNode: Component[P]
}

object ComponentNode {
  @scala.inline
  def apply[P](
    content: js.Array[VNode],
    isSVG: Boolean,
    props: P with IntrinsicProps,
    `type`: Component[P],
    key: Key = null
  ): ComponentNode[P] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNode[P]]
  }
}

