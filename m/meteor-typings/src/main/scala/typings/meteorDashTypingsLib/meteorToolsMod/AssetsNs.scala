package typings
package meteorDashTypingsLib.meteorToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", "Assets")
@js.native
object AssetsNs extends js.Object {
  def absoluteFilePath(assetPath: java.lang.String): java.lang.String = js.native
  def getBinary(assetPath: java.lang.String): meteorDashTypingsLib.EJSON = js.native
  def getBinary(assetPath: java.lang.String, asyncCallback: js.Function): meteorDashTypingsLib.EJSON = js.native
  def getText(assetPath: java.lang.String): java.lang.String = js.native
  def getText(assetPath: java.lang.String, asyncCallback: js.Function): java.lang.String = js.native
}

