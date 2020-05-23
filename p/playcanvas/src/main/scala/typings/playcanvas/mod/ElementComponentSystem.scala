package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages creation of {@link pc.ElementComponent}s.
  * @param app - The application.
  */
@JSImport("playcanvas", "ElementComponentSystem")
@js.native
class ElementComponentSystem protected ()
  extends typings.playcanvas.pc.EventHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}

