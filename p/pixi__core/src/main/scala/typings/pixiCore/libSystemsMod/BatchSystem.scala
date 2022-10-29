package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "BatchSystem")
@js.native
open class BatchSystem protected ()
  extends typings.pixiCore.libBatchBatchSystemMod.BatchSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object BatchSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "BatchSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
