package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SATFactory extends js.Object {
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
  @scala.inline
  def apply(collides: (BodyType, BodyType, ICollisionData) => ICollisionData): SATFactory = {
    val __obj = js.Dynamic.literal(collides = js.Any.fromFunction3(collides))
    __obj.asInstanceOf[SATFactory]
  }
}

