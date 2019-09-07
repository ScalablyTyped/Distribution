package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScreenComponentSystem
  * @classdesc Manages creation of {@link pc.ScreenComponent}s.
  * @description Create a new ScreenComponentSystem
  * @param {pc.Application} app The application
  * @extends pc.ComponentSystem
  */
@JSImport("playcanvas", "ScreenComponentSystem")
@js.native
class ScreenComponentSystem protected ()
  extends typings.playcanvas.pcNs.ScreenComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

