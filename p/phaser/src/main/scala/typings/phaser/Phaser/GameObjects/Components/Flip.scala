package typings.phaser.Phaser.GameObjects.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for visually flipping a Game Object.
  * Should be applied as a mixin and not used directly.
  */
trait Flip extends js.Object {
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  var flipX: Boolean
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  var flipY: Boolean
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  def resetFlip(): this.type
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlip(x: Boolean, y: Boolean): this.type
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipX(value: Boolean): this.type
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipY(value: Boolean): this.type
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  def toggleFlipX(): this.type
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  def toggleFlipY(): this.type
}

object Flip {
  @scala.inline
  def apply(
    flipX: Boolean,
    flipY: Boolean,
    resetFlip: () => Flip,
    setFlip: (Boolean, Boolean) => Flip,
    setFlipX: Boolean => Flip,
    setFlipY: Boolean => Flip,
    toggleFlipX: () => Flip,
    toggleFlipY: () => Flip
  ): Flip = {
    val __obj = js.Dynamic.literal(flipX = flipX, flipY = flipY, resetFlip = js.Any.fromFunction0(resetFlip), setFlip = js.Any.fromFunction2(setFlip), setFlipX = js.Any.fromFunction1(setFlipX), setFlipY = js.Any.fromFunction1(setFlipY), toggleFlipX = js.Any.fromFunction0(toggleFlipX), toggleFlipY = js.Any.fromFunction0(toggleFlipY))
  
    __obj.asInstanceOf[Flip]
  }
}

