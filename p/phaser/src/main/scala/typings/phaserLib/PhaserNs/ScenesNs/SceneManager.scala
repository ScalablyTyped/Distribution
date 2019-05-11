package typings
package phaserLib.PhaserNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Scene Manager.
  * 
  * The Scene Manager is a Game level system, responsible for creating, processing and updating all of the
  * Scenes in a Game instance.
  */
@JSGlobal("Phaser.Scenes.SceneManager")
@js.native
class SceneManager protected () extends js.Object {
  /**
    * 
    * @param game The Phaser.Game instance this Scene Manager belongs to.
    * @param sceneConfig Scene specific configuration settings.
    */
  def this(game: phaserLib.PhaserNs.Game, sceneConfig: js.Object) = this()
  /**
    * Do any of the Cameras in any of the Scenes require a custom viewport?
    * If not we can skip scissor tests.
    */
  var customViewports: scala.Double = js.native
  /**
    * The Game that this SceneManager belongs to.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * Has the Scene Manager properly started?
    */
  val isBooted: scala.Boolean = js.native
  /**
    * Is the Scene Manager actively processing the Scenes list?
    */
  val isProcessing: scala.Boolean = js.native
  /**
    * An object that maps the keys to the scene so we can quickly get a scene from a key without iteration.
    */
  var keys: js.Object = js.native
  /**
    * The array in which all of the scenes are kept.
    */
  var scenes: js.Array[_] = js.native
  def add(key: java.lang.String, sceneConfig: js.Function): phaserLib.PhaserNs.Scene = js.native
  def add(key: java.lang.String, sceneConfig: js.Function, autoStart: scala.Boolean): phaserLib.PhaserNs.Scene = js.native
  def add(key: java.lang.String, sceneConfig: js.Function, autoStart: scala.Boolean, data: js.Object): phaserLib.PhaserNs.Scene = js.native
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
  def add(key: java.lang.String, sceneConfig: phaserLib.PhaserNs.Scene): phaserLib.PhaserNs.Scene = js.native
  def add(key: java.lang.String, sceneConfig: phaserLib.PhaserNs.Scene, autoStart: scala.Boolean): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.Scene,
    autoStart: scala.Boolean,
    data: js.Object
  ): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig
  ): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig,
    autoStart: scala.Boolean
  ): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig,
    autoStart: scala.Boolean,
    data: js.Object
  ): phaserLib.PhaserNs.Scene = js.native
  def add(key: java.lang.String, sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig,
    autoStart: scala.Boolean
  ): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig,
    autoStart: scala.Boolean,
    data: js.Object
  ): phaserLib.PhaserNs.Scene = js.native
  /**
    * Brings a Scene to the top of the Scenes list.
    * 
    * This means it will render above all other Scenes.
    * @param key The Scene to move.
    */
  def bringToTop(key: java.lang.String): SceneManager = js.native
  def bringToTop(key: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Destroy the SceneManager and all of its Scene's systems.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Dumps debug information about each Scene to the developer console.
    */
  def dump(): scala.Unit = js.native
  /**
    * Retrieves a Scene by numeric index.
    * @param index The index of the Scene to retrieve.
    */
  def getAt(index: phaserLib.integer): js.UndefOr[phaserLib.PhaserNs.Scene] = js.native
  /**
    * Retrieves the numeric index of a Scene.
    * @param key The key of the Scene.
    */
  def getIndex(key: java.lang.String): phaserLib.integer = js.native
  def getIndex(key: phaserLib.PhaserNs.Scene): phaserLib.integer = js.native
  /**
    * Retrieves a Scene.
    * @param key The Scene to retrieve.
    */
  def getScene(key: java.lang.String): phaserLib.PhaserNs.Scene = js.native
  def getScene(key: phaserLib.PhaserNs.Scene): phaserLib.PhaserNs.Scene = js.native
  /**
    * Returns an array of all the current Scenes being managed by this Scene Manager.
    * 
    * You can filter the output by the active state of the Scene and choose to have
    * the array returned in normal or reversed order.
    * @param isActive Only include Scene's that are currently active? Default true.
    * @param inReverse Return the array of Scenes in reverse? Default false.
    */
  def getScenes(): js.Array[phaserLib.PhaserNs.Scene] = js.native
  def getScenes(isActive: scala.Boolean): js.Array[phaserLib.PhaserNs.Scene] = js.native
  def getScenes(isActive: scala.Boolean, inReverse: scala.Boolean): js.Array[phaserLib.PhaserNs.Scene] = js.native
  /**
    * Determines whether a Scene is running.
    * @param key The Scene to check.
    */
  def isActive(key: java.lang.String): scala.Boolean = js.native
  /**
    * Determines whether a Scene is paused.
    * @param key The Scene to check.
    */
  def isPaused(key: java.lang.String): scala.Boolean = js.native
  /**
    * Determines whether a Scene is sleeping.
    * @param key The Scene to check.
    */
  def isSleeping(key: java.lang.String): scala.Boolean = js.native
  /**
    * Determines whether a Scene is visible.
    * @param key The Scene to check.
    */
  def isVisible(key: java.lang.String): scala.Boolean = js.native
  /**
    * Moves a Scene so it is immediately above another Scene in the Scenes list.
    * 
    * This means it will render over the top of the other Scene.
    * @param keyA The Scene that Scene B will be moved above.
    * @param keyB The Scene to be moved.
    */
  def moveAbove(keyA: java.lang.String, keyB: java.lang.String): SceneManager = js.native
  def moveAbove(keyA: java.lang.String, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  def moveAbove(keyA: phaserLib.PhaserNs.Scene, keyB: java.lang.String): SceneManager = js.native
  def moveAbove(keyA: phaserLib.PhaserNs.Scene, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Moves a Scene so it is immediately below another Scene in the Scenes list.
    * 
    * This means it will render behind the other Scene.
    * @param keyA The Scene that Scene B will be moved above.
    * @param keyB The Scene to be moved.
    */
  def moveBelow(keyA: java.lang.String, keyB: java.lang.String): SceneManager = js.native
  def moveBelow(keyA: java.lang.String, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  def moveBelow(keyA: phaserLib.PhaserNs.Scene, keyB: java.lang.String): SceneManager = js.native
  def moveBelow(keyA: phaserLib.PhaserNs.Scene, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Moves a Scene down one position in the Scenes list.
    * @param key The Scene to move.
    */
  def moveDown(key: java.lang.String): SceneManager = js.native
  def moveDown(key: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Moves a Scene up one position in the Scenes list.
    * @param key The Scene to move.
    */
  def moveUp(key: java.lang.String): SceneManager = js.native
  def moveUp(key: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Pauses the given Scene.
    * @param key The Scene to pause.
    * @param data An optional data object that will be passed to the Scene and emitted by its pause event.
    */
  def pause(key: java.lang.String): SceneManager = js.native
  def pause(key: java.lang.String, data: js.Object): SceneManager = js.native
  /**
    * Process the Scene operations queue.
    */
  def processQueue(): scala.Unit = js.native
  /**
    * Removes a Scene from the SceneManager.
    * 
    * The Scene is removed from the local scenes array, it's key is cleared from the keys
    * cache and Scene.Systems.destroy is then called on it.
    * 
    * If the SceneManager is processing the Scenes when this method is called it will
    * queue the operation for the next update sequence.
    * @param scene The Scene to be removed.
    */
  def remove(scene: java.lang.String): SceneManager = js.native
  def remove(scene: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Renders the Scenes.
    * @param renderer The renderer to use.
    */
  def render(renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer): scala.Unit = js.native
  def render(renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer): scala.Unit = js.native
  /**
    * Resumes the given Scene.
    * @param key The Scene to resume.
    * @param data An optional data object that will be passed to the Scene and emitted by its resume event.
    */
  def resume(key: java.lang.String): SceneManager = js.native
  def resume(key: java.lang.String, data: js.Object): SceneManager = js.native
  /**
    * Runs the given Scene, but does not change the state of this Scene.
    * 
    * If the given Scene is paused, it will resume it. If sleeping, it will wake it.
    * If not running at all, it will be started.
    * 
    * Use this if you wish to open a modal Scene by calling `pause` on the current
    * Scene, then `run` on the modal Scene.
    * @param key The Scene to run.
    * @param data A data object that will be passed to the Scene on start, wake, or resume.
    */
  def run(key: java.lang.String): SceneManager = js.native
  def run(key: java.lang.String, data: js.Object): SceneManager = js.native
  /**
    * Sends a Scene to the back of the Scenes list.
    * 
    * This means it will render below all other Scenes.
    * @param key The Scene to move.
    */
  def sendToBack(key: java.lang.String): SceneManager = js.native
  def sendToBack(key: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Puts the given Scene to sleep.
    * @param key The Scene to put to sleep.
    * @param data An optional data object that will be passed to the Scene and emitted by its sleep event.
    */
  def sleep(key: java.lang.String): SceneManager = js.native
  def sleep(key: java.lang.String, data: js.Object): SceneManager = js.native
  /**
    * Starts the given Scene.
    * @param key The Scene to start.
    * @param data Optional data object to pass to Scene.Settings and Scene.init.
    */
  def start(key: java.lang.String): SceneManager = js.native
  def start(key: java.lang.String, data: js.Object): SceneManager = js.native
  /**
    * Stops the given Scene.
    * @param key The Scene to stop.
    */
  def stop(key: java.lang.String): SceneManager = js.native
  /**
    * Swaps the positions of two Scenes in the Scenes list.
    * @param keyA The first Scene to swap.
    * @param keyB The second Scene to swap.
    */
  def swapPosition(keyA: java.lang.String, keyB: java.lang.String): SceneManager = js.native
  def swapPosition(keyA: java.lang.String, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  def swapPosition(keyA: phaserLib.PhaserNs.Scene, keyB: java.lang.String): SceneManager = js.native
  def swapPosition(keyA: phaserLib.PhaserNs.Scene, keyB: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Sleeps one one Scene and starts the other.
    * @param from The Scene to sleep.
    * @param to The Scene to start.
    */
  def switch(from: java.lang.String, to: java.lang.String): SceneManager = js.native
  /**
    * Updates the Scenes.
    * @param time Time elapsed.
    * @param delta Delta time from the last update.
    */
  def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Awakens the given Scene.
    * @param key The Scene to wake up.
    * @param data An optional data object that will be passed to the Scene and emitted by its wake event.
    */
  def wake(key: java.lang.String): SceneManager = js.native
  def wake(key: java.lang.String, data: js.Object): SceneManager = js.native
}

