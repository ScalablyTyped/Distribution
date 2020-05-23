package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  val content: js.Array[VNode]
  val isSVG: Boolean
  val key: Key | Null
  val props: js.Any
  val `type`: js.Any
}

object VNode {
  @scala.inline
  def apply(content: js.Array[VNode], isSVG: Boolean, props: js.Any, `type`: js.Any, key: Key = null): VNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

