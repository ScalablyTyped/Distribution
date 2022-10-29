package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BatchSystem")
@js.native
open class BatchSystem protected ()
  extends typings.pixiCore.libSystemsMod.BatchSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BatchSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "BatchSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
