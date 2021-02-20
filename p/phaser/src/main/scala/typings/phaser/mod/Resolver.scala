package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Resolver` module contains methods for resolving collision pairs.
  *
  * @class Resolver
  */
@JSImport("matter", "Resolver")
@js.native
class Resolver ()
  extends typings.phaser.MatterJS.Resolver
object Resolver {
  
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  /* static member */
  @JSImport("matter", "Resolver.postSolvePosition")
  @js.native
  def postSolvePosition(bodies: js.Array[BodyType]): Unit = js.native
  
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  /* static member */
  @JSImport("matter", "Resolver.preSolvePosition")
  @js.native
  def preSolvePosition(pairs: js.Array[IPair]): Unit = js.native
  
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  /* static member */
  @JSImport("matter", "Resolver.preSolveVelocity")
  @js.native
  def preSolveVelocity(pairs: js.Array[IPair]): Unit = js.native
  
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  /* static member */
  @JSImport("matter", "Resolver.solvePosition")
  @js.native
  def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit = js.native
  
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  /* static member */
  @JSImport("matter", "Resolver.solveVelocity")
  @js.native
  def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit = js.native
}
