package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the type of a script. It is returned by {@link pc.createScript}.
  * Also referred to as Script Type.
  *
  * The type is to be extended using its JavaScript prototype. There is a **list of methods**
  * that will be executed by the engine on instances of this type, such as:
  *
  * * initialize
  * * postInitialize
  * * update
  * * postUpdate
  * * swap
  *
  * **initialize** and **postInitialize** - are called if defined when script is about to run
  * for the first time - postInitialize will run after all initialize methods are executed in
  * the same tick or enabling chain of actions.
  *
  * **update** and **postUpdate** - methods are called if defined for enabled (running state)
  * scripts on each tick.
  *
  * **swap** - This method will be called when a {@link pc.ScriptType} that already exists in
  * the registry gets redefined. If the new {@link pc.ScriptType} has a `swap` method in its
  * prototype, then it will be executed to perform hot-reload at runtime.
  * @property app - The {@link pc.Application} that the instance of this type
  * belongs to.
  * @property entity - The {@link pc.Entity} that the instance of this type belongs to.
  * @property enabled - True if the instance of this type is in running state. False
  * when script is not running, because the Entity or any of its parents are disabled or the
  * Script Component is disabled or the Script Instance is disabled. When disabled no update
  * methods will be called on each tick. initialize and postInitialize methods will run once
  * when the script instance is in `enabled` state during app tick.
  * @param args - The input arguments object
  * @param args.app - The {@link pc.Application} that is running the script
  * @param args.entity - The {@link pc.Entity} that the script is attached to
  */
@js.native
trait ScriptType extends EventHandler {
  /**
    * The {@link pc.Application} that the instance of this type
    belongs to.
    */
  var app: Application = js.native
  /**
    * True if the instance of this type is in running state. False
    when script is not running, because the Entity or any of its parents are disabled or the
    Script Component is disabled or the Script Instance is disabled. When disabled no update
    methods will be called on each tick. initialize and postInitialize methods will run once
    when the script instance is in `enabled` state during app tick.
    */
  var enabled: Boolean = js.native
  /**
    * The {@link pc.Entity} that the instance of this type belongs to.
    */
  var entity: Entity = js.native
  /**
    * Called when script is about to run for the first time.
    */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called after all initialize methods are executed in the same tick or enabling chain of actions.
    */
  var postInitialize: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called for enabled (running state) scripts on each tick, after update.
    * @param dt - The delta time in seconds since the last frame.
    */
  var postUpdate: js.UndefOr[js.Function1[/* dt */ Double, Unit]] = js.native
  /**
    * Called when a ScriptType that already exists in the registry
    * gets redefined. If the new ScriptType has a `swap` method in its prototype,
    * then it will be executed to perform hot-reload at runtime.
    */
  var swap: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called for enabled (running state) scripts on each tick.
    * @param dt - The delta time in seconds since the last frame.
    */
  var update: js.UndefOr[js.Function1[/* dt */ Double, Unit]] = js.native
}

