package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "ProjectionSystem")
@js.native
open class ProjectionSystem protected ()
  extends typings.pixiCore.libProjectionProjectionSystemMod.ProjectionSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object ProjectionSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "ProjectionSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
