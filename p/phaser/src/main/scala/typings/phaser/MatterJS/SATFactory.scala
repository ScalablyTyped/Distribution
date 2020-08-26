package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SATFactory extends js.Object {
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
  implicit class SATFactoryOps[Self <: SATFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollides(value: (BodyType, BodyType, ICollisionData) => ICollisionData): Self = this.set("collides", js.Any.fromFunction3(value))
  }
  
}

