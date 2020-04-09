package typings.mrz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultDetails extends js.Object {
  /** Index of the end of the field in `line`. */
  var end: Double
  /** Name of the field in `result.fields`. */
  var field: /* import warning: importer.ImportType#apply Failed type conversion: 'format' | 'valid' | 'fields' | 'details'['fields'] */ js.Any
  /** Full english term for the field. */
  var label: String
  /** Index of the line where the field is located. */
  var line: Double
  /** Array of ranges that are necessary to compute this field. */
  var ranges: js.Array[Range]
  /** Index of the start of the field in `line`. */
  var start: Double
  var valid: Boolean
  /** Value of the field or `null`. */
  var value: String | Null
}

object ResultDetails {
  @scala.inline
  def apply(
    end: Double,
    field: /* import warning: importer.ImportType#apply Failed type conversion: 'format' | 'valid' | 'fields' | 'details'['fields'] */ js.Any,
    label: String,
    line: Double,
    ranges: js.Array[Range],
    start: Double,
    valid: Boolean,
    value: String = null
  ): ResultDetails = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultDetails]
  }
}

