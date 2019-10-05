package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptComponentSystem
  * @extends pc.ComponentSystem
  * @description Create a new ScriptComponentSystem
  * @classdesc Allows scripts to be attached to an Entity and executed
  * @param {pc.Application} app The application
  */
@JSGlobal("pc.ScriptComponentSystem")
@js.native
class ScriptComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
}

