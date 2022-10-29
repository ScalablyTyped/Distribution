package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ScissorSystem")
@js.native
open class ScissorSystem protected ()
  extends typings.pixiCore.mod.ScissorSystem {
  /**
    * @param {PIXI.Renderer} renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object ScissorSystem {
  
  @JSImport("pixi.js", "ScissorSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("pixi.js", "ScissorSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  @JSImport("pixi.js", "ScissorSystem.isMatrixRotated")
  @js.native
  def isMatrixRotated: Any = js.native
  inline def isMatrixRotated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatrixRotated")(x.asInstanceOf[js.Any])
}
