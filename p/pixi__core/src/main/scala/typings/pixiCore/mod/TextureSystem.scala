package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TextureSystem")
@js.native
open class TextureSystem protected ()
  extends typings.pixiCore.libSystemsMod.TextureSystem {
  /**
    * @param renderer - The renderer this system works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object TextureSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "TextureSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
