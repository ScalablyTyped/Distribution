package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.SAT` module contains methods for detecting collisions using the Separating Axis Theorem.
  *
  * @class SAT
  */
@JSGlobal("MatterJS.SAT")
@js.native
class SAT ()
  extends StObject
     with typings.phaser.MatterJS.SAT
object SAT {
  
  @JSGlobal("MatterJS.SAT")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  /* static member */
  @scala.inline
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], previousCollision.asInstanceOf[js.Any])).asInstanceOf[ICollisionData]
}
