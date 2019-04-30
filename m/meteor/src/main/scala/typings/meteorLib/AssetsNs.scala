package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Assets")
@js.native
object AssetsNs extends js.Object {
  def absoluteFilePath(assetPath: java.lang.String): java.lang.String = js.native
  def getBinary(assetPath: java.lang.String): js.UndefOr[meteorLib.EJSON] = js.native
  def getBinary(assetPath: java.lang.String, asyncCallback: js.Function): js.UndefOr[meteorLib.EJSON] = js.native
  def getText(assetPath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getText(assetPath: java.lang.String, asyncCallback: js.Function): js.UndefOr[java.lang.String] = js.native
}

