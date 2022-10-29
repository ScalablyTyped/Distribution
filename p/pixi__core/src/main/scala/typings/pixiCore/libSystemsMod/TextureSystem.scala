package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "TextureSystem")
@js.native
open class TextureSystem protected ()
  extends typings.pixiCore.libTexturesTextureSystemMod.TextureSystem {
  /**
    * @param renderer - The renderer this system works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object TextureSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "TextureSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
