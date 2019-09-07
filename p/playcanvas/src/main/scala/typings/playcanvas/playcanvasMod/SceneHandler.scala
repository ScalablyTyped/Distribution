package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SceneHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Scene} resources
  * @param {pc.Application} app The running {@link pc.Application}
  */
@JSImport("playcanvas", "SceneHandler")
@js.native
class SceneHandler protected ()
  extends typings.playcanvas.pcNs.SceneHandler {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

