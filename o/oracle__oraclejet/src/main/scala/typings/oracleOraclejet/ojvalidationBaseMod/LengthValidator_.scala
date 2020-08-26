package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.LengthValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
class LengthValidator_ () extends Validator[Double | String] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MLengthValidator_(): String | Null = js.native
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}

