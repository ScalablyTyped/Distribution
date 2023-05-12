package typings.playcanvas.global.pc

import typings.playcanvas.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the type of a script. It is returned by {@link createScript}. Also referred to as
  * Script Type.
  *
  * The type is to be extended using its JavaScript prototype. There is a list of methods that will
  * be executed by the engine on instances of this type, such as:
  *
  * - `initialize`
  * - `postInitialize`
  * - `update`
  * - `postUpdate`
  * - `swap`
  *
  * `initialize` and `postInitialize` - are called (if defined) when a script is about to run for
  * the first time - `postInitialize` will run after all `initialize` methods are executed in the
  * same tick or enabling chain of actions.
  *
  * `update` and `postUpdate` - are called (if defined) for enabled (running state) scripts on each
  * tick.
  *
  * `swap` - is called when a ScriptType that already exists in the registry gets redefined. If the
  * new ScriptType has a `swap` method in its prototype, then it will be executed to perform hot-
  * reload at runtime.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.ScriptType")
@js.native
open class ScriptType protected ()
  extends typings.playcanvas.mod.ScriptType {
  /**
    * Create a new ScriptType instance.
    *
    * @param {object} args - The input arguments object.
    * @param {import('../app-base.js').AppBase} args.app - The {@link AppBase} that is running the
    * script.
    * @param {import('../entity.js').Entity} args.entity - The {@link Entity} that the script is
    * attached to.
    */
  def this(args: App) = this()
}
object ScriptType {
  
  @JSGlobal("pc.ScriptType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shorthand function to extend Script Type prototype with list of methods.
    *
    * @param {object} methods - Object with methods, where key - is name of method, and value - is function.
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
    */
  /* static member */
  inline def extend(methods: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @param {*} constructorFn - The constructor function of the script type.
    * @returns {string} The script name.
    * @private
    */
  /* static member */
  @JSGlobal("pc.ScriptType.__getScriptName")
  @js.native
  def getScriptName: Any = js.native
  
  inline def getScriptName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__getScriptName")(x.asInstanceOf[js.Any])
  
  /**
    * Name of a Script Type.
    *
    * @type {string}
    * @private
    */
  /* static member */
  @JSGlobal("pc.ScriptType.__name")
  @js.native
  def name: Any = js.native
  
  inline def name_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__name")(x.asInstanceOf[js.Any])
}
