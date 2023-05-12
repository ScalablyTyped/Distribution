package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.MMSlashDDSlashYYYY
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DDTHHColonMMZ`
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DD`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeFormatMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(date: js.Date, format: `YYYY-MM-DD` | MMSlashDDSlashYYYY): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateTimeForSql(date: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTimeForSql")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def formatDateTime_YYYYMMDDTHHMMZ(date: js.Date, format: `YYYY-MM-DDTHHColonMMZ`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def timeHash(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")().asInstanceOf[String]
  inline def timeHash(digits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")(digits.asInstanceOf[js.Any]).asInstanceOf[String]
}
