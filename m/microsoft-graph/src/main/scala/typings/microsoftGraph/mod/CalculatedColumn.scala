package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculatedColumn extends js.Object {
  // For dateTime output types, the format of the value. Must be one of dateOnly or dateTime.
  var format: js.UndefOr[String] = js.undefined
  // The formula used to compute the value for this column.
  var formula: js.UndefOr[String] = js.undefined
  // The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text.
  var outputType: js.UndefOr[String] = js.undefined
}

object CalculatedColumn {
  @scala.inline
  def apply(format: String = null, formula: String = null, outputType: String = null): CalculatedColumn = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (outputType != null) __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedColumn]
  }
}

