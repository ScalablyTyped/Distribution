package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
class LengthValidator ()
  extends Validator[scala.Double | java.lang.String] {
  def this(options: atOracleOraclejetLib.ojvalidationDashBaseMod.LengthValidatorNs.ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MLengthValidator(): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def validate(value: scala.Double | java.lang.String): scala.Unit = js.native
  def validate(value: java.lang.String): scala.Unit = js.native
  def validate(value: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
object LengthValidator extends js.Object {
  var defaults: atOracleOraclejetLib.Anon_CountBy = js.native
}

