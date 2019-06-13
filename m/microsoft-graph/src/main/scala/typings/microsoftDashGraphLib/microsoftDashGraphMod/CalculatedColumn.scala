package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculatedColumn extends js.Object {
  /** For dateTime output types, the format of the value. Must be one of dateOnly or dateTime. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The formula used to compute the value for this column. */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /** The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text. */
  var outputType: js.UndefOr[java.lang.String] = js.undefined
}

object CalculatedColumn {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    formula: java.lang.String = null,
    outputType: java.lang.String = null
  ): CalculatedColumn = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (outputType != null) __obj.updateDynamic("outputType")(outputType)
    __obj.asInstanceOf[CalculatedColumn]
  }
}

