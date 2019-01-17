package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "RegExpValidator")
@js.native
class RegExpValidator ()
  extends Validator[java.lang.String | scala.Double] {
  def this(options: atOracleOraclejetLib.ojvalidationDashBaseMod.RegExpValidatorNs.ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MRegExpValidator(): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def validate(value: java.lang.String | scala.Double): scala.Unit = js.native
  def validate(value: java.lang.String): scala.Unit = js.native
  def validate(value: scala.Double): scala.Unit = js.native
}

