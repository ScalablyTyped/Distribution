package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ProjectionSystem")
@js.native
open class ProjectionSystem protected ()
  extends typings.pixiCore.mod.ProjectionSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object ProjectionSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "ProjectionSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
