package typings.phaser.Phaser

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Structs.Map
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Animations.GenerateFrameNames
import typings.phaser.Phaser.Types.Animations.GenerateFrameNumbers
import typings.phaser.Phaser.Types.Animations.JSONAnimation
import typings.phaser.Phaser.Types.Animations.JSONAnimationFrame
import typings.phaser.Phaser.Types.Animations.JSONAnimations
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animations {
  
  /**
    * A Frame based Animation.
    * 
    * This consists of a key, some default values (like the frame rate) and a bunch of Frame objects.
    * 
    * The Animation Manager creates these. Game Objects don't own an instance of these directly.
    * Game Objects have the Animation Component, which are like playheads to global Animations (these objects)
    * So multiple Game Objects can have playheads all pointing to this one Animation instance.
    */
  @js.native
  trait Animation
    extends StObject
       with EventEmitter {
    
    /**
      * Add frames to the end of the animation.
      * @param config Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
      */
    def addFrame(config: String): this.type = js.native
    def addFrame(config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): this.type = js.native
    
    /**
      * Add frame/s into the animation.
      * @param index The index to insert the frame at within the animation.
      * @param config Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
      */
    def addFrameAt(index: integer, config: String): this.type = js.native
    def addFrameAt(index: integer, config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): this.type = js.native
    
    /**
      * Check if the given frame index is valid.
      * @param index The index to be checked.
      */
    def checkFrame(index: integer): Boolean = js.native
    
    /**
      * Called internally when this Animation completes playback.
      * Optionally, hides the parent Game Object, then stops playback.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      */
    /* protected */ def completeAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * The delay in ms before the playback will begin.
      */
    var delay: integer = js.native
    
    /**
      * How long the animation should play for, in milliseconds.
      * If the `frameRate` property has been set then it overrides this value,
      * otherwise the `frameRate` is derived from `duration`.
      */
    var duration: integer = js.native
    
    /**
      * The frame rate of playback in frames per second (default 24 if duration is null)
      */
    var frameRate: integer = js.native
    
    /**
      * Extract all the frame data into the frames array.
      */
    var frames: js.Array[AnimationFrame] = js.native
    
    /**
      * Called internally when this Animation first starts to play.
      * Sets the accumulator and nextTick properties.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      * @param includeDelay If `true` the Animation Components delay value will be added to the `nextTick` total. Default true.
      */
    /* protected */ def getFirstTick(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /* protected */ def getFirstTick(component: typings.phaser.Phaser.GameObjects.Components.Animation, includeDelay: Boolean): Unit = js.native
    
    /**
      * Returns the AnimationFrame at the provided index
      * @param index The index in the AnimationFrame array
      */
    /* protected */ def getFrameAt(index: integer): AnimationFrame = js.native
    
    /**
      * Returns the frame closest to the given progress value between 0 and 1.
      * @param value A value between 0 and 1.
      */
    def getFrameByProgress(value: Double): AnimationFrame = js.native
    
    /**
      * Creates AnimationFrame instances based on the given frame data.
      * @param textureManager A reference to the global Texture Manager.
      * @param frames Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
      * @param defaultTextureKey The key to use if no key is set in the frame configuration object.
      */
    def getFrames(textureManager: TextureManager, frames: String): js.Array[AnimationFrame] = js.native
    def getFrames(textureManager: TextureManager, frames: String, defaultTextureKey: String): js.Array[AnimationFrame] = js.native
    def getFrames(
      textureManager: TextureManager,
      frames: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]
    ): js.Array[AnimationFrame] = js.native
    def getFrames(
      textureManager: TextureManager,
      frames: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame],
      defaultTextureKey: String
    ): js.Array[AnimationFrame] = js.native
    
    /**
      * Returns the animation last frame.
      */
    def getLastFrame(): AnimationFrame = js.native
    
    /**
      * Called internally. Sets the accumulator and nextTick values of the current Animation.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      */
    def getNextTick(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * Should the GameObject's `visible` property be set to `false` when the animation finishes?
      */
    var hideOnComplete: Boolean = js.native
    
    /**
      * The unique identifying string for this animation.
      */
    var key: String = js.native
    
    /**
      * A reference to the global Animation Manager.
      */
    var manager: AnimationManager = js.native
    
    /**
      * How many ms per frame, not including frame specific modifiers.
      */
    var msPerFrame: integer = js.native
    
    /**
      * Advance the animation frame.
      * @param component The Animation Component to advance.
      */
    def nextFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * Pauses playback of this Animation. The paused state is set immediately.
      */
    def pause(): this.type = js.native
    
    /**
      * Global pause. All Game Objects using this Animation instance are impacted by this property.
      */
    var paused: Boolean = js.native
    
    /**
      * Called internally when the Animation is playing backwards.
      * Sets the previous frame, causing a yoyo, repeat, complete or update, accordingly.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      */
    def previousFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * Removes the given AnimationFrame from this Animation instance.
      * This is a global action. Any Game Object using this Animation will be impacted by this change.
      * @param frame The AnimationFrame to be removed.
      */
    def removeFrame(frame: AnimationFrame): this.type = js.native
    
    /**
      * Removes a frame from the AnimationFrame array at the provided index
      * and updates the animation accordingly.
      * @param index The index in the AnimationFrame array
      */
    def removeFrameAt(index: integer): this.type = js.native
    
    /**
      * Number of times to repeat the animation. Set to -1 to repeat forever.
      */
    var repeat: integer = js.native
    
    /**
      * Called internally during playback. Forces the animation to repeat, providing there are enough counts left
      * in the repeat counter.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      */
    def repeatAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * The delay in ms before the a repeat play starts.
      */
    var repeatDelay: integer = js.native
    
    /**
      * Resumes playback of this Animation. The paused state is reset immediately.
      */
    def resume(): this.type = js.native
    
    /**
      * Sets the texture frame the animation uses for rendering.
      * @param component The Animation Component belonging to the Game Object invoking this call.
      */
    def setFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    
    /**
      * Should the GameObject's `visible` property be set to `true` when the animation starts to play?
      */
    var showOnStart: Boolean = js.native
    
    /**
      * Skip frames if the time lags, or always advanced anyway?
      */
    var skipMissedFrames: Boolean = js.native
    
    /**
      * Converts the animation data to JSON.
      */
    def toJSON(): JSONAnimation = js.native
    
    /**
      * A frame based animation (as opposed to a bone based animation)
      */
    var `type`: String = js.native
    
    /**
      * Called internally whenever frames are added to, or removed from, this Animation.
      */
    def updateFrameSequence(): this.type = js.native
    
    /**
      * Should the animation yoyo (reverse back down to the start) before repeating?
      */
    var yoyo: Boolean = js.native
  }
  
  /**
    * A single frame in an Animation sequence.
    * 
    * An AnimationFrame consists of a reference to the Texture it uses for rendering, references to other
    * frames in the animation, and index data. It also has the ability to modify the animation timing.
    * 
    * AnimationFrames are generated automatically by the Animation class.
    */
  trait AnimationFrame extends StObject {
    
    /**
      * Destroys this object by removing references to external resources and callbacks.
      */
    def destroy(): Unit
    
    /**
      * Additional time (in ms) that this frame should appear for during playback.
      * The value is added onto the msPerFrame set by the animation.
      */
    var duration: Double
    
    /**
      * A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    var frame: Frame
    
    /**
      * The index of this AnimationFrame within the Animation sequence.
      */
    var index: integer
    
    /**
      * Is this the first frame in an animation sequence?
      */
    val isFirst: Boolean
    
    /**
      * Is this the last frame in an animation sequence?
      */
    val isLast: Boolean
    
    /**
      * A reference to the AnimationFrame that comes after this one in the animation, if any.
      */
    val nextFrame: AnimationFrame
    
    /**
      * A reference to the AnimationFrame that comes before this one in the animation, if any.
      */
    val prevFrame: AnimationFrame
    
    /**
      * What % through the animation does this frame come?
      * This value is generated when the animation is created and cached here.
      */
    val progress: Double
    
    /**
      * The key of the Frame within the Texture that this AnimationFrame uses.
      */
    var textureFrame: String | integer
    
    /**
      * The key of the Texture this AnimationFrame uses.
      */
    var textureKey: String
    
    /**
      * Generates a JavaScript object suitable for converting to JSON.
      */
    def toJSON(): JSONAnimationFrame
  }
  object AnimationFrame {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      duration: Double,
      frame: Frame,
      index: integer,
      isFirst: Boolean,
      isLast: Boolean,
      nextFrame: AnimationFrame,
      prevFrame: AnimationFrame,
      progress: Double,
      textureFrame: String | integer,
      textureKey: String,
      toJSON: () => JSONAnimationFrame
    ): AnimationFrame = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], nextFrame = nextFrame.asInstanceOf[js.Any], prevFrame = prevFrame.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], textureFrame = textureFrame.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AnimationFrame]
    }
    
    @scala.inline
    implicit class AnimationFrameMutableBuilder[Self <: AnimationFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextFrame(value: AnimationFrame): Self = StObject.set(x, "nextFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevFrame(value: AnimationFrame): Self = StObject.set(x, "prevFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureFrame(value: String | integer): Self = StObject.set(x, "textureFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureKey(value: String): Self = StObject.set(x, "textureKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => JSONAnimationFrame): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The Animation Manager.
    * 
    * Animations are managed by the global Animation Manager. This is a singleton class that is
    * responsible for creating and delivering animations and their corresponding data to all Game Objects.
    * Unlike plugins it is owned by the Game instance, not the Scene.
    * 
    * Sprites and other Game Objects get the data they need from the AnimationManager.
    */
  @js.native
  trait AnimationManager
    extends StObject
       with EventEmitter {
    
    /**
      * Adds an existing Animation to the Animation Manager.
      * @param key The key under which the Animation should be added. The Animation will be updated with it. Must be unique.
      * @param animation The Animation which should be added to the Animation Manager.
      */
    def add(key: String, animation: Animation): this.type = js.native
    
    /**
      * The Animations registered in the Animation Manager.
      * 
      * This map should be modified with the {@link #add} and {@link #create} methods of the Animation Manager.
      */
    var anims: Map[String, Animation] = js.native
    
    /**
      * Registers event listeners after the Game boots.
      */
    def boot(): Unit = js.native
    
    /**
      * Creates a new Animation and adds it to the Animation Manager.
      * 
      * Animations are global. Once created, you can use them in any Scene in your game. They are not Scene specific.
      * 
      * If an invalid key is given this method will return `false`.
      * 
      * If you pass the key of an animation that already exists in the Animation Manager, that animation will be returned.
      * 
      * A brand new animation is only created if the key is valid and not already in use.
      * 
      * If you wish to re-use an existing key, call `AnimationManager.remove` first, then this method.
      * @param config The configuration settings for the Animation.
      */
    def create(config: typings.phaser.Phaser.Types.Animations.Animation): Animation | `false` = js.native
    
    /**
      * Checks to see if the given key is already in use within the Animation Manager or not.
      * 
      * Animations are global. Keys created in one scene can be used from any other Scene in your game. They are not Scene specific.
      * @param key The key of the Animation to check.
      */
    def exists(key: String): Boolean = js.native
    
    /**
      * Loads this Animation Manager's Animations and settings from a JSON object.
      * @param data The JSON object to parse.
      * @param clearCurrentAnimations If set to `true`, the current animations will be removed (`anims.clear()`). If set to `false` (default), the animations in `data` will be added. Default false.
      */
    def fromJSON(data: String): js.Array[Animation] = js.native
    def fromJSON(data: String, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
    def fromJSON(data: JSONAnimation): js.Array[Animation] = js.native
    def fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
    def fromJSON(data: JSONAnimations): js.Array[Animation] = js.native
    def fromJSON(data: JSONAnimations, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
    
    /**
      * A reference to the Phaser.Game instance.
      */
    var game: Game = js.native
    
    /**
      * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
      * 
      * Generates objects with string based frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNames}.
      * 
      * It's a helper method, designed to make it easier for you to extract all of the frame names from texture atlases.
      * If you're working with a sprite sheet, see the `generateFrameNumbers` method instead.
      * 
      * Example:
      * 
      * If you have a texture atlases loaded called `gems` and it contains 6 frames called `ruby_0001`, `ruby_0002`, and so on,
      * then you can call this method using: `this.anims.generateFrameNames('gems', { prefix: 'ruby_', end: 6, zeroPad: 4 })`.
      * 
      * The `end` value tells it to look for 6 frames, incrementally numbered, all starting with the prefix `ruby_`. The `zeroPad`
      * value tells it how many zeroes pad out the numbers. To create an animation using this method, you can do:
      * 
      * ```javascript
      * this.anims.create({
      *   key: 'ruby',
      *   repeat: -1,
      *   frames: this.anims.generateFrameNames('gems', {
      *     prefix: 'ruby_',
      *     end: 6,
      *     zeroPad: 4
      *   })
      * });
      * ```
      * 
      * Please see the animation examples for further details.
      * @param key The key for the texture containing the animation frames.
      * @param config The configuration object for the animation frame names.
      */
    def generateFrameNames(key: String): js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
    def generateFrameNames(key: String, config: GenerateFrameNames): js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
    
    /**
      * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
      * 
      * Generates objects with numbered frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNumbers}.
      * 
      * If you're working with a texture atlas, see the `generateFrameNames` method instead.
      * @param key The key for the texture containing the animation frames.
      * @param config The configuration object for the animation frames.
      */
    def generateFrameNumbers(key: String, config: GenerateFrameNumbers): js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
    
    /**
      * Get an Animation.
      * @param key The key of the Animation to retrieve.
      */
    def get(key: String): Animation = js.native
    
    /**
      * The global time scale of the Animation Manager.
      * 
      * This scales the time delta between two frames, thus influencing the speed of time for the Animation Manager.
      */
    var globalTimeScale: Double = js.native
    
    /**
      * Load an Animation into a Game Object's Animation Component.
      * @param child The Game Object to load the animation into.
      * @param key The key of the animation to load.
      * @param startFrame The name of a start frame to set on the loaded animation.
      */
    def load(child: GameObject, key: String): GameObject = js.native
    def load(child: GameObject, key: String, startFrame: String): GameObject = js.native
    def load(child: GameObject, key: String, startFrame: integer): GameObject = js.native
    
    /**
      * The name of this Animation Manager.
      */
    var name: String = js.native
    
    /**
      * Pause all animations.
      */
    def pauseAll(): this.type = js.native
    
    /**
      * Whether the Animation Manager is paused along with all of its Animations.
      */
    var paused: Boolean = js.native
    
    def play(key: String, child: js.Array[GameObject]): this.type = js.native
    /**
      * Play an animation on the given Game Objects that have an Animation Component.
      * @param key The key of the animation to play on the Game Object.
      * @param child The Game Objects to play the animation on.
      */
    def play(key: String, child: GameObject): this.type = js.native
    
    /**
      * Removes an Animation from this Animation Manager, based on the given key.
      * 
      * This is a global action. Once an Animation has been removed, no Game Objects
      * can carry on using it.
      * @param key The key of the animation to remove.
      */
    def remove(key: String): Animation = js.native
    
    /**
      * Resume all paused animations.
      */
    def resumeAll(): this.type = js.native
    
    def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: js.Array[GameObject]): G = js.native
    def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: js.Array[GameObject], stagger: Double): G = js.native
    /**
      * Takes an array of Game Objects that have an Animation Component and then
      * starts the given animation playing on them, each one offset by the
      * `stagger` amount given to this method.
      * @param key The key of the animation to play on the Game Objects.
      * @param children An array of Game Objects to play the animation on. They must have an Animation Component.
      * @param stagger The amount of time, in milliseconds, to offset each play time by. Default 0.
      */
    def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: GameObject): G = js.native
    def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: GameObject, stagger: Double): G = js.native
    
    /**
      * A reference to the Texture Manager.
      */
    var textureManager: TextureManager = js.native
    
    /**
      * Returns the Animation data as JavaScript object based on the given key.
      * Or, if not key is defined, it will return the data of all animations as array of objects.
      * @param key The animation to get the JSONAnimation data from. If not provided, all animations are returned as an array.
      */
    def toJSON(): JSONAnimations = js.native
    def toJSON(key: String): JSONAnimations = js.native
  }
}
