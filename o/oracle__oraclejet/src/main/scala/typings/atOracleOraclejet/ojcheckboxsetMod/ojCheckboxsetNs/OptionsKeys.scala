package typings.atOracleOraclejet.ojcheckboxsetMod.ojCheckboxsetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionsKeys extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OptionsKeys {
  @scala.inline
  def apply(label: String = null, value: String = null): OptionsKeys = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionsKeys]
  }
}

