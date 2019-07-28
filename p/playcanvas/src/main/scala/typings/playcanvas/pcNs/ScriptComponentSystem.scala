package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ScriptComponentSystem
  * @description Create a new ScriptComponentSystem
  * @class Allows scripts to be attached to an Entity and executed
  * @param {pc.Application} app The application
  * @extends pc.ComponentSystem
  */
@JSGlobal("pc.ScriptComponentSystem")
@js.native
class ScriptComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
}

