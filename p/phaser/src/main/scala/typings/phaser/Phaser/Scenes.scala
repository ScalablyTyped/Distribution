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
import typings.phaser.Phaser.Types.Scenes.CreateSceneFromObjectConfig
import typings.phaser.Phaser.Types.Scenes.SceneTransitionConfig
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scenes")
@js.native
object Scenes extends js.Object {
  /**
    * The Scene Manager.
    * 
    * The Scene Manager is a Game level system, responsible for creating, processing and updating all of the
    * Scenes in a Game instance.
    */
  @js.native
  trait SceneManager extends js.Object {
    /**
      * Do any of the Cameras in any of the Scenes require a custom viewport?
      * If not we can skip scissor tests.
      */
    var customViewports: Double = js.native
    /**
      * The Game that this SceneManager belongs to.
      */
    var game: Game = js.native
    /**
      * Has the Scene Manager properly started?
      */
    val isBooted: Boolean = js.native
    /**
      * Is the Scene Manager actively processing the Scenes list?
      */
    val isProcessing: Boolean = js.native
    /**
      * An object that maps the keys to the scene so we can quickly get a scene from a key without iteration.
      */
    var keys: js.Object = js.native
    /**
      * The array in which all of the scenes are kept.
      */
    var scenes: js.Array[_] = js.native
    def add(key: String, sceneConfig: js.Function): Scene = js.native
    def add(key: String, sceneConfig: js.Function, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: js.Function, autoStart: Boolean, data: js.Object): Scene = js.native
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
      * @param data Optional data object. This will be set as Scene.settings.data and passed to `Scene.init`.
      */
    def add(key: String, sceneConfig: Scene): Scene = js.native
    def add(key: String, sceneConfig: Scene, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: Scene, autoStart: Boolean, data: js.Object): Scene = js.native
    def add(key: String, sceneConfig: CreateSceneFromObjectConfig): Scene = js.native
    def add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean, data: js.Object): Scene = js.native
    def add(key: String, sceneConfig: SettingsConfig): Scene = js.native
    def add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean, data: js.Object): Scene = js.native
    /**
      * Brings a Scene to the top of the Scenes list.
      * 
      * This means it will render above all other Scenes.
      * @param key The Scene to move.
      */
    def bringToTop(key: String): SceneManager = js.native
    def bringToTop(key: Scene): SceneManager = js.native
    /**
      * Destroy the SceneManager and all of its Scene's systems.
      */
    def destroy(): Unit = js.native
    /**
      * Dumps debug information about each Scene to the developer console.
      */
    def dump(): Unit = js.native
    /**
      * Retrieves a Scene by numeric index.
      * @param index The index of the Scene to retrieve.
      */
    def getAt(index: integer): js.UndefOr[Scene] = js.native
    /**
      * Retrieves the numeric index of a Scene.
      * @param key The key of the Scene.
      */
    def getIndex(key: String): integer = js.native
    def getIndex(key: Scene): integer = js.native
    /**
      * Retrieves a Scene.
      * @param key The Scene to retrieve.
      */
    def getScene(key: String): Scene = js.native
    def getScene(key: Scene): Scene = js.native
    /**
      * Returns an array of all the current Scenes being managed by this Scene Manager.
      * 
      * You can filter the output by the active state of the Scene and choose to have
      * the array returned in normal or reversed order.
      * @param isActive Only include Scene's that are currently active? Default true.
      * @param inReverse Return the array of Scenes in reverse? Default false.
      */
    def getScenes(): js.Array[Scene] = js.native
    def getScenes(isActive: Boolean): js.Array[Scene] = js.native
    def getScenes(isActive: Boolean, inReverse: Boolean): js.Array[Scene] = js.native
    /**
      * Determines whether a Scene is running.
      * @param key The Scene to check.
      */
    def isActive(key: String): Boolean = js.native
    /**
      * Determines whether a Scene is paused.
      * @param key The Scene to check.
      */
    def isPaused(key: String): Boolean = js.native
    /**
      * Determines whether a Scene is sleeping.
      * @param key The Scene to check.
      */
    def isSleeping(key: String): Boolean = js.native
    /**
      * Determines whether a Scene is visible.
      * @param key The Scene to check.
      */
    def isVisible(key: String): Boolean = js.native
    /**
      * Moves a Scene so it is immediately above another Scene in the Scenes list.
      * 
      * This means it will render over the top of the other Scene.
      * @param keyA The Scene that Scene B will be moved above.
      * @param keyB The Scene to be moved.
      */
    def moveAbove(keyA: String, keyB: String): SceneManager = js.native
    def moveAbove(keyA: String, keyB: Scene): SceneManager = js.native
    def moveAbove(keyA: Scene, keyB: String): SceneManager = js.native
    def moveAbove(keyA: Scene, keyB: Scene): SceneManager = js.native
    /**
      * Moves a Scene so it is immediately below another Scene in the Scenes list.
      * 
      * This means it will render behind the other Scene.
      * @param keyA The Scene that Scene B will be moved above.
      * @param keyB The Scene to be moved.
      */
    def moveBelow(keyA: String, keyB: String): SceneManager = js.native
    def moveBelow(keyA: String, keyB: Scene): SceneManager = js.native
    def moveBelow(keyA: Scene, keyB: String): SceneManager = js.native
    def moveBelow(keyA: Scene, keyB: Scene): SceneManager = js.native
    /**
      * Moves a Scene down one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveDown(key: String): SceneManager = js.native
    def moveDown(key: Scene): SceneManager = js.native
    /**
      * Moves a Scene up one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveUp(key: String): SceneManager = js.native
    def moveUp(key: Scene): SceneManager = js.native
    /**
      * Pauses the given Scene.
      * @param key The Scene to pause.
      * @param data An optional data object that will be passed to the Scene and emitted by its pause event.
      */
    def pause(key: String): SceneManager = js.native
    def pause(key: String, data: js.Object): SceneManager = js.native
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
    def remove(key: String): SceneManager = js.native
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
    def resume(key: String): SceneManager = js.native
    def resume(key: String, data: js.Object): SceneManager = js.native
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
    def run(key: String): SceneManager = js.native
    def run(key: String, data: js.Object): SceneManager = js.native
    /**
      * Sends a Scene to the back of the Scenes list.
      * 
      * This means it will render below all other Scenes.
      * @param key The Scene to move.
      */
    def sendToBack(key: String): SceneManager = js.native
    def sendToBack(key: Scene): SceneManager = js.native
    /**
      * Puts the given Scene to sleep.
      * @param key The Scene to put to sleep.
      * @param data An optional data object that will be passed to the Scene and emitted by its sleep event.
      */
    def sleep(key: String): SceneManager = js.native
    def sleep(key: String, data: js.Object): SceneManager = js.native
    /**
      * Starts the given Scene.
      * @param key The Scene to start.
      * @param data Optional data object to pass to Scene.Settings and Scene.init.
      */
    def start(key: String): SceneManager = js.native
    def start(key: String, data: js.Object): SceneManager = js.native
    /**
      * Stops the given Scene.
      * @param key The Scene to stop.
      * @param data Optional data object to pass to Scene.shutdown.
      */
    def stop(key: String): SceneManager = js.native
    def stop(key: String, data: js.Object): SceneManager = js.native
    /**
      * Swaps the positions of two Scenes in the Scenes list.
      * @param keyA The first Scene to swap.
      * @param keyB The second Scene to swap.
      */
    def swapPosition(keyA: String, keyB: String): SceneManager = js.native
    def swapPosition(keyA: String, keyB: Scene): SceneManager = js.native
    def swapPosition(keyA: Scene, keyB: String): SceneManager = js.native
    def swapPosition(keyA: Scene, keyB: Scene): SceneManager = js.native
    /**
      * Sleeps one one Scene and starts the other.
      * @param from The Scene to sleep.
      * @param to The Scene to start.
      */
    def switch(from: String, to: String): SceneManager = js.native
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
    def wake(key: String): SceneManager = js.native
    def wake(key: String, data: js.Object): SceneManager = js.native
  }
  
  /**
    * A proxy class to the Global Scene Manager.
    */
  @js.native
  trait ScenePlugin extends js.Object {
    /**
      * The key of the Scene this ScenePlugin belongs to.
      */
    var key: String = js.native
    /**
      * The Game's SceneManager.
      */
    var manager: SceneManager = js.native
    /**
      * The Scene that this ScenePlugin belongs to.
      */
    var scene: Scene = js.native
    /**
      * The settings of the Scene this ScenePlugin belongs to.
      */
    var settings: SettingsObject = js.native
    /**
      * The Scene Systems instance of the Scene that this ScenePlugin belongs to.
      */
    var systems: Systems = js.native
    /**
      * If this Scene is currently transitioning to another, this holds
      * the current percentage of the transition progress, between 0 and 1.
      */
    var transitionProgress: Double = js.native
    def add(key: String, sceneConfig: js.Function, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: js.Function, autoStart: Boolean, data: js.Object): Scene = js.native
    /**
      * Add the Scene into the Scene Manager and start it if 'autoStart' is true or the Scene config 'active' property is set.
      * @param key The Scene key.
      * @param sceneConfig The config for the Scene.
      * @param autoStart Whether to start the Scene after it's added.
      * @param data Optional data object. This will be set as Scene.settings.data and passed to `Scene.init`.
      */
    def add(key: String, sceneConfig: Scene, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: Scene, autoStart: Boolean, data: js.Object): Scene = js.native
    def add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean, data: js.Object): Scene = js.native
    def add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean): Scene = js.native
    def add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean, data: js.Object): Scene = js.native
    /**
      * Brings a Scene to the top of the Scenes list.
      * 
      * This means it will render above all other Scenes.
      * @param key The Scene to move.
      */
    def bringToTop(): ScenePlugin = js.native
    def bringToTop(key: String): ScenePlugin = js.native
    /**
      * Retrieve a Scene.
      * @param key The Scene to retrieve.
      */
    def get(key: String): Scene = js.native
    /**
      * Retrieves the numeric index of a Scene in the Scenes list.
      * @param key The Scene to get the index of.
      */
    def getIndex(): integer = js.native
    def getIndex(key: String): integer = js.native
    def getIndex(key: Scene): integer = js.native
    /**
      * Checks if the given Scene is running or not?
      * @param key The Scene to check.
      */
    def isActive(): Boolean = js.native
    def isActive(key: String): Boolean = js.native
    /**
      * Checks if the given Scene is paused or not?
      * @param key The Scene to check.
      */
    def isPaused(): Boolean = js.native
    def isPaused(key: String): Boolean = js.native
    /**
      * Checks if the given Scene is sleeping or not?
      * @param key The Scene to check.
      */
    def isSleeping(): Boolean = js.native
    def isSleeping(key: String): Boolean = js.native
    /**
      * Checks if the given Scene is visible or not?
      * @param key The Scene to check.
      */
    def isVisible(): Boolean = js.native
    def isVisible(key: String): Boolean = js.native
    /**
      * Launch the given Scene and run it in parallel with this one.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to launch.
      * @param data The Scene data.
      */
    def launch(key: String): ScenePlugin = js.native
    def launch(key: String, data: js.Object): ScenePlugin = js.native
    /**
      * Swaps the position of two scenes in the Scenes list, so that Scene B is directly above Scene A.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The Scene that Scene B will be moved to be above.
      * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
      */
    def moveAbove(keyA: String): ScenePlugin = js.native
    def moveAbove(keyA: String, keyB: String): ScenePlugin = js.native
    /**
      * Swaps the position of two scenes in the Scenes list, so that Scene B is directly below Scene A.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The Scene that Scene B will be moved to be below.
      * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
      */
    def moveBelow(keyA: String): ScenePlugin = js.native
    def moveBelow(keyA: String, keyB: String): ScenePlugin = js.native
    /**
      * Moves a Scene down one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveDown(): ScenePlugin = js.native
    def moveDown(key: String): ScenePlugin = js.native
    /**
      * Moves a Scene up one position in the Scenes list.
      * @param key The Scene to move.
      */
    def moveUp(): ScenePlugin = js.native
    def moveUp(key: String): ScenePlugin = js.native
    /**
      * Pause the Scene - this stops the update step from happening but it still renders.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to pause.
      * @param data An optional data object that will be passed to the Scene and emitted in its pause event.
      */
    def pause(): ScenePlugin = js.native
    def pause(key: String): ScenePlugin = js.native
    def pause(key: String, data: js.Object): ScenePlugin = js.native
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
    def remove(): SceneManager = js.native
    def remove(key: String): SceneManager = js.native
    def remove(key: Scene): SceneManager = js.native
    /**
      * Restarts this Scene.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param data The Scene data.
      */
    def restart(): ScenePlugin = js.native
    def restart(data: js.Object): ScenePlugin = js.native
    /**
      * Resume the Scene - starts the update loop again.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to resume.
      * @param data An optional data object that will be passed to the Scene and emitted in its resume event.
      */
    def resume(): ScenePlugin = js.native
    def resume(key: String): ScenePlugin = js.native
    def resume(key: String, data: js.Object): ScenePlugin = js.native
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
    def run(key: String): ScenePlugin = js.native
    def run(key: String, data: js.Object): ScenePlugin = js.native
    /**
      * Sends a Scene to the back of the Scenes list.
      * 
      * This means it will render below all other Scenes.
      * @param key The Scene to move.
      */
    def sendToBack(): ScenePlugin = js.native
    def sendToBack(key: String): ScenePlugin = js.native
    /**
      * Sets the active state of the given Scene.
      * @param value If `true` the Scene will be resumed. If `false` it will be paused.
      * @param key The Scene to set the active state of.
      * @param data An optional data object that will be passed to the Scene and emitted with its events.
      */
    def setActive(value: Boolean): ScenePlugin = js.native
    def setActive(value: Boolean, key: String): ScenePlugin = js.native
    def setActive(value: Boolean, key: String, data: js.Object): ScenePlugin = js.native
    /**
      * Sets the visible state of the given Scene.
      * @param value The visible value.
      * @param key The Scene to set the visible state for.
      */
    def setVisible(value: Boolean): ScenePlugin = js.native
    def setVisible(value: Boolean, key: String): ScenePlugin = js.native
    /**
      * Makes the Scene sleep (no update, no render) but doesn't shutdown.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to put to sleep.
      * @param data An optional data object that will be passed to the Scene and emitted in its sleep event.
      */
    def sleep(): ScenePlugin = js.native
    def sleep(key: String): ScenePlugin = js.native
    def sleep(key: String, data: js.Object): ScenePlugin = js.native
    /**
      * Shutdown this Scene and run the given one.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to start.
      * @param data The Scene data.
      */
    def start(): ScenePlugin = js.native
    def start(key: String): ScenePlugin = js.native
    def start(key: String, data: js.Object): ScenePlugin = js.native
    /**
      * Shutdown the Scene, clearing display list, timers, etc.
      * 
      * This happens at the next Scene Manager update, not immediately.
      * @param key The Scene to stop.
      * @param data Optional data object to pass to Scene.Systems.shutdown.
      */
    def stop(): ScenePlugin = js.native
    def stop(key: String): ScenePlugin = js.native
    def stop(key: String, data: js.Any): ScenePlugin = js.native
    /**
      * Swaps the position of two scenes in the Scenes list.
      * 
      * This controls the order in which they are rendered and updated.
      * @param keyA The first Scene to swap.
      * @param keyB The second Scene to swap. If none is given it defaults to this Scene.
      */
    def swapPosition(keyA: String): ScenePlugin = js.native
    def swapPosition(keyA: String, keyB: String): ScenePlugin = js.native
    /**
      * Makes this Scene sleep then starts the Scene given.
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to start.
      */
    def switch(key: String): ScenePlugin = js.native
    /**
      * This will start a transition from the current Scene to the target Scene given.
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
      * Makes the Scene wake-up (starts update and render)
      * 
      * This will happen at the next Scene Manager update, not immediately.
      * @param key The Scene to wake up.
      * @param data An optional data object that will be passed to the Scene and emitted in its wake event.
      */
    def wake(): ScenePlugin = js.native
    def wake(key: String): ScenePlugin = js.native
    def wake(key: String, data: js.Object): ScenePlugin = js.native
  }
  
  /**
    * The Scene Systems class.
    * 
    * This class is available from within a Scene under the property `sys`.
    * It is responsible for managing all of the plugins a Scene has running, including the display list, and
    * handling the update step and renderer. It also contains references to global systems belonging to Game.
    */
  @js.native
  trait Systems extends js.Object {
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
      * A reference to the global Plugins Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.plugins` property.
      */
    var plugins: PluginManager = js.native
    /**
      * A reference to the global registry. This is a game-wide instance of the Data Manager, allowing
      * you to exchange data between Scenes via a universal and shared point.
      * 
      * In the default set-up you can access this from within a Scene via the `this.registry` property.
      */
    var registry: DataManager = js.native
    /**
      * A reference to either the Canvas or WebGL Renderer that this Game is using.
      */
    var renderer: CanvasRenderer | WebGLRenderer = js.native
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
      * The Scene Settings. This is the parsed output based on the Scene configuration.
      */
    var settings: SettingsObject = js.native
    /**
      * A reference to the global Sound Manager.
      * 
      * In the default set-up you can access this from within a Scene via the `this.sound` property.
      */
    var sound: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager = js.native
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
      * Immediately sorts the display list if the flag is set.
      */
    def depthSort(): Unit = js.native
    /**
      * Returns any data that was sent to this Scene by another Scene.
      * 
      * The data is also passed to `Scene.init` and in various Scene events, but
      * you can access it at any point via this method.
      */
    def getData(): js.Any = js.native
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
      * Pause this Scene.
      * A paused Scene still renders, it just doesn't run ANY of its update handlers or systems.
      * @param data A data object that will be passed in the 'pause' event.
      */
    def pause(): Systems = js.native
    def pause(data: js.Object): Systems = js.native
    /**
      * Force a sort of the display list on the next render.
      */
    def queueDepthSort(): Unit = js.native
    /**
      * Called automatically by the Scene Manager.
      * Instructs the Scene to render itself via its Camera Manager to the renderer given.
      * @param renderer The renderer that invoked the render call.
      */
    def render(renderer: CanvasRenderer): Unit = js.native
    def render(renderer: WebGLRenderer): Unit = js.native
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
    def setActive(value: Boolean): Systems = js.native
    def setActive(value: Boolean, data: js.Object): Systems = js.native
    /**
      * Sets the visible state of this Scene.
      * An invisible Scene will not render, but will still process updates.
      * @param value `true` to render this Scene, otherwise `false`.
      */
    def setVisible(value: Boolean): Systems = js.native
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
      * Wake-up this Scene if it was previously asleep.
      * @param data A data object that will be passed in the 'wake' event.
      */
    def wake(): Systems = js.native
    def wake(data: js.Object): Systems = js.native
  }
  
}

