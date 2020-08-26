package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorFactory extends js.Object {
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  def collisions(broadphasePairs: js.Array[IPair], engine: Engine): js.Array[ICollisionData] = js.native
}

object DetectorFactory {
  @scala.inline
  def apply(
    canCollide: (ICollisionFilter, ICollisionFilter) => Boolean,
    collisions: (js.Array[IPair], Engine) => js.Array[ICollisionData]
  ): DetectorFactory = {
    val __obj = js.Dynamic.literal(canCollide = js.Any.fromFunction2(canCollide), collisions = js.Any.fromFunction2(collisions))
    __obj.asInstanceOf[DetectorFactory]
  }
  @scala.inline
  implicit class DetectorFactoryOps[Self <: DetectorFactory] (val x: Self) extends AnyVal {
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
    def setCanCollide(value: (ICollisionFilter, ICollisionFilter) => Boolean): Self = this.set("canCollide", js.Any.fromFunction2(value))
    @scala.inline
    def setCollisions(value: (js.Array[IPair], Engine) => js.Array[ICollisionData]): Self = this.set("collisions", js.Any.fromFunction2(value))
  }
  
}

