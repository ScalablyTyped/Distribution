package typings
package phaserLib.PhaserNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Scene Systems class.
  * 
  * This class is available from within a Scene under the property `sys`.
  * It is responsible for managing all of the plugins a Scene has running, including the display list, and
  * handling the update step and renderer. It also contains references to global systems belonging to Game.
  */
@JSGlobal("Phaser.Scenes.Systems")
@js.native
class Systems protected () extends js.Object {
  /**
    * 
    * @param scene The Scene that owns this Systems instance.
    * @param config Scene specific configuration settings.
    */
  def this(scene: phaserLib.PhaserNs.Scene, config: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig) = this()
  /**
    * A reference to the Scene's Game Object Factory.
    * 
    * Use this to quickly and easily create new Game Object's.
    * 
    * In the default set-up you can access this from within a Scene via the `this.add` property.
    */
  var add: phaserLib.PhaserNs.GameObjectsNs.GameObjectFactory = js.native
  /**
    * A reference to the global Animations Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.anims` property.
    */
  var anims: phaserLib.PhaserNs.AnimationsNs.AnimationManager = js.native
  /**
    * A reference to the global Cache. The Cache stores all files bought in to Phaser via
    * the Loader, with the exception of images. Images are stored in the Texture Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.cache` property.
    */
  var cache: phaserLib.PhaserNs.CacheNs.CacheManager = js.native
  /**
    * A reference to the Scene's Camera Manager.
    * 
    * Use this to manipulate and create Cameras for this specific Scene.
    * 
    * In the default set-up you can access this from within a Scene via the `this.cameras` property.
    */
  var cameras: phaserLib.PhaserNs.CamerasNs.Scene2DNs.CameraManager = js.native
  /**
    * A handy reference to the Scene canvas / context.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The Scene Configuration object, as passed in when creating the Scene.
    */
  var config: java.lang.String | phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig = js.native
  /**
    * A reference to the Canvas Rendering Context being used by the renderer.
    */
  var context: stdLib.CanvasRenderingContext2D = js.native
  /**
    * A reference to the Scene's Display List.
    * 
    * Use this to organize the children contained in the display list.
    * 
    * In the default set-up you can access this from within a Scene via the `this.children` property.
    */
  var displayList: phaserLib.PhaserNs.GameObjectsNs.DisplayList = js.native
  /**
    * A reference to the Scene's Event Manager.
    * 
    * Use this to listen for Scene specific events, such as `pause` and `shutdown`.
    * 
    * In the default set-up you can access this from within a Scene via the `this.events` property.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * The Facebook Instant Games Plugin.
    */
  var facebook: phaserLib.PhaserNs.FacebookInstantGamesPlugin = js.native
  /**
    * A reference to the Phaser Game instance.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * A reference to the Scene's Game Object Creator.
    * 
    * Use this to quickly and easily create new Game Object's. The difference between this and the
    * Game Object Factory, is that the Creator just creates and returns Game Object instances, it
    * doesn't then add them to the Display List or Update List.
    * 
    * In the default set-up you can access this from within a Scene via the `this.make` property.
    */
  var make: phaserLib.PhaserNs.GameObjectsNs.GameObjectCreator = js.native
  /**
    * A reference to the global Plugins Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.plugins` property.
    */
  var plugins: phaserLib.PhaserNs.PluginsNs.PluginManager = js.native
  /**
    * A reference to the global registry. This is a game-wide instance of the Data Manager, allowing
    * you to exchange data between Scenes via a universal and shared point.
    * 
    * In the default set-up you can access this from within a Scene via the `this.registry` property.
    */
  var registry: phaserLib.PhaserNs.DataNs.DataManager = js.native
  /**
    * A reference to either the Canvas or WebGL Renderer that this Game is using.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * A reference to the global Scale Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.scale` property.
    */
  var scale: phaserLib.PhaserNs.ScaleNs.ScaleManager = js.native
  /**
    * A reference to the Scene that these Systems belong to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene Manager Plugin.
    * 
    * Use this to manipulate both this and other Scene's in your game, for example to launch a parallel Scene,
    * or pause or resume a Scene, or switch from this Scene to another.
    * 
    * In the default set-up you can access this from within a Scene via the `this.scene` property.
    */
  var scenePlugin: ScenePlugin = js.native
  /**
    * The Scene Settings. This is the parsed output based on the Scene configuration.
    */
  var settings: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsObject = js.native
  /**
    * A reference to the global Sound Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.sound` property.
    */
  var sound: phaserLib.PhaserNs.SoundNs.BaseSoundManager = js.native
  /**
    * A reference to the global Texture Manager.
    * 
    * In the default set-up you can access this from within a Scene via the `this.textures` property.
    */
  var textures: phaserLib.PhaserNs.TexturesNs.TextureManager = js.native
  /**
    * A reference to the Scene's Update List.
    * 
    * Use this to organize the children contained in the update list.
    * 
    * The Update List is responsible for managing children that need their `preUpdate` methods called,
    * in order to process so internal components, such as Sprites with Animations.
    * 
    * In the default set-up there is no reference to this from within the Scene itself.
    */
  var updateList: phaserLib.PhaserNs.GameObjectsNs.UpdateList = js.native
  /**
    * Immediately sorts the display list if the flag is set.
    */
  def depthSort(): scala.Unit = js.native
  /**
    * This method is called only once by the Scene Manager when the Scene is instantiated.
    * It is responsible for setting up all of the Scene plugins and references.
    * It should never be called directly.
    * @param game A reference to the Phaser Game instance.
    */
  /* protected */ def init(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
  /**
    * Is this Scene running?
    */
  def isActive(): scala.Boolean = js.native
  /**
    * Is this Scene paused?
    */
  def isPaused(): scala.Boolean = js.native
  /**
    * Is this Scene sleeping?
    */
  def isSleeping(): scala.Boolean = js.native
  /**
    * Is this Scene currently transitioning in from another Scene?
    */
  def isTransitionIn(): scala.Boolean = js.native
  /**
    * Is this Scene currently transitioning out from itself to another Scene?
    */
  def isTransitionOut(): scala.Boolean = js.native
  /**
    * Is this Scene currently transitioning out to, or in from another Scene?
    */
  def isTransitioning(): scala.Boolean = js.native
  /**
    * Is this Scene visible and rendering?
    */
  def isVisible(): scala.Boolean = js.native
  /**
    * Pause this Scene.
    * A paused Scene still renders, it just doesn't run ANY of its update handlers or systems.
    * @param data A data object that will be passed in the 'pause' event.
    */
  def pause(): Systems = js.native
  def pause(data: js.Object): Systems = js.native
  /**
    * Force a sort of the display list on the next render.
    */
  def queueDepthSort(): scala.Unit = js.native
  /**
    * Called automatically by the Scene Manager.
    * Instructs the Scene to render itself via its Camera Manager to the renderer given.
    * @param renderer The renderer that invoked the render call.
    */
  def render(renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer): scala.Unit = js.native
  def render(renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer): scala.Unit = js.native
  /**
    * Resume this Scene from a paused state.
    * @param data A data object that will be passed in the 'resume' event.
    */
  def resume(): Systems = js.native
  def resume(data: js.Object): Systems = js.native
  /**
    * Set the active state of this Scene.
    * 
    * An active Scene will run its core update loop.
    * @param value If `true` the Scene will be resumed, if previously paused. If `false` it will be paused.
    * @param data A data object that will be passed in the 'resume' or 'pause' events.
    */
  def setActive(value: scala.Boolean): Systems = js.native
  def setActive(value: scala.Boolean, data: js.Object): Systems = js.native
  /**
    * Sets the visible state of this Scene.
    * An invisible Scene will not render, but will still process updates.
    * @param value `true` to render this Scene, otherwise `false`.
    */
  def setVisible(value: scala.Boolean): Systems = js.native
  /**
    * Shutdown this Scene and send a shutdown event to all of its systems.
    * A Scene that has been shutdown will not run its update loop or render, but it does
    * not destroy any of its plugins or references. It is put into hibernation for later use.
    * If you don't ever plan to use this Scene again, then it should be destroyed instead
    * to free-up resources.
    * @param data A data object that will be passed in the 'shutdown' event.
    */
  def shutdown(): scala.Unit = js.native
  def shutdown(data: js.Object): scala.Unit = js.native
  /**
    * Send this Scene to sleep.
    * 
    * A sleeping Scene doesn't run it's update step or render anything, but it also isn't shut down
    * or have any of its systems or children removed, meaning it can be re-activated at any point and
    * will carry on from where it left off. It also keeps everything in memory and events and callbacks
    * from other Scenes may still invoke changes within it, so be careful what is left active.
    * @param data A data object that will be passed in the 'sleep' event.
    */
  def sleep(): Systems = js.native
  def sleep(data: js.Object): Systems = js.native
  /**
    * Start this Scene running and rendering.
    * Called automatically by the SceneManager.
    * @param data Optional data object that may have been passed to this Scene from another.
    */
  def start(data: js.Object): scala.Unit = js.native
  /**
    * A single game step. Called automatically by the Scene Manager as a result of a Request Animation
    * Frame or Set Timeout call to the main Game instance.
    * @param time The time value from the most recent Game step. Typically a high-resolution timer value, or Date.now().
    * @param delta The delta value since the last frame. This is smoothed to avoid delta spikes by the TimeStep class.
    */
  def step(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Wake-up this Scene if it was previously asleep.
    * @param data A data object that will be passed in the 'wake' event.
    */
  def wake(): Systems = js.native
  def wake(data: js.Object): Systems = js.native
}

