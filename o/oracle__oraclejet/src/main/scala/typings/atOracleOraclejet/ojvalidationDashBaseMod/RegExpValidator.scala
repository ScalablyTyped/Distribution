package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.ojvalidationDashBaseMod.RegExpValidatorNs.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "RegExpValidator")
@js.native
class RegExpValidator () extends Validator[String | Double] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MRegExpValidator(): String | Null = js.native
  /* CompleteClass */
  override def validate(value: String | Double): Unit = js.native
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}

