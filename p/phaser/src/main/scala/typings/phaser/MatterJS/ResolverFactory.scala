package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverFactory extends js.Object {
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  def postSolvePosition(bodies: js.Array[BodyType]): Unit
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  def preSolvePosition(pairs: js.Array[IPair]): Unit
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  def preSolveVelocity(pairs: js.Array[IPair]): Unit
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit
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
}

