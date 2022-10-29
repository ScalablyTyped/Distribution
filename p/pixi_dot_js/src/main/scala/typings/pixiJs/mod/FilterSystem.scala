package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "FilterSystem")
@js.native
open class FilterSystem protected ()
  extends typings.pixiCore.mod.FilterSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object FilterSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "FilterSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
