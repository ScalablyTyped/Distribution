package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Animations.Animation
import typings.phaser.Phaser.Animations.AnimationFrame
import typings.phaser.Phaser.Animations.AnimationState
import typings.phaser.Phaser.Types.Animations.PlayAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Plane Game Object.
  * 
  * The Plane Game Object is a helper class that takes the Mesh Game Object and extends it,
  * allowing for fast and easy creation of Planes. A Plane is a one-sided grid of cells,
  * where you specify the number of cells in each dimension. The Plane can have a texture
  * that is either repeated (tiled) across each cell, or applied to the full Plane.
  * 
  * The Plane can then be manipulated in 3D space, with rotation across all 3 axis.
  * 
  * This allows you to create effects not possible with regular Sprites, such as perspective
  * distortion. You can also adjust the vertices on a per-vertex basis. Plane data becomes
  * part of the WebGL batch, just like standard Sprites, so doesn't introduce any additional
  * shader overhead. Because the Plane just generates vertices into the WebGL batch, like any
  * other Sprite, you can use all of the common Game Object components on a Plane too,
  * such as a custom pipeline, mask, blend mode or texture.
  * 
  * You can use the `uvScroll` and `uvScale` methods to adjust the placement and scaling
  * of the texture if this Plane is using a single texture, and not a frame from a texture
  * atlas or sprite sheet.
  * 
  * The Plane Game Object also has the Animation component, allowing you to play animations
  * across the Plane just as you would with a Sprite.
  * 
  * Note that the Plane object is WebGL only and does not have a Canvas counterpart.
  * 
  * The Plane origin is always 0.5 x 0.5 and cannot be changed.
  */
@js.native
trait Plane
  extends StObject
     with Mesh {
  
  /**
    * The Animation State component of this Sprite.
    * 
    * This component provides features to apply animations to this Sprite.
    * It is responsible for playing, loading, queuing animations for later playback,
    * mixing between animations and setting the current animation frame to this Sprite.
    */
  var anims: AnimationState = js.native
  
  /**
    * Creates a checkerboard style texture, based on the given colors and alpha
    * values and applies it to this Plane, replacing any current texture it may
    * have.
    * 
    * The colors are used in an alternating pattern, like a chess board.
    * 
    * Calling this method generates a brand new 16x16 pixel WebGLTexture internally
    * and applies it to this Plane. While quite fast to do, you should still be
    * mindful of calling this method either extensively, or in tight parts of
    * your game.
    * @param color1 The odd cell color, specified as a hex value. Default 0xffffff.
    * @param color2 The even cell color, specified as a hex value. Default 0x0000ff.
    * @param alpha1 The odd cell alpha value, specified as a number between 0 and 255. Default 255.
    * @param alpha2 The even cell alpha value, specified as a number between 0 and 255. Default 255.
    * @param height The view height of the Plane after creation, in pixels. Default 128.
    */
  def createCheckerboard(): Unit = js.native
  def createCheckerboard(color1: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Double, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Double, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Double, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Unit, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Unit, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Double, alpha1: Unit, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Double, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Double, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Double, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Unit, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Unit, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Double, color2: Unit, alpha1: Unit, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Double, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Double, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Double, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Unit, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Unit, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Double, alpha1: Unit, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Double, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Double, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Double, alpha2: Unit, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Unit, alpha2: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Unit, alpha2: Double, height: Double): Unit = js.native
  def createCheckerboard(color1: Unit, color2: Unit, alpha1: Unit, alpha2: Unit, height: Double): Unit = js.native
  
  /**
    * The height of this Plane in cells, not pixels.
    * 
    * This value is read-only. To adjust it, see the `setGridSize` method.
    */
  val gridHeight: Double = js.native
  
  /**
    * The width of this Plane in cells, not pixels.
    * 
    * This value is read-only. To adjust it, see the `setGridSize` method.
    */
  val gridWidth: Double = js.native
  
  /**
    * Is the texture of this Plane tiled across all cells, or not?
    * 
    * This value is read-only. To adjust it, see the `setGridSize` method.
    */
  val isTiled: Boolean = js.native
  
  /**
    * Start playing the given animation on this Plane.
    * 
    * Animations in Phaser can either belong to the global Animation Manager, or specifically to this Plane.
    * 
    * The benefit of a global animation is that multiple Game Objects can all play the same animation, without
    * having to duplicate the data. You can just create it once and then play it on any animating Game Object.
    * 
    * The following code shows how to create a global repeating animation. The animation will be created
    * from all of the frames within the sprite sheet that was loaded with the key 'muybridge':
    * 
    * ```javascript
    * var config = {
    *     key: 'run',
    *     frames: 'muybridge',
    *     frameRate: 15,
    *     repeat: -1
    * };
    * 
    * //  This code should be run from within a Scene:
    * this.anims.create(config);
    * ```
    * 
    * However, if you wish to create an animation that is unique to this Plane, and this Plane alone,
    * you can call the `Animation.create` method instead. It accepts the exact same parameters as when
    * creating a global animation, however the resulting data is kept locally in this Plane.
    * 
    * With the animation created, either globally or locally, you can now play it on this Plane:
    * 
    * ```javascript
    * const plane = this.add.plane(...);
    * plane.play('run');
    * ```
    * 
    * Alternatively, if you wish to run it at a different frame rate for example, you can pass a config
    * object instead:
    * 
    * ```javascript
    * const plane = this.add.plane(...);
    * plane.play({ key: 'run', frameRate: 24 });
    * ```
    * 
    * When playing an animation on a Plane it will first check to see if it can find a matching key
    * locally within the Plane. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * 
    * If you need a Plane to be able to play both local and global animations, make sure they don't
    * have conflicting keys.
    * 
    * See the documentation for the `PlayAnimationConfig` config object for more details about this.
    * 
    * Also, see the documentation in the Animation Manager for further details on creating animations.
    * @param key The string-based key of the animation to play, or an Animation instance, or a `PlayAnimationConfig` object.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    */
  def play(key: String): this.type = js.native
  def play(key: String, ignoreIfPlaying: Boolean): this.type = js.native
  def play(key: Animation): this.type = js.native
  def play(key: Animation, ignoreIfPlaying: Boolean): this.type = js.native
  def play(key: PlayAnimationConfig): this.type = js.native
  def play(key: PlayAnimationConfig, ignoreIfPlaying: Boolean): this.type = js.native
  
  /**
    * Waits for the specified delay, in milliseconds, then starts playback of the given animation.
    * 
    * If the animation _also_ has a delay value set in its config, it will be **added** to the delay given here.
    * 
    * If an animation is already running and a new animation is given to this method, it will wait for
    * the given delay before starting the new animation.
    * 
    * If no animation is currently running, the given one begins after the delay.
    * 
    * When playing an animation on a Game Object it will first check to see if it can find a matching key
    * locally within the Game Object. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * @param key The string-based key of the animation to play, or an Animation instance, or a `PlayAnimationConfig` object.
    * @param delay The delay, in milliseconds, to wait before starting the animation playing.
    */
  def playAfterDelay(key: String, delay: Double): this.type = js.native
  def playAfterDelay(key: Animation, delay: Double): this.type = js.native
  def playAfterDelay(key: PlayAnimationConfig, delay: Double): this.type = js.native
  
  /**
    * Waits for the current animation to complete the `repeatCount` number of repeat cycles, then starts playback
    * of the given animation.
    * 
    * You can use this to ensure there are no harsh jumps between two sets of animations, i.e. going from an
    * idle animation to a walking animation, by making them blend smoothly into each other.
    * 
    * If no animation is currently running, the given one will start immediately.
    * 
    * When playing an animation on a Game Object it will first check to see if it can find a matching key
    * locally within the Game Object. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * @param key The string-based key of the animation to play, or an Animation instance, or a `PlayAnimationConfig` object.
    * @param repeatCount How many times should the animation repeat before the next one starts? Default 1.
    */
  def playAfterRepeat(key: String): this.type = js.native
  def playAfterRepeat(key: String, repeatCount: Double): this.type = js.native
  def playAfterRepeat(key: Animation): this.type = js.native
  def playAfterRepeat(key: Animation, repeatCount: Double): this.type = js.native
  def playAfterRepeat(key: PlayAnimationConfig): this.type = js.native
  def playAfterRepeat(key: PlayAnimationConfig, repeatCount: Double): this.type = js.native
  
  /**
    * Start playing the given animation on this Plane, in reverse.
    * 
    * Animations in Phaser can either belong to the global Animation Manager, or specifically to a Game Object.
    * 
    * The benefit of a global animation is that multiple Game Objects can all play the same animation, without
    * having to duplicate the data. You can just create it once and then play it on any animating Game Object.
    * 
    * The following code shows how to create a global repeating animation. The animation will be created
    * from all of the frames within the sprite sheet that was loaded with the key 'muybridge':
    * 
    * ```javascript
    * var config = {
    *     key: 'run',
    *     frames: 'muybridge',
    *     frameRate: 15,
    *     repeat: -1
    * };
    * 
    * //  This code should be run from within a Scene:
    * this.anims.create(config);
    * ```
    * 
    * However, if you wish to create an animation that is unique to this Game Object, and this Game Object alone,
    * you can call the `Animation.create` method instead. It accepts the exact same parameters as when
    * creating a global animation, however the resulting data is kept locally in this Game Object.
    * 
    * With the animation created, either globally or locally, you can now play it on this Game Object:
    * 
    * ```javascript
    * const plane = this.add.plane(...);
    * plane.playReverse('run');
    * ```
    * 
    * Alternatively, if you wish to run it at a different frame rate, for example, you can pass a config
    * object instead:
    * 
    * ```javascript
    * const plane = this.add.plane(...);
    * plane.playReverse({ key: 'run', frameRate: 24 });
    * ```
    * 
    * When playing an animation on a Game Object it will first check to see if it can find a matching key
    * locally within the Game Object. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * 
    * If you need a Game Object to be able to play both local and global animations, make sure they don't
    * have conflicting keys.
    * 
    * See the documentation for the `PlayAnimationConfig` config object for more details about this.
    * 
    * Also, see the documentation in the Animation Manager for further details on creating animations.
    * @param key The string-based key of the animation to play, or an Animation instance, or a `PlayAnimationConfig` object.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    */
  def playReverse(key: String): this.type = js.native
  def playReverse(key: String, ignoreIfPlaying: Boolean): this.type = js.native
  def playReverse(key: Animation): this.type = js.native
  def playReverse(key: Animation, ignoreIfPlaying: Boolean): this.type = js.native
  def playReverse(key: PlayAnimationConfig): this.type = js.native
  def playReverse(key: PlayAnimationConfig, ignoreIfPlaying: Boolean): this.type = js.native
  
  /**
    * Modifies the layout of this Plane by adjusting the grid dimensions to the
    * given width and height. The values are given in cells, not pixels.
    * 
    * The `tile` parameter allows you to control if the texture is tiled, or
    * applied across the entire Plane? A tiled texture will repeat with one
    * iteration per cell. A non-tiled texture will be applied across the whole
    * Plane.
    * 
    * Note that if this Plane is using a single texture, not from a texture atlas
    * or sprite sheet, then you can use the `Plane.uvScale` method to have much
    * more fine-grained control over the texture tiling.
    * @param width The width of this Plane, in cells, not pixels. Default 8.
    * @param height The height of this Plane, in cells, not pixels. Default 8.
    * @param tile Is the texture tiled? I.e. repeated across each cell. Default false.
    */
  def preDestroy(): Unit = js.native
  def preDestroy(width: Double): Unit = js.native
  def preDestroy(width: Double, height: Double): Unit = js.native
  def preDestroy(width: Double, height: Double, tile: Boolean): Unit = js.native
  def preDestroy(width: Double, height: Unit, tile: Boolean): Unit = js.native
  def preDestroy(width: Unit, height: Double): Unit = js.native
  def preDestroy(width: Unit, height: Double, tile: Boolean): Unit = js.native
  def preDestroy(width: Unit, height: Unit, tile: Boolean): Unit = js.native
  
  /**
    * If this Plane has a Checkerboard Texture, this method will destroy it
    * and reset the internal flag for it.
    */
  def removeCheckerboard(): Unit = js.native
  
  /**
    * Sets the height of this Plane to match the given value, in pixels.
    * 
    * This adjusts the `Plane.viewPosition.z` value to achieve this.
    * 
    * If no `value` parameter is given, it will set the view height to match
    * that of the current texture frame the Plane is using.
    * @param value The height, in pixels, to set this Plane view height to.
    */
  def setViewHeight(): Unit = js.native
  def setViewHeight(value: Double): Unit = js.native
  
  /**
    * Immediately stops the current animation from playing and dispatches the `ANIMATION_STOP` events.
    * 
    * If no animation is playing, no event will be dispatched.
    * 
    * If there is another animation queued (via the `chain` method) then it will start playing immediately.
    */
  def stop(): this.type = js.native
  
  /**
    * Stops the current animation from playing after the specified time delay, given in milliseconds.
    * 
    * It then dispatches the `ANIMATION_STOP` event.
    * 
    * If no animation is running, no events will be dispatched.
    * 
    * If there is another animation in the queue (set via the `chain` method) then it will start playing,
    * when the current one stops.
    * @param delay The number of milliseconds to wait before stopping this animation.
    */
  def stopAfterDelay(delay: Double): this.type = js.native
  
  /**
    * Stops the current animation from playing after the given number of repeats.
    * 
    * It then dispatches the `ANIMATION_STOP` event.
    * 
    * If no animation is running, no events will be dispatched.
    * 
    * If there is another animation in the queue (set via the `chain` method) then it will start playing,
    * when the current one stops.
    * @param repeatCount How many times should the animation repeat before stopping? Default 1.
    */
  def stopAfterRepeat(): this.type = js.native
  def stopAfterRepeat(repeatCount: Double): this.type = js.native
  
  /**
    * Stops the current animation from playing when it next sets the given frame.
    * If this frame doesn't exist within the animation it will not stop it from playing.
    * 
    * It then dispatches the `ANIMATION_STOP` event.
    * 
    * If no animation is running, no events will be dispatched.
    * 
    * If there is another animation in the queue (set via the `chain` method) then it will start playing,
    * when the current one stops.
    * @param frame The frame to check before stopping this animation.
    */
  def stopOnFrame(frame: AnimationFrame): this.type = js.native
}
