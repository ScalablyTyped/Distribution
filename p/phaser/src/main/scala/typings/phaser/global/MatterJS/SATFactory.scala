package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.SATFactory")
@js.native
class SATFactory ()
  extends StObject
     with typings.phaser.MatterJS.SATFactory {
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  /* CompleteClass */
  override def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = js.native
}
