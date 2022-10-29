package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BatchSystem")
@js.native
open class BatchSystem protected ()
  extends typings.pixiCore.mod.BatchSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BatchSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "BatchSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
