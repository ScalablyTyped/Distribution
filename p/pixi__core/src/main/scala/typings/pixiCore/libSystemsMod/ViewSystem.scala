package typings.pixiCore.libSystemsMod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "ViewSystem")
@js.native
open class ViewSystem protected ()
  extends typings.pixiCore.libViewViewSystemMod.ViewSystem {
  def this(renderer: IRenderer[ICanvas]) = this()
}
/* static members */
object ViewSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "ViewSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
