package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlConverterUtils {
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "IntlConverterUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateToLocalIso(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToLocalIso")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getConverterInstance[T](converterOption: String): Converter[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConverterInstance")(converterOption.asInstanceOf[js.Any]).asInstanceOf[Converter[T] | Null]
  inline def getConverterInstance[T](converterOption: Converter[T]): Converter[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConverterInstance")(converterOption.asInstanceOf[js.Any]).asInstanceOf[Converter[T] | Null]
  inline def getConverterInstance[T](converterOption: RegisteredConverter): Converter[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConverterInstance")(converterOption.asInstanceOf[js.Any]).asInstanceOf[Converter[T] | Null]
  
  inline def getInitials(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")().asInstanceOf[js.UndefOr[String]]
  inline def getInitials(firstName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(firstName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getInitials(firstName: String, lastName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(firstName.asInstanceOf[js.Any], lastName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getInitials(firstName: Unit, lastName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitials")(firstName.asInstanceOf[js.Any], lastName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getLocalTimeZoneOffset(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalTimeZoneOffset")().asInstanceOf[String]
  
  inline def isoToDate(isoString: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isoToDate")(isoString.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def isoToLocalDate(isoString: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isoToLocalDate")(isoString.asInstanceOf[js.Any]).asInstanceOf[Date]
}
