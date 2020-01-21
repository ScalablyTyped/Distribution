package typings.oracleOraclejet.ojselectcomboboxMod.ojSelect

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionContext extends js.Object {
  var component: Element
  var data: js.Object
  var depth: Double
  var index: Double
  var leaf: Boolean
  var parent: Element
  var parentElement: Element
}

object OptionContext {
  @scala.inline
  def apply(
    component: Element,
    data: js.Object,
    depth: Double,
    index: Double,
    leaf: Boolean,
    parent: Element,
    parentElement: Element
  ): OptionContext = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionContext]
  }
}

