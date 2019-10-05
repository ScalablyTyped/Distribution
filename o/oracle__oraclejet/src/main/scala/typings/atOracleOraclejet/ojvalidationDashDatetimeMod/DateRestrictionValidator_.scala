package typings.atOracleOraclejet.ojvalidationDashDatetimeMod

import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typings.atOracleOraclejet.ojvalidationDashDatetimeMod.DateRestrictionValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateRestrictionValidator")
@js.native
class DateRestrictionValidator_ () extends Validator[String] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MDateRestrictionValidator_(): String | Null = js.native
  /* CompleteClass */
  override def validate(value: String): Unit = js.native
}

