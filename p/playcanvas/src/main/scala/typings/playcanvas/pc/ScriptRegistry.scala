package typings.playcanvas.pc

import typings.playcanvas.ScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptRegistry
  * @extends pc.EventHandler
  * @classdesc Container for all Script Types that are available to this application
  * @description Create an instance of a pc.ScriptRegistry.
  * Note: PlayCanvas scripts can access the Script Registry from inside the application with {@link pc.Application#scripts} {@link pc.ADDRESS_REPEAT}.
  * @param {pc.Application} app Application to attach registry to.
  */
@JSGlobal("pc.ScriptRegistry")
@js.native
class ScriptRegistry protected () extends EventHandler {
  def this(app: Application) = this()
  /**
    * @function
    * @name pc.ScriptRegistry#add
    * @description Add {@link ScriptType} to registry.
    * Note: when {@link pc.createScript} is called, it will add the {@link ScriptType} to the registry automatically.
    * If a script already exists in registry, and the new script has a `swap` method defined,
    * it will perform code hot swapping automatically in async manner.
    * @param {ScriptType} script Script Type that is created using {@link pc.createScript}
    * @returns {Boolean} True if added for the first time or false if script already exists
    * @example
    * var PlayerController = pc.createScript('playerController');
    * // playerController Script Type will be added to pc.ScriptRegistry automatically
    * app.scripts.has('playerController') === true; // true
    */
  def add(script: ScriptType): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptRegistry#get
    * @description Get {@link ScriptType} by name.
    * @param {String} name Name of a {@link ScriptType}.
    * @returns {ScriptType} The Script Type if it exists in the registry or null otherwise.
    * @example
    * var PlayerController = app.scripts.get('playerController');
    */
  def get(name: String): ScriptType = js.native
  /**
    * @function
    * @name pc.ScriptRegistry#has
    * @description Check if a {@link ScriptType} with the specified name is in the registry.
    * @param {String} name Name of a {@link ScriptType}
    * @returns {Boolean} True if {@link ScriptType} is in registry
    * @example
    * if (app.scripts.has('playerController')) {
    *     // playerController is in pc.ScriptRegistry
    * }
    */
  def has(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptRegistry#list
    * @description Get list of all {@link ScriptType}s from registry.
    * @returns {ScriptType[]} list of all {@link ScriptType}s in registry
    * @example
    * // logs array of all Script Type names available in registry
    * console.log(app.scripts.list().map(function(o) {
    *     return o.name;
    * }));
    */
  def list(): js.Array[ScriptType] = js.native
  /**
    * @function
    * @name pc.ScriptRegistry#remove
    * @description Remove {@link ScriptType}.
    * @param {String} name Name of a {@link ScriptType} to remove
    * @returns {Boolean} True if removed or False if already not in registry
    * @example
    * app.scripts.remove('playerController');
    */
  def remove(name: String): Boolean = js.native
}

