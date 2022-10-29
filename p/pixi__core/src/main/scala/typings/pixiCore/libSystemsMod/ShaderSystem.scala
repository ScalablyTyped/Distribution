package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "ShaderSystem")
@js.native
open class ShaderSystem protected ()
  extends typings.pixiCore.libShaderShaderSystemMod.ShaderSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object ShaderSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "ShaderSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
