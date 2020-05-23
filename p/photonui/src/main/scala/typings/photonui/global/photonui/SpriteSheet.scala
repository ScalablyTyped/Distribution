package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.SpriteSheet")
@js.native
class SpriteSheet ()
  extends typings.photonui.photonui.SpriteSheet {
  /* CompleteClass */
  override var icons: StringDictionary[js.Array[Double]] = js.native
  /* CompleteClass */
  override var imageUrl: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var size: String = js.native
  /* CompleteClass */
  override def addIcon(iconName: String, x: Double, y: Double): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getIconCSS(iconName: String): String = js.native
  /* CompleteClass */
  override def getIconPosition(iconName: String): X = js.native
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  /* CompleteClass */
  override def removeIcon(iconName: String): Unit = js.native
}

/* static members */
@JSGlobal("photonui.SpriteSheet")
@js.native
object SpriteSheet extends js.Object {
  def getSpriteSheet(name: String): typings.photonui.photonui.SpriteSheet = js.native
}

