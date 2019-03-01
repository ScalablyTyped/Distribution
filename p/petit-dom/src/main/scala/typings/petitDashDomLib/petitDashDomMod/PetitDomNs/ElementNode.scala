package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementNode[T /* <: petitDashDomLib.petitDashDomLibStrings.main */, E /* <: /* import warning: ImportType.apply Failed type conversion: petit-dom.petit-dom.PetitDom.DomElements[T] */ js.Any */] extends VNode {
  @JSName("props")
  val props_ElementNode: Props[E]
  @JSName("type")
  val type_ElementNode: T
}

object ElementNode {
  @scala.inline
  def apply[T /* <: petitDashDomLib.petitDashDomLibStrings.main */, E /* <: /* import warning: ImportType.apply Failed type conversion: petit-dom.petit-dom.PetitDom.DomElements[T] */ js.Any */](content: js.Array[VNode], isSVG: scala.Boolean, props: Props[E], `type`: T, key: Key = null): ElementNode[T, E] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("isSVG")(isSVG)
    __obj.updateDynamic("props")(props)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementNode[T, E]]
  }
}

