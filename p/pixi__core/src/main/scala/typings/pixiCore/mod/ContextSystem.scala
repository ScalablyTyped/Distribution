package typings.pixiCore.mod

import typings.pixiCore.libContextContextSystemMod.ContextSystemOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ContextSystem")
@js.native
open class ContextSystem protected ()
  extends typings.pixiCore.libSystemsMod.ContextSystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object ContextSystem {
  
  @JSImport("@pixi/core", "ContextSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "ContextSystem.defaultOptions")
  @js.native
  def defaultOptions: ContextSystemOptions = js.native
  inline def defaultOptions_=(x: ContextSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "ContextSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
