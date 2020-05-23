package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorFactory extends js.Object {
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  def collisions(broadphasePairs: js.Array[IPair], engine: Engine): js.Array[ICollisionData]
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
}

