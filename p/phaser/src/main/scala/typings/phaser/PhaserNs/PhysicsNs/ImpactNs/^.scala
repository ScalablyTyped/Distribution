package typings.phaser.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Impact")
@js.native
object ^ extends js.Object {
  /**
    * [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    * @param vel [description]
    * @param accel [description]
    * @param friction [description]
    * @param max [description]
    */
  def GetVelocity(delta: Double, vel: Double, accel: Double, friction: Double, max: Double): Double = js.native
  /**
    * [description]
    * @param world [description]
    * @param left [description]
    * @param right [description]
    * @param weak [description]
    */
  def SeparateX(world: World, left: Body, right: Body): Unit = js.native
  def SeparateX(world: World, left: Body, right: Body, weak: Body): Unit = js.native
  /**
    * [description]
    * @param world [description]
    * @param top [description]
    * @param bottom [description]
    * @param weak [description]
    */
  def SeparateY(world: World, top: Body, bottom: Body): Unit = js.native
  def SeparateY(world: World, top: Body, bottom: Body, weak: Body): Unit = js.native
  /**
    * Impact Physics Solver
    * @param world The Impact simulation to run the solver in.
    * @param bodyA The first body in the collision.
    * @param bodyB The second body in the collision.
    */
  def Solver(world: World, bodyA: Body, bodyB: Body): Unit = js.native
  /**
    * Set up the trace-result
    * var res = {
    *     collision: {x: false, y: false, slope: false},
    *     pos: {x: x, y: y},
    *     tile: {x: 0, y: 0}
    * };
    * @param body [description]
    * @param res [description]
    */
  def UpdateMotion(body: Body, res: js.Object): Unit = js.native
}

