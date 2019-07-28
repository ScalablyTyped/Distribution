package typings.phaser.PhaserNs.GameObjectsNs

import typings.phaser.PhaserNs.TexturesNs.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bob Game Object.
  * 
  * A Bob belongs to a Blitter Game Object. The Blitter is responsible for managing and rendering this object.
  * 
  * A Bob has a position, alpha value and a frame from a texture that it uses to render with. You can also toggle
  * the flipped and visible state of the Bob. The Frame the Bob uses to render can be changed dynamically, but it
  * must be a Frame within the Texture used by the parent Blitter.
  * 
  * Bob positions are relative to the Blitter parent. So if you move the Blitter parent, all Bob children will
  * have their positions impacted by this change as well.
  * 
  * You can manipulate Bob objects directly from your game code, but the creation and destruction of them should be
  * handled via the Blitter parent.
  */
@JSGlobal("Phaser.GameObjects.Bob")
@js.native
class Bob protected () extends js.Object {
  /**
    * 
    * @param blitter The parent Blitter object is responsible for updating this Bob.
    * @param x The horizontal position of this Game Object in the world, relative to the parent Blitter position.
    * @param y The vertical position of this Game Object in the world, relative to the parent Blitter position.
    * @param frame The Frame this Bob will render with, as defined in the Texture the parent Blitter is using.
    * @param visible Should the Bob render visible or not to start with?
    */
  def this(blitter: Blitter, x: Double, y: Double, frame: String, visible: Boolean) = this()
  def this(blitter: Blitter, x: Double, y: Double, frame: integer, visible: Boolean) = this()
  /**
    * The alpha value of the Bob, between 0 and 1.
    * 
    * A Bob with alpha 0 will skip rendering.
    */
  var alpha: Double = js.native
  /**
    * A blank object which can be used to store data related to this Bob in.
    */
  var data: js.Object = js.native
  /**
    * The horizontally flipped state of the Bob.
    * A Bob that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture.
    */
  var flipX: Boolean = js.native
  /**
    * The vertically flipped state of the Bob.
    * A Bob that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture.
    */
  var flipY: Boolean = js.native
  /**
    * The frame that the Bob uses to render with.
    * To change the frame use the `Bob.setFrame` method.
    */
  var frame: Frame = js.native
  /**
    * The Blitter object that this Bob belongs to.
    */
  var parent: Blitter = js.native
  /**
    * The visible state of the Bob.
    * 
    * An invisible Bob will skip rendering.
    */
  var visible: Boolean = js.native
  /**
    * The x position of this Bob, relative to the x position of the Blitter.
    */
  var x: Double = js.native
  /**
    * The y position of this Bob, relative to the y position of the Blitter.
    */
  var y: Double = js.native
  /**
    * Destroys this Bob instance.
    * Removes itself from the Blitter and clears the parent, frame and data properties.
    */
  def destroy(): Unit = js.native
  /**
    * Resets this Bob.
    * 
    * Changes the position to the values given, and optionally changes the frame.
    * 
    * Also resets the flipX and flipY values, sets alpha back to 1 and visible to true.
    * @param x The x position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param y The y position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param frame The Frame the Bob will use. It _must_ be part of the Texture the parent Blitter object is using.
    */
  def reset(x: Double, y: Double): Bob = js.native
  def reset(x: Double, y: Double, frame: String): Bob = js.native
  def reset(x: Double, y: Double, frame: Frame): Bob = js.native
  def reset(x: Double, y: Double, frame: integer): Bob = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Bob back to their default un-flipped state.
    */
  def resetFlip(): Bob = js.native
  /**
    * Set the Alpha level of this Bob. The alpha controls the opacity of the Game Object as it renders.
    * Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.
    * 
    * A Bob with alpha 0 will skip rendering.
    * @param value The alpha value used for this Bob. Between 0 and 1.
    */
  def setAlpha(value: Double): Bob = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Bob.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlip(x: Boolean, y: Boolean): Bob = js.native
  /**
    * Sets the horizontal flipped state of this Bob.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipX(value: Boolean): Bob = js.native
  /**
    * Sets the vertical flipped state of this Bob.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  def setFlipY(value: Boolean): Bob = js.native
  /**
    * Changes the Texture Frame being used by this Bob.
    * The frame must be part of the Texture the parent Blitter is using.
    * If no value is given it will use the default frame of the Blitter parent.
    * @param frame The frame to be used during rendering.
    */
  def setFrame(): Bob = js.native
  def setFrame(frame: String): Bob = js.native
  def setFrame(frame: Frame): Bob = js.native
  def setFrame(frame: integer): Bob = js.native
  /**
    * Sets the visibility of this Bob.
    * 
    * An invisible Bob will skip rendering.
    * @param value The visible state of the Game Object.
    */
  def setVisible(value: Boolean): Bob = js.native
}

