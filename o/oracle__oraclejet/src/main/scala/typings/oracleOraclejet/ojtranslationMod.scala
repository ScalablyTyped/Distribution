package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojtranslation", JSImport.Namespace)
@js.native
object ojtranslationMod extends js.Object {
  def applyParameters(pattern: String, parameters: js.Array[_]): String | Null = js.native
  def applyParameters(pattern: String, parameters: js.Object): String | Null = js.native
  def getComponentTranslations(componentName: String): js.Object = js.native
  def getResource(key: String): js.Object | String | Null = js.native
  def getTranslatedString(key: String, var_args: (String | js.Object | js.Array[_])*): String = js.native
  def setBundle(bundle: js.Object): Unit = js.native
}

