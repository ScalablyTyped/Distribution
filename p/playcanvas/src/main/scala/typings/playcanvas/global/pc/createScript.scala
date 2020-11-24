package typings.playcanvas.global.pc

import typings.playcanvas.anon.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("pc.createScript")
@js.native
object createScript extends js.Object {
  
  /**
    * Create and register a new {@link pc.ScriptType}.
    * It returns new class type (constructor function), which is auto-registered to {@link pc.ScriptRegistry} using it's name.
    * This is the main interface to create Script Types, to define custom logic using JavaScript, that is used to create interaction for entities.
    * @example
    * var Turning = pc.createScript('turn');
    *
    * // define `speed` attribute that is available in Editor UI
    * Turning.attributes.add('speed', {
    *     type: 'number',
    *     default: 180,
    *     placeholder: 'deg/s'
    * });
    *
    * // runs every tick
    * Turning.prototype.update = function (dt) {
    *     this.entity.rotate(0, this.speed * dt, 0);
    * };
    * @param name - Unique Name of a Script Type.
    * If a Script Type with the same name has already been registered and the new one has a `swap` method defined in its prototype,
    * then it will perform hot swapping of existing Script Instances on entities using this new Script Type.
    * Note: There is a reserved list of names that cannot be used, such as list below as well as some starting from `_` (underscore):
    * system, entity, create, destroy, swap, move, scripts, onEnable, onDisable, onPostStateChange, has, on, off, fire, once, hasEvent.
    * @param [app] - Optional application handler, to choose which {@link pc.ScriptRegistry} to add a script to.
    * By default it will use `pc.Application.getApplication()` to get current {@link pc.Application}.
    * @returns A class type (constructor function) that inherits {@link pc.ScriptType},
    * which the developer is meant to further extend by adding attributes and prototype methods.
    */
  def apply(name: String): TypeofScriptType = js.native
  def apply(name: String, app: typings.playcanvas.pc.Application): TypeofScriptType = js.native
}
