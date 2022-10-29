package typings.pixiJs.mod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "StartupSystem")
@js.native
open class StartupSystem protected ()
  extends typings.pixiCore.mod.StartupSystem {
  def this(renderer: IRenderer) = this()
}
/* static members */
object StartupSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "StartupSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
