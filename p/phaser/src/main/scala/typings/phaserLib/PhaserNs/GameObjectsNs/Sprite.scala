package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
@JSGlobal("Phaser.GameObjects.Sprite")
@js.native
class Sprite protected ()
  extends GameObject
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Depth
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Flip
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.GetBounds
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Mask
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Origin
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Size
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.TextureCrop
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Tint
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Transform
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * The Animation Controller of this Sprite.
    */
  var anims: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: scala.Double = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: scala.Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: scala.Double = js.native
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override var flipX: scala.Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override var flipY: scala.Boolean = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
    * Start playing the given animation.
    * @param key The string-based key of the animation to play.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def play(key: java.lang.String): Sprite = js.native
  def play(key: java.lang.String, ignoreIfPlaying: scala.Boolean): Sprite = js.native
  def play(key: java.lang.String, ignoreIfPlaying: scala.Boolean, startFrame: phaserLib.integer): Sprite = js.native
  /**
    * Update this Sprite's animations.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def preUpdate(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: scala.Boolean, y: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: scala.Boolean): this.type = js.native
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: scala.Boolean): this.type = js.native
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
  /* CompleteClass */
  override def setSize(width: scala.Double, height: scala.Double): this.type = js.native
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
  /* CompleteClass */
  override def setSizeToFrame(frame: phaserLib.PhaserNs.TexturesNs.Frame): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
}

