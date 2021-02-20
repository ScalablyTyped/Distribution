package typings.phaser.global.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Texture")
@js.native
abstract class Texture protected ()
  extends typings.phaser.spine.Texture {
  def this(image: HTMLImageElement) = this()
}
object Texture {
  
  /* static member */
  @JSGlobal("spine.Texture.filterFromString")
  @js.native
  def filterFromString(text: String): typings.phaser.spine.TextureFilter = js.native
  
  /* static member */
  @JSGlobal("spine.Texture.wrapFromString")
  @js.native
  def wrapFromString(text: String): typings.phaser.spine.TextureWrap = js.native
}
