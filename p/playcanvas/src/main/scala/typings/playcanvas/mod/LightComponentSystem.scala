package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.LightComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc A Light Component is used to dynamically light the scene.
  * @description Create a new LightComponentSystem.
  * @param {pc.Application} app - The application.
  */
@JSImport("playcanvas", "LightComponentSystem")
@js.native
class LightComponentSystem protected ()
  extends typings.playcanvas.pc.LightComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

