package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ShaderSystem")
@js.native
open class ShaderSystem protected ()
  extends typings.pixiCore.libSystemsMod.ShaderSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object ShaderSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "ShaderSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
