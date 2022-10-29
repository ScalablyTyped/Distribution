package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "EventSystem")
@js.native
open class EventSystem protected ()
  extends typings.pixiEvents.mod.EventSystem {
  /**
    * @param {PIXI.Renderer} renderer
    */
  def this(renderer: typings.pixiEvents.libEventSystemMod.Renderer) = this()
}
/* static members */
object EventSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "EventSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
