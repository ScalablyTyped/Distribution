package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils")
@js.native
object IntlConverterUtilsNs extends js.Object {
  def dateToLocalIso(date: Date): String = js.native
  def getConverterInstance[T](converterOption: String): Converter[T] | Null = js.native
  def getConverterInstance[T](converterOption: Converter[T]): Converter[T] | Null = js.native
  def getConverterInstance[T](converterOption: RegisteredConverter): Converter[T] | Null = js.native
  def getInitials(): js.UndefOr[String] = js.native
  def getInitials(firstName: String): js.UndefOr[String] = js.native
  def getInitials(firstName: String, lastName: String): js.UndefOr[String] = js.native
  def getLocalTimeZoneOffset(): String = js.native
  def isoToDate(isoString: String): Date = js.native
  def isoToLocalDate(isoString: String): Date = js.native
}

