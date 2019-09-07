package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptComponentSystem
  * @description Create a new ScriptComponentSystem
  * @classdesc Allows scripts to be attached to an Entity and executed
  * @param {pc.Application} app The application
  * @extends pc.ComponentSystem
  */
@JSImport("playcanvas", "ScriptComponentSystem")
@js.native
class ScriptComponentSystem protected ()
  extends typings.playcanvas.pcNs.ScriptComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

