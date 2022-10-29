package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "FilterSystem")
@js.native
open class FilterSystem protected ()
  extends typings.pixiCore.libFiltersFilterSystemMod.FilterSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object FilterSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "FilterSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
