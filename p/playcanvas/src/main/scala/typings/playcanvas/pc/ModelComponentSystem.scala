package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ModelComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Allows an Entity to render a model or a primitive shape like a box,
  * capsule, sphere, cylinder, cone etc.
  * @description Create a new ModelComponentSystem.
  * @param {pc.Application} app - The Application.
  */
@JSGlobal("pc.ModelComponentSystem")
@js.native
class ModelComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
}

