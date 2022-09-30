package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiInteraction.mod.InteractionManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "InteractionManager")
@js.native
open class InteractionManager protected ()
  extends typings.pixiInteraction.mod.InteractionManager {
  /**
    * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
    * @param options - The options for the manager.
    * @param {boolean} [options.autoPreventDefault=true] - Should the manager automatically prevent default browser actions.
    * @param {number} [options.interactionFrequency=10] - Maximum frequency (ms) at pointer over/out states will be checked.
    * @param {number} [options.useSystemTicker=true] - Whether to add {@link tickerUpdate} to {@link PIXI.Ticker.system}.
    */
  def this(renderer: typings.pixiCore.mod.AbstractRenderer) = this()
  def this(renderer: typings.pixiCore.mod.AbstractRenderer, options: InteractionManagerOptions) = this()
}
/* static members */
object InteractionManager {
  
  /** @ignore */
  @JSImport("pixi.js", "InteractionManager.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
