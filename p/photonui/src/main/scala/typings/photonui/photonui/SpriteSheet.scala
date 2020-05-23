package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheet extends Base {
  var icons: StringDictionary[js.Array[Double]]
  var imageUrl: String
  var name: String
  var size: String
  def addIcon(iconName: String, x: Double, y: Double): Unit
  def getIconCSS(iconName: String): String
  def getIconPosition(iconName: String): X
  def removeIcon(iconName: String): Unit
}

object SpriteSheet {
  @scala.inline
  def apply(
    addIcon: (String, Double, Double) => Unit,
    destroy: () => Unit,
    getIconCSS: String => String,
    getIconPosition: String => X,
    icons: StringDictionary[js.Array[Double]],
    imageUrl: String,
    name: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeIcon: String => Unit,
    size: String
  ): SpriteSheet = {
    val __obj = js.Dynamic.literal(addIcon = js.Any.fromFunction3(addIcon), destroy = js.Any.fromFunction0(destroy), getIconCSS = js.Any.fromFunction1(getIconCSS), getIconPosition = js.Any.fromFunction1(getIconPosition), icons = icons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeIcon = js.Any.fromFunction1(removeIcon), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheet]
  }
}

