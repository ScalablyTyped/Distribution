package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Assets")
@js.native
object AssetsNs extends js.Object {
  def absoluteFilePath(assetPath: String): String = js.native
  def getBinary(assetPath: String): js.UndefOr[EJSON] = js.native
  def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[EJSON] = js.native
  def getText(assetPath: String): js.UndefOr[String] = js.native
  def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = js.native
}

