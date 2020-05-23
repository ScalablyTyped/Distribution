package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods for setting the friction of an Arcade Physics Body.
  * 
  * In Arcade Physics, friction is a special case of motion transfer from an "immovable" body to a riding body.
  */
@js.native
trait Friction extends js.Object {
  /**
    * Sets the friction of this game object's physics body.
    * In Arcade Physics, friction is a special case of motion transfer from an "immovable" body to a riding body.
    * @param x The amount of horizontal friction to apply, [0, 1].
    * @param y The amount of vertical friction to apply, [0, 1]. Default x.
    */
  def setFriction(x: Double): this.type = js.native
  def setFriction(x: Double, y: Double): this.type = js.native
  /**
    * Sets the horizontal friction of this game object's physics body.
    * This can move a riding body horizontally when it collides with this one on the vertical axis.
    * @param x The amount of friction to apply, [0, 1].
    */
  def setFrictionX(x: Double): this.type = js.native
  /**
    * Sets the vertical friction of this game object's physics body.
    * This can move a riding body vertically when it collides with this one on the horizontal axis.
    * @param y The amount of friction to apply, [0, 1].
    */
  def setFrictionY(y: Double): this.type = js.native
}

