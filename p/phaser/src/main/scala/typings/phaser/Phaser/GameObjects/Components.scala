package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Animations.AnimationFrame
import typings.phaser.Phaser.Animations.AnimationManager
import typings.phaser.Phaser.BlendModes
import typings.phaser.Phaser.Curves.Path
import typings.phaser.Phaser.Display.Masks.BitmapMask
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.Phaser.Textures.CanvasTexture
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.GameObjects.PathFollower.PathConfig
import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Components {
  
  /**
    * Provides methods used for setting the alpha properties of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait Alpha extends StObject {
    
    /**
      * The alpha value of the Game Object.
      * 
      * This is a global value, impacting the entire Game Object, not just a region of it.
      */
    var alpha: Double = js.native
    
    /**
      * The alpha value starting from the bottom-left of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var alphaBottomLeft: Double = js.native
    
    /**
      * The alpha value starting from the bottom-right of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var alphaBottomRight: Double = js.native
    
    /**
      * The alpha value starting from the top-left of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var alphaTopLeft: Double = js.native
    
    /**
      * The alpha value starting from the top-right of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var alphaTopRight: Double = js.native
    
    /**
      * Clears all alpha values associated with this Game Object.
      * 
      * Immediately sets the alpha levels back to 1 (fully opaque).
      */
    def clearAlpha(): this.type = js.native
    
    /**
      * Set the Alpha level of this Game Object. The alpha controls the opacity of the Game Object as it renders.
      * Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.
      * 
      * If your game is running under WebGL you can optionally specify four different alpha values, each of which
      * correspond to the four corners of the Game Object. Under Canvas only the `topLeft` value given is used.
      * @param topLeft The alpha value used for the top-left of the Game Object. If this is the only value given it's applied across the whole Game Object. Default 1.
      * @param topRight The alpha value used for the top-right of the Game Object. WebGL only.
      * @param bottomLeft The alpha value used for the bottom-left of the Game Object. WebGL only.
      * @param bottomRight The alpha value used for the bottom-right of the Game Object. WebGL only.
      */
    def setAlpha(): this.type = js.native
    def setAlpha(topLeft: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Double, bottomLeft: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Double, bottomLeft: Double, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Double, bottomLeft: Unit, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Unit, bottomLeft: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Unit, bottomLeft: Double, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Double, topRight: Unit, bottomLeft: Unit, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Double, bottomLeft: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Double, bottomLeft: Double, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Double, bottomLeft: Unit, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Unit, bottomLeft: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Unit, bottomLeft: Double, bottomRight: Double): this.type = js.native
    def setAlpha(topLeft: Unit, topRight: Unit, bottomLeft: Unit, bottomRight: Double): this.type = js.native
  }
  
  /**
    * Provides methods used for setting the alpha property of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait AlphaSingle extends StObject {
    
    /**
      * The alpha value of the Game Object.
      * 
      * This is a global value, impacting the entire Game Object, not just a region of it.
      */
    var alpha: Double = js.native
    
    /**
      * Clears all alpha values associated with this Game Object.
      * 
      * Immediately sets the alpha levels back to 1 (fully opaque).
      */
    def clearAlpha(): this.type = js.native
    
    /**
      * Set the Alpha level of this Game Object. The alpha controls the opacity of the Game Object as it renders.
      * Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.
      * @param value The alpha value applied across the whole Game Object. Default 1.
      */
    def setAlpha(): this.type = js.native
    def setAlpha(value: Double): this.type = js.native
  }
  
  @js.native
  trait Animation extends StObject {
    
    /**
      * Load an Animation and fires 'onStartEvent' event, extracted from 'play' method.
      * @param key The string-based key of the animation to play, as defined previously in the Animation Manager.
      * @param startFrame Optionally start the animation playing from this frame index. Default 0.
      */
    def _startAnimation(key: String): GameObject = js.native
    def _startAnimation(key: String, startFrame: integer): GameObject = js.native
    
    /**
      * Internal time overflow accumulator.
      */
    var accumulator: Double = js.native
    
    /**
      * A reference to the global Animation Manager.
      */
    var animationManager: AnimationManager = js.native
    
    /**
      * Sets an animation to be played immediately after the current one completes.
      * 
      * The current animation must enter a 'completed' state for this to happen, i.e. finish all of its repeats, delays, etc, or have the `stop` method called directly on it.
      * 
      * An animation set to repeat forever will never enter a completed state.
      * 
      * You can chain a new animation at any point, including before the current one starts playing, during it, or when it ends (via its `animationcomplete` callback).
      * Chained animations are specific to a Game Object, meaning different Game Objects can have different chained animations without impacting the global animation they're playing.
      * 
      * Call this method with no arguments to reset the chained animation.
      * @param key The string-based key of the animation to play next, as defined previously in the Animation Manager. Or an Animation instance.
      */
    def chain(): GameObject = js.native
    def chain(key: String): GameObject = js.native
    def chain(key: typings.phaser.Phaser.Animations.Animation): GameObject = js.native
    
    /**
      * The current Animation loaded into this Animation Controller.
      */
    var currentAnim: typings.phaser.Phaser.Animations.Animation = js.native
    
    /**
      * The current AnimationFrame being displayed by this Animation Controller.
      */
    var currentFrame: AnimationFrame = js.native
    
    /**
      * Waits for the specified delay, in milliseconds, then starts playback of the requested animation.
      * @param delay The delay, in milliseconds, to wait before starting the animation playing.
      * @param key The key of the animation to play.
      * @param startFrame The frame of the animation to start from. Default 0.
      */
    def delayedPlay(delay: integer, key: String): GameObject = js.native
    def delayedPlay(delay: integer, key: String, startFrame: integer): GameObject = js.native
    
    /**
      * Destroy this Animation component.
      * 
      * Unregisters event listeners and cleans up its references.
      */
    def destroy(): Unit = js.native
    
    /**
      * How long the animation should play for, in milliseconds.
      * If the `frameRate` property has been set then it overrides this value,
      * otherwise the `frameRate` is derived from `duration`.
      */
    var duration: Double = js.native
    
    /**
      * Will the playhead move forwards (`true`) or in reverse (`false`).
      */
    var forward: Boolean = js.native
    
    /**
      * The frame rate of playback in frames per second.
      * The default is 24 if the `duration` property is `null`.
      */
    var frameRate: Double = js.native
    
    /**
      * Returns the key of the animation currently loaded into this component.
      */
    def getCurrentKey(): String = js.native
    
    /**
      * Gets the amount of time, in milliseconds that the animation will be delayed before starting playback.
      */
    def getDelay(): integer = js.native
    
    /**
      * Returns a value between 0 and 1 indicating how far this animation is through, ignoring repeats and yoyos.
      * If the animation has a non-zero repeat defined, `getProgress` and `getTotalProgress` will be different
      * because `getProgress` doesn't include any repeats or repeat delays, whereas `getTotalProgress` does.
      */
    def getProgress(): Double = js.native
    
    /**
      * Gets the number of times that the animation will repeat
      * after its first iteration. For example, if returns 1, the animation will
      * play a total of twice (the initial play plus 1 repeat).
      * A value of -1 means the animation will repeat indefinitely.
      */
    def getRepeat(): integer = js.native
    
    /**
      * Gets the amount of delay between repeats, if any.
      */
    def getRepeatDelay(): Double = js.native
    
    /**
      * Gets the Time Scale factor.
      */
    def getTimeScale(): Double = js.native
    
    /**
      * Returns the total number of frames in this animation.
      */
    def getTotalFrames(): integer = js.native
    
    /**
      * Gets if the current Animation will yoyo when it reaches the end.
      * A yoyo'ing animation will play through consecutively, and then reverse-play back to the start again.
      */
    def getYoyo(): Boolean = js.native
    
    /**
      * `true` if the current animation is paused, otherwise `false`.
      */
    val isPaused: Boolean = js.native
    
    /**
      * Is an animation currently playing or not?
      */
    var isPlaying: Boolean = js.native
    
    /**
      * Internal method used to load an animation into this component.
      * @param key The key of the animation to load.
      * @param startFrame The start frame of the animation to load. Default 0.
      */
    def load(key: String): GameObject = js.native
    def load(key: String, startFrame: integer): GameObject = js.native
    
    /**
      * ms per frame, not including frame specific modifiers that may be present in the Animation data.
      */
    var msPerFrame: Double = js.native
    
    /**
      * The key of the next Animation to be loaded into this Animation Controller when the current animation completes.
      */
    var nextAnim: String = js.native
    
    /**
      * A queue of keys of the next Animations to be loaded into this Animation Controller when the current animation completes.
      */
    var nextAnimsQueue: js.Array[String] = js.native
    
    /**
      * Advances the animation to the next frame, regardless of the time or animation state.
      * If the animation is set to repeat, or yoyo, this will still take effect.
      * 
      * Calling this does not change the direction of the animation. I.e. if it was currently
      * playing in reverse, calling this method doesn't then change the direction to forwards.
      */
    def nextFrame(): GameObject = js.native
    
    /**
      * The time point at which the next animation frame will change.
      */
    var nextTick: Double = js.native
    
    /**
      * The Game Object to which this animation controller belongs.
      */
    var parent: GameObject = js.native
    
    /**
      * Pause the current animation and set the `isPlaying` property to `false`.
      * You can optionally pause it at a specific frame.
      * @param atFrame An optional frame to set after pausing the animation.
      */
    def pause(): GameObject = js.native
    def pause(atFrame: AnimationFrame): GameObject = js.native
    
    /**
      * An internal flag keeping track of pending repeats.
      */
    var pendingRepeat: Boolean = js.native
    
    /**
      * Plays an Animation on a Game Object that has the Animation component, such as a Sprite.
      * 
      * Animations are stored in the global Animation Manager and are referenced by a unique string-based key.
      * @param key The string-based key of the animation to play, as defined previously in the Animation Manager. Or an Animation instance.
      * @param ignoreIfPlaying If this animation is already playing then ignore this call. Default false.
      * @param startFrame Optionally start the animation playing from this frame index. Default 0.
      */
    def play(key: String): GameObject = js.native
    def play(key: String, ignoreIfPlaying: Boolean): GameObject = js.native
    def play(key: String, ignoreIfPlaying: Boolean, startFrame: integer): GameObject = js.native
    def play(key: String, ignoreIfPlaying: Unit, startFrame: integer): GameObject = js.native
    def play(key: typings.phaser.Phaser.Animations.Animation): GameObject = js.native
    def play(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Boolean): GameObject = js.native
    def play(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Boolean, startFrame: integer): GameObject = js.native
    def play(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Unit, startFrame: integer): GameObject = js.native
    
    /**
      * Plays an Animation (in reverse mode) on the Game Object that owns this Animation Component.
      * @param key The string-based key of the animation to play, as defined previously in the Animation Manager. Or an Animation instance.
      * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
      * @param startFrame Optionally start the animation playing from this frame index. Default 0.
      */
    def playReverse(key: String): GameObject = js.native
    def playReverse(key: String, ignoreIfPlaying: Boolean): GameObject = js.native
    def playReverse(key: String, ignoreIfPlaying: Boolean, startFrame: integer): GameObject = js.native
    def playReverse(key: String, ignoreIfPlaying: Unit, startFrame: integer): GameObject = js.native
    def playReverse(key: typings.phaser.Phaser.Animations.Animation): GameObject = js.native
    def playReverse(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Boolean): GameObject = js.native
    def playReverse(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Boolean, startFrame: integer): GameObject = js.native
    def playReverse(key: typings.phaser.Phaser.Animations.Animation, ignoreIfPlaying: Unit, startFrame: integer): GameObject = js.native
    
    /**
      * Advances the animation to the previous frame, regardless of the time or animation state.
      * If the animation is set to repeat, or yoyo, this will still take effect.
      * 
      * Calling this does not change the direction of the animation. I.e. if it was currently
      * playing in forwards, calling this method doesn't then change the direction to backwards.
      */
    def previousFrame(): GameObject = js.native
    
    /**
      * Handle the removal of an animation from the Animation Manager.
      * @param key The key of the removed Animation.
      * @param animation The removed Animation.
      */
    def remove(): Unit = js.native
    def remove(key: String): Unit = js.native
    def remove(key: String, animation: typings.phaser.Phaser.Animations.Animation): Unit = js.native
    def remove(key: Unit, animation: typings.phaser.Phaser.Animations.Animation): Unit = js.native
    
    /**
      * An internal counter keeping track of how many repeats are left to play.
      */
    var repeatCounter: Double = js.native
    
    /**
      * Restarts the current animation from its beginning, optionally including its delay value.
      * @param includeDelay Whether to include the delay value of the animation when restarting. Default false.
      */
    def restart(): GameObject = js.native
    def restart(includeDelay: Boolean): GameObject = js.native
    
    /**
      * Resumes playback of a paused animation and sets the `isPlaying` property to `true`.
      * You can optionally tell it to start playback from a specific frame.
      * @param fromFrame An optional frame to set before restarting playback.
      */
    def resume(): GameObject = js.native
    def resume(fromFrame: AnimationFrame): GameObject = js.native
    
    /**
      * Reverse the Animation that is already playing on the Game Object.
      */
    def reverse(): GameObject = js.native
    
    /**
      * Sets the given Animation Frame as being the current frame
      * and applies it to the parent Game Object, adjusting its size and origin as needed.
      * @param animationFrame The Animation Frame to set as being current.
      */
    def setCurrentFrame(animationFrame: AnimationFrame): GameObject = js.native
    
    /**
      * Sets the amount of time, in milliseconds, that the animation will be delayed before starting playback.
      * @param value The amount of time, in milliseconds, to wait before starting playback. Default 0.
      */
    def setDelay(): GameObject = js.native
    def setDelay(value: integer): GameObject = js.native
    
    /**
      * Takes a value between 0 and 1 and uses it to set how far this animation is through playback.
      * Does not factor in repeats or yoyos, but does handle playing forwards or backwards.
      * @param value The progress value, between 0 and 1. Default 0.
      */
    def setProgress(): GameObject = js.native
    def setProgress(value: Double): GameObject = js.native
    
    /**
      * Sets the number of times that the animation should repeat
      * after its first iteration. For example, if repeat is 1, the animation will
      * play a total of twice (the initial play plus 1 repeat).
      * To repeat indefinitely, use -1. repeat should always be an integer.
      * @param value The number of times that the animation should repeat.
      */
    def setRepeat(value: integer): GameObject = js.native
    
    /**
      * Sets the amount of time in seconds between repeats.
      * For example, if `repeat` is 2 and `repeatDelay` is 10, the animation will play initially,
      * then wait for 10 seconds before repeating, then play again, then wait another 10 seconds
      * before doing its final repeat.
      * @param value The delay to wait between repeats, in seconds.
      */
    def setRepeatDelay(value: Double): GameObject = js.native
    
    /**
      * Sets the Time Scale factor, allowing you to make the animation go go faster or slower than default.
      * Where 1 = normal speed (the default), 0.5 = half speed, 2 = double speed, etc.
      * @param value The time scale factor, where 1 is no change, 0.5 is half speed, etc. Default 1.
      */
    def setTimeScale(): GameObject = js.native
    def setTimeScale(value: Double): GameObject = js.native
    
    /**
      * Sets if the current Animation will yoyo when it reaches the end.
      * A yoyo'ing animation will play through consecutively, and then reverse-play back to the start again.
      * @param value `true` if the animation should yoyo, `false` to not. Default false.
      */
    def setYoyo(): GameObject = js.native
    def setYoyo(value: Boolean): GameObject = js.native
    
    /**
      * Skip frames if the time lags, or always advanced anyway?
      */
    var skipMissedFrames: Boolean = js.native
    
    /**
      * Immediately stops the current animation from playing and dispatches the `animationcomplete` event.
      * 
      * If no animation is set, no event will be dispatched.
      * 
      * If there is another animation queued (via the `chain` method) then it will start playing immediately.
      */
    def stop(): GameObject = js.native
    
    /**
      * Stops the current animation from playing after the specified time delay, given in milliseconds.
      * @param delay The number of milliseconds to wait before stopping this animation.
      */
    def stopAfterDelay(delay: integer): GameObject = js.native
    
    /**
      * Stops the current animation from playing when it next sets the given frame.
      * If this frame doesn't exist within the animation it will not stop it from playing.
      * @param frame The frame to check before stopping this animation.
      */
    def stopOnFrame(frame: AnimationFrame): GameObject = js.native
    
    /**
      * Stops the current animation from playing when it next repeats.
      */
    def stopOnRepeat(): GameObject = js.native
    
    /**
      * The internal update loop for the Animation Component.
      * @param time The current timestamp.
      * @param delta The delta time, in ms, elapsed since the last frame.
      */
    def update(time: Double, delta: Double): Unit = js.native
  }
  
  /**
    * Provides methods used for setting the blend mode of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait BlendMode extends StObject {
    
    /**
      * Sets the Blend Mode being used by this Game Object.
      * 
      * This can be a const, such as `Phaser.BlendModes.SCREEN`, or an integer, such as 4 (for Overlay)
      * 
      * Under WebGL only the following Blend Modes are available:
      * 
      * * ADD
      * * MULTIPLY
      * * SCREEN
      * * ERASE
      * 
      * Canvas has more available depending on browser support.
      * 
      * You can also create your own custom Blend Modes in WebGL.
      * 
      * Blend modes have different effects under Canvas and WebGL, and from browser to browser, depending
      * on support. Blend Modes also cause a WebGL batch flush should it encounter a new blend mode. For these
      * reasons try to be careful about the construction of your Scene and the frequency of which blend modes
      * are used.
      */
    var blendMode: BlendModes | String = js.native
    
    /**
      * Sets the Blend Mode being used by this Game Object.
      * 
      * This can be a const, such as `Phaser.BlendModes.SCREEN`, or an integer, such as 4 (for Overlay)
      * 
      * Under WebGL only the following Blend Modes are available:
      * 
      * * ADD
      * * MULTIPLY
      * * SCREEN
      * * ERASE (only works when rendering to a framebuffer, like a Render Texture)
      * 
      * Canvas has more available depending on browser support.
      * 
      * You can also create your own custom Blend Modes in WebGL.
      * 
      * Blend modes have different effects under Canvas and WebGL, and from browser to browser, depending
      * on support. Blend Modes also cause a WebGL batch flush should it encounter a new blend mode. For these
      * reasons try to be careful about the construction of your Scene and the frequency in which blend modes
      * are used.
      * @param value The BlendMode value. Either a string or a CONST.
      */
    def setBlendMode(value: String): this.type = js.native
    def setBlendMode(value: BlendModes): this.type = js.native
  }
  
  /**
    * Provides methods used for calculating and setting the size of a non-Frame based Game Object.
    * Should be applied as a mixin and not used directly.
    */
  trait ComputedSize extends StObject {
    
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
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    var width: Double
  }
  object ComputedSize {
    
    inline def apply(
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
    
    extension [Self <: ComputedSize](x: Self) {
      
      inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
      
      inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSetDisplaySize(value: (Double, Double) => ComputedSize): Self = StObject.set(x, "setDisplaySize", js.Any.fromFunction2(value))
      
      inline def setSetSize(value: (Double, Double) => ComputedSize): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides methods used for getting and setting the texture of a Game Object.
    */
  @js.native
  trait Crop extends StObject {
    
    /**
      * The Texture Frame this Game Object is using to render with.
      */
    var frame: Frame = js.native
    
    /**
      * A boolean flag indicating if this Game Object is being cropped or not.
      * You can toggle this at any time after `setCrop` has been called, to turn cropping on or off.
      * Equally, calling `setCrop` with no arguments will reset the crop and disable it.
      */
    var isCropped: Boolean = js.native
    
    /**
      * Applies a crop to a texture based Game Object, such as a Sprite or Image.
      * 
      * The crop is a rectangle that limits the area of the texture frame that is visible during rendering.
      * 
      * Cropping a Game Object does not change its size, dimensions, physics body or hit area, it just
      * changes what is shown when rendered.
      * 
      * The crop coordinates are relative to the texture frame, not the Game Object, meaning 0 x 0 is the top-left.
      * 
      * Therefore, if you had a Game Object that had an 800x600 sized texture, and you wanted to show only the left
      * half of it, you could call `setCrop(0, 0, 400, 600)`.
      * 
      * It is also scaled to match the Game Object scale automatically. Therefore a crop rect of 100x50 would crop
      * an area of 200x100 when applied to a Game Object that had a scale factor of 2.
      * 
      * You can either pass in numeric values directly, or you can provide a single Rectangle object as the first argument.
      * 
      * Call this method with no arguments at all to reset the crop, or toggle the property `isCropped` to `false`.
      * 
      * You should do this if the crop rectangle becomes the same size as the frame itself, as it will allow
      * the renderer to skip several internal calculations.
      * @param x The x coordinate to start the crop from. Or a Phaser.Geom.Rectangle object, in which case the rest of the arguments are ignored.
      * @param y The y coordinate to start the crop from.
      * @param width The width of the crop rectangle in pixels.
      * @param height The height of the crop rectangle in pixels.
      */
    def setCrop(): this.type = js.native
    def setCrop(x: Double): this.type = js.native
    def setCrop(x: Double, y: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * The Texture this Game Object is using to render with.
      */
    var texture: typings.phaser.Phaser.Textures.Texture | CanvasTexture = js.native
  }
  
  /**
    * Provides methods used for setting the depth of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  trait Depth extends StObject {
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    var depth: Double
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    def setDepth(value: integer): this.type
  }
  object Depth {
    
    inline def apply(depth: Double, setDepth: integer => Depth): Depth = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], setDepth = js.Any.fromFunction1(setDepth))
      __obj.asInstanceOf[Depth]
    }
    
    extension [Self <: Depth](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setSetDepth(value: integer => Depth): Self = StObject.set(x, "setDepth", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Provides methods used for visually flipping a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  trait Flip extends StObject {
    
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
    
    inline def apply(
      flipX: Boolean,
      flipY: Boolean,
      resetFlip: () => Flip,
      setFlip: (Boolean, Boolean) => Flip,
      setFlipX: Boolean => Flip,
      setFlipY: Boolean => Flip,
      toggleFlipX: () => Flip,
      toggleFlipY: () => Flip
    ): Flip = {
      val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], resetFlip = js.Any.fromFunction0(resetFlip), setFlip = js.Any.fromFunction2(setFlip), setFlipX = js.Any.fromFunction1(setFlipX), setFlipY = js.Any.fromFunction1(setFlipY), toggleFlipX = js.Any.fromFunction0(toggleFlipX), toggleFlipY = js.Any.fromFunction0(toggleFlipY))
      __obj.asInstanceOf[Flip]
    }
    
    extension [Self <: Flip](x: Self) {
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setResetFlip(value: () => Flip): Self = StObject.set(x, "resetFlip", js.Any.fromFunction0(value))
      
      inline def setSetFlip(value: (Boolean, Boolean) => Flip): Self = StObject.set(x, "setFlip", js.Any.fromFunction2(value))
      
      inline def setSetFlipX(value: Boolean => Flip): Self = StObject.set(x, "setFlipX", js.Any.fromFunction1(value))
      
      inline def setSetFlipY(value: Boolean => Flip): Self = StObject.set(x, "setFlipY", js.Any.fromFunction1(value))
      
      inline def setToggleFlipX(value: () => Flip): Self = StObject.set(x, "toggleFlipX", js.Any.fromFunction0(value))
      
      inline def setToggleFlipY(value: () => Flip): Self = StObject.set(x, "toggleFlipY", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Provides methods used for obtaining the bounds of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait GetBounds extends StObject {
    
    /**
      * Gets the bottom-center coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getBottomCenter[O /* <: Vector2 */](): O = js.native
    def getBottomCenter[O /* <: Vector2 */](output: O): O = js.native
    def getBottomCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getBottomCenter[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the bottom-left corner coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getBottomLeft[O /* <: Vector2 */](): O = js.native
    def getBottomLeft[O /* <: Vector2 */](output: O): O = js.native
    def getBottomLeft[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getBottomLeft[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the bottom-right corner coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getBottomRight[O /* <: Vector2 */](): O = js.native
    def getBottomRight[O /* <: Vector2 */](output: O): O = js.native
    def getBottomRight[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getBottomRight[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the bounds of this Game Object, regardless of origin.
      * The values are stored and returned in a Rectangle, or Rectangle-like, object.
      * @param output An object to store the values in. If not provided a new Rectangle will be created.
      */
    def getBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](): O = js.native
    def getBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](output: O): O = js.native
    
    /**
      * Gets the center coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      */
    def getCenter[O /* <: Vector2 */](): O = js.native
    def getCenter[O /* <: Vector2 */](output: O): O = js.native
    
    /**
      * Gets the left-center coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getLeftCenter[O /* <: Vector2 */](): O = js.native
    def getLeftCenter[O /* <: Vector2 */](output: O): O = js.native
    def getLeftCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getLeftCenter[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the right-center coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getRightCenter[O /* <: Vector2 */](): O = js.native
    def getRightCenter[O /* <: Vector2 */](output: O): O = js.native
    def getRightCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getRightCenter[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the top-center coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getTopCenter[O /* <: Vector2 */](): O = js.native
    def getTopCenter[O /* <: Vector2 */](output: O): O = js.native
    def getTopCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getTopCenter[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the top-left corner coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getTopLeft[O /* <: Vector2 */](): O = js.native
    def getTopLeft[O /* <: Vector2 */](output: O): O = js.native
    def getTopLeft[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getTopLeft[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
    
    /**
      * Gets the top-right corner coordinate of this Game Object, regardless of origin.
      * The returned point is calculated in local space and does not factor in any parent containers
      * @param output An object to store the values in. If not provided a new Vector2 will be created.
      * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
      */
    def getTopRight[O /* <: Vector2 */](): O = js.native
    def getTopRight[O /* <: Vector2 */](output: O): O = js.native
    def getTopRight[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
    def getTopRight[O /* <: Vector2 */](output: Unit, includeParent: Boolean): O = js.native
  }
  
  /**
    * Provides methods used for getting and setting the mask of a Game Object.
    */
  @js.native
  trait Mask extends StObject {
    
    /**
      * Clears the mask that this Game Object was using.
      * @param destroyMask Destroy the mask before clearing it? Default false.
      */
    def clearMask(): this.type = js.native
    def clearMask(destroyMask: Boolean): this.type = js.native
    
    /**
      * Creates and returns a Bitmap Mask. This mask can be used by any Game Object,
      * including this one.
      * 
      * To create the mask you need to pass in a reference to a renderable Game Object.
      * A renderable Game Object is one that uses a texture to render with, such as an
      * Image, Sprite, Render Texture or BitmapText.
      * 
      * If you do not provide a renderable object, and this Game Object has a texture,
      * it will use itself as the object. This means you can call this method to create
      * a Bitmap Mask from any renderable Game Object.
      * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
      */
    def createBitmapMask(): BitmapMask = js.native
    def createBitmapMask(renderable: GameObject): BitmapMask = js.native
    
    /**
      * Creates and returns a Geometry Mask. This mask can be used by any Game Object,
      * including this one.
      * 
      * To create the mask you need to pass in a reference to a Graphics Game Object.
      * 
      * If you do not provide a graphics object, and this Game Object is an instance
      * of a Graphics object, then it will use itself to create the mask.
      * 
      * This means you can call this method to create a Geometry Mask from any Graphics Game Object.
      * @param graphics A Graphics Game Object. The geometry within it will be used as the mask.
      */
    def createGeometryMask(): GeometryMask = js.native
    def createGeometryMask(graphics: Graphics): GeometryMask = js.native
    
    /**
      * The Mask this Game Object is using during render.
      */
    var mask: BitmapMask | GeometryMask = js.native
    
    /**
      * Sets the mask that this Game Object will use to render with.
      * 
      * The mask must have been previously created and can be either a GeometryMask or a BitmapMask.
      * Note: Bitmap Masks only work on WebGL. Geometry Masks work on both WebGL and Canvas.
      * 
      * If a mask is already set on this Game Object it will be immediately replaced.
      * 
      * Masks are positioned in global space and are not relative to the Game Object to which they
      * are applied. The reason for this is that multiple Game Objects can all share the same mask.
      * 
      * Masks have no impact on physics or input detection. They are purely a rendering component
      * that allows you to limit what is visible during the render pass.
      * @param mask The mask this Game Object will use when rendering.
      */
    def setMask(mask: BitmapMask): this.type = js.native
    def setMask(mask: GeometryMask): this.type = js.native
  }
  
  /**
    * Provides methods used for getting and setting the origin of a Game Object.
    * Values are normalized, given in the range 0 to 1.
    * Display values contain the calculated pixel values.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait Origin extends StObject {
    
    /**
      * The horizontal display origin of this Game Object.
      * The origin is a normalized value between 0 and 1.
      * The displayOrigin is a pixel value, based on the size of the Game Object combined with the origin.
      */
    var displayOriginX: Double = js.native
    
    /**
      * The vertical display origin of this Game Object.
      * The origin is a normalized value between 0 and 1.
      * The displayOrigin is a pixel value, based on the size of the Game Object combined with the origin.
      */
    var displayOriginY: Double = js.native
    
    /**
      * The horizontal origin of this Game Object.
      * The origin maps the relationship between the size and position of the Game Object.
      * The default value is 0.5, meaning all Game Objects are positioned based on their center.
      * Setting the value to 0 means the position now relates to the left of the Game Object.
      */
    var originX: Double = js.native
    
    /**
      * The vertical origin of this Game Object.
      * The origin maps the relationship between the size and position of the Game Object.
      * The default value is 0.5, meaning all Game Objects are positioned based on their center.
      * Setting the value to 0 means the position now relates to the top of the Game Object.
      */
    var originY: Double = js.native
    
    /**
      * Sets the display origin of this Game Object.
      * The difference between this and setting the origin is that you can use pixel values for setting the display origin.
      * @param x The horizontal display origin value. Default 0.
      * @param y The vertical display origin value. If not defined it will be set to the value of `x`. Default x.
      */
    def setDisplayOrigin(): this.type = js.native
    def setDisplayOrigin(x: Double): this.type = js.native
    def setDisplayOrigin(x: Double, y: Double): this.type = js.native
    def setDisplayOrigin(x: Unit, y: Double): this.type = js.native
    
    /**
      * Sets the origin of this Game Object.
      * 
      * The values are given in the range 0 to 1.
      * @param x The horizontal origin value. Default 0.5.
      * @param y The vertical origin value. If not defined it will be set to the value of `x`. Default x.
      */
    def setOrigin(): this.type = js.native
    def setOrigin(x: Double): this.type = js.native
    def setOrigin(x: Double, y: Double): this.type = js.native
    def setOrigin(x: Unit, y: Double): this.type = js.native
    
    /**
      * Sets the origin of this Game Object based on the Pivot values in its Frame.
      */
    def setOriginFromFrame(): this.type = js.native
    
    /**
      * Updates the Display Origin cached values internally stored on this Game Object.
      * You don't usually call this directly, but it is exposed for edge-cases where you may.
      */
    def updateDisplayOrigin(): this.type = js.native
  }
  
  /**
    * Provides methods used for managing a Game Object following a Path.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait PathFollower extends StObject {
    
    /**
      * Is this PathFollower actively following a Path or not?
      * 
      * To be considered as `isFollowing` it must be currently moving on a Path, and not paused.
      */
    def isFollowing(): Boolean = js.native
    
    /**
      * The Path this PathFollower is following. It can only follow one Path at a time.
      */
    var path: Path = js.native
    
    /**
      * Internal update handler that advances this PathFollower along the path.
      * 
      * Called automatically by the Scene step, should not typically be called directly.
      */
    def pathUpdate(): Unit = js.native
    
    /**
      * Pauses this PathFollower. It will still continue to render, but it will remain motionless at the
      * point on the Path at which you paused it.
      */
    def pauseFollow(): this.type = js.native
    
    /**
      * Resumes a previously paused PathFollower.
      * 
      * If the PathFollower was not paused this has no effect.
      */
    def resumeFollow(): this.type = js.native
    
    /**
      * Should the PathFollower automatically rotate to point in the direction of the Path?
      */
    var rotateToPath: Boolean = js.native
    
    /**
      * Set the Path that this PathFollower should follow.
      * 
      * Optionally accepts {@link Phaser.Types.GameObjects.PathFollower.PathConfig} settings.
      * @param path The Path this PathFollower is following. It can only follow one Path at a time.
      * @param config Settings for the PathFollower.
      */
    def setPath(path: Path): this.type = js.native
    def setPath(path: Path, config: Double): this.type = js.native
    def setPath(path: Path, config: PathConfig): this.type = js.native
    def setPath(path: Path, config: NumberTweenBuilderConfig): this.type = js.native
    
    /**
      * Set whether the PathFollower should automatically rotate to point in the direction of the Path.
      * @param value Whether the PathFollower should automatically rotate to point in the direction of the Path.
      * @param offset Rotation offset in degrees. Default 0.
      */
    def setRotateToPath(value: Boolean): this.type = js.native
    def setRotateToPath(value: Boolean, offset: Double): this.type = js.native
    
    /**
      * Starts this PathFollower following its given Path.
      * @param config The duration of the follow, or a PathFollower config object. Default {}.
      * @param startAt Optional start position of the follow, between 0 and 1. Default 0.
      */
    def startFollow(): this.type = js.native
    def startFollow(config: Double): this.type = js.native
    def startFollow(config: Double, startAt: Double): this.type = js.native
    def startFollow(config: Unit, startAt: Double): this.type = js.native
    def startFollow(config: PathConfig): this.type = js.native
    def startFollow(config: PathConfig, startAt: Double): this.type = js.native
    def startFollow(config: NumberTweenBuilderConfig): this.type = js.native
    def startFollow(config: NumberTweenBuilderConfig, startAt: Double): this.type = js.native
    
    /**
      * Stops this PathFollower from following the path any longer.
      * 
      * This will invoke any 'stop' conditions that may exist on the Path, or for the follower.
      */
    def stopFollow(): this.type = js.native
  }
  
  /**
    * Provides methods used for setting the WebGL rendering pipeline of a Game Object.
    */
  @js.native
  trait Pipeline extends StObject {
    
    /**
      * The initial WebGL pipeline of this Game Object.
      */
    var defaultPipeline: WebGLPipeline = js.native
    
    /**
      * Gets the name of the WebGL Pipeline this Game Object is currently using.
      */
    def getPipelineName(): String = js.native
    
    /**
      * Sets the initial WebGL Pipeline of this Game Object.
      * This should only be called during the instantiation of the Game Object.
      * @param pipelineName The name of the pipeline to set on this Game Object. Defaults to the Texture Tint Pipeline. Default TextureTintPipeline.
      */
    def initPipeline(): Boolean = js.native
    def initPipeline(pipelineName: String): Boolean = js.native
    
    /**
      * The current WebGL pipeline of this Game Object.
      */
    var pipeline: WebGLPipeline = js.native
    
    /**
      * Resets the WebGL Pipeline of this Game Object back to the default it was created with.
      */
    def resetPipeline(): Boolean = js.native
    
    /**
      * Sets the active WebGL Pipeline of this Game Object.
      * @param pipelineName The name of the pipeline to set on this Game Object.
      */
    def setPipeline(pipelineName: String): this.type = js.native
  }
  
  /**
    * Provides methods used for getting and setting the Scroll Factor of a Game Object.
    */
  @js.native
  trait ScrollFactor extends StObject {
    
    /**
      * The horizontal scroll factor of this Game Object.
      * 
      * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
      * 
      * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
      * It does not change the Game Objects actual position values.
      * 
      * A value of 1 means it will move exactly in sync with a camera.
      * A value of 0 means it will not move at all, even if the camera moves.
      * Other values control the degree to which the camera movement is mapped to this Game Object.
      * 
      * Please be aware that scroll factor values other than 1 are not taken in to consideration when
      * calculating physics collisions. Bodies always collide based on their world position, but changing
      * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
      * them from physics bodies if not accounted for in your code.
      */
    var scrollFactorX: Double = js.native
    
    /**
      * The vertical scroll factor of this Game Object.
      * 
      * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
      * 
      * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
      * It does not change the Game Objects actual position values.
      * 
      * A value of 1 means it will move exactly in sync with a camera.
      * A value of 0 means it will not move at all, even if the camera moves.
      * Other values control the degree to which the camera movement is mapped to this Game Object.
      * 
      * Please be aware that scroll factor values other than 1 are not taken in to consideration when
      * calculating physics collisions. Bodies always collide based on their world position, but changing
      * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
      * them from physics bodies if not accounted for in your code.
      */
    var scrollFactorY: Double = js.native
    
    /**
      * Sets the scroll factor of this Game Object.
      * 
      * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
      * 
      * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
      * It does not change the Game Objects actual position values.
      * 
      * A value of 1 means it will move exactly in sync with a camera.
      * A value of 0 means it will not move at all, even if the camera moves.
      * Other values control the degree to which the camera movement is mapped to this Game Object.
      * 
      * Please be aware that scroll factor values other than 1 are not taken in to consideration when
      * calculating physics collisions. Bodies always collide based on their world position, but changing
      * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
      * them from physics bodies if not accounted for in your code.
      * @param x The horizontal scroll factor of this Game Object.
      * @param y The vertical scroll factor of this Game Object. If not set it will use the `x` value. Default x.
      */
    def setScrollFactor(x: Double): this.type = js.native
    def setScrollFactor(x: Double, y: Double): this.type = js.native
  }
  
  /**
    * Provides methods used for getting and setting the size of a Game Object.
    */
  trait Size extends StObject {
    
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
    
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    var width: Double
  }
  object Size {
    
    inline def apply(
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
    
    extension [Self <: Size](x: Self) {
      
      inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
      
      inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSetDisplaySize(value: (Double, Double) => Size): Self = StObject.set(x, "setDisplaySize", js.Any.fromFunction2(value))
      
      inline def setSetSize(value: (Double, Double) => Size): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      inline def setSetSizeToFrame(value: Frame => Size): Self = StObject.set(x, "setSizeToFrame", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides methods used for getting and setting the texture of a Game Object.
    */
  @js.native
  trait Texture extends StObject {
    
    /**
      * The Texture Frame this Game Object is using to render with.
      */
    var frame: Frame = js.native
    
    /**
      * Sets the frame this Game Object will use to render with.
      * 
      * The Frame has to belong to the current Texture being used.
      * 
      * It can be either a string or an index.
      * 
      * Calling `setFrame` will modify the `width` and `height` properties of your Game Object.
      * It will also change the `origin` if the Frame has a custom pivot point, as exported from packages like Texture Packer.
      * @param frame The name or index of the frame within the Texture.
      * @param updateSize Should this call adjust the size of the Game Object? Default true.
      * @param updateOrigin Should this call adjust the origin of the Game Object? Default true.
      */
    def setFrame(frame: String): this.type = js.native
    def setFrame(frame: String, updateSize: Boolean): this.type = js.native
    def setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: String, updateSize: Unit, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: integer): this.type = js.native
    def setFrame(frame: integer, updateSize: Boolean): this.type = js.native
    def setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: integer, updateSize: Unit, updateOrigin: Boolean): this.type = js.native
    
    /**
      * Sets the texture and frame this Game Object will use to render with.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * @param key The key of the texture to be used, as stored in the Texture Manager, or a Texture instance.
      * @param frame The name or index of the frame within the Texture.
      */
    def setTexture(key: String): this.type = js.native
    def setTexture(key: String, frame: String): this.type = js.native
    def setTexture(key: String, frame: integer): this.type = js.native
    def setTexture(key: typings.phaser.Phaser.Textures.Texture): this.type = js.native
    def setTexture(key: typings.phaser.Phaser.Textures.Texture, frame: String): this.type = js.native
    def setTexture(key: typings.phaser.Phaser.Textures.Texture, frame: integer): this.type = js.native
    
    /**
      * The Texture this Game Object is using to render with.
      */
    var texture: typings.phaser.Phaser.Textures.Texture | CanvasTexture = js.native
  }
  
  /**
    * Provides methods used for getting and setting the texture of a Game Object.
    */
  @js.native
  trait TextureCrop extends StObject {
    
    /**
      * The Texture Frame this Game Object is using to render with.
      */
    var frame: Frame = js.native
    
    /**
      * A boolean flag indicating if this Game Object is being cropped or not.
      * You can toggle this at any time after `setCrop` has been called, to turn cropping on or off.
      * Equally, calling `setCrop` with no arguments will reset the crop and disable it.
      */
    var isCropped: Boolean = js.native
    
    /**
      * Applies a crop to a texture based Game Object, such as a Sprite or Image.
      * 
      * The crop is a rectangle that limits the area of the texture frame that is visible during rendering.
      * 
      * Cropping a Game Object does not change its size, dimensions, physics body or hit area, it just
      * changes what is shown when rendered.
      * 
      * The crop coordinates are relative to the texture frame, not the Game Object, meaning 0 x 0 is the top-left.
      * 
      * Therefore, if you had a Game Object that had an 800x600 sized texture, and you wanted to show only the left
      * half of it, you could call `setCrop(0, 0, 400, 600)`.
      * 
      * It is also scaled to match the Game Object scale automatically. Therefore a crop rect of 100x50 would crop
      * an area of 200x100 when applied to a Game Object that had a scale factor of 2.
      * 
      * You can either pass in numeric values directly, or you can provide a single Rectangle object as the first argument.
      * 
      * Call this method with no arguments at all to reset the crop, or toggle the property `isCropped` to `false`.
      * 
      * You should do this if the crop rectangle becomes the same size as the frame itself, as it will allow
      * the renderer to skip several internal calculations.
      * @param x The x coordinate to start the crop from. Or a Phaser.Geom.Rectangle object, in which case the rest of the arguments are ignored.
      * @param y The y coordinate to start the crop from.
      * @param width The width of the crop rectangle in pixels.
      * @param height The height of the crop rectangle in pixels.
      */
    def setCrop(): this.type = js.native
    def setCrop(x: Double): this.type = js.native
    def setCrop(x: Double, y: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: Double, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Double, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Double, width: Unit, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Double, height: Double): this.type = js.native
    def setCrop(x: typings.phaser.Phaser.Geom.Rectangle, y: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Sets the frame this Game Object will use to render with.
      * 
      * The Frame has to belong to the current Texture being used.
      * 
      * It can be either a string or an index.
      * 
      * Calling `setFrame` will modify the `width` and `height` properties of your Game Object.
      * It will also change the `origin` if the Frame has a custom pivot point, as exported from packages like Texture Packer.
      * @param frame The name or index of the frame within the Texture.
      * @param updateSize Should this call adjust the size of the Game Object? Default true.
      * @param updateOrigin Should this call adjust the origin of the Game Object? Default true.
      */
    def setFrame(frame: String): this.type = js.native
    def setFrame(frame: String, updateSize: Boolean): this.type = js.native
    def setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: String, updateSize: Unit, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: integer): this.type = js.native
    def setFrame(frame: integer, updateSize: Boolean): this.type = js.native
    def setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): this.type = js.native
    def setFrame(frame: integer, updateSize: Unit, updateOrigin: Boolean): this.type = js.native
    
    /**
      * Sets the texture and frame this Game Object will use to render with.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture.
      */
    def setTexture(key: String): this.type = js.native
    def setTexture(key: String, frame: String): this.type = js.native
    def setTexture(key: String, frame: integer): this.type = js.native
    
    /**
      * The Texture this Game Object is using to render with.
      */
    var texture: typings.phaser.Phaser.Textures.Texture | CanvasTexture = js.native
  }
  
  /**
    * Provides methods used for setting the tint of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  @js.native
  trait Tint extends StObject {
    
    /**
      * Clears all tint values associated with this Game Object.
      * 
      * Immediately sets the color values back to 0xffffff and the tint type to 'additive',
      * which results in no visible change to the texture.
      */
    def clearTint(): this.type = js.native
    
    /**
      * Does this Game Object have a tint applied to it or not?
      */
    val isTinted: Boolean = js.native
    
    /**
      * Sets an additive tint on this Game Object.
      * 
      * The tint works by taking the pixel color values from the Game Objects texture, and then
      * multiplying it by the color value of the tint. You can provide either one color value,
      * in which case the whole Game Object will be tinted in that color. Or you can provide a color
      * per corner. The colors are blended together across the extent of the Game Object.
      * 
      * To modify the tint color once set, either call this method again with new values or use the
      * `tint` property to set all colors at once. Or, use the properties `tintTopLeft`, `tintTopRight,
      * `tintBottomLeft` and `tintBottomRight` to set the corner color values independently.
      * 
      * To remove a tint call `clearTint`.
      * 
      * To swap this from being an additive tint to a fill based tint set the property `tintFill` to `true`.
      * @param topLeft The tint being applied to the top-left of the Game Object. If no other values are given this value is applied evenly, tinting the whole Game Object. Default 0xffffff.
      * @param topRight The tint being applied to the top-right of the Game Object.
      * @param bottomLeft The tint being applied to the bottom-left of the Game Object.
      * @param bottomRight The tint being applied to the bottom-right of the Game Object.
      */
    def setTint(): this.type = js.native
    def setTint(topLeft: Unit, topRight: Unit, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: Unit, bottomLeft: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: Unit, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: integer, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: integer, bottomLeft: integer): this.type = js.native
    def setTint(topLeft: Unit, topRight: integer, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTint(topLeft: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: Unit, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: Unit, bottomLeft: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: Unit, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: integer, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: integer, bottomLeft: integer): this.type = js.native
    def setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): this.type = js.native
    
    /**
      * Sets a fill-based tint on this Game Object.
      * 
      * Unlike an additive tint, a fill-tint literally replaces the pixel colors from the texture
      * with those in the tint. You can use this for effects such as making a player flash 'white'
      * if hit by something. You can provide either one color value, in which case the whole
      * Game Object will be rendered in that color. Or you can provide a color per corner. The colors
      * are blended together across the extent of the Game Object.
      * 
      * To modify the tint color once set, either call this method again with new values or use the
      * `tint` property to set all colors at once. Or, use the properties `tintTopLeft`, `tintTopRight,
      * `tintBottomLeft` and `tintBottomRight` to set the corner color values independently.
      * 
      * To remove a tint call `clearTint`.
      * 
      * To swap this from being a fill-tint to an additive tint set the property `tintFill` to `false`.
      * @param topLeft The tint being applied to the top-left of the Game Object. If not other values are given this value is applied evenly, tinting the whole Game Object. Default 0xffffff.
      * @param topRight The tint being applied to the top-right of the Game Object.
      * @param bottomLeft The tint being applied to the bottom-left of the Game Object.
      * @param bottomRight The tint being applied to the bottom-right of the Game Object.
      */
    def setTintFill(): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: Unit, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: Unit, bottomLeft: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: Unit, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: integer, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: integer, bottomLeft: integer): this.type = js.native
    def setTintFill(topLeft: Unit, topRight: integer, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: Unit, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: Unit, bottomLeft: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: Unit, bottomLeft: integer, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: integer, bottomLeft: Unit, bottomRight: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer): this.type = js.native
    def setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): this.type = js.native
    
    /**
      * The tint value being applied to the whole of the Game Object.
      * This property is a setter-only. Use the properties `tintTopLeft` etc to read the current tint value.
      */
    var tint: integer = js.native
    
    /**
      * The tint value being applied to the bottom-left of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var tintBottomLeft: integer = js.native
    
    /**
      * The tint value being applied to the bottom-right of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var tintBottomRight: integer = js.native
    
    /**
      * Fill or additive?
      */
    var tintFill: Boolean = js.native
    
    /**
      * The tint value being applied to the top-left of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var tintTopLeft: integer = js.native
    
    /**
      * The tint value being applied to the top-right of the Game Object.
      * This value is interpolated from the corner to the center of the Game Object.
      */
    var tintTopRight: integer = js.native
  }
  
  /**
    * Build a JSON representation of the given Game Object.
    * 
    * This is typically extended further by Game Object specific implementations.
    */
  trait ToJSON extends StObject
  
  /**
    * Provides methods used for getting and setting the position, scale and rotation of a Game Object.
    */
  @js.native
  trait Transform extends StObject {
    
    /**
      * The angle of this Game Object as expressed in degrees.
      * 
      * Phaser uses a right-hand clockwise rotation system, where 0 is right, 90 is down, 180/-180 is left
      * and -90 is up.
      * 
      * If you prefer to work in radians, see the `rotation` property instead.
      */
    var angle: integer = js.native
    
    /**
      * Gets the local transform matrix for this Game Object.
      * @param tempMatrix The matrix to populate with the values from this Game Object.
      */
    def getLocalTransformMatrix(): TransformMatrix = js.native
    def getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
    
    /**
      * Gets the sum total rotation of all of this Game Objects parent Containers.
      * 
      * The returned value is in radians and will be zero if this Game Object has no parent container.
      */
    def getParentRotation(): Double = js.native
    
    /**
      * Gets the world transform matrix for this Game Object, factoring in any parent Containers.
      * @param tempMatrix The matrix to populate with the values from this Game Object.
      * @param parentMatrix A temporary matrix to hold parent values during the calculations.
      */
    def getWorldTransformMatrix(): TransformMatrix = js.native
    def getWorldTransformMatrix(tempMatrix: Unit, parentMatrix: TransformMatrix): TransformMatrix = js.native
    def getWorldTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
    def getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix = js.native
    
    /**
      * The angle of this Game Object in radians.
      * 
      * Phaser uses a right-hand clockwise rotation system, where 0 is right, PI/2 is down, +-PI is left
      * and -PI/2 is up.
      * 
      * If you prefer to work in degrees, see the `angle` property instead.
      */
    var rotation: Double = js.native
    
    /**
      * This is a special setter that allows you to set both the horizontal and vertical scale of this Game Object
      * to the same value, at the same time. When reading this value the result returned is `(scaleX + scaleY) / 2`.
      * 
      * Use of this property implies you wish the horizontal and vertical scales to be equal to each other. If this
      * isn't the case, use the `scaleX` or `scaleY` properties instead.
      */
    var scale: Double = js.native
    
    /**
      * The horizontal scale of this Game Object.
      */
    var scaleX: Double = js.native
    
    /**
      * The vertical scale of this Game Object.
      */
    var scaleY: Double = js.native
    
    /**
      * Sets the angle of this Game Object.
      * @param degrees The rotation of this Game Object, in degrees. Default 0.
      */
    def setAngle(): this.type = js.native
    def setAngle(degrees: Double): this.type = js.native
    
    /**
      * Sets the position of this Game Object.
      * @param x The x position of this Game Object. Default 0.
      * @param y The y position of this Game Object. If not set it will use the `x` value. Default x.
      * @param z The z position of this Game Object. Default 0.
      * @param w The w position of this Game Object. Default 0.
      */
    def setPosition(): this.type = js.native
    def setPosition(x: Double): this.type = js.native
    def setPosition(x: Double, y: Double): this.type = js.native
    def setPosition(x: Double, y: Double, z: Double): this.type = js.native
    def setPosition(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    def setPosition(x: Double, y: Double, z: Unit, w: Double): this.type = js.native
    def setPosition(x: Double, y: Unit, z: Double): this.type = js.native
    def setPosition(x: Double, y: Unit, z: Double, w: Double): this.type = js.native
    def setPosition(x: Double, y: Unit, z: Unit, w: Double): this.type = js.native
    def setPosition(x: Unit, y: Double): this.type = js.native
    def setPosition(x: Unit, y: Double, z: Double): this.type = js.native
    def setPosition(x: Unit, y: Double, z: Double, w: Double): this.type = js.native
    def setPosition(x: Unit, y: Double, z: Unit, w: Double): this.type = js.native
    def setPosition(x: Unit, y: Unit, z: Double): this.type = js.native
    def setPosition(x: Unit, y: Unit, z: Double, w: Double): this.type = js.native
    def setPosition(x: Unit, y: Unit, z: Unit, w: Double): this.type = js.native
    
    /**
      * Sets the position of this Game Object to be a random position within the confines of
      * the given area.
      * 
      * If no area is specified a random position between 0 x 0 and the game width x height is used instead.
      * 
      * The position does not factor in the size of this Game Object, meaning that only the origin is
      * guaranteed to be within the area.
      * @param x The x position of the top-left of the random area. Default 0.
      * @param y The y position of the top-left of the random area. Default 0.
      * @param width The width of the random area.
      * @param height The height of the random area.
      */
    def setRandomPosition(): this.type = js.native
    def setRandomPosition(x: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Double, width: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Double, width: Unit, height: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Unit, width: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Unit, width: Double, height: Double): this.type = js.native
    def setRandomPosition(x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Double, width: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Double, width: Double, height: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Unit, width: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
    def setRandomPosition(x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Sets the rotation of this Game Object.
      * @param radians The rotation of this Game Object, in radians. Default 0.
      */
    def setRotation(): this.type = js.native
    def setRotation(radians: Double): this.type = js.native
    
    /**
      * Sets the scale of this Game Object.
      * @param x The horizontal scale of this Game Object.
      * @param y The vertical scale of this Game Object. If not set it will use the `x` value. Default x.
      */
    def setScale(x: Double): this.type = js.native
    def setScale(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the w position of this Game Object.
      * @param value The w position of this Game Object. Default 0.
      */
    def setW(): this.type = js.native
    def setW(value: Double): this.type = js.native
    
    /**
      * Sets the x position of this Game Object.
      * @param value The x position of this Game Object. Default 0.
      */
    def setX(): this.type = js.native
    def setX(value: Double): this.type = js.native
    
    /**
      * Sets the y position of this Game Object.
      * @param value The y position of this Game Object. Default 0.
      */
    def setY(): this.type = js.native
    def setY(value: Double): this.type = js.native
    
    /**
      * Sets the z position of this Game Object.
      * 
      * Note: The z position does not control the rendering order of 2D Game Objects. Use
      * {@link Phaser.GameObjects.Components.Depth#setDepth} instead.
      * @param value The z position of this Game Object. Default 0.
      */
    def setZ(): this.type = js.native
    def setZ(value: Double): this.type = js.native
    
    /**
      * The w position of this Game Object.
      */
    var w: Double = js.native
    
    /**
      * The x position of this Game Object.
      */
    var x: Double = js.native
    
    /**
      * The y position of this Game Object.
      */
    var y: Double = js.native
    
    /**
      * The z position of this Game Object.
      * 
      * Note: The z position does not control the rendering order of 2D Game Objects. Use
      * {@link Phaser.GameObjects.Components.Depth#depth} instead.
      */
    var z: Double = js.native
  }
  
  /**
    * A Matrix used for display transformations for rendering.
    * 
    * It is represented like so:
    * 
    * ```
    * | a | c | tx |
    * | b | d | ty |
    * | 0 | 0 | 1  |
    * ```
    */
  @js.native
  trait TransformMatrix extends StObject {
    
    /**
      * The Scale X value.
      */
    var a: Double = js.native
    
    /**
      * Apply the identity, translate, rotate and scale operations on the Matrix.
      * @param x The horizontal translation.
      * @param y The vertical translation.
      * @param rotation The angle of rotation in radians.
      * @param scaleX The horizontal scale.
      * @param scaleY The vertical scale.
      */
    def applyITRS(x: Double, y: Double, rotation: Double, scaleX: Double, scaleY: Double): this.type = js.native
    
    /**
      * Takes the `x` and `y` values and returns a new position in the `output` vector that is the inverse of
      * the current matrix with its transformation applied.
      * 
      * Can be used to translate points from world to local space.
      * @param x The x position to translate.
      * @param y The y position to translate.
      * @param output A Vector2, or point-like object, to store the results in.
      */
    def applyInverse(x: Double, y: Double): Vector2 = js.native
    def applyInverse(x: Double, y: Double, output: Vector2): Vector2 = js.native
    
    /**
      * The Skew Y value.
      */
    var b: Double = js.native
    
    /**
      * The Skew X value.
      */
    var c: Double = js.native
    
    /**
      * Set the values of this Matrix to copy those of the matrix given.
      * @param src The source Matrix to copy from.
      */
    def copyFrom(src: TransformMatrix): this.type = js.native
    
    /**
      * Set the values of this Matrix to copy those of the array given.
      * Where array indexes 0, 1, 2, 3, 4 and 5 are mapped to a, b, c, d, e and f.
      * @param src The array of values to set into this matrix.
      */
    def copyFromArray(src: js.Array[js.Any]): this.type = js.native
    
    /**
      * Copy the values in this Matrix to the array given.
      * 
      * Where array indexes 0, 1, 2, 3, 4 and 5 are mapped to a, b, c, d, e and f.
      * @param out The array to copy the matrix values in to.
      */
    def copyToArray(): js.Array[js.Any] = js.native
    def copyToArray(out: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Copy the values from this Matrix to the given Canvas Rendering Context.
      * This will use the Context.transform method.
      * @param ctx The Canvas Rendering Context to copy the matrix values to.
      */
    def copyToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = js.native
    
    /**
      * The Scale Y value.
      */
    var d: Double = js.native
    
    /**
      * Decompose this Matrix into its translation, scale and rotation values using QR decomposition.
      * 
      * The result must be applied in the following order to reproduce the current matrix:
      * 
      * translate -> rotate -> scale
      */
    def decomposeMatrix(): js.Object = js.native
    
    /**
      * The decomposed matrix.
      */
    var decomposedMatrix: js.Object = js.native
    
    /**
      * Destroys this Transform Matrix.
      */
    def destroy(): Unit = js.native
    
    /**
      * The Translate X value.
      */
    var e: Double = js.native
    
    /**
      * The Translate Y value.
      */
    var f: Double = js.native
    
    /**
      * Returns a string that can be used in a CSS Transform call as a `matrix` property.
      */
    def getCSSMatrix(): String = js.native
    
    /**
      * Returns the X component of this matrix multiplied by the given values.
      * This is the same as `x * a + y * c + e`.
      * @param x The x value.
      * @param y The y value.
      */
    def getX(x: Double, y: Double): Double = js.native
    
    /**
      * Returns the Y component of this matrix multiplied by the given values.
      * This is the same as `x * b + y * d + f`.
      * @param x The x value.
      * @param y The y value.
      */
    def getY(x: Double, y: Double): Double = js.native
    
    /**
      * Invert the Matrix.
      */
    def invert(): this.type = js.native
    
    /**
      * Reset the Matrix to an identity matrix.
      */
    def loadIdentity(): this.type = js.native
    
    /**
      * The matrix values.
      */
    var matrix: Float32Array = js.native
    
    /**
      * Multiply this Matrix by the given Matrix.
      * 
      * If an `out` Matrix is given then the results will be stored in it.
      * If it is not given, this matrix will be updated in place instead.
      * Use an `out` Matrix if you do not wish to mutate this matrix.
      * @param rhs The Matrix to multiply by.
      * @param out An optional Matrix to store the results in.
      */
    def multiply(rhs: TransformMatrix): this.type | TransformMatrix = js.native
    def multiply(rhs: TransformMatrix, out: TransformMatrix): this.type | TransformMatrix = js.native
    
    /**
      * Multiply this Matrix by the matrix given, including the offset.
      * 
      * The offsetX is added to the tx value: `offsetX * a + offsetY * c + tx`.
      * The offsetY is added to the ty value: `offsetY * b + offsetY * d + ty`.
      * @param src The source Matrix to copy from.
      * @param offsetX Horizontal offset to factor in to the multiplication.
      * @param offsetY Vertical offset to factor in to the multiplication.
      */
    def multiplyWithOffset(src: TransformMatrix, offsetX: Double, offsetY: Double): this.type = js.native
    
    /**
      * Rotate the Matrix.
      * @param angle The angle of rotation in radians.
      */
    def rotate(angle: Double): this.type = js.native
    
    /**
      * The rotation of the Matrix. Value is in radians.
      */
    val rotation: Double = js.native
    
    /**
      * The rotation of the Matrix, normalized to be within the Phaser right-handed
      * clockwise rotation space. Value is in radians.
      */
    val rotationNormalized: Double = js.native
    
    /**
      * Scale the Matrix.
      * @param x The horizontal scale value.
      * @param y The vertical scale value.
      */
    def scale(x: Double, y: Double): this.type = js.native
    
    /**
      * The decomposed horizontal scale of the Matrix. This value is always positive.
      */
    val scaleX: Double = js.native
    
    /**
      * The decomposed vertical scale of the Matrix. This value is always positive.
      */
    val scaleY: Double = js.native
    
    /**
      * Copy the values from this Matrix to the given Canvas Rendering Context.
      * This will use the Context.setTransform method.
      * @param ctx The Canvas Rendering Context to copy the matrix values to.
      */
    def setToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = js.native
    
    /**
      * Set the values of this Matrix.
      * @param a The Scale X value.
      * @param b The Shear Y value.
      * @param c The Shear X value.
      * @param d The Scale Y value.
      * @param tx The Translate X value.
      * @param ty The Translate Y value.
      */
    def setTransform(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
    
    /**
      * Transform the Matrix.
      * @param a The Scale X value.
      * @param b The Shear Y value.
      * @param c The Shear X value.
      * @param d The Scale Y value.
      * @param tx The Translate X value.
      * @param ty The Translate Y value.
      */
    def transform(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
    
    def transformPoint(x: Double, y: Double, point: js.Object): Point | Vector2 | js.Object = js.native
    /**
      * Transform a point using this Matrix.
      * @param x The x coordinate of the point to transform.
      * @param y The y coordinate of the point to transform.
      * @param point The Point object to store the transformed coordinates.
      */
    def transformPoint(x: Double, y: Double, point: Point): Point | Vector2 | js.Object = js.native
    def transformPoint(x: Double, y: Double, point: Vector2): Point | Vector2 | js.Object = js.native
    
    /**
      * Translate the Matrix.
      * @param x The horizontal translation value.
      * @param y The vertical translation value.
      */
    def translate(x: Double, y: Double): this.type = js.native
    
    /**
      * The Translate X value.
      */
    var tx: Double = js.native
    
    /**
      * The Translate Y value.
      */
    var ty: Double = js.native
  }
  
  /**
    * Provides methods used for setting the visibility of a Game Object.
    * Should be applied as a mixin and not used directly.
    */
  trait Visible extends StObject {
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    def setVisible(value: Boolean): this.type
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    var visible: Boolean
  }
  object Visible {
    
    inline def apply(setVisible: Boolean => Visible, visible: Boolean): Visible = {
      val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visible]
    }
    
    extension [Self <: Visible](x: Self) {
      
      inline def setSetVisible(value: Boolean => Visible): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
