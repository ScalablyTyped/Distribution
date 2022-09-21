package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtranslationMod {
  
  @JSImport("@oracle/oraclejet/ojtranslation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyParameters(pattern: String, parameters: js.Array[Any]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyParameters")(pattern.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def applyParameters(pattern: String, parameters: js.Object): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyParameters")(pattern.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getComponentTranslations(componentName: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentTranslations")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getResource(key: String): js.Object | String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object | String | Null]
  
  inline def getTranslatedString(key: String, var_args: (String | js.Object | js.Array[Any])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslatedString")(List(key.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def setBundle(bundle: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundle")(bundle.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
