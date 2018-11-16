package typings
package meteorLib.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", "Assets")
@js.native
object AssetsNs extends js.Object {
  def absoluteFilePath(assetPath: java.lang.String): java.lang.String = js.native
  def getBinary(assetPath: java.lang.String): meteorLib.EJSON = js.native
  def getBinary(assetPath: java.lang.String, asyncCallback: js.Function): meteorLib.EJSON = js.native
  def getText(assetPath: java.lang.String): java.lang.String = js.native
  def getText(assetPath: java.lang.String, asyncCallback: js.Function): java.lang.String = js.native
}

