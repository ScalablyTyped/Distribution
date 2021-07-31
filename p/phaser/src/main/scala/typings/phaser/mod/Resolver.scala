package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Resolver` module contains methods for resolving collision pairs.
  *
  * @class Resolver
  */
@JSImport("matter", "Resolver")
@js.native
class Resolver ()
  extends StObject
     with typings.phaser.MatterJS.Resolver
object Resolver {
  
  @JSImport("matter", "Resolver")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  /* static member */
  @scala.inline
  def postSolvePosition(bodies: js.Array[BodyType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postSolvePosition")(bodies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  /* static member */
  @scala.inline
  def preSolvePosition(pairs: js.Array[IPair]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preSolvePosition")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  /* static member */
  @scala.inline
  def preSolveVelocity(pairs: js.Array[IPair]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preSolveVelocity")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  /* static member */
  @scala.inline
  def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePosition")(pairs.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  /* static member */
  @scala.inline
  def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solveVelocity")(pairs.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
