package typings.pixiCore.mod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "PluginSystem")
@js.native
open class PluginSystem protected ()
  extends typings.pixiCore.libSystemsMod.PluginSystem {
  def this(renderer: IRenderer) = this()
}
/* static members */
object PluginSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "PluginSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
