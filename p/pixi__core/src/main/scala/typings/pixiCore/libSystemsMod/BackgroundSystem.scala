package typings.pixiCore.libSystemsMod

import typings.pixiCore.libBackgroundBackgroundSystemMod.BackgroundSystemOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "BackgroundSystem")
@js.native
open class BackgroundSystem ()
  extends typings.pixiCore.libBackgroundBackgroundSystemMod.BackgroundSystem
/* static members */
object BackgroundSystem {
  
  @JSImport("@pixi/core/lib/systems", "BackgroundSystem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/core/lib/systems", "BackgroundSystem.defaultOptions")
  @js.native
  def defaultOptions: BackgroundSystemOptions = js.native
  inline def defaultOptions_=(x: BackgroundSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "BackgroundSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
