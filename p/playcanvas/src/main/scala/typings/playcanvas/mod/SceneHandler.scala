package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SceneHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Scene} resources.
  * @param {pc.Application} app - The running {@link pc.Application}.
  */
@JSImport("playcanvas", "SceneHandler")
@js.native
class SceneHandler protected ()
  extends typings.playcanvas.pc.SceneHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}

