package typings.nginstackDevTools

import typings.nginstackDevTools.anon.DisableHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseQueryAnalyzerMod {
  
  @JSImport("@nginstack/dev-tools/lib/database/QueryAnalyzer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHtmlExecutionPlan(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlExecutionPlan")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHtmlExecutionPlan(sql: String, options: DisableHeader): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlExecutionPlan")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTxtExecutionPlan(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTxtExecutionPlan")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTxtExecutionPlan(sql: String, options: DisableHeader): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTxtExecutionPlan")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
