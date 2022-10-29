package typings.pixiAccessibility

import typings.pixiAccessibility.libAccessibleTargetMod.IAccessibleTarget
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/accessibility", "AccessibilityManager")
  @js.native
  open class AccessibilityManager protected ()
    extends typings.pixiAccessibility.libAccessibilityManagerMod.AccessibilityManager {
    /**
      * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: IRenderer) = this()
  }
  /* static members */
  object AccessibilityManager {
    
    /** @ignore */
    @JSImport("@pixi/accessibility", "AccessibilityManager.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/accessibility", "accessibleTarget")
  @js.native
  val accessibleTarget: IAccessibleTarget = js.native
}
