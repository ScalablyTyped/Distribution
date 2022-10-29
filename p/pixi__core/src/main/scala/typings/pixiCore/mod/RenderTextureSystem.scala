package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "RenderTextureSystem")
@js.native
open class RenderTextureSystem protected ()
  extends typings.pixiCore.libSystemsMod.RenderTextureSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object RenderTextureSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "RenderTextureSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
