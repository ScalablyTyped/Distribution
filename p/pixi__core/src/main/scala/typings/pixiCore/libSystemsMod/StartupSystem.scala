package typings.pixiCore.libSystemsMod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libStartupStartupSystemMod.StartupSystemOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "StartupSystem")
@js.native
open class StartupSystem protected ()
  extends typings.pixiCore.libStartupStartupSystemMod.StartupSystem {
  def this(renderer: IRenderer[ICanvas]) = this()
}
/* static members */
object StartupSystem {
  
  @JSImport("@pixi/core/lib/systems", "StartupSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "StartupSystem.defaultOptions")
  @js.native
  def defaultOptions: StartupSystemOptions = js.native
  inline def defaultOptions_=(x: StartupSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "StartupSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
