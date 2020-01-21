package typings.petitDom.mod._Global_.JSX

import typings.petitDom.mod.PetitDom.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementChildrenAttribute extends js.Object {
  var content: js.Array[VNode]
}

object ElementChildrenAttribute {
  @scala.inline
  def apply(content: js.Array[VNode]): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
}

