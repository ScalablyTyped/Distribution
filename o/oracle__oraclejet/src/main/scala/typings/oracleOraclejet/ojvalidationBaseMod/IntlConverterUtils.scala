package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlConverterUtils {
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.dateToLocalIso")
  @js.native
  def dateToLocalIso(date: Date): String = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getConverterInstance")
  @js.native
  def getConverterInstance[T](converterOption: String): Converter[T] | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getConverterInstance")
  @js.native
  def getConverterInstance[T](converterOption: Converter[T]): Converter[T] | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getConverterInstance")
  @js.native
  def getConverterInstance[T](converterOption: RegisteredConverter): Converter[T] | Null = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getInitials")
  @js.native
  def getInitials(): js.UndefOr[String] = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getInitials")
  @js.native
  def getInitials(firstName: js.UndefOr[scala.Nothing], lastName: String): js.UndefOr[String] = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getInitials")
  @js.native
  def getInitials(firstName: String): js.UndefOr[String] = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getInitials")
  @js.native
  def getInitials(firstName: String, lastName: String): js.UndefOr[String] = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.getLocalTimeZoneOffset")
  @js.native
  def getLocalTimeZoneOffset(): String = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.isoToDate")
  @js.native
  def isoToDate(isoString: String): Date = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils.isoToLocalDate")
  @js.native
  def isoToLocalDate(isoString: String): Date = js.native
}
