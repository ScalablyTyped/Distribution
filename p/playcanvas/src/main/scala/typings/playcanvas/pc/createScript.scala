package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createScript")
@js.native
object createScript extends js.Object {
  /**
    * @static
    * @function
    * @name pc.createScript
    * @description Method to create named {@link ScriptType}.
    * It returns new function (class) "Script Type", which is auto-registered to {@link pc.ScriptRegistry} using it's name.
    * This is the main interface to create Script Types, to define custom logic using JavaScript, that is used to create interaction for entities.
    * @param {String} name unique Name of a Script Type.
    * If a Script Type with the same name has already been registered and the new one has a `swap` method defined in its prototype,
    * then it will perform hot swapping of existing Script Instances on entities using this new Script Type.
    * Note: There is a reserved list of names that cannot be used, such as list below as well as some starting from `_` (underscore):
    * system, entity, create, destroy, swap, move, scripts, onEnable, onDisable, onPostStateChange, has, on, off, fire, once, hasEvent
    * @param {pc.Application} [app] Optional application handler, to choose which {@link pc.ScriptRegistry} to add a script to.
    * By default it will use `pc.Application.getApplication()` to get current {@link pc.Application}.
    * @returns {Function} The constructor of a {@link ScriptType}, which the developer is meant to extend by adding attributes and prototype methods.
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
    * Turning.prototype.update = function(dt) {
    *     this.entity.rotate(0, this.speed * dt, 0);
    * };
    */
  def apply(name: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(name: String, app: Application): js.Function1[/* repeated */ js.Any, _] = js.native
}

