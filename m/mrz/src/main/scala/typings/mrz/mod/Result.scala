package typings.mrz.mod

import typings.mrz.mrzStrings.FRENCH_NATIONAL_ID
import typings.mrz.mrzStrings.SWISS_DRIVING_LICENSE
import typings.mrz.mrzStrings.TD1
import typings.mrz.mrzStrings.TD2
import typings.mrz.mrzStrings.TD3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * Array of objects describing all parsed fields.
    */
  var details: js.Array[ResultDetails] = js.native
  /**
    * Object mapping field names to their respective value. The value is set to `null`
    * if it is invalid. The value may be different than the raw value. For example
    * `result.fields.sex` will be "male" when the raw value was "M".
    */
  var fields: ResultFields = js.native
  /**
    * String identifying the format of the parsed MRZ. Supported formats are:
    *
    * * TD1 (identity card with three MRZ lines)
    * * TD2 (identity card with two MRZ lines)
    * * TD3 (passport)
    * * SWISS_DRIVING_LICENSE
    * * FRENCH_NATIONAL_ID
    */
  var format: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID = js.native
  /** `true` if all fields are valid. `false` otherwise. */
  var valid: Boolean = js.native
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
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailsVarargs(value: ResultDetails*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[ResultDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: ResultFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: TD1 | TD2 | TD3 | SWISS_DRIVING_LICENSE | FRENCH_NATIONAL_ID): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

