package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  val content: js.Array[VNode]
  val isSVG: scala.Boolean
  val key: Key | scala.Null
  val props: js.Any
  val `type`: js.Any
}

object VNode {
  @scala.inline
  def apply(content: js.Array[VNode], isSVG: scala.Boolean, props: js.Any, `type`: js.Any, key: Key = null): VNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("isSVG")(isSVG)
    __obj.updateDynamic("props")(props)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

