package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "TransformFeedbackSystem")
@js.native
open class TransformFeedbackSystem protected ()
  extends typings.pixiCore.libTransformFeedbackTransformFeedbackSystemMod.TransformFeedbackSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
}
/* static members */
object TransformFeedbackSystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "TransformFeedbackSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
