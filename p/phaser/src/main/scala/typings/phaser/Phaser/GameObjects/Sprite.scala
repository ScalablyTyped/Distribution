package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Animations.Animation
import typings.phaser.Phaser.Animations.AnimationFrame
import typings.phaser.Phaser.Animations.AnimationState
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.PostPipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.TextureCrop
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Types.Animations.PlayAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Sprite
  extends StObject
     with GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with PostPipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible {
  
  /**
    * The Animation State component of this Sprite.
    * 
    * This component provides features to apply animations to this Sprite.
    * It is responsible for playing, loading, queuing animations for later playback,
    * mixing between animations and setting the current animation frame to this Sprite.
    */
  var anims: AnimationState = js.native
  
  /**
    * Sets an animation, or an array of animations, to be played immediately after the current one completes or stops.
    * 
    * The current animation must enter a 'completed' state for this to happen, i.e. finish all of its repeats, delays, etc,
    * or have the `stop` method called directly on it.
    * 
    * An animation set to repeat forever will never enter a completed state.
    * 
    * You can chain a new animation at any point, including before the current one starts playing, during it,
    * or when it ends (via its `animationcomplete` event).
    * 
    * Chained animations are specific to a Game Object, meaning different Game Objects can have different chained
    * animations without impacting the animation they're playing.
    * 
    * Call this method with no arguments to reset all currently chained animations.
    * 
    * When playing an animation on a Sprite it will first check to see if it can find a matching key
    * locally within the Sprite. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * @param key The string-based key of the animation to play, or an Animation instance, or a `PlayAnimationConfig` object, or an array of them.
    */
  def chain(): this.type = js.native
  def chain(key: String): this.type = js.native
  def chain(key: js.Array[Animation | PlayAnimationConfig | String]): this.type = js.native
  def chain(key: Animation): this.type = js.native
  def chain(key: PlayAnimationConfig): this.type = js.native
  
  /**
    * Start playing the given animation on this Sprite.
    * 
    * Animations in Phaser can either belong to the global Animation Manager, or specifically to this Sprite.
    * 
    * The benefit of a global animation is that multiple Sprites can all play the same animation, without
    * having to duplicate the data. You can just create it once and then play it on any Sprite.
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
    * However, if you wish to create an animation that is unique to this Sprite, and this Sprite alone,
    * you can call the `Animation.create` method instead. It accepts the exact same parameters as when
    * creating a global animation, however the resulting data is kept locally in this Sprite.
    * 
    * With the animation created, either globally or locally, you can now play it on this Sprite:
    * 
    * ```javascript
    * this.add.sprite(x, y).play('run');
    * ```
    * 
    * Alternatively, if you wish to run it at a different frame rate, for example, you can pass a config
    * object instead:
    * 
    * ```javascript
    * this.add.sprite(x, y).play({ key: 'run', frameRate: 24 });
    * ```
    * 
    * When playing an animation on a Sprite it will first check to see if it can find a matching key
    * locally within the Sprite. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * 
    * If you need a Sprite to be able to play both local and global animations, make sure they don't
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
    * When playing an animation on a Sprite it will first check to see if it can find a matching key
    * locally within the Sprite. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * 
    * Prior to Phaser 3.50 this method was called 'delayedPlay'.
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
    * When playing an animation on a Sprite it will first check to see if it can find a matching key
    * locally within the Sprite. If it can, it will play the local animation. If not, it will then
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
    * Start playing the given animation on this Sprite, in reverse.
    * 
    * Animations in Phaser can either belong to the global Animation Manager, or specifically to this Sprite.
    * 
    * The benefit of a global animation is that multiple Sprites can all play the same animation, without
    * having to duplicate the data. You can just create it once and then play it on any Sprite.
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
    * However, if you wish to create an animation that is unique to this Sprite, and this Sprite alone,
    * you can call the `Animation.create` method instead. It accepts the exact same parameters as when
    * creating a global animation, however the resulting data is kept locally in this Sprite.
    * 
    * With the animation created, either globally or locally, you can now play it on this Sprite:
    * 
    * ```javascript
    * this.add.sprite(x, y).playReverse('run');
    * ```
    * 
    * Alternatively, if you wish to run it at a different frame rate, for example, you can pass a config
    * object instead:
    * 
    * ```javascript
    * this.add.sprite(x, y).playReverse({ key: 'run', frameRate: 24 });
    * ```
    * 
    * When playing an animation on a Sprite it will first check to see if it can find a matching key
    * locally within the Sprite. If it can, it will play the local animation. If not, it will then
    * search the global Animation Manager and look for it there.
    * 
    * If you need a Sprite to be able to play both local and global animations, make sure they don't
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
    * Update this Sprite's animations.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
  
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
