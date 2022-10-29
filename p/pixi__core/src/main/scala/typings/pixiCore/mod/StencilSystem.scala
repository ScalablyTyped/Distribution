package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "StencilSystem")
@js.native
open class StencilSystem protected ()
  extends typings.pixiCore.libSystemsMod.StencilSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object StencilSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "StencilSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
