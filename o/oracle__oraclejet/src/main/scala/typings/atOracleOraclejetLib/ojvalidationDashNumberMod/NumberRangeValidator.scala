package typings
package atOracleOraclejetLib.ojvalidationDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-number", "NumberRangeValidator")
@js.native
class NumberRangeValidator ()
  extends atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[java.lang.String | scala.Double] {
  def this(options: atOracleOraclejetLib.ojvalidationDashNumberMod.NumberRangeValidatorNs.ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MNumberRangeValidator(): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def validate(value: java.lang.String | scala.Double): scala.Unit = js.native
  def validate(value: java.lang.String): scala.Unit = js.native
  def validate(value: scala.Double): scala.Unit = js.native
}

