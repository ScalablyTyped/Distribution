package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverFactory extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ResolverFactory] (val x: Self) extends AnyVal {
    
    inline def setPostSolvePosition(value: js.Array[BodyType] => Unit): Self = StObject.set(x, "postSolvePosition", js.Any.fromFunction1(value))
    
    inline def setPreSolvePosition(value: js.Array[IPair] => Unit): Self = StObject.set(x, "preSolvePosition", js.Any.fromFunction1(value))
    
    inline def setPreSolveVelocity(value: js.Array[IPair] => Unit): Self = StObject.set(x, "preSolveVelocity", js.Any.fromFunction1(value))
    
    inline def setSolvePosition(value: (js.Array[IPair], js.Array[BodyType], Double) => Unit): Self = StObject.set(x, "solvePosition", js.Any.fromFunction3(value))
    
    inline def setSolveVelocity(value: (js.Array[IPair], Double) => Unit): Self = StObject.set(x, "solveVelocity", js.Any.fromFunction2(value))
  }
}
