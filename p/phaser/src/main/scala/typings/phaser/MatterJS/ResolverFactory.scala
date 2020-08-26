package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverFactory extends js.Object {
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  def postSolvePosition(bodies: js.Array[BodyType]): Unit = js.native
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  def preSolvePosition(pairs: js.Array[IPair]): Unit = js.native
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  def preSolveVelocity(pairs: js.Array[IPair]): Unit = js.native
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit = js.native
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit = js.native
}

object ResolverFactory {
  @scala.inline
  def apply(
    postSolvePosition: js.Array[BodyType] => Unit,
    preSolvePosition: js.Array[IPair] => Unit,
    preSolveVelocity: js.Array[IPair] => Unit,
    solvePosition: (js.Array[IPair], js.Array[BodyType], Double) => Unit,
    solveVelocity: (js.Array[IPair], Double) => Unit
  ): ResolverFactory = {
    val __obj = js.Dynamic.literal(postSolvePosition = js.Any.fromFunction1(postSolvePosition), preSolvePosition = js.Any.fromFunction1(preSolvePosition), preSolveVelocity = js.Any.fromFunction1(preSolveVelocity), solvePosition = js.Any.fromFunction3(solvePosition), solveVelocity = js.Any.fromFunction2(solveVelocity))
    __obj.asInstanceOf[ResolverFactory]
  }
  @scala.inline
  implicit class ResolverFactoryOps[Self <: ResolverFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostSolvePosition(value: js.Array[BodyType] => Unit): Self = this.set("postSolvePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setPreSolvePosition(value: js.Array[IPair] => Unit): Self = this.set("preSolvePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setPreSolveVelocity(value: js.Array[IPair] => Unit): Self = this.set("preSolveVelocity", js.Any.fromFunction1(value))
    @scala.inline
    def setSolvePosition(value: (js.Array[IPair], js.Array[BodyType], Double) => Unit): Self = this.set("solvePosition", js.Any.fromFunction3(value))
    @scala.inline
    def setSolveVelocity(value: (js.Array[IPair], Double) => Unit): Self = this.set("solveVelocity", js.Any.fromFunction2(value))
  }
  
}

