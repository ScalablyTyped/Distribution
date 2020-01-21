package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Pair` module contains methods for creating and manipulating collision pairs.
  *
  * @class Pair
  */
@JSGlobal("MatterJS.Pair")
@js.native
class Pair () extends js.Object

/* static members */
@JSGlobal("MatterJS.Pair")
@js.native
object Pair extends js.Object {
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  def create(collision: ICollisionData, timestamp: Double): IPair = js.native
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  def id(bodyA: BodyType, bodyB: BodyType): String = js.native
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit = js.native
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit = js.native
}

