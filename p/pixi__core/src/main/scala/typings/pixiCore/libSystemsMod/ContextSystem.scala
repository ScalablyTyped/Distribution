package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "ContextSystem")
@js.native
open class ContextSystem protected ()
  extends typings.pixiCore.libContextContextSystemMod.ContextSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object ContextSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "ContextSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
