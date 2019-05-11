package typings
package phaserLib.PhaserNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A proxy class to the Global Scene Manager.
  */
@JSGlobal("Phaser.Scenes.ScenePlugin")
@js.native
class ScenePlugin protected () extends js.Object {
  /**
    * 
    * @param scene The Scene that this ScenePlugin belongs to.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * The key of the Scene this ScenePlugin belongs to.
    */
  var key: java.lang.String = js.native
  /**
    * The Game's SceneManager.
    */
  var manager: SceneManager = js.native
  /**
    * The Scene that this ScenePlugin belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * The settings of the Scene this ScenePlugin belongs to.
    */
  var settings: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsObject = js.native
  /**
    * The Scene Systems instance of the Scene that this ScenePlugin belongs to.
    */
  var systems: Systems = js.native
  /**
    * If this Scene is currently transitioning to another, this holds
    * the current percentage of the transition progress, between 0 and 1.
    */
  var transitionProgress: scala.Double = js.native
  def add(key: java.lang.String, sceneConfig: js.Function, autoStart: scala.Boolean): phaserLib.PhaserNs.Scene = js.native
  def add(key: java.lang.String, sceneConfig: js.Function, autoStart: scala.Boolean, data: js.Object): phaserLib.PhaserNs.Scene = js.native
  /**
    * Add the Scene into the Scene Manager and start it if 'autoStart' is true or the Scene config 'active' property is set.
    * @param key The Scene key.
    * @param sceneConfig The config for the Scene.
    * @param autoStart Whether to start the Scene after it's added.
    * @param data Optional data object. This will be set as Scene.settings.data and passed to `Scene.init`.
    */
  def add(key: java.lang.String, sceneConfig: phaserLib.PhaserNs.Scene, autoStart: scala.Boolean): phaserLib.PhaserNs.Scene = js.native
  def add(
    key: java.lang.String,
    sceneConfig: phaserLib.PhaserNs.Scene,
    autoStart: scala.Boolean,
    data: js.Object
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
  def bringToTop(): ScenePlugin = js.native
  def bringToTop(key: java.lang.String): ScenePlugin = js.native
  /**
    * Retrieve a Scene.
    * @param key The Scene to retrieve.
    */
  def get(key: java.lang.String): phaserLib.PhaserNs.Scene = js.native
  /**
    * Retrieves the numeric index of a Scene in the Scenes list.
    * @param key The Scene to get the index of.
    */
  def getIndex(): phaserLib.integer = js.native
  def getIndex(key: java.lang.String): phaserLib.integer = js.native
  def getIndex(key: phaserLib.PhaserNs.Scene): phaserLib.integer = js.native
  /**
    * Checks if the given Scene is running or not?
    * @param key The Scene to check.
    */
  def isActive(): scala.Boolean = js.native
  def isActive(key: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if the given Scene is paused or not?
    * @param key The Scene to check.
    */
  def isPaused(): scala.Boolean = js.native
  def isPaused(key: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if the given Scene is sleeping or not?
    * @param key The Scene to check.
    */
  def isSleeping(): scala.Boolean = js.native
  def isSleeping(key: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if the given Scene is visible or not?
    * @param key The Scene to check.
    */
  def isVisible(): scala.Boolean = js.native
  def isVisible(key: java.lang.String): scala.Boolean = js.native
  /**
    * Launch the given Scene and run it in parallel with this one.
    * @param key The Scene to launch.
    * @param data The Scene data.
    */
  def launch(key: java.lang.String): ScenePlugin = js.native
  def launch(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Swaps the position of two scenes in the Scenes list, so that Scene B is directly above Scene A.
    * 
    * This controls the order in which they are rendered and updated.
    * @param keyA The Scene that Scene B will be moved to be above.
    * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
    */
  def moveAbove(keyA: java.lang.String): ScenePlugin = js.native
  def moveAbove(keyA: java.lang.String, keyB: java.lang.String): ScenePlugin = js.native
  /**
    * Swaps the position of two scenes in the Scenes list, so that Scene B is directly below Scene A.
    * 
    * This controls the order in which they are rendered and updated.
    * @param keyA The Scene that Scene B will be moved to be below.
    * @param keyB The Scene to be moved. If none is given it defaults to this Scene.
    */
  def moveBelow(keyA: java.lang.String): ScenePlugin = js.native
  def moveBelow(keyA: java.lang.String, keyB: java.lang.String): ScenePlugin = js.native
  /**
    * Moves a Scene down one position in the Scenes list.
    * @param key The Scene to move.
    */
  def moveDown(): ScenePlugin = js.native
  def moveDown(key: java.lang.String): ScenePlugin = js.native
  /**
    * Moves a Scene up one position in the Scenes list.
    * @param key The Scene to move.
    */
  def moveUp(): ScenePlugin = js.native
  def moveUp(key: java.lang.String): ScenePlugin = js.native
  /**
    * Pause the Scene - this stops the update step from happening but it still renders.
    * @param key The Scene to pause.
    * @param data An optional data object that will be passed to the Scene and emitted in its pause event.
    */
  def pause(): ScenePlugin = js.native
  def pause(key: java.lang.String): ScenePlugin = js.native
  def pause(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Removes a Scene from the SceneManager.
    * 
    * The Scene is removed from the local scenes array, it's key is cleared from the keys
    * cache and Scene.Systems.destroy is then called on it.
    * 
    * If the SceneManager is processing the Scenes when this method is called it wil
    * queue the operation for the next update sequence.
    * @param key The Scene to be removed.
    */
  def remove(): SceneManager = js.native
  def remove(key: java.lang.String): SceneManager = js.native
  def remove(key: phaserLib.PhaserNs.Scene): SceneManager = js.native
  /**
    * Restarts this Scene.
    * @param data The Scene data.
    */
  def restart(): ScenePlugin = js.native
  def restart(data: js.Object): ScenePlugin = js.native
  /**
    * Resume the Scene - starts the update loop again.
    * @param key The Scene to resume.
    * @param data An optional data object that will be passed to the Scene and emitted in its resume event.
    */
  def resume(): ScenePlugin = js.native
  def resume(key: java.lang.String): ScenePlugin = js.native
  def resume(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Runs the given Scene, but does not change the state of this Scene.
    * 
    * If the given Scene is paused, it will resume it. If sleeping, it will wake it.
    * If not running at all, it will be started.
    * 
    * Use this if you wish to open a modal Scene by calling `pause` on the current
    * Scene, then `run` on the modal Scene.
    * @param key The Scene to run.
    * @param data A data object that will be passed to the Scene and emitted in its ready, wake, or resume events.
    */
  def run(key: java.lang.String): ScenePlugin = js.native
  def run(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Sends a Scene to the back of the Scenes list.
    * 
    * This means it will render below all other Scenes.
    * @param key The Scene to move.
    */
  def sendToBack(): ScenePlugin = js.native
  def sendToBack(key: java.lang.String): ScenePlugin = js.native
  /**
    * Sets the active state of the given Scene.
    * @param value If `true` the Scene will be resumed. If `false` it will be paused.
    * @param key The Scene to set the active state of.
    * @param data An optional data object that will be passed to the Scene and emitted with its events.
    */
  def setActive(value: scala.Boolean): ScenePlugin = js.native
  def setActive(value: scala.Boolean, key: java.lang.String): ScenePlugin = js.native
  def setActive(value: scala.Boolean, key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Sets the visible state of the given Scene.
    * @param value The visible value.
    * @param key The Scene to set the visible state for.
    */
  def setVisible(value: scala.Boolean): ScenePlugin = js.native
  def setVisible(value: scala.Boolean, key: java.lang.String): ScenePlugin = js.native
  /**
    * Makes the Scene sleep (no update, no render) but doesn't shutdown.
    * @param key The Scene to put to sleep.
    * @param data An optional data object that will be passed to the Scene and emitted in its sleep event.
    */
  def sleep(): ScenePlugin = js.native
  def sleep(key: java.lang.String): ScenePlugin = js.native
  def sleep(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Shutdown this Scene and run the given one.
    * @param key The Scene to start.
    * @param data The Scene data.
    */
  def start(): ScenePlugin = js.native
  def start(key: java.lang.String): ScenePlugin = js.native
  def start(key: java.lang.String, data: js.Object): ScenePlugin = js.native
  /**
    * Shutdown the Scene, clearing display list, timers, etc.
    * @param key The Scene to stop.
    */
  def stop(): ScenePlugin = js.native
  def stop(key: java.lang.String): ScenePlugin = js.native
  /**
    * Swaps the position of two scenes in the Scenes list.
    * 
    * This controls the order in which they are rendered and updated.
    * @param keyA The first Scene to swap.
    * @param keyB The second Scene to swap. If none is given it defaults to this Scene.
    */
  def swapPosition(keyA: java.lang.String): ScenePlugin = js.native
  def swapPosition(keyA: java.lang.String, keyB: java.lang.String): ScenePlugin = js.native
  /**
    * Makes this Scene sleep then starts the Scene given.
    * 
    * No checks are made to see if an instance of the given Scene is already running.
    * Because Scenes in Phaser are non-exclusive, you are allowed to run multiple
    * instances of them _at the same time_. This means, calling this function
    * may launch another instance of the requested Scene if it's already running.
    * @param key The Scene to start.
    */
  def switch(key: java.lang.String): ScenePlugin = js.native
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
  def transition(config: phaserLib.PhaserNs.TypesNs.ScenesNs.SceneTransitionConfig): scala.Boolean = js.native
  /**
    * Makes the Scene wake-up (starts update and render)
    * @param key The Scene to wake up.
    * @param data An optional data object that will be passed to the Scene and emitted in its wake event.
    */
  def wake(): ScenePlugin = js.native
  def wake(key: java.lang.String): ScenePlugin = js.native
  def wake(key: java.lang.String, data: js.Object): ScenePlugin = js.native
}

