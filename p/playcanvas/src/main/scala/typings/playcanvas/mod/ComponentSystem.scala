package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component Systems contain the logic and functionality to update all Components of a particular type.
  * @param app - The application managing this system.
  */
@JSImport("playcanvas", "ComponentSystem")
@js.native
class ComponentSystem protected ()
  extends StObject
     with typings.playcanvas.pc.EventHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}
