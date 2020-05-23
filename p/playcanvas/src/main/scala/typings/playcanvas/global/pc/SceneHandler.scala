package typings.playcanvas.global.pc

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading {@link pc.Scene} resources.
  * @param app - The running {@link pc.Application}.
  */
@JSGlobal("pc.SceneHandler")
@js.native
class SceneHandler protected () extends ResourceHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}

