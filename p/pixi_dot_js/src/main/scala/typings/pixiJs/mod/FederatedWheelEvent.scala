package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "FederatedWheelEvent")
@js.native
open class FederatedWheelEvent protected ()
  extends typings.pixiEvents.mod.FederatedWheelEvent {
  /**
    * @param manager - The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  def this(manager: typings.pixiEvents.libEventBoundaryMod.EventBoundary) = this()
}
