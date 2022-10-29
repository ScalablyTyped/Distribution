package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "FederatedPointerEvent")
@js.native
open class FederatedPointerEvent protected ()
  extends typings.pixiEvents.mod.FederatedPointerEvent {
  /**
    * @param manager - The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
}
