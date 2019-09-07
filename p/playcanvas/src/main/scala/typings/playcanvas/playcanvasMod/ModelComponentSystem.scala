package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ModelComponentSystem
  * @classdesc Allows an Entity to render a model or a primitive shape like a box,
  * capsule, sphere, cylinder, cone etc.
  * @description Create a new ModelComponentSystem
  * @param {pc.Application} app The Application.
  * @extends pc.ComponentSystem
  */
@JSImport("playcanvas", "ModelComponentSystem")
@js.native
class ModelComponentSystem protected ()
  extends typings.playcanvas.pcNs.ModelComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

