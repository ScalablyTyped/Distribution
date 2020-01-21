package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentClassNode[P /* <: ComponentProps */] extends VNode {
  @JSName("props")
  val props_ComponentClassNode: P with IntrinsicProps
  @JSName("type")
  val type_ComponentClassNode: ComponentClass[P]
}

object ComponentClassNode {
  @scala.inline
  def apply[P /* <: ComponentProps */](
    content: js.Array[VNode],
    isSVG: Boolean,
    props: P with IntrinsicProps,
    `type`: ComponentClass[P],
    key: Key = null
  ): ComponentClassNode[P] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentClassNode[P]]
  }
}

