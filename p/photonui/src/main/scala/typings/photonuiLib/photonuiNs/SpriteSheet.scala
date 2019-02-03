package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.SpriteSheet")
@js.native
class SpriteSheet () extends Base {
  var icons: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]] = js.native
  var imageUrl: java.lang.String = js.native
  var name: java.lang.String = js.native
  var size: java.lang.String = js.native
  def addIcon(iconName: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def getIconCSS(iconName: java.lang.String): java.lang.String = js.native
  def getIconPosition(iconName: java.lang.String): photonuiLib.Anon_X = js.native
  def removeIcon(iconName: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("photonui.SpriteSheet")
@js.native
object SpriteSheet extends js.Object {
  def getSpriteSheet(name: java.lang.String): photonuiLib.photonuiNs.SpriteSheet = js.native
}

