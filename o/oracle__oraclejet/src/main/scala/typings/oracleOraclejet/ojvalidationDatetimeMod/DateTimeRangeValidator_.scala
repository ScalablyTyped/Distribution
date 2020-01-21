package typings.oracleOraclejet.ojvalidationDatetimeMod

import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeRangeValidator")
@js.native
class DateTimeRangeValidator_ () extends Validator[String] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MDateTimeRangeValidator_(): String | Null = js.native
  /* CompleteClass */
  override def validate(value: String): Unit = js.native
}

