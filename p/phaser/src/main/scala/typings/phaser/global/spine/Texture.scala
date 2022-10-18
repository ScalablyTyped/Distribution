package typings.phaser.global.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("spine.Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typings.phaser.spine.Texture {
  def this(image: HTMLImageElement) = this()
  
  /* protected */ /* CompleteClass */
  var _image: HTMLImageElement = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  
  /* CompleteClass */
  override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
  
  /* CompleteClass */
  override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
}
object Texture {
  
  @JSGlobal("spine.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def filterFromString(text: String): typings.phaser.spine.TextureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.TextureFilter]
  
  /* static member */
  inline def wrapFromString(text: String): typings.phaser.spine.TextureWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.TextureWrap]
}
