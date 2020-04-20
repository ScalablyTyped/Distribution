package typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionContext[D] extends js.Object {
  var component: Element
  var data: D
  var index: Double
}

object OptionContext {
  @scala.inline
  def apply[D](component: Element, data: D, index: Double): OptionContext[D] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionContext[D]]
  }
}

