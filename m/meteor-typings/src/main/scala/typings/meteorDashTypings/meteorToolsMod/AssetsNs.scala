package typings.meteorDashTypings.meteorToolsMod

import typings.meteorDashTypings.EJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", "Assets")
@js.native
object AssetsNs extends js.Object {
  def absoluteFilePath(assetPath: String): String = js.native
  def getBinary(assetPath: String): EJSON = js.native
  def getBinary(assetPath: String, asyncCallback: js.Function): EJSON = js.native
  def getText(assetPath: String): String = js.native
  def getText(assetPath: String, asyncCallback: js.Function): String = js.native
}

