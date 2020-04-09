package typings.mrz.mod

import typings.mrz.mrzStrings.FRENCH_NATIONAL_ID
import typings.mrz.mrzStrings.SWISS_DRIVING_LICENSE
import typings.mrz.mrzStrings.TD1
import typings.mrz.mrzStrings.TD2
import typings.mrz.mrzStrings.TD3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Array of objects describing all parsed fields.
    */
  var details: js.Array[ResultDetails]
  /**
    * Object mapping field names to their respective value. The value is set to `null`
    * if it is invalid. The value may be different than the raw value. For example
    * `result.fields.sex` will be "male" when the raw value was "M".
    */
  var fields: ResultFields
  /**
    * String identifying the format of the parsed MRZ. Supported formats are:
    *
    * * TD1 (identity card with three MRZ lines)
    * * TD2 (identity card with two MRZ lines)
    * * TD3 (passport)
    * * SWISS_DRIVING_LICENSE
    * * FRENCH_NATIONAL_ID
    */
  var format: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID
  /** `true` if all fields are valid. `false` otherwise. */
  var valid: Boolean
}

object Result {
  @scala.inline
  def apply(
    details: js.Array[ResultDetails],
    fields: ResultFields,
    format: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID,
    valid: Boolean
  ): Result = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

