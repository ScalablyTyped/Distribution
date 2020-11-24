package typings.meteor.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Assets")
@js.native
object Assets extends js.Object {
  
  def absoluteFilePath(assetPath: String): String = js.native
  
  def getBinary(assetPath: String): js.UndefOr[typings.meteor.EJSON] = js.native
  def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[typings.meteor.EJSON] = js.native
  
  def getText(assetPath: String): js.UndefOr[String] = js.native
  def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = js.native
}
