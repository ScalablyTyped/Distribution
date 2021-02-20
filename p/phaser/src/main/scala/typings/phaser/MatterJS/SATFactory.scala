package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SATFactory extends StObject {
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = js.native
}
object SATFactory {
  
  @scala.inline
  def apply(collides: (BodyType, BodyType, ICollisionData) => ICollisionData): SATFactory = {
    val __obj = js.Dynamic.literal(collides = js.Any.fromFunction3(collides))
    __obj.asInstanceOf[SATFactory]
  }
  
  @scala.inline
  implicit class SATFactoryMutableBuilder[Self <: SATFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollides(value: (BodyType, BodyType, ICollisionData) => ICollisionData): Self = StObject.set(x, "collides", js.Any.fromFunction3(value))
  }
}
