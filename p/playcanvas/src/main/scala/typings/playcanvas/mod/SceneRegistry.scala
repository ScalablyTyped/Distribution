package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for storing the name and url for scene files.
  * @param app - The application.
  */
@JSImport("playcanvas", "SceneRegistry")
@js.native
class SceneRegistry protected ()
  extends typings.playcanvas.pc.SceneRegistry {
  def this(app: typings.playcanvas.pc.Application) = this()
}

