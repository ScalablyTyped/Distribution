package typings.pixiSpine.global.PIXI.spine.core

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends typings.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
}
object Texture {
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Texture.filterFromString")
  @js.native
  def filterFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureFilter = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Texture.wrapFromString")
  @js.native
  def wrapFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureWrap = js.native
}
