package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.CollisionComponentSystem
  * @classdesc Manages creation of {@link pc.CollisionComponent}s.
  * @description Creates a new CollisionComponentSystem.
  * @param {pc.Application} app The running {pc.Application}
  * @extends pc.ComponentSystem
  */
@JSImport("playcanvas", "CollisionComponentSystem")
@js.native
class CollisionComponentSystem protected ()
  extends typings.playcanvas.pcNs.CollisionComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

