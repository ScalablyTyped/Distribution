package typings
package phaserLib.PhaserNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Animation Manager.
  * 
  * Animations are managed by the global Animation Manager. This is a singleton class that is
  * responsible for creating and delivering animations and their corresponding data to all Game Objects.
  * Unlike plugins it is owned by the Game instance, not the Scene.
  * 
  * Sprites and other Game Objects get the data they need from the AnimationManager.
  */
@JSGlobal("Phaser.Animations.AnimationManager")
@js.native
class AnimationManager protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param game A reference to the Phaser.Game instance.
    */
  def this(game: phaserLib.PhaserNs.Game) = this()
  /**
    * The Animations registered in the Animation Manager.
    * 
    * This map should be modified with the {@link #add} and {@link #create} methods of the Animation Manager.
    */
  var anims: phaserLib.PhaserNs.StructsNs.Map[java.lang.String, Animation] = js.native
  /**
    * A reference to the Phaser.Game instance.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * The global time scale of the Animation Manager.
    * 
    * This scales the time delta between two frames, thus influencing the speed of time for the Animation Manager.
    */
  var globalTimeScale: scala.Double = js.native
  /**
    * The name of this Animation Manager.
    */
  var name: java.lang.String = js.native
  /**
    * Whether the Animation Manager is paused along with all of its Animations.
    */
  var paused: scala.Boolean = js.native
  /**
    * A reference to the Texture Manager.
    */
  var textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager = js.native
  /**
    * Adds an existing Animation to the Animation Manager.
    * @param key The key under which the Animation should be added. The Animation will be updated with it. Must be unique.
    * @param animation The Animation which should be added to the Animation Manager.
    */
  def add(key: java.lang.String, animation: Animation): AnimationManager = js.native
  /**
    * Registers event listeners after the Game boots.
    */
  def boot(): scala.Unit = js.native
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
  def create(config: phaserLib.PhaserNs.TypesNs.AnimationsNs.Animation): Animation | phaserLib.phaserLibNumbers.`false` = js.native
  /**
    * Checks to see if the given key is already in use within the Animation Manager or not.
    * 
    * Animations are global. Keys created in one scene can be used from any other Scene in your game. They are not Scene specific.
    * @param key The key of the Animation to check.
    */
  def exists(key: java.lang.String): scala.Boolean = js.native
  /**
    * Loads this Animation Manager's Animations and settings from a JSON object.
    * @param data The JSON object to parse.
    * @param clearCurrentAnimations If set to `true`, the current animations will be removed (`anims.clear()`). If set to `false` (default), the animations in `data` will be added. Default false.
    */
  def fromJSON(data: java.lang.String): js.Array[Animation] = js.native
  def fromJSON(data: java.lang.String, clearCurrentAnimations: scala.Boolean): js.Array[Animation] = js.native
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimation): js.Array[Animation] = js.native
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimation, clearCurrentAnimations: scala.Boolean): js.Array[Animation] = js.native
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimations): js.Array[Animation] = js.native
  def fromJSON(
    data: phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimations,
    clearCurrentAnimations: scala.Boolean
  ): js.Array[Animation] = js.native
  /**
    * [description]
    * @param key The key for the texture containing the animation frames.
    * @param config The configuration object for the animation frame names.
    */
  def generateFrameNames(key: java.lang.String): js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame] = js.native
  def generateFrameNames(key: java.lang.String, config: phaserLib.PhaserNs.TypesNs.AnimationsNs.GenerateFrameNames): js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame] = js.native
  /**
    * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
    * 
    * Generates objects with numbered frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNumbers}.
    * @param key The key for the texture containing the animation frames.
    * @param config The configuration object for the animation frames.
    */
  def generateFrameNumbers(key: java.lang.String, config: phaserLib.PhaserNs.TypesNs.AnimationsNs.GenerateFrameNumbers): js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame] = js.native
  /**
    * Get an Animation.
    * @param key The key of the Animation to retrieve.
    */
  def get(key: java.lang.String): Animation = js.native
  /**
    * Load an Animation into a Game Object's Animation Component.
    * @param child The Game Object to load the animation into.
    * @param key The key of the animation to load.
    * @param startFrame The name of a start frame to set on the loaded animation.
    */
  def load(child: phaserLib.PhaserNs.GameObjectsNs.GameObject, key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def load(
    child: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    key: java.lang.String,
    startFrame: java.lang.String
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def load(
    child: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    key: java.lang.String,
    startFrame: phaserLib.integer
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Pause all animations.
    */
  def pauseAll(): AnimationManager = js.native
  def play(key: java.lang.String, child: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): AnimationManager = js.native
  /**
    * Play an animation on the given Game Objects that have an Animation Component.
    * @param key The key of the animation to play on the Game Object.
    * @param child The Game Objects to play the animation on.
    */
  def play(key: java.lang.String, child: phaserLib.PhaserNs.GameObjectsNs.GameObject): AnimationManager = js.native
  /**
    * Remove an animation.
    * @param key The key of the animation to remove.
    */
  def remove(key: java.lang.String): Animation = js.native
  /**
    * Resume all paused animations.
    */
  def resumeAll(): AnimationManager = js.native
  def staggerPlay[G /* <: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject] */](key: java.lang.String, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): G = js.native
  def staggerPlay[G /* <: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject] */](
    key: java.lang.String,
    children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject],
    stagger: scala.Double
  ): G = js.native
  /**
    * Takes an array of Game Objects that have an Animation Component and then
    * starts the given animation playing on them, each one offset by the
    * `stagger` amount given to this method.
    * @param key The key of the animation to play on the Game Objects.
    * @param children An array of Game Objects to play the animation on. They must have an Animation Component.
    * @param stagger The amount of time, in milliseconds, to offset each play time by. Default 0.
    */
  def staggerPlay[G /* <: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject] */](key: java.lang.String, children: phaserLib.PhaserNs.GameObjectsNs.GameObject): G = js.native
  def staggerPlay[G /* <: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject] */](
    key: java.lang.String,
    children: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    stagger: scala.Double
  ): G = js.native
  /**
    * Get the animation data as javascript object by giving key, or get the data of all animations as array of objects, if key wasn't provided.
    * @param key [description]
    */
  def toJSON(key: java.lang.String): phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimations = js.native
}

