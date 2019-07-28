package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.ojcolorMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ColorConverterNs.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "ColorConverter")
@js.native
class ColorConverter () extends Converter[^] {
  def this(options: ConverterOptions) = this()
  /* CompleteClass */
  override def format(value: ^): String | Null = js.native
  @JSName("getHint")
  def getHint_MColorConverter(): String = js.native
  /* CompleteClass */
  override def parse(value: String): ^  | Null = js.native
  @JSName("resolvedOptions")
  def resolvedOptions_MColorConverter(): ConverterOptions = js.native
}

