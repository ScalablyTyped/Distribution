package typings.phaser.Phaser

import typings.phaser.Phaser.Animations.AnimationManager
import typings.phaser.Phaser.Cache.CacheManager
import typings.phaser.Phaser.Cameras.Scene2D.CameraManager
import typings.phaser.Phaser.Data.DataManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.DisplayList
import typings.phaser.Phaser.GameObjects.GameObjectCreator
import typings.phaser.Phaser.GameObjects.GameObjectFactory
import typings.phaser.Phaser.GameObjects.UpdateList
import typings.phaser.Phaser.Plugins.PluginManager
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Sound.HTML5AudioSoundManager
import typings.phaser.Phaser.Sound.NoAudioSoundManager
import typings.phaser.Phaser.Sound.WebAudioSoundManager
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Scenes.SceneTransitionConfig
import typings.phaser.Phaser.Types.Scenes.SceneType
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scenes {
  
  /**
    * The Scene Manager.
    * 
    * The Scene Manager is a Game level system, responsible for creating, processing and updating all of the
    * Scenes in a Game instance.
    * 
    * You should not usually interact directly with the Scene Manager at all. Instead, you should use
    * the Scene Plugin, which is available from every Scene in your game via the `this.scene` property.
    * 
    * Using methods in this Scene Manager directly will break queued operations and can cause runtime
    * errors. Instead, go via the Scene Plugin. Every feature this Scene Manager provides is also
    * available via the Scene Plugin.
    */
  @js.native
  trait SceneManager extends StObject {
    
    /**
      * Adds a new Scene into the SceneManager.
      * You must give each Scene a unique key by which you'll identify it.
      * 
      * The `sceneConfig` can be:
      * 
      * * A `Phaser.Scene` object, or an object that extends it.
      * * A plain JavaScript object
      * * A JavaScript ES6 Class that extends `Phaser.Scene`
      * * A JavaScript ES5 prototype based Class
      * * A JavaScript function
      * 
      * If a function is given then a new Scene will be created by calling it.
      * @param key A unique key used to reference the Scene, i.e. `MainMenu` or `Level1`.
      * @param sceneConfig The config for the Scene
      * @param autoStart If `true` the Scene will be started immediately after being added. Default false.
      * @param data Optional data object. This will be set as `Scene.settings.data` and passed to `Scene.init`, and `Scene.create`.
      */
    def add(key: String, sceneConfig: SceneType): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Boolean): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Boolean, data: js.Object): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Unit, data: js.Object): Scene | Null = js.native
    
    /**
      * Brings a Scene to the top of the Scenes list.
      * 
      * This means it will render above all other Scenes.
      * @param key The Scene to move.
      */
    def bringToTop[T /* <: Scene */](key: T): this.type = js.native
    def bringToTop[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Do any of the Cameras in any of the Scenes require a custom viewport?
      * If not we can skip scissor tests.
      */
    var customViewports: Double = js.native
    
    /**
      * Destroy this Scene Manager and all of its systems.
      * 
      * This process cannot be reversed.
      * 
      * This method is called automatically when a Phaser Game instance is destroyed.
      */
    def destroy(): Unit = js.native
    
    /**
      * Dumps debug information about each Scene to the developer console.
      */
    def dump(): Unit = js.native
    
    /**
      * The Game that this SceneManager belongs to.
      */
    var game: Game = js.native
    
    /**
      * Retrieves a Scene by numeric index.
      * @param index The index of the Scene to retrieve.
      */
    def getAt[T /* <: Scene */](index: Double): T = js.native
    
    /**
      * Retrieves the numeric index of a Scene.
      * @param key The key of the Scene.
      */
    def getIndex[T /* <: Scene */](key: T): Double = js.native
    def getIndex[T /* <: Scene */](key: String): Double = js.native
    
    /**
      * Retrieves a Scene based on the given key.
      * 
      * If an actual Scene is passed to this method, it can be used to check if
      * its currently within the Scene Manager, or not.
      * @param key The key of the Scene to retrieve.
      */
    def getScene[T /* <: Scene */](key: T): T = js.native
    def getScene[T /* <: Scene */](key: String): T = js.native
    
    /**
      * Returns an array of all the current Scenes being managed by this Scene Manager.
      * 
      * You can filter the output by the active state of the Scene and choose to have
      * the array returned in normal or reversed order.
      * @param isActive Only include Scene's that are currently active? Default true.
      * @param inReverse Return the array of Scenes in reverse? Default false.
      */
    def getScenes[T /* <: js.Array[Scene] */](): T = js.native
    def getScenes[T /* <: js.Array[Scene] */](isActive: Boolean): T = js.native
    def getScenes[T /* <: js.Array[Scene] */](isActive: Boolean, inReverse: Boolean): T = js.native
    def getScenes[T /* <: js.Array[Scene] */](isActive: Unit, inReverse: Boolean): T = js.native
    
    /**
      * Determines whether a Scene is running.
      * @param key The Scene to check.
      */
    def isActive[T /* <: Scene */](key: T): Boolean = js.native
    def isActive[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Has the Scene Manager properly started?
      */
    val isBooted: Boolean = js.native
    
    /**
      * Determines whether a Scene is paused.
      * @param key The Scene to check.
      */
    def isPaused[T /* <: Scene */](key: T): Boolean = js.native
    def isPaused[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Is the Scene Manager actively processing the Scenes list?
      */
    val isProcessing: Boolean = js.native
    
    /**
      * Determines whether a Scene is sleeping.
      * @param key The Scene to check.
      */
    def isSleeping[T /* <: Scene */](key: T): Boolean = js.native
    def isSleeping[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Determines whether a Scene is visible.
      * @param key The Scene to check.
      */
    def isVisible[T /* <: Scene */](key: T): Boolean = js.native
    def isVisible[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * An object that maps the keys to the scene so we can quickly get a scene from a key without iteration.
      */
    var keys: Record[String, Scene] = js.native
    
    /**
      * Moves a Scene so it is immediately above another Scene in the Scenes list.
      * 
      * This means it will render over the top of the other Scene.
      * @param keyA The Scene that Scene B will be moved above.
      * @param keyB The Scene to be moved.
      */
    def moveAbove[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Moves a Scene so it is immediately below another Scene in the Scenes list.
      * 
      * This means it will render behind the other Scene.
      * @param keyA The Scene that Scene B will be moved below.
      * @param keyB The Scene to be moved.
      */
    def moveBelow[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Moves a Scene down one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveDown[T /* <: Scene */](key: T): this.type = js.native
    def moveDown[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Moves a Scene up one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveUp[T /* <: Scene */](key: T): this.type = js.native
    def moveUp[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Pauses the given Scene.
      * @param key The Scene to pause.
      * @param data An optional data object that will be passed to the Scene and emitted by its pause event.
      */
    def pause[T /* <: Scene */](key: T): this.type = js.native
    def pause[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def pause[T /* <: Scene */](key: String): this.type = js.native
    def pause[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * Process the Scene operations queue.
      */
    def processQueue(): Unit = js.native
    
    /**
      * Removes a Scene from the SceneManager.
      * 
      * The Scene is removed from the local scenes array, it's key is cleared from the keys
      * cache and Scene.Systems.destroy is then called on it.
      * 
      * If the SceneManager is processing the Scenes when this method is called it will
      * queue the operation for the next update sequence.
      * @param key A unique key used to reference the Scene, i.e. `MainMenu` or `Level1`.
      */
    def remove(key: String): this.type = js.native
    
    /**
      * Renders the Scenes.
      * @param renderer The renderer to use.
      */
    def render(renderer: CanvasRenderer): Unit = js.native
    def render(renderer: WebGLRenderer): Unit = js.native
    
    /**
      * Resumes the given Scene.
      * @param key The Scene to resume.
      * @param data An optional data object that will be passed to the Scene and emitted by its resume event.
      */
    def resume[T /* <: Scene */](key: T): this.type = js.native
    def resume[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def resume[T /* <: Scene */](key: String): this.type = js.native
    def resume[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * Runs the given Scene.
      * 
      * If the given Scene is paused, it will resume it. If sleeping, it will wake it.
      * If not running at all, it will be started.
      * 
      * Use this if you wish to open a modal Scene by calling `pause` on the current
      * Scene, then `run` on the modal Scene.
      * @param key The Scene to run.
      * @param data A data object that will be passed to the Scene on start, wake, or resume.
      */
    def run[T /* <: Scene */](key: T): this.type = js.native
    def run[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def run[T /* <: Scene */](key: String): this.type = js.native
    def run[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * The array in which all of the scenes are kept.
      */
    var scenes: js.Array[Scene] = js.native
    
    /**
      * Sends a Scene to the back of the Scenes list.
      * 
      * This means it will render below all other Scenes.
      * @param key The Scene to move.
      */
    def sendToBack[T /* <: Scene */](key: T): this.type = js.native
    def sendToBack[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Puts the given Scene to sleep.
      * @param key The Scene to put to sleep.
      * @param data An optional data object that will be passed to the Scene and emitted by its sleep event.
      */
    def sleep[T /* <: Scene */](key: T): this.type = js.native
    def sleep[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def sleep[T /* <: Scene */](key: String): this.type = js.native
    def sleep[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * Starts the given Scene, if it is not starting, loading, or creating.
      * 
      * If the Scene is running, paused, or sleeping, it will be shutdown and then started.
      * @param key The Scene to start.
      * @param data Optional data object to pass to `Scene.Settings` and `Scene.init`, and `Scene.create`.
      */
    def start[T /* <: Scene */](key: T): this.type = js.native
    def start[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def start[T /* <: Scene */](key: String): this.type = js.native
    def start[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * Stops the given Scene.
      * @param key The Scene to stop.
      * @param data Optional data object to pass to Scene.shutdown.
      */
    def stop[T /* <: Scene */](key: T): this.type = js.native
    def stop[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def stop[T /* <: Scene */](key: String): this.type = js.native
    def stop[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * Swaps the positions of two Scenes in the Scenes list.
      * @param keyA The first Scene to swap.
      * @param keyB The second Scene to swap.
      */
    def swapPosition[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Sleeps one one Scene and starts the other.
      * @param from The Scene to sleep.
      * @param to The Scene to start.
      */
    def switch[T /* <: Scene */](from: T, to: T): this.type = js.native
    def switch[T /* <: Scene */](from: T, to: String): this.type = js.native
    def switch[T /* <: Scene */](from: String, to: T): this.type = js.native
    def switch[T /* <: Scene */](from: String, to: String): this.type = js.native
    
    /**
      * This system Scene is created during `bootQueue` and is a default
      * empty Scene that lives outside of the Scene list, but can be used
      * by plugins and managers that need access to a live Scene, without
      * being tied to one.
      */
    var systemScene: Scene = js.native
    
    /**
      * Updates the Scenes.
      * @param time Time elapsed.
      * @param delta Delta time from the last update.
      */
    def update(time: Double, delta: Double): Unit = js.native
    
    /**
      * Awakens the given Scene.
      * @param key The Scene to wake up.
      * @param data An optional data object that will be passed to the Scene and emitted by its wake event.
      */
    def wake[T /* <: Scene */](key: T): this.type = js.native
    def wake[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def wake[T /* <: Scene */](key: String): this.type = js.native
    def wake[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
  }
  
  /**
    * The Scene Plugin is the main interface to the Scene Manager and allows you to control
    * any Scene running in your game. You should always use this plugin. By default, it is
    * mapped to the Scene property `this.scene`. Meaning, from within a Scene, you can call
    * methods such as `this.scene.start()`.
    * 
    * Note that nearly all methods in this class are run on a queue-basis and not
    * immediately. For example, calling `this.scene.launch('SceneB')` will try to
    * launch SceneB when the Scene Manager next updates, which is at the start of the game
    * step. All operations are queued and run in the order in which they are invoked here.
    */
  @js.native
  trait ScenePlugin extends StObject {
    
    /**
      * Add the Scene into the Scene Manager and start it if 'autoStart' is true or the Scene config 'active' property is set.
      * @param key A unique key used to reference the Scene, i.e. `MainMenu` or `Level1`.
      * @param sceneConfig The config for the Scene
      * @param autoStart If `true` the Scene will be started immediately after being added. Default false.
      * @param data Optional data object. This will be set as `Scene.settings.data` and passed to `Scene.init`, and `Scene.create`.
      */
    def add(key: String, sceneConfig: SceneType): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Boolean): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Boolean, data: js.Object): Scene | Null = js.native
    def add(key: String, sceneConfig: SceneType, autoStart: Unit, data: js.Object): Scene | Null = js.native
    
    /**
      * Brings a Scene to the top of the Scenes list.
      * 
      * This means it will render above all other Scenes.
      * @param key The Scene to move.
      */
    def bringToTop[T /* <: Scene */](): this.type = js.native
    def bringToTop[T /* <: Scene */](key: T): this.type = js.native
    def bringToTop[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Retrieve a Scene.
      * @param key The Scene to retrieve.
      */
    def get[T /* <: Scene */](key: T): T = js.native
    def get[T /* <: Scene */](key: String): T = js.native
    
    /**
      * Retrieves the numeric index of a Scene in the Scenes list.
      * @param key The Scene to get the index of.
      */
    def getIndex[T /* <: Scene */](): Double = js.native
    def getIndex[T /* <: Scene */](key: T): Double = js.native
    def getIndex[T /* <: Scene */](key: String): Double = js.native
    
    /**
      * Return the status of the Scene.
      * @param key The Scene to get the status from.
      */
    def getStatus[T /* <: Scene */](key: T): Double = js.native
    def getStatus[T /* <: Scene */](key: String): Double = js.native
    
    /**
      * Checks if the given Scene is running or not?
      * @param key The Scene to check.
      */
    def isActive[T /* <: Scene */](): Boolean = js.native
    def isActive[T /* <: Scene */](key: T): Boolean = js.native
    def isActive[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Checks if the given Scene is paused or not?
      * @param key The Scene to check.
      */
    def isPaused[T /* <: Scene */](): Boolean = js.native
    def isPaused[T /* <: Scene */](key: T): Boolean = js.native
    def isPaused[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Checks if the given Scene is sleeping or not?
      * @param key The Scene to check.
      */
    def isSleeping[T /* <: Scene */](): Boolean = js.native
    def isSleeping[T /* <: Scene */](key: T): Boolean = js.native
    def isSleeping[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * Checks if the given Scene is visible or not?
      * @param key The Scene to check.
      */
    def isVisible[T /* <: Scene */](): Boolean = js.native
    def isVisible[T /* <: Scene */](key: T): Boolean = js.native
    def isVisible[T /* <: Scene */](key: String): Boolean = js.native
    
    /**
      * The key of the Scene this ScenePlugin belongs to.
      */
    var key: String = js.native
    
    /**
      * Launch the given Scene and run it in parallel with this one.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to launch.
      * @param data The Scene data.
      */
    def launch[T /* <: Scene */](key: T): this.type = js.native
    def launch[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def launch[T /* <: Scene */](key: String): this.type = js.native
    def launch[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * The Game's SceneManager.
      */
    var manager: SceneManager = js.native
    
    /**
      * Swaps the position of two scenes in the Scenes list, so that Scene B is directly above Scene A.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The Scene that Scene B will be moved to be above.
      * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
      */
    def moveAbove[T /* <: Scene */](keyA: T): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: String): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def moveAbove[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Swaps the position of two scenes in the Scenes list, so that Scene B is directly below Scene A.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The Scene that Scene B will be moved to be below.
      * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
      */
    def moveBelow[T /* <: Scene */](keyA: T): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: String): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def moveBelow[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Moves a Scene down one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveDown[T /* <: Scene */](): this.type = js.native
    def moveDown[T /* <: Scene */](key: T): this.type = js.native
    def moveDown[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Moves a Scene up one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveUp[T /* <: Scene */](): this.type = js.native
    def moveUp[T /* <: Scene */](key: T): this.type = js.native
    def moveUp[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Pause the Scene - this stops the update step from happening but it still renders.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to pause.
      * @param data An optional data object that will be passed to the Scene and emitted in its pause event.
      */
    def pause[T /* <: Scene */](): this.type = js.native
    def pause[T /* <: Scene */](key: T): this.type = js.native
    def pause[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def pause[T /* <: Scene */](key: String): this.type = js.native
    def pause[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    def pause[T /* <: Scene */](key: Unit, data: js.Object): this.type = js.native
    
    /**
      * Removes a Scene from the SceneManager.
      * 
      * The Scene is removed from the local scenes array, it's key is cleared from the keys
      * cache and Scene.Systems.destroy is then called on it.
      * 
      * If the SceneManager is processing the Scenes when this method is called it will
      * queue the operation for the next update sequence.
      * @param key The Scene to be removed.
      */
    def remove[T /* <: Scene */](): this.type = js.native
    def remove[T /* <: Scene */](key: T): this.type = js.native
    def remove[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Restarts this Scene.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param data The Scene data. If no value is given it will not overwrite any previous data that may exist.
      */
    def restart(): this.type = js.native
    def restart(data: js.Object): this.type = js.native
    
    /**
      * Resume the Scene - starts the update loop again.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to resume.
      * @param data An optional data object that will be passed to the Scene and emitted in its resume event.
      */
    def resume[T /* <: Scene */](): this.type = js.native
    def resume[T /* <: Scene */](key: T): this.type = js.native
    def resume[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def resume[T /* <: Scene */](key: String): this.type = js.native
    def resume[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    def resume[T /* <: Scene */](key: Unit, data: js.Object): this.type = js.native
    
    /**
      * Runs the given Scene, but does not change the state of this Scene.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * 
      * If the given Scene is paused, it will resume it. If sleeping, it will wake it.
      * If not running at all, it will be started.
      * 
      * Use this if you wish to open a modal Scene by calling `pause` on the current
      * Scene, then `run` on the modal Scene.
      * @param key The Scene to run.
      * @param data A data object that will be passed to the Scene and emitted in its ready, wake, or resume events.
      */
    def run[T /* <: Scene */](key: T): this.type = js.native
    def run[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def run[T /* <: Scene */](key: String): this.type = js.native
    def run[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    
    /**
      * The Scene that this ScenePlugin belongs to.
      */
    var scene: Scene = js.native
    
    /**
      * Sends a Scene to the back of the Scenes list.
      * 
      * This means it will render below all other Scenes.
      * @param key The Scene to move.
      */
    def sendToBack[T /* <: Scene */](): this.type = js.native
    def sendToBack[T /* <: Scene */](key: T): this.type = js.native
    def sendToBack[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * Sets the active state of the given Scene.
      * @param value If `true` the Scene will be resumed. If `false` it will be paused.
      * @param key The Scene to set the active state of.
      * @param data An optional data object that will be passed to the Scene and emitted with its events.
      */
    def setActive[T /* <: Scene */](value: Boolean): this.type = js.native
    def setActive[T /* <: Scene */](value: Boolean, key: T): this.type = js.native
    def setActive[T /* <: Scene */](value: Boolean, key: T, data: js.Object): this.type = js.native
    def setActive[T /* <: Scene */](value: Boolean, key: String): this.type = js.native
    def setActive[T /* <: Scene */](value: Boolean, key: String, data: js.Object): this.type = js.native
    def setActive[T /* <: Scene */](value: Boolean, key: Unit, data: js.Object): this.type = js.native
    
    /**
      * Sets the visible state of the given Scene.
      * @param value The visible value.
      * @param key The Scene to set the visible state for.
      */
    def setVisible[T /* <: Scene */](value: Boolean): this.type = js.native
    def setVisible[T /* <: Scene */](value: Boolean, key: T): this.type = js.native
    def setVisible[T /* <: Scene */](value: Boolean, key: String): this.type = js.native
    
    /**
      * The settings of the Scene this ScenePlugin belongs to.
      */
    var settings: SettingsObject = js.native
    
    /**
      * Makes the Scene sleep (no update, no render) but doesn't shutdown.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to put to sleep.
      * @param data An optional data object that will be passed to the Scene and emitted in its sleep event.
      */
    def sleep[T /* <: Scene */](): this.type = js.native
    def sleep[T /* <: Scene */](key: T): this.type = js.native
    def sleep[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def sleep[T /* <: Scene */](key: String): this.type = js.native
    def sleep[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    def sleep[T /* <: Scene */](key: Unit, data: js.Object): this.type = js.native
    
    /**
      * Shutdown this Scene and run the given one.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to start.
      * @param data The Scene data. If no value is given it will not overwrite any previous data that may exist.
      */
    def start[T /* <: Scene */](): this.type = js.native
    def start[T /* <: Scene */](key: T): this.type = js.native
    def start[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def start[T /* <: Scene */](key: String): this.type = js.native
    def start[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    def start[T /* <: Scene */](key: Unit, data: js.Object): this.type = js.native
    
    /**
      * Shutdown the Scene, clearing display list, timers, etc.
      * 
      * This happens at the next Scene Manager update, not immediately.
      * @param key The Scene to stop.
      * @param data Optional data object to pass to Scene.Systems.shutdown.
      */
    def stop[T /* <: Scene */](): this.type = js.native
    def stop[T /* <: Scene */](key: T): this.type = js.native
    def stop[T /* <: Scene */](key: T, data: Any): this.type = js.native
    def stop[T /* <: Scene */](key: String): this.type = js.native
    def stop[T /* <: Scene */](key: String, data: Any): this.type = js.native
    def stop[T /* <: Scene */](key: Unit, data: Any): this.type = js.native
    
    /**
      * Swaps the position of two scenes in the Scenes list.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The first Scene to swap.
      * @param keyB The second Scene to swap. If none is given it defaults to this Scene.
      */
    def swapPosition[T /* <: Scene */](keyA: T): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: T, keyB: T): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: T, keyB: String): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: String): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: String, keyB: T): this.type = js.native
    def swapPosition[T /* <: Scene */](keyA: String, keyB: String): this.type = js.native
    
    /**
      * Makes this Scene sleep then starts the Scene given.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to start.
      */
    def switch[T /* <: Scene */](key: T): this.type = js.native
    def switch[T /* <: Scene */](key: String): this.type = js.native
    
    /**
      * The Scene Systems instance of the Scene that this ScenePlugin belongs to.
      */
    var systems: Systems = js.native
    
    /**
      * This will start a transition from the current Scene to the target Scene given.
      * 
      * The target Scene cannot be the same as the current Scene.
      * 
      * The transition will last for the duration specified in milliseconds.
      * 
      * You can have the target Scene moved above or below this one in the display list.
      * 
      * You can specify an update callback. This callback will be invoked _every frame_ for the duration
      * of the transition.
      * 
      * This Scene can either be sent to sleep at the end of the transition, or stopped. The default is to stop.
      * 
      * There are also 5 transition related events: This scene will emit the event `transitionout` when
      * the transition begins, which is typically the frame after calling this method.
      * 
      * The target Scene will emit the event `transitioninit` when that Scene's `init` method is called.
      * It will then emit the event `transitionstart` when its `create` method is called.
      * If the Scene was sleeping and has been woken up, it will emit the event `transitionwake` instead of these two,
      * as the Scenes `init` and `create` methods are not invoked when a Scene wakes up.
      * 
      * When the duration of the transition has elapsed it will emit the event `transitioncomplete`.
      * These events are cleared of all listeners when the Scene shuts down, but not if it is sent to sleep.
      * 
      * It's important to understand that the duration of the transition begins the moment you call this method.
      * If the Scene you are transitioning to includes delayed processes, such as waiting for files to load, the
      * time still counts down even while that is happening. If the game itself pauses, or something else causes
      * this Scenes update loop to stop, then the transition will also pause for that duration. There are
      * checks in place to prevent you accidentally stopping a transitioning Scene but if you've got code to
      * override this understand that until the target Scene completes it might never be unlocked for input events.
      * @param config The transition configuration object.
      */
    def transition(config: SceneTransitionConfig): Boolean = js.native
    
    /**
      * If this Scene is currently transitioning to another, this holds
      * the current percentage of the transition progress, between 0 and 1.
      */
    var transitionProgress: Double = js.native
    
    /**
      * Makes the Scene wake-up (starts update and render)
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to wake up.
      * @param data An optional data object that will be passed to the Scene and emitted in its wake event.
      */
    def wake[T /* <: Scene */](): this.type = js.native
    def wake[T /* <: Scene */](key: T): this.type = js.native
    def wake[T /* <: Scene */](key: T, data: js.Object): this.type = js.native
    def wake[T /* <: Scene */](key: String): this.type = js.native
    def wake[T /* <: Scene */](key: String, data: js.Object): this.type = js.native
    def wake[T /* <: Scene */](key: Unit, data: js.Object): this.type = js.native
  }
  
  /**
    * The Scene Systems class.
    * 
    * This class is available from within a Scene under the property `sys`.
    * It is responsible for managing all of the plugins a Scene has running, including the display list, and
    * handling the update step and renderer. It also contains references to global systems belonging to Game.
    */
  @js.native
  trait Systems extends StObject {
    
    /**
      * A reference to the Scene's Game Object Factory.
      * 
      * Use this to quickly and easily create new Game Object's.
      * 
      * In the default set-up you can access this from within a Scene via the `this.add` property.
      */
    var add: GameObjectFactory = js.native
    
    /**
      * A reference to the global Animations Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.anims` property.
      */
    var anims: AnimationManager = js.native
    
    /**
      * A reference to the global Cache. The Cache stores all files bought in to Phaser via
      * the Loader, with the exception of images. Images are stored in the Texture Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.cache` property.
      */
    var cache: CacheManager = js.native
    
    /**
      * A reference to the Scene's Camera Manager.
      * 
      * Use this to manipulate and create Cameras for this specific Scene.
      * 
      * In the default set-up you can access this from within a Scene via the `this.cameras` property.
      */
    var cameras: CameraManager = js.native
    
    /**
      * Can this Scene receive Input events?
      */
    def canInput(): Boolean = js.native
    
    /**
      * A handy reference to the Scene canvas / context.
      */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * The Scene Configuration object, as passed in when creating the Scene.
      */
    var config: String | SettingsConfig = js.native
    
    /**
      * A reference to the Canvas Rendering Context being used by the renderer.
      */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * Immediately sorts the display list if the flag is set.
      */
    def depthSort(): Unit = js.native
    
    /**
      * A reference to the Scene's Display List.
      * 
      * Use this to organize the children contained in the display list.
      * 
      * In the default set-up you can access this from within a Scene via the `this.children` property.
      */
    var displayList: DisplayList = js.native
    
    /**
      * A reference to the Scene's Event Manager.
      * 
      * Use this to listen for Scene specific events, such as `pause` and `shutdown`.
      * 
      * In the default set-up you can access this from within a Scene via the `this.events` property.
      */
    var events: EventEmitter = js.native
    
    /**
      * The Facebook Instant Games Plugin.
      */
    var facebook: FacebookInstantGamesPlugin = js.native
    
    /**
      * A reference to the Phaser Game instance.
      */
    var game: Game = js.native
    
    /**
      * Returns any data that was sent to this Scene by another Scene.
      * 
      * The data is also passed to `Scene.init` and in various Scene events, but
      * you can access it at any point via this method.
      */
    def getData(): Any = js.native
    
    /**
      * Returns the current status of this Scene.
      */
    def getStatus(): Double = js.native
    
    /**
      * This method is called only once by the Scene Manager when the Scene is instantiated.
      * It is responsible for setting up all of the Scene plugins and references.
      * It should never be called directly.
      * @param game A reference to the Phaser Game instance.
      */
    /* protected */ def init(game: Game): Unit = js.native
    
    /**
      * Is this Scene running?
      */
    def isActive(): Boolean = js.native
    
    /**
      * Is this Scene paused?
      */
    def isPaused(): Boolean = js.native
    
    /**
      * Is this Scene sleeping?
      */
    def isSleeping(): Boolean = js.native
    
    /**
      * Is this Scene currently transitioning in from another Scene?
      */
    def isTransitionIn(): Boolean = js.native
    
    /**
      * Is this Scene currently transitioning out from itself to another Scene?
      */
    def isTransitionOut(): Boolean = js.native
    
    /**
      * Is this Scene currently transitioning out to, or in from another Scene?
      */
    def isTransitioning(): Boolean = js.native
    
    /**
      * Is this Scene visible and rendering?
      */
    def isVisible(): Boolean = js.native
    
    /**
      * A reference to the Scene's Game Object Creator.
      * 
      * Use this to quickly and easily create new Game Object's. The difference between this and the
      * Game Object Factory, is that the Creator just creates and returns Game Object instances, it
      * doesn't then add them to the Display List or Update List.
      * 
      * In the default set-up you can access this from within a Scene via the `this.make` property.
      */
    var make: GameObjectCreator = js.native
    
    /**
      * Pause this Scene.
      * 
      * A paused Scene still renders, it just doesn't run any of its update handlers or systems.
      * @param data A data object that will be passed in the 'pause' event.
      */
    def pause(): Systems = js.native
    def pause(data: js.Object): Systems = js.native
    
    /**
      * A reference to the global Plugins Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.plugins` property.
      */
    var plugins: PluginManager = js.native
    
    /**
      * Force a sort of the display list on the next render.
      */
    def queueDepthSort(): Unit = js.native
    
    /**
      * A reference to the global registry. This is a game-wide instance of the Data Manager, allowing
      * you to exchange data between Scenes via a universal and shared point.
      * 
      * In the default set-up you can access this from within a Scene via the `this.registry` property.
      */
    var registry: DataManager = js.native
    
    /**
      * Called automatically by the Scene Manager.
      * Instructs the Scene to render itself via its Camera Manager to the renderer given.
      * @param renderer The renderer that invoked the render call.
      */
    def render(renderer: CanvasRenderer): Unit = js.native
    def render(renderer: WebGLRenderer): Unit = js.native
    
    /**
      * A reference to either the Canvas or WebGL Renderer that this Game is using.
      */
    var renderer: CanvasRenderer | WebGLRenderer = js.native
    
    /**
      * Resume this Scene from a paused state.
      * @param data A data object that will be passed in the 'resume' event.
      */
    def resume(): Systems = js.native
    def resume(data: js.Object): Systems = js.native
    
    /**
      * A reference to the global Scale Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.scale` property.
      */
    var scale: ScaleManager = js.native
    
    /**
      * A reference to the Scene that these Systems belong to.
      */
    var scene: Scene = js.native
    
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
      * Set the active state of this Scene.
      * 
      * An active Scene will run its core update loop.
      * @param value If `true` the Scene will be resumed, if previously paused. If `false` it will be paused.
      * @param data A data object that will be passed in the 'resume' or 'pause' events.
      */
    def setActive(value: Boolean): Systems = js.native
    def setActive(value: Boolean, data: js.Object): Systems = js.native
    
    /**
      * Sets the visible state of this Scene.
      * An invisible Scene will not render, but will still process updates.
      * @param value `true` to render this Scene, otherwise `false`.
      */
    def setVisible(value: Boolean): Systems = js.native
    
    /**
      * The Scene Settings. This is the parsed output based on the Scene configuration.
      */
    var settings: SettingsObject = js.native
    
    /**
      * Shutdown this Scene and send a shutdown event to all of its systems.
      * A Scene that has been shutdown will not run its update loop or render, but it does
      * not destroy any of its plugins or references. It is put into hibernation for later use.
      * If you don't ever plan to use this Scene again, then it should be destroyed instead
      * to free-up resources.
      * @param data A data object that will be passed in the 'shutdown' event.
      */
    def shutdown(): Unit = js.native
    def shutdown(data: js.Object): Unit = js.native
    
    /**
      * Send this Scene to sleep.
      * 
      * A sleeping Scene doesn't run its update step or render anything, but it also isn't shut down
      * or has any of its systems or children removed, meaning it can be re-activated at any point and
      * will carry on from where it left off. It also keeps everything in memory and events and callbacks
      * from other Scenes may still invoke changes within it, so be careful what is left active.
      * @param data A data object that will be passed in the 'sleep' event.
      */
    def sleep(): Systems = js.native
    def sleep(data: js.Object): Systems = js.native
    
    /**
      * A reference to the global Sound Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.sound` property.
      */
    var sound: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager = js.native
    
    /**
      * Start this Scene running and rendering.
      * Called automatically by the SceneManager.
      * @param data Optional data object that may have been passed to this Scene from another.
      */
    def start(data: js.Object): Unit = js.native
    
    /**
      * A single game step. Called automatically by the Scene Manager as a result of a Request Animation
      * Frame or Set Timeout call to the main Game instance.
      * @param time The time value from the most recent Game step. Typically a high-resolution timer value, or Date.now().
      * @param delta The delta value since the last frame. This is smoothed to avoid delta spikes by the TimeStep class.
      */
    def step(time: Double, delta: Double): Unit = js.native
    
    /**
      * A reference to the global Texture Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.textures` property.
      */
    var textures: TextureManager = js.native
    
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
    var updateList: UpdateList = js.native
    
    /**
      * Wake-up this Scene if it was previously asleep.
      * @param data A data object that will be passed in the 'wake' event.
      */
    def wake(): Systems = js.native
    def wake(data: js.Object): Systems = js.native
  }
}
