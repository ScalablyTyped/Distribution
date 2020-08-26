package typings.phaser.Phaser.GameObjects.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for calculating and setting the size of a non-Frame based Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait ComputedSize extends js.Object {
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayHeight: Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayWidth: Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  var height: Double = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  var width: Double = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setDisplaySize(width: Double, height: Double): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setSize(width: Double, height: Double): this.type = js.native
}

object ComputedSize {
  @scala.inline
  def apply(
    displayHeight: Double,
    displayWidth: Double,
    height: Double,
    setDisplaySize: (Double, Double) => ComputedSize,
    setSize: (Double, Double) => ComputedSize,
    width: Double
  ): ComputedSize = {
    val __obj = js.Dynamic.literal(displayHeight = displayHeight.asInstanceOf[js.Any], displayWidth = displayWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], setDisplaySize = js.Any.fromFunction2(setDisplaySize), setSize = js.Any.fromFunction2(setSize), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedSize]
  }
  @scala.inline
  implicit class ComputedSizeOps[Self <: ComputedSize] (val x: Self) extends AnyVal {
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
    def setDisplayHeight(value: Double): Self = this.set("displayHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayWidth(value: Double): Self = this.set("displayWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDisplaySize(value: (Double, Double) => ComputedSize): Self = this.set("setDisplaySize", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSize(value: (Double, Double) => ComputedSize): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

