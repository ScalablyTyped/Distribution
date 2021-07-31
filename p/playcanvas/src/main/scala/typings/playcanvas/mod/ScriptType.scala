package typings.playcanvas.mod

import typings.playcanvas.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("playcanvas", "ScriptType")
@js.native
class ScriptType protected ()
  extends StObject
     with typings.playcanvas.pc.ScriptType {
  def this(args: App) = this()
}
object ScriptType {
  
  @JSImport("playcanvas", "ScriptType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The interface to define attributes for Script Types. Refer to {@link pc.ScriptAttributes}.
    * @example
    * var PlayerController = pc.createScript('playerController');
    *
    * PlayerController.attributes.add('speed', {
    *     type: 'number',
    *     title: 'Speed',
    *     placeholder: 'km/h',
    *     default: 22.2
    * });
    */
  /* static member */
  @JSImport("playcanvas", "ScriptType.attributes")
  @js.native
  val attributes: typings.playcanvas.pc.ScriptAttributes = js.native
  
  /**
    * Shorthand function to extend Script Type prototype with list of methods.
    * @example
    * var PlayerController = pc.createScript('playerController');
    *
    * PlayerController.extend({
    *     initialize: function () {
    *         // called once on initialize
    *     },
    *     update: function (dt) {
    *         // called each tick
    *     }
    * });
    * @param methods - Object with methods, where key - is name of method, and value - is function.
    */
  /* static member */
  @scala.inline
  def extend(methods: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Name of a Script Type
    */
  /* static member */
  @JSImport("playcanvas", "ScriptType.scriptName")
  @js.native
  val scriptName: String | Null = js.native
}
