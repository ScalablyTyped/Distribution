package typings.phaser.Phaser.Physics.Impact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Impact.Solver")
@js.native
object Solver extends js.Object {
  /**
    * Impact Physics Solver
    * @param world The Impact simulation to run the solver in.
    * @param bodyA The first body in the collision.
    * @param bodyB The second body in the collision.
    */
  def apply(world: World, bodyA: Body, bodyB: Body): Unit = js.native
}

