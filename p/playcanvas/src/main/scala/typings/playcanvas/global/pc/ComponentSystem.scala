package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component Systems contain the logic and functionality to update all Components of a particular type.
  * @param app - The application managing this system.
  */
@JSGlobal("pc.ComponentSystem")
@js.native
class ComponentSystem protected ()
  extends typings.playcanvas.pc.EventHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}

