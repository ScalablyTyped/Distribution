package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.CollisionComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Manages creation of {@link pc.CollisionComponent}s.
  * @description Creates a new CollisionComponentSystem.
  * @param {pc.Application} app - The running {pc.Application}.
  */
@JSImport("playcanvas", "CollisionComponentSystem")
@js.native
class CollisionComponentSystem protected ()
  extends typings.playcanvas.pc.CollisionComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

