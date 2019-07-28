package typings.atOracleOraclejet.ojvalidationDashDatetimeMod

import typings.atOracleOraclejet.Anon_DateField
import typings.atOracleOraclejet.ojvalidationDashDatetimeMod.IntlDateTimeConverterNs.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "IntlDateTimeConverter")
@js.native
class IntlDateTimeConverter () extends DateTimeConverter {
  def this(options: ConverterOptions) = this()
  def formatRelative(value: String): String | Null = js.native
  def formatRelative(value: String, relativeOptions: Anon_DateField): String | Null = js.native
  @JSName("getHint")
  def getHint_MIntlDateTimeConverter(): Null = js.native
  @JSName("getOptions")
  def getOptions_MIntlDateTimeConverter(): ConverterOptions = js.native
  @JSName("resolvedOptions")
  def resolvedOptions_MIntlDateTimeConverter(): ConverterOptions = js.native
}

