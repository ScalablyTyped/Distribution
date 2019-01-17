package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "RequiredValidator")
@js.native
class RequiredValidator ()
  extends Validator[js.Object | java.lang.String | scala.Double] {
  def this(options: atOracleOraclejetLib.ojvalidationDashBaseMod.RequiredValidatorNs.ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MRequiredValidator(): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def validate(value: js.Object | java.lang.String | scala.Double): scala.Unit = js.native
  def validate(value: java.lang.String): scala.Unit = js.native
  def validate(value: js.Object): scala.Unit = js.native
  def validate(value: scala.Double): scala.Unit = js.native
}

