package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.Phaser.Textures.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the size of a Game Object.
  */
trait Size extends js.Object {
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayHeight: Double
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayWidth: Double
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  var height: Double
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  var width: Double
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setDisplaySize(width: Double, height: Double): this.type
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
  def setSize(width: Double, height: Double): this.type
  /**
    * Sets the size of this Game Object to be that of the given Frame.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param frame The frame to base the size of this Game Object on.
    */
  def setSizeToFrame(frame: Frame): this.type
}

object Size {
  @scala.inline
  def apply(
    displayHeight: Double,
    displayWidth: Double,
    height: Double,
    setDisplaySize: (Double, Double) => Size,
    setSize: (Double, Double) => Size,
    setSizeToFrame: Frame => Size,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(displayHeight = displayHeight.asInstanceOf[js.Any], displayWidth = displayWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], setDisplaySize = js.Any.fromFunction2(setDisplaySize), setSize = js.Any.fromFunction2(setSize), setSizeToFrame = js.Any.fromFunction1(setSizeToFrame), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

