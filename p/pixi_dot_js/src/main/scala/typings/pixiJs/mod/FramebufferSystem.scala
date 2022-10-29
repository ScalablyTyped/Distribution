package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "FramebufferSystem")
@js.native
open class FramebufferSystem protected ()
  extends typings.pixiCore.mod.FramebufferSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object FramebufferSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "FramebufferSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
