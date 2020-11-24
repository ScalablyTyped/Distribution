package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.MatterJS.Body
import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains methods for changing the collision filter of a Matter Body. Should be used as a mixin and not called directly.
  */
@js.native
trait Collision extends js.Object {
  
  def setCollidesWith(categories: js.Array[Double]): GameObject = js.native
  /**
    * Sets the collision mask for this Game Object's Matter Body. Two Matter Bodies with different collision groups will only
    * collide if each one includes the other's category in its mask based on a bitwise AND, i.e. `(categoryA & maskB) !== 0`
    * and `(categoryB & maskA) !== 0` are both true.
    * @param categories A unique category bitfield, or an array of them.
    */
  def setCollidesWith(categories: Double): GameObject = js.native
  
  /**
    * Sets the collision category of this Game Object's Matter Body. This number must be a power of two between 2^0 (= 1) and 2^31.
    * Two bodies with different collision groups (see {@link #setCollisionGroup}) will only collide if their collision
    * categories are included in their collision masks (see {@link #setCollidesWith}).
    * @param value Unique category bitfield.
    */
  def setCollisionCategory(value: Double): GameObject = js.native
  
  /**
    * Sets the collision group of this Game Object's Matter Body. If this is zero or two Matter Bodies have different values,
    * they will collide according to the usual rules (see {@link #setCollisionCategory} and {@link #setCollisionGroup}).
    * If two Matter Bodies have the same positive value, they will always collide; if they have the same negative value,
    * they will never collide.
    * @param value Unique group index.
    */
  def setCollisionGroup(value: Double): GameObject = js.native
  
  /**
    * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
    * 
    * This does not change the bodies collision category, group or filter. Those must be set in addition
    * to the callback.
    * @param callback The callback to invoke when this body starts colliding with another.
    */
  def setOnCollide(callback: js.Function): GameObject = js.native
  
  /**
    * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
    * 
    * This does not change the bodies collision category, group or filter. Those must be set in addition
    * to the callback.
    * @param callback The callback to invoke for the duration of this body colliding with another.
    */
  def setOnCollideActive(callback: js.Function): GameObject = js.native
  
  /**
    * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
    * 
    * This does not change the bodies collision category, group or filter. Those must be set in addition
    * to the callback.
    * @param callback The callback to invoke when this body stops colliding with another.
    */
  def setOnCollideEnd(callback: js.Function): GameObject = js.native
  
  def setOnCollideWith(body: js.Array[Body], callback: js.Function): GameObject = js.native
  /**
    * The callback is sent a reference to the other body, along with a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
    * 
    * This does not change the bodies collision category, group or filter. Those must be set in addition
    * to the callback.
    * @param body The body, or an array of bodies, to test for collisions with.
    * @param callback The callback to invoke when this body collides with the given body or bodies.
    */
  def setOnCollideWith(body: Body, callback: js.Function): GameObject = js.native
}
