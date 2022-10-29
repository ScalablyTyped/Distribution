package typings.pixiJs.mod

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AccessibilityManager")
@js.native
open class AccessibilityManager protected ()
  extends typings.pixiAccessibility.mod.AccessibilityManager {
  /**
    * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
    */
  def this(renderer: IRenderer) = this()
}
/* static members */
object AccessibilityManager {
  
  /** @ignore */
  @JSImport("pixi.js", "AccessibilityManager.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
