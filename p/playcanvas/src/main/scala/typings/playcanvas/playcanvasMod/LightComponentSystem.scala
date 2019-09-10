package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.LightComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc A Light Component is used to dynamically light the scene.
  * @description Create a new LightComponentSystem.
  * @param {pc.Application} app The application.
  */
@JSImport("playcanvas", "LightComponentSystem")
@js.native
class LightComponentSystem protected ()
  extends typings.playcanvas.pcNs.LightComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

