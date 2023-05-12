package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  v0.18 Release Updates
trait Collision extends StObject {
  
  /**
    * Detect collision between two bodies.
    * @method collides
    * @param {BodyType} bodyA
    * @param {BodyType} bodyB
    * @param {Pairs} [pairs] Optionally reuse collision records from existing pairs.
    * @return {collision|null} A collision record if detected, otherwise null
    */
  def collides(bodyA: BodyType, bodyB: BodyType, pairs: Pairs): Any
  
  /**
    * Creates a new collision record.
    * @method create
    * @param {BodyType} bodyA The first body part represented by the collision record
    * @param {BodyType} bodyB The second body part represented by the collision record
    * @return {collision} A new collision record
    */
  def create(bodyA: BodyType, bodyB: BodyType): Any
}
object Collision {
  
  inline def apply(collides: (BodyType, BodyType, Pairs) => Any, create: (BodyType, BodyType) => Any): Collision = {
    val __obj = js.Dynamic.literal(collides = js.Any.fromFunction3(collides), create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[Collision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collision] (val x: Self) extends AnyVal {
    
    inline def setCollides(value: (BodyType, BodyType, Pairs) => Any): Self = StObject.set(x, "collides", js.Any.fromFunction3(value))
    
    inline def setCreate(value: (BodyType, BodyType) => Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
