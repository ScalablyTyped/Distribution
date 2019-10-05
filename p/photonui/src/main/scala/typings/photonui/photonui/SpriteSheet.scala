package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.SpriteSheet")
@js.native
class SpriteSheet () extends Base {
  var icons: StringDictionary[js.Array[Double]] = js.native
  var imageUrl: String = js.native
  var name: String = js.native
  var size: String = js.native
  def addIcon(iconName: String, x: Double, y: Double): Unit = js.native
  def getIconCSS(iconName: String): String = js.native
  def getIconPosition(iconName: String): Anon_X = js.native
  def removeIcon(iconName: String): Unit = js.native
}

/* static members */
@JSGlobal("photonui.SpriteSheet")
@js.native
object SpriteSheet extends js.Object {
  def getSpriteSheet(name: String): SpriteSheet = js.native
}

