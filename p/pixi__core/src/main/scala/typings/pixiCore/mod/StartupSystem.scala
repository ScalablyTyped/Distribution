package typings.pixiCore.mod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libStartupStartupSystemMod.StartupSystemOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "StartupSystem")
@js.native
open class StartupSystem protected ()
  extends typings.pixiCore.libSystemsMod.StartupSystem {
  def this(renderer: IRenderer[ICanvas]) = this()
}
/* static members */
object StartupSystem {
  
  @JSImport("@pixi/core", "StartupSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "StartupSystem.defaultOptions")
  @js.native
  def defaultOptions: StartupSystemOptions = js.native
  inline def defaultOptions_=(x: StartupSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "StartupSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
