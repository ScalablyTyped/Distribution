package typings.pixiCore.mod

import typings.pixiCore.libIrendererMod.IRenderer
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
  
  /** @ignore */
  @JSImport("@pixi/core", "StartupSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
