package typings.playcanvas.pc

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.TypeofScriptType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ScriptRegistry.
  * Note: PlayCanvas scripts can access the Script Registry from inside the application with {@link pc.Application#scripts} {@link pc.ADDRESS_REPEAT}.
  * @param app - Application to attach registry to.
  */
@js.native
trait ScriptRegistry
  extends StObject
     with EventHandler {
  
  /**
    * Add {@link pc.ScriptType} to registry.
    * Note: when {@link pc.createScript} is called, it will add the {@link pc.ScriptType} to the registry automatically.
    * If a script already exists in registry, and the new script has a `swap` method defined,
    * it will perform code hot swapping automatically in async manner.
    * @example
    * var PlayerController = pc.createScript('playerController');
    * // playerController Script Type will be added to pc.ScriptRegistry automatically
    * console.log(app.scripts.has('playerController')); // outputs true
    * @param script - Script Type that is created using {@link pc.createScript}.
    * @returns True if added for the first time or false if script already exists.
    */
  def add(script: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  
  /**
    * Get {@link pc.ScriptType} by name.
    * @example
    * var PlayerController = app.scripts.get('playerController');
    * @param name - Name of a {@link pc.ScriptType}.
    * @returns The Script Type if it exists in the registry or null otherwise.
    */
  def get(name: String): TypeofScriptType & (Instantiable1[/* args */ App, ScriptType]) = js.native
  
  def has(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Check if a {@link pc.ScriptType} with the specified name is in the registry.
    * @example
    * if (app.scripts.has('playerController')) {
    *     // playerController is in pc.ScriptRegistry
    * }
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @returns True if {@link pc.ScriptType} is in registry.
    */
  def has(nameOrType: String): Boolean = js.native
  
  /**
    * Get list of all {@link pc.ScriptType}s from registry.
    * @example
    * // logs array of all Script Type names available in registry
    * console.log(app.scripts.list().map(function (o) {
    *     return o.name;
    * }));
    * @returns list of all {@link pc.ScriptType}s in registry.
    */
  def list(): js.Array[TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])] = js.native
  
  def remove(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Remove {@link pc.ScriptType}.
    * @example
    * app.scripts.remove('playerController');
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @returns True if removed or False if already not in registry.
    */
  def remove(nameOrType: String): Boolean = js.native
}
