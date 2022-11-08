package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.TypeofScriptType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../app-base.js').AppBase} AppBase */
/** @typedef {import('./script-type.js').ScriptType} ScriptType */
/**
  * Container for all {@link ScriptType}s that are available to this application. Note that
  * PlayCanvas scripts can access the Script Registry from inside the application with
  * {@link AppBase#scripts}.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "ScriptRegistry")
@js.native
open class ScriptRegistry protected () extends EventHandler {
  /**
    * Create a new ScriptRegistry instance.
    *
    * @param {AppBase} app - Application to attach registry to.
    */
  def this(app: AppBase) = this()
  
  var _list: js.Array[Any] = js.native
  
  /**
    * Add {@link ScriptType} to registry. Note: when {@link createScript} is called, it will add
    * the {@link ScriptType} to the registry automatically. If a script already exists in
    * registry, and the new script has a `swap` method defined, it will perform code hot swapping
    * automatically in async manner.
    *
    * @param {typeof ScriptType} script - Script Type that is created using {@link createScript}.
    * @returns {boolean} True if added for the first time or false if script already exists.
    * @example
    * var PlayerController = pc.createScript('playerController');
    * // playerController Script Type will be added to pc.ScriptRegistry automatically
    * console.log(app.scripts.has('playerController')); // outputs true
    */
  def add(script: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  
  var app: AppBase = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Get {@link ScriptType} by name.
    *
    * @param {string} name - Name of a {@link ScriptType}.
    * @returns {typeof ScriptType} The Script Type if it exists in the registry or null otherwise.
    * @example
    * var PlayerController = app.scripts.get('playerController');
    */
  def get(name: String): TypeofScriptType & (Instantiable1[/* args */ App, ScriptType]) = js.native
  
  def has(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Check if a {@link ScriptType} with the specified name is in the registry.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {boolean} True if {@link ScriptType} is in registry.
    * @example
    * if (app.scripts.has('playerController')) {
    *     // playerController is in pc.ScriptRegistry
    * }
    */
  def has(nameOrType: String): Boolean = js.native
  
  /**
    * Get list of all {@link ScriptType}s from registry.
    *
    * @returns {Array<typeof ScriptType>} list of all {@link ScriptType}s in registry.
    * @example
    * // logs array of all Script Type names available in registry
    * console.log(app.scripts.list().map(function (o) {
    *     return o.name;
    * }));
    */
  def list(): js.Array[TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])] = js.native
  
  def remove(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Remove {@link ScriptType}.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {boolean} True if removed or False if already not in registry.
    * @example
    * app.scripts.remove('playerController');
    */
  def remove(nameOrType: String): Boolean = js.native
}
