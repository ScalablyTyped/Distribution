package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojtranslation", JSImport.Namespace)
@js.native
object ojtranslationMod extends js.Object {
  def applyParameters(pattern: java.lang.String, parameters: js.Array[_]): java.lang.String | scala.Null = js.native
  def applyParameters(pattern: java.lang.String, parameters: js.Object): java.lang.String | scala.Null = js.native
  def getComponentTranslations(componentName: java.lang.String): js.Object = js.native
  def getResource(key: java.lang.String): js.Object | java.lang.String | scala.Null = js.native
  def getTranslatedString(key: java.lang.String, var_args: (java.lang.String | js.Object | js.Array[_])*): java.lang.String = js.native
  def setBundle(bundle: js.Object): scala.Unit = js.native
}

