package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "FramebufferSystem")
@js.native
open class FramebufferSystem protected ()
  extends typings.pixiCore.libFramebufferFramebufferSystemMod.FramebufferSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object FramebufferSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "FramebufferSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
