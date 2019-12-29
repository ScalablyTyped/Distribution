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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Animations")
@js.native
object Animations extends js.Object {
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
  class Animation protected () extends EventEmitter {
    /**
      * 
      * @param manager A reference to the global Animation Manager
      * @param key The unique identifying string for this animation.
      * @param config The Animation configuration.
      */
    def this(manager: AnimationManager, key: String, config: typings.phaser.Phaser.Types.Animations.Animation) = this()
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
      * Global pause. All Game Objects using this Animation instance are impacted by this property.
      */
    var paused: Boolean = js.native
    /**
      * Number of times to repeat the animation. Set to -1 to repeat forever.
      */
    var repeat: integer = js.native
    /**
      * The delay in ms before the a repeat play starts.
      */
    var repeatDelay: integer = js.native
    /**
      * Should the GameObject's `visible` property be set to `true` when the animation starts to play?
      */
    var showOnStart: Boolean = js.native
    /**
      * Skip frames if the time lags, or always advanced anyway?
      */
    var skipMissedFrames: Boolean = js.native
    /**
      * A frame based animation (as opposed to a bone based animation)
      */
    var `type`: String = js.native
    /**
      * Should the animation yoyo (reverse back down to the start) before repeating?
      */
    var yoyo: Boolean = js.native
    /**
      * Add frames to the end of the animation.
      * @param config [description]
      */
    def addFrame(config: String): Animation = js.native
    def addFrame(config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): Animation = js.native
    /**
      * Add frame/s into the animation.
      * @param index The index to insert the frame at within the animation.
      * @param config [description]
      */
    def addFrameAt(index: integer, config: String): Animation = js.native
    def addFrameAt(index: integer, config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): Animation = js.native
    /**
      * Check if the given frame index is valid.
      * @param index The index to be checked.
      */
    def checkFrame(index: integer): Boolean = js.native
    /**
      * [description]
      * @param component [description]
      */
    /* protected */ def completeAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * [description]
      * @param component [description]
      * @param includeDelay [description] Default true.
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
      * [description]
      * @param textureManager [description]
      * @param frames [description]
      * @param defaultTextureKey [description]
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
      * [description]
      * @param component [description]
      */
    def getNextTick(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * Advance the animation frame.
      * @param component The Animation Component to advance.
      */
    def nextFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * [description]
      */
    def pause(): Animation = js.native
    /**
      * [description]
      * @param component [description]
      */
    def previousFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * [description]
      * @param frame [description]
      */
    def removeFrame(frame: AnimationFrame): Animation = js.native
    /**
      * Removes a frame from the AnimationFrame array at the provided index
      * and updates the animation accordingly.
      * @param index The index in the AnimationFrame array
      */
    def removeFrameAt(index: integer): Animation = js.native
    /**
      * [description]
      * @param component [description]
      */
    def repeatAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * [description]
      */
    def resume(): Animation = js.native
    /**
      * Sets the texture frame the animation uses for rendering.
      * @param component [description]
      */
    def setFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
    /**
      * Converts the animation data to JSON.
      */
    def toJSON(): JSONAnimation = js.native
    /**
      * [description]
      */
    def updateFrameSequence(): Animation = js.native
  }
  
  /**
    * A single frame in an Animation sequence.
    * 
    * An AnimationFrame consists of a reference to the Texture it uses for rendering, references to other
    * frames in the animation, and index data. It also has the ability to modify the animation timing.
    * 
    * AnimationFrames are generated automatically by the Animation class.
    */
  @js.native
  class AnimationFrame protected () extends js.Object {
    /**
      * 
      * @param textureKey The key of the Texture this AnimationFrame uses.
      * @param textureFrame The key of the Frame within the Texture that this AnimationFrame uses.
      * @param index The index of this AnimationFrame within the Animation sequence.
      * @param frame A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    def this(textureKey: String, textureFrame: String, index: integer, frame: Frame) = this()
    def this(textureKey: String, textureFrame: integer, index: integer, frame: Frame) = this()
    /**
      * Additional time (in ms) that this frame should appear for during playback.
      * The value is added onto the msPerFrame set by the animation.
      */
    var duration: Double = js.native
    /**
      * A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    var frame: Frame = js.native
    /**
      * The index of this AnimationFrame within the Animation sequence.
      */
    var index: integer = js.native
    /**
      * Is this the first frame in an animation sequence?
      */
    val isFirst: Boolean = js.native
    /**
      * Is this the last frame in an animation sequence?
      */
    val isLast: Boolean = js.native
    /**
      * A reference to the AnimationFrame that comes after this one in the animation, if any.
      */
    val nextFrame: AnimationFrame = js.native
    /**
      * A reference to the AnimationFrame that comes before this one in the animation, if any.
      */
    val prevFrame: AnimationFrame = js.native
    /**
      * What % through the animation does this frame come?
      * This value is generated when the animation is created and cached here.
      */
    val progress: Double = js.native
    /**
      * The key of the Frame within the Texture that this AnimationFrame uses.
      */
    var textureFrame: String | integer = js.native
    /**
      * The key of the Texture this AnimationFrame uses.
      */
    var textureKey: String = js.native
    /**
      * Destroys this object by removing references to external resources and callbacks.
      */
    def destroy(): Unit = js.native
    /**
      * Generates a JavaScript object suitable for converting to JSON.
      */
    def toJSON(): JSONAnimationFrame = js.native
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
  class AnimationManager protected () extends EventEmitter {
    /**
      * 
      * @param game A reference to the Phaser.Game instance.
      */
    def this(game: Game) = this()
    /**
      * The Animations registered in the Animation Manager.
      * 
      * This map should be modified with the {@link #add} and {@link #create} methods of the Animation Manager.
      */
    var anims: Map[String, Animation] = js.native
    /**
      * A reference to the Phaser.Game instance.
      */
    var game: Game = js.native
    /**
      * The global time scale of the Animation Manager.
      * 
      * This scales the time delta between two frames, thus influencing the speed of time for the Animation Manager.
      */
    var globalTimeScale: Double = js.native
    /**
      * The name of this Animation Manager.
      */
    var name: String = js.native
    /**
      * Whether the Animation Manager is paused along with all of its Animations.
      */
    var paused: Boolean = js.native
    /**
      * A reference to the Texture Manager.
      */
    var textureManager: TextureManager = js.native
    /**
      * Adds an existing Animation to the Animation Manager.
      * @param key The key under which the Animation should be added. The Animation will be updated with it. Must be unique.
      * @param animation The Animation which should be added to the Animation Manager.
      */
    def add(key: String, animation: Animation): AnimationManager = js.native
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
      * [description]
      * @param key The key for the texture containing the animation frames.
      * @param config The configuration object for the animation frame names.
      */
    def generateFrameNames(key: String): js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
    def generateFrameNames(key: String, config: GenerateFrameNames): js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
    /**
      * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
      * 
      * Generates objects with numbered frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNumbers}.
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
      * Load an Animation into a Game Object's Animation Component.
      * @param child The Game Object to load the animation into.
      * @param key The key of the animation to load.
      * @param startFrame The name of a start frame to set on the loaded animation.
      */
    def load(child: GameObject, key: String): GameObject = js.native
    def load(child: GameObject, key: String, startFrame: String): GameObject = js.native
    def load(child: GameObject, key: String, startFrame: integer): GameObject = js.native
    /**
      * Pause all animations.
      */
    def pauseAll(): AnimationManager = js.native
    def play(key: String, child: js.Array[GameObject]): AnimationManager = js.native
    /**
      * Play an animation on the given Game Objects that have an Animation Component.
      * @param key The key of the animation to play on the Game Object.
      * @param child The Game Objects to play the animation on.
      */
    def play(key: String, child: GameObject): AnimationManager = js.native
    /**
      * Remove an animation.
      * @param key The key of the animation to remove.
      */
    def remove(key: String): Animation = js.native
    /**
      * Resume all paused animations.
      */
    def resumeAll(): AnimationManager = js.native
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
      * Get the animation data as javascript object by giving key, or get the data of all animations as array of objects, if key wasn't provided.
      * @param key [description]
      */
    def toJSON(key: String): JSONAnimations = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Add Animation Event.
      * 
      * This event is dispatched when a new animation is added to the global Animation Manager.
      * 
      * This can happen either as a result of an animation instance being added to the Animation Manager,
      * or the Animation Manager creating a new animation directly.
      */
    val ADD_ANIMATION: js.Any = js.native
    /**
      * The Animation Complete Event.
      * 
      * This event is dispatched by an Animation instance when it completes, i.e. finishes playing or is manually stopped.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all complete the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_COMPLETE: js.Any = js.native
    /**
      * The Animation Repeat Event.
      * 
      * This event is dispatched when a currently playing animation repeats.
      * 
      * The event is dispatched directly from the Animation object itself. Which means that listeners
      * bound to this event will be invoked every time the Animation repeats, for every Game Object that may have it.
      */
    val ANIMATION_REPEAT: js.Any = js.native
    /**
      * The Animation Restart Event.
      * 
      * This event is dispatched by an Animation instance when it restarts.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all restart the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_RESTART: js.Any = js.native
    /**
      * The Animation Start Event.
      * 
      * This event is dispatched by an Animation instance when it starts playing.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all play the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_START: js.Any = js.native
    /**
      * The Pause All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager is told to pause.
      * 
      * When this happens all current animations will stop updating, although it doesn't necessarily mean
      * that the game has paused as well.
      */
    val PAUSE_ALL: js.Any = js.native
    /**
      * The Remove Animation Event.
      * 
      * This event is dispatched when an animation is removed from the global Animation Manager.
      */
    val REMOVE_ANIMATION: js.Any = js.native
    /**
      * The Resume All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager resumes, having been previously paused.
      * 
      * When this happens all current animations will continue updating again.
      */
    val RESUME_ALL: js.Any = js.native
    /**
      * The Sprite Animation Complete Event.
      * 
      * This event is dispatched by a Sprite when an animation finishes playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_COMPLETE` event.
      */
    val SPRITE_ANIMATION_COMPLETE: js.Any = js.native
    /**
      * The Sprite Animation Key Complete Event.
      * 
      * This event is dispatched by a Sprite when a specific animation finishes playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationcomplete-explode`.
      */
    val SPRITE_ANIMATION_KEY_COMPLETE: js.Any = js.native
    /**
      * The Sprite Animation Key Repeat Event.
      * 
      * This event is dispatched by a Sprite when a specific animation repeats playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrepeat-explode`.
      */
    val SPRITE_ANIMATION_KEY_REPEAT: js.Any = js.native
    /**
      * The Sprite Animation Key Restart Event.
      * 
      * This event is dispatched by a Sprite when a specific animation restarts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrestart-explode`.
      */
    val SPRITE_ANIMATION_KEY_RESTART: js.Any = js.native
    /**
      * The Sprite Animation Key Start Event.
      * 
      * This event is dispatched by a Sprite when a specific animation starts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationstart-explode`.
      */
    val SPRITE_ANIMATION_KEY_START: js.Any = js.native
    /**
      * The Sprite Animation Key Update Event.
      * 
      * This event is dispatched by a Sprite when a specific animation playing on it updates. This happens when the animation changes frame,
      * based on the animation frame rate and other factors like `timeScale` and `delay`.
      * 
      * Listen for it on the Sprite using `sprite.on('animationupdate-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationupdate-explode`.
      */
    val SPRITE_ANIMATION_KEY_UPDATE: js.Any = js.native
    /**
      * The Sprite Animation Repeat Event.
      * 
      * This event is dispatched by a Sprite when an animation repeats playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_REPEAT` event.
      */
    val SPRITE_ANIMATION_REPEAT: js.Any = js.native
    /**
      * The Sprite Animation Restart Event.
      * 
      * This event is dispatched by a Sprite when an animation restarts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_RESTART` event.
      */
    val SPRITE_ANIMATION_RESTART: js.Any = js.native
    /**
      * The Sprite Animation Start Event.
      * 
      * This event is dispatched by a Sprite when an animation starts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_START` event.
      */
    val SPRITE_ANIMATION_START: js.Any = js.native
    /**
      * The Sprite Animation Update Event.
      * 
      * This event is dispatched by a Sprite when an animation playing on it updates. This happens when the animation changes frame,
      * based on the animation frame rate and other factors like `timeScale` and `delay`.
      * 
      * Listen for it on the Sprite using `sprite.on('animationupdate', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_UPDATE` event.
      */
    val SPRITE_ANIMATION_UPDATE: js.Any = js.native
  }
  
}

