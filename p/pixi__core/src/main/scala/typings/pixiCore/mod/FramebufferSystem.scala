package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "FramebufferSystem")
@js.native
open class FramebufferSystem protected ()
  extends typings.pixiCore.libSystemsMod.FramebufferSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object FramebufferSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "FramebufferSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
