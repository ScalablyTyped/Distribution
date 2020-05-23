package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter", "ResolverFactory")
@js.native
class ResolverFactory ()
  extends typings.phaser.MatterJS.ResolverFactory {
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  /* CompleteClass */
  override def postSolvePosition(bodies: js.Array[BodyType]): Unit = js.native
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  /* CompleteClass */
  override def preSolvePosition(pairs: js.Array[IPair]): Unit = js.native
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  /* CompleteClass */
  override def preSolveVelocity(pairs: js.Array[IPair]): Unit = js.native
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  /* CompleteClass */
  override def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit = js.native
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  /* CompleteClass */
  override def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit = js.native
}

