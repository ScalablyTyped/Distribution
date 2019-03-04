package typings
package atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionContext extends js.Object {
  var component: stdLib.Element
  var data: js.Object
  var depth: scala.Double
  var index: scala.Double
  var leaf: scala.Boolean
  var parent: stdLib.Element
  var parentElement: stdLib.Element
}

object OptionContext {
  @scala.inline
  def apply(
    component: stdLib.Element,
    data: js.Object,
    depth: scala.Double,
    index: scala.Double,
    leaf: scala.Boolean,
    parent: stdLib.Element,
    parentElement: stdLib.Element
  ): OptionContext = {
    val __obj = js.Dynamic.literal(component = component, data = data, depth = depth, index = index, leaf = leaf, parent = parent, parentElement = parentElement)
  
    __obj.asInstanceOf[OptionContext]
  }
}

