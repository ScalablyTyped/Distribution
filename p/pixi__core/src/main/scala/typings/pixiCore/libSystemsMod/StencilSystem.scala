package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "StencilSystem")
@js.native
open class StencilSystem protected ()
  extends typings.pixiCore.libMaskStencilSystemMod.StencilSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object StencilSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "StencilSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
