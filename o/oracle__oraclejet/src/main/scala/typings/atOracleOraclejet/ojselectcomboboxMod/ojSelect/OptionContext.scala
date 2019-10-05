package typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect

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
    val __obj = js.Dynamic.literal(component = component, data = data, depth = depth, index = index, leaf = leaf, parent = parent, parentElement = parentElement)
  
    __obj.asInstanceOf[OptionContext]
  }
}

