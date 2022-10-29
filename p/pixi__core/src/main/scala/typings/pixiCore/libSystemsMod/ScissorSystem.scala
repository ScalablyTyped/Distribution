package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "ScissorSystem")
@js.native
open class ScissorSystem protected ()
  extends typings.pixiCore.libMaskScissorSystemMod.ScissorSystem {
  /**
    * @param {PIXI.Renderer} renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object ScissorSystem {
  
  @JSImport("@pixi/core/lib/systems", "ScissorSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "ScissorSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  @JSImport("@pixi/core/lib/systems", "ScissorSystem.isMatrixRotated")
  @js.native
  def isMatrixRotated: Any = js.native
  inline def isMatrixRotated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatrixRotated")(x.asInstanceOf[js.Any])
}
