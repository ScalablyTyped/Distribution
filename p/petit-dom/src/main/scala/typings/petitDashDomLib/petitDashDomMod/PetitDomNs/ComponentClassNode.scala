package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

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
    isSVG: scala.Boolean,
    props: P with IntrinsicProps,
    `type`: ComponentClass[P],
    key: Key = null
  ): ComponentClassNode[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("isSVG")(isSVG)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentClassNode[P]]
  }
}

