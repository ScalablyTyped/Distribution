package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.RequiredValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "RequiredValidator")
@js.native
class RequiredValidator_ ()
  extends Validator[js.Object | String | Double] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MRequiredValidator_(): String | Null = js.native
  def validate(value: String): Unit = js.native
  def validate(value: js.Object): Unit = js.native
  def validate(value: Double): Unit = js.native
}

