package typings
package atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionsKeys extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsKeys {
  @scala.inline
  def apply(label: java.lang.String = null, value: java.lang.String = null): OptionsKeys = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionsKeys]
  }
}

