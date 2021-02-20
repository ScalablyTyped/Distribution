package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtranslationMod {
  
  @JSImport("@oracle/oraclejet/ojtranslation", "applyParameters")
  @js.native
  def applyParameters(pattern: String, parameters: js.Array[_]): String | Null = js.native
  @JSImport("@oracle/oraclejet/ojtranslation", "applyParameters")
  @js.native
  def applyParameters(pattern: String, parameters: js.Object): String | Null = js.native
  
  @JSImport("@oracle/oraclejet/ojtranslation", "getComponentTranslations")
  @js.native
  def getComponentTranslations(componentName: String): js.Object = js.native
  
  @JSImport("@oracle/oraclejet/ojtranslation", "getResource")
  @js.native
  def getResource(key: String): js.Object | String | Null = js.native
  
  @JSImport("@oracle/oraclejet/ojtranslation", "getTranslatedString")
  @js.native
  def getTranslatedString(key: String, var_args: (String | js.Object | js.Array[_])*): String = js.native
  
  @JSImport("@oracle/oraclejet/ojtranslation", "setBundle")
  @js.native
  def setBundle(bundle: js.Object): Unit = js.native
}
