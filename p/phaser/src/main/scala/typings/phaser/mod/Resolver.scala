package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Resolver` module contains methods for resolving collision pairs.
  *
  * @class Resolver
  */
@JSImport("matter", "Resolver")
@js.native
class Resolver ()
  extends typings.phaser.MatterJS.Resolver

/* static members */
@JSImport("matter", "Resolver")
@js.native
object Resolver extends js.Object {
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

