package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "TextureGCSystem")
@js.native
open class TextureGCSystem protected ()
  extends typings.pixiCore.libTexturesTextureGCSystemMod.TextureGCSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object TextureGCSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "TextureGCSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
