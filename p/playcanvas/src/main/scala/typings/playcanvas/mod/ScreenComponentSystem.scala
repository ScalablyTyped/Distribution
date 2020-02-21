package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScreenComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Manages creation of {@link pc.ScreenComponent}s.
  * @description Create a new ScreenComponentSystem.
  * @param {pc.Application} app - The application.
  */
@JSImport("playcanvas", "ScreenComponentSystem")
@js.native
class ScreenComponentSystem protected ()
  extends typings.playcanvas.pc.ScreenComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

