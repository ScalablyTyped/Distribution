package typings.pixiSpine.global.PIXI.spine.core

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
  
  /* CompleteClass */
  var _image: HTMLImageElement = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  
  /* CompleteClass */
  override def setFilters(
    minFilter: typings.pixiSpine.PIXI.spine.core.TextureFilter,
    magFilter: typings.pixiSpine.PIXI.spine.core.TextureFilter
  ): Unit = js.native
  
  /* CompleteClass */
  override def setWraps(
    uWrap: typings.pixiSpine.PIXI.spine.core.TextureWrap,
    vWrap: typings.pixiSpine.PIXI.spine.core.TextureWrap
  ): Unit = js.native
}
object Texture {
  
  @JSGlobal("PIXI.spine.core.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def filterFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.TextureFilter]
  
  /* static member */
  @scala.inline
  def wrapFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.TextureWrap]
}
