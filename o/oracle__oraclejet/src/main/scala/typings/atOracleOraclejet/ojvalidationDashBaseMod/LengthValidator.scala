package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.Anon_CountBy
import typings.atOracleOraclejet.ojvalidationDashBaseMod.LengthValidatorNs.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
class LengthValidator () extends Validator[Double | String] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MLengthValidator(): String | Null = js.native
  /* CompleteClass */
  override def validate(value: Double | String): Unit = js.native
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
object LengthValidator extends js.Object {
  var defaults: Anon_CountBy = js.native
}

