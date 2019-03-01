package typings
package atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionContext[D] extends js.Object {
  var component: stdLib.Element
  var data: D
  var index: scala.Double
}

object OptionContext {
  @scala.inline
  def apply[D](component: stdLib.Element, data: D, index: scala.Double): OptionContext[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[OptionContext[D]]
  }
}

