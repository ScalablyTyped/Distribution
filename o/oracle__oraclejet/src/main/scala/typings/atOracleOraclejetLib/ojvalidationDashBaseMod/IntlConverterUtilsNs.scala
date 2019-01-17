package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils")
@js.native
object IntlConverterUtilsNs extends js.Object {
  def dateToLocalIso(date: stdLib.Date): java.lang.String = js.native
  def getConverterInstance[T](converterOption: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[T]): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[T] | scala.Null = js.native
  def getConverterInstance[T](converterOption: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[T] | scala.Null = js.native
  def getConverterInstance[T](converterOption: java.lang.String): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[T] | scala.Null = js.native
  def getInitials(): js.UndefOr[java.lang.String] = js.native
  def getInitials(firstName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getInitials(firstName: java.lang.String, lastName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getLocalTimeZoneOffset(): java.lang.String = js.native
  def isoToDate(isoString: java.lang.String): stdLib.Date = js.native
  def isoToLocalDate(isoString: java.lang.String): stdLib.Date = js.native
}

