package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultColumnValue extends js.Object {
  // The formula used to compute the default value for this column.
  var formula: js.UndefOr[String] = js.undefined
  // The direct value to use as the default value for this column.
  var value: js.UndefOr[String] = js.undefined
}

object DefaultColumnValue {
  @scala.inline
  def apply(formula: String = null, value: String = null): DefaultColumnValue = {
    val __obj = js.Dynamic.literal()
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DefaultColumnValue]
  }
}

