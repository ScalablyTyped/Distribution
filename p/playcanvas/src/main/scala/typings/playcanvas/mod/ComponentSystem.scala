package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ComponentSystem
  * @extends pc.EventHandler
  * @classdesc Component Systems contain the logic and functionality to update all Components of a particular type.
  * @param {pc.Application} app The application managing this system.
  */
@JSImport("playcanvas", "ComponentSystem")
@js.native
class ComponentSystem protected ()
  extends typings.playcanvas.pc.ComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

