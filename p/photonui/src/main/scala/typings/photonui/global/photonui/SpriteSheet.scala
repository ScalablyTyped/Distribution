package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.SpriteSheet")
@js.native
class SpriteSheet ()
  extends StObject
     with typings.photonui.photonui.SpriteSheet {
  
  /* CompleteClass */
  override def addIcon(iconName: String, x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def getIconCSS(iconName: String): String = js.native
  
  /* CompleteClass */
  override def getIconPosition(iconName: String): X = js.native
  
  /* CompleteClass */
  var icons: StringDictionary[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var imageUrl: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  
  /* CompleteClass */
  override def removeIcon(iconName: String): Unit = js.native
  
  /* CompleteClass */
  var size: String = js.native
}
object SpriteSheet {
  
  @JSGlobal("photonui.SpriteSheet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getSpriteSheet(name: String): typings.photonui.photonui.SpriteSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpriteSheet")(name.asInstanceOf[js.Any]).asInstanceOf[typings.photonui.photonui.SpriteSheet]
}
