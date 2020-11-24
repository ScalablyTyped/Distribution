package typings.oracleOraclejet.ojvalidationDatetimeMod

import typings.oracleOraclejet.anon.DateField
import typings.oracleOraclejet.ojvalidationDatetimeMod.IntlDateTimeConverter.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "IntlDateTimeConverter")
@js.native
class IntlDateTimeConverter_ () extends DateTimeConverter {
  def this(options: ConverterOptions) = this()
  
  def formatRelative(value: String): String | Null = js.native
  def formatRelative(value: String, relativeOptions: DateField): String | Null = js.native
  
  @JSName("getHint")
  def getHint_MIntlDateTimeConverter_(): Null = js.native
  
  @JSName("getOptions")
  def getOptions_MIntlDateTimeConverter_(): ConverterOptions = js.native
  
  @JSName("resolvedOptions")
  def resolvedOptions_MIntlDateTimeConverter_(): ConverterOptions = js.native
}
