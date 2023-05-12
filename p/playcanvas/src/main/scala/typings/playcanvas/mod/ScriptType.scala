package typings.playcanvas.mod

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
@JSImport("playcanvas", "ScriptType")
@js.native
open class ScriptType protected () extends EventHandler {
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
  
  /** @private */
  /* private */ var __attributes: Any = js.native
  
  /** @private */
  /* private */ var __attributesRaw: Any = js.native
  
  /** @private */
  /* private */ var __destroyed: Any = js.native
  
  /**
    * The order in the script component that the methods of this script instance will run
    * relative to other script instances in the component.
    *
    * @type {number}
    * @private
    */
  /* private */ var __executionOrder: Any = js.native
  
  /**
    * @param {boolean} [force] - Set to true to force initialization of the attributes.
    * @private
    */
  /* private */ var __initializeAttributes: Any = js.native
  
  /** @private */
  /* private */ var __scriptType: Any = js.native
  
  /** @private */
  /* private */ var _enabled: Any = js.native
  
  /** @private */
  /* private */ var _enabledOld: Any = js.native
  
  /** @private */
  /* private */ var _initialized: Any = js.native
  
  /** @private */
  /* private */ var _postInitialized: Any = js.native
  
  /**
    * The {@link AppBase} that the instance of this type belongs to.
    *
    * @type {import('../app-base.js').AppBase}
    */
  var app: AppBase = js.native
  
  def enabled: Boolean = js.native
  /**
    * Fired when a script instance becomes enabled.
    *
    * @event ScriptType#enable
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('enable', function () {
    *         // Script Instance is now enabled
    *     });
    * };
    */
  /**
    * Fired when a script instance becomes disabled.
    *
    * @event ScriptType#disable
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('disable', function () {
    *         // Script Instance is now disabled
    *     });
    * };
    */
  /**
    * Fired when a script instance changes state to enabled or disabled.
    *
    * @event ScriptType#state
    * @param {boolean} enabled - True if now enabled, False if disabled.
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('state', function (enabled) {
    *         console.log('Script Instance is now ' + (enabled ? 'enabled' : 'disabled'));
    *     });
    * };
    */
  /**
    * Fired when a script instance is destroyed and removed from component.
    *
    * @event ScriptType#destroy
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('destroy', function () {
    *         // no more part of an entity
    *         // good place to cleanup entity from destroyed script
    *     });
    * };
    */
  /**
    * Fired when any script attribute has been changed.
    *
    * @event ScriptType#attr
    * @param {string} name - Name of attribute.
    * @param {object} value - New value.
    * @param {object} valueOld - Old value.
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('attr', function (name, value, valueOld) {
    *         console.log(name + ' been changed from ' + valueOld + ' to ' + value);
    *     });
    * };
    */
  /**
    * Fired when a specific script attribute has been changed.
    *
    * @event ScriptType#attr:[name]
    * @param {object} value - New value.
    * @param {object} valueOld - Old value.
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('attr:speed', function (value, valueOld) {
    *         console.log('speed been changed from ' + valueOld + ' to ' + value);
    *     });
    * };
    */
  /**
    * Fired when a script instance had an exception. The script instance will be automatically
    * disabled.
    *
    * @event ScriptType#error
    * @param {Error} err - Native JavaScript Error object with details of error.
    * @param {string} method - The method of the script instance that the exception originated from.
    * @example
    * PlayerController.prototype.initialize = function () {
    *     this.on('error', function (err, method) {
    *         // caught an exception
    *         console.log(err.stack);
    *     });
    * };
    */
  /**
    * True if the instance of this type is in running state. False when script is not running,
    * because the Entity or any of its parents are disabled or the {@link ScriptComponent} is
    * disabled or the Script Instance is disabled. When disabled no update methods will be called
    * on each tick. initialize and postInitialize methods will run once when the script instance
    * is in `enabled` state during app tick.
    *
    * @type {boolean}
    */
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * The {@link Entity} that the instance of this type belongs to.
    *
    * @type {import('../entity.js').Entity}
    */
  var entity: Entity = js.native
  
  /**
    * @param {{entity: import('../entity.js').Entity, app: import('../app-base.js').AppBase}} args -
    * The entity and app.
    * @private
    */
  /* private */ var initScriptType: Any = js.native
  
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
    * Called when a ScriptType that already exists in the registry gets redefined. If the new
    * ScriptType has a `swap` method in its prototype, then it will be executed to perform
    * hot-reload at runtime.
    * @param old - Old instance of the scriptType to copy data to the new instance.
    */
  var swap: js.UndefOr[js.Function1[/* old */ this.type, Unit]] = js.native
  
  /**
    * Called for enabled (running state) scripts on each tick.
    * @param dt - The delta time in seconds since the last frame.
    */
  var update: js.UndefOr[js.Function1[/* dt */ Double, Unit]] = js.native
}
object ScriptType {
  
  @JSImport("playcanvas", "ScriptType")
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
  @JSImport("playcanvas", "ScriptType.__getScriptName")
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
  @JSImport("playcanvas", "ScriptType.__name")
  @js.native
  def name: Any = js.native
  
  inline def name_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__name")(x.asInstanceOf[js.Any])
}
