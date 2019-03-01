package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

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
  def apply[P /* <: ComponentProps */](
    content: js.Array[VNode],
    isSVG: scala.Boolean,
    props: P with IntrinsicProps,
    `type`: Component[P],
    key: Key = null
  ): ComponentNode[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("isSVG")(isSVG)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNode[P]]
  }
}

