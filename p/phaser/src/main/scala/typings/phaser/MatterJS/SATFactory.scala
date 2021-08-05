package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SATFactory extends StObject {
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData
}
object SATFactory {
  
  inline def apply(collides: (BodyType, BodyType, ICollisionData) => ICollisionData): SATFactory = {
    val __obj = js.Dynamic.literal(collides = js.Any.fromFunction3(collides))
    __obj.asInstanceOf[SATFactory]
  }
  
  extension [Self <: SATFactory](x: Self) {
    
    inline def setCollides(value: (BodyType, BodyType, ICollisionData) => ICollisionData): Self = StObject.set(x, "collides", js.Any.fromFunction3(value))
  }
}
