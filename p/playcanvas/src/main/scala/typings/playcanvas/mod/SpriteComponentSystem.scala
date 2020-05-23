package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages creation of {@link pc.SpriteComponent}s.
  * @param app - The application.
  */
@JSImport("playcanvas", "SpriteComponentSystem")
@js.native
class SpriteComponentSystem protected ()
  extends typings.playcanvas.pc.EventHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}

