package typings.phaser.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains methods for changing the collision filter of a Matter Body. Should be used as a mixin and not called directly.
  */
@js.native
trait Collision extends js.Object {
  def setCollidesWith(categories: js.Array[Double]): GameObject = js.native
  /**
    * Sets the collision mask for this Game Object's Matter Body. Two Matter Bodies with different collision groups will only collide if each one includes the other's category in its mask based on a bitwise AND, i.e. `(categoryA & maskB) !== 0` and `(categoryB & maskA) !== 0` are both true.
    * @param categories A unique category bitfield, or an array of them.
    */
  def setCollidesWith(categories: Double): GameObject = js.native
  /**
    * Sets the collision category of this Game Object's Matter Body. This number must be a power of two between 2^0 (= 1) and 2^31. Two bodies with different collision groups (see {@link #setCollisionGroup}) will only collide if their collision categories are included in their collision masks (see {@link #setCollidesWith}).
    * @param value Unique category bitfield.
    */
  def setCollisionCategory(value: Double): GameObject = js.native
  /**
    * Sets the collision group of this Game Object's Matter Body. If this is zero or two Matter Bodies have different values, they will collide according to the usual rules (see {@link #setCollisionCategory} and {@link #setCollisionGroup}). If two Matter Bodies have the same positive value, they will always collide; if they have the same negative value, they will never collide.
    * @param value Unique group index.
    */
  def setCollisionGroup(value: Double): GameObject = js.native
}

