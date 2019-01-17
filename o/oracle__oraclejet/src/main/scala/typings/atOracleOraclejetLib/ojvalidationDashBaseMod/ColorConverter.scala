package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "ColorConverter")
@js.native
class ColorConverter ()
  extends Converter[atOracleOraclejetLib.ojcolorMod.namespaced] {
  def this(options: atOracleOraclejetLib.ojvalidationDashBaseMod.ColorConverterNs.ConverterOptions) = this()
  /* CompleteClass */
  override def format(value: atOracleOraclejetLib.ojcolorMod.namespaced): java.lang.String | scala.Null = js.native
  @JSName("getHint")
  def getHint_MColorConverter(): java.lang.String = js.native
  /* CompleteClass */
  override def parse(value: java.lang.String): atOracleOraclejetLib.ojcolorMod.namespaced | scala.Null = js.native
  @JSName("resolvedOptions")
  def resolvedOptions_MColorConverter(): atOracleOraclejetLib.ojvalidationDashBaseMod.ColorConverterNs.ConverterOptions = js.native
}

