package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSqlMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/sql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeSQLValue(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeSQLValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapToArraySQLConvert(sql: String, params: MapSqlParams): Params = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToArraySQLConvert")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Params]
  
  inline def printSQLMapQuery(sql: String, mapParams: MapSqlParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printSQLMapQuery")(sql.asInstanceOf[js.Any], mapParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printSQLQuery(sql: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printSQLQuery")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type MapSqlParams = StringDictionary[Any]
}
