package typings.pixiJs.mod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ViewSystem")
@js.native
open class ViewSystem protected ()
  extends typings.pixiCore.mod.ViewSystem {
  def this(renderer: IRenderer) = this()
}
/* static members */
object ViewSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "ViewSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
