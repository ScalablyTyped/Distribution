package typings.playcanvas.pc

import typings.playcanvas.anon.Enabled
import typings.playcanvas.anon.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ScriptComponent allows you to extend the functionality of an Entity by attaching your own Script Types defined in JavaScript files
  * to be executed with access to the Entity. For more details on scripting see <a href="//developer.playcanvas.com/user-manual/scripting/">Scripting</a>.
  * @property scripts - An array of all script instances attached to an entity. This Array shall not be modified by developer.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait ScriptComponent extends Component {
  
  /**
    * Create a script instance and attach to an entity script component.
    * @example
    * entity.script.create('playerController', {
    *     attributes: {
    *         speed: 4
    *     }
    * });
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @param [args] - Object with arguments for a script.
    * @param [args.enabled] - If script instance is enabled after creation. Defaults to true.
    * @param [args.attributes] - Object with values for attributes (if any), where key is name of an attribute.
    * @param [args.preloading] - If script instance is created during preload. If true, script and attributes must be initialized manually. Defaults to false.
    * @param [args.ind] - The index where to insert the script instance at. Defaults to -1, which means append it at the end.
    * @returns Returns an instance of a {@link pc.ScriptType} if successfully attached to an entity,
    * or null if it failed because a script with a same name has already been added
    * or if the {@link pc.ScriptType} cannot be found by name in the {@link pc.ScriptRegistry}.
    */
  def create(nameOrType: String): ScriptType = js.native
  def create(nameOrType: String, args: Enabled): ScriptType = js.native
  def create(nameOrType: TypeofScriptType): ScriptType = js.native
  def create(nameOrType: TypeofScriptType, args: Enabled): ScriptType = js.native
  
  /**
    * Destroy the script instance that is attached to an entity.
    * @example
    * entity.script.destroy('playerController');
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @returns If it was successfully destroyed.
    */
  def destroy(nameOrType: String): Boolean = js.native
  def destroy(nameOrType: TypeofScriptType): Boolean = js.native
  
  /**
    * Get a script instance (if attached).
    * @example
    * var controller = entity.script.get('playerController');
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @returns If script is attached, the instance is returned. Otherwise null is returned.
    */
  def get(nameOrType: String): ScriptType | Null = js.native
  def get(nameOrType: TypeofScriptType): ScriptType | Null = js.native
  
  /**
    * Detect if script is attached to an entity.
    * @example
    * if (entity.script.has('playerController')) {
    *     // entity has script
    * }
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @returns If script is attached to an entity.
    */
  def has(nameOrType: String): Boolean = js.native
  def has(nameOrType: TypeofScriptType): Boolean = js.native
  
  /**
    * Move script instance to different position to alter update order of scripts within entity.
    * @example
    * entity.script.move('playerController', 0);
    * @param nameOrType - The name or type of {@link pc.ScriptType}.
    * @param ind - New position index.
    * @returns If it was successfully moved.
    */
  def move(nameOrType: String, ind: Double): Boolean = js.native
  def move(nameOrType: TypeofScriptType, ind: Double): Boolean = js.native
  
  /**
    * An array of all script instances attached to an entity. This Array shall not be modified by developer.
    */
  var scripts: js.Array[ScriptType] = js.native
}
