package typings.pixiSpine.global.PIXI.spine.core

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends typings.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
}
/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  
  def filterFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureFilter = js.native
  
  def wrapFromString(text: String): typings.pixiSpine.PIXI.spine.core.TextureWrap = js.native
}
