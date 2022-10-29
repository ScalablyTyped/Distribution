package typings.pixiJs.mod

import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "FederatedEvent")
@js.native
open class FederatedEvent[N /* <: UIEvent */] protected ()
  extends typings.pixiEvents.mod.FederatedEvent[N] {
  /**
    * @param manager - The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
}
