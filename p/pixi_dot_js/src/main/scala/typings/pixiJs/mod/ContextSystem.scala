package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ContextSystem")
@js.native
open class ContextSystem protected ()
  extends typings.pixiCore.mod.ContextSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object ContextSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "ContextSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
