package typings.playcanvas.pc

import typings.playcanvas.AnonAttributes
import typings.playcanvas.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ScriptComponent
  * @augments pc.Component
  * @classdesc The ScriptComponent allows you to extend the functionality of an Entity by attaching your own Script Types defined in JavaScript files
  * to be executed with access to the Entity. For more details on scripting see <a href="//developer.playcanvas.com/user-manual/scripting/">Scripting</a>.
  * @param {pc.ScriptComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {pc.ScriptType[]} scripts An array of all script instances attached to an entity. This Array shall not be modified by developer.
  */
@JSGlobal("pc.ScriptComponent")
@js.native
class ScriptComponent protected () extends Component {
  def this(system: ScriptComponentSystem, entity: Entity) = this()
  /**
    * An array of all script instances attached to an entity. This Array shall not be modified by developer.
    */
  var scripts: js.Array[ScriptType] = js.native
  /**
    * @function
    * @name pc.ScriptComponent#create
    * @description Create a script instance using name of a {@link pc.ScriptType} and attach to an entity script component.
    * @param {string|Class<pc.ScriptType>} name - The name of the Script Type (or alternatively the {@link pc.ScriptType} to instantiate).
    * @param {object} [args] - Object with arguments for a script.
    * @param {boolean} [args.enabled] - If script instance is enabled after creation. Defaults to true.
    * @param {object} [args.attributes] - Object with values for attributes (if any), where key is name of an attribute.
    * @param {boolean} [args.preloading] - If script instance is created during preload. If true, script and attributes must be initialized manually. Defaults to false.
    * @param {number} [args.ind] - The index where to insert the script instance at. Defaults to -1, which means append it at the end.
    * @returns {pc.ScriptType} Returns an instance of a {@link pc.ScriptType} if successfully attached to an entity,
    * or null if it failed because a script with a same name has already been added
    * or if the {@link pc.ScriptType} cannot be found by name in the {@link pc.ScriptRegistry}.
    * @example
    * entity.script.create('playerController', {
    *     attributes: {
    *         speed: 4
    *     }
    * });
    */
  def create(name: String): ScriptType = js.native
  def create(name: String, args: AnonAttributes): ScriptType = js.native
  def create(name: TypeofScriptType): ScriptType = js.native
  def create(name: TypeofScriptType, args: AnonAttributes): ScriptType = js.native
  /**
    * @function
    * @name pc.ScriptComponent#destroy
    * @description Destroy the script instance that is attached to an entity.
    * @param {string} name - The name of the Script Type.
    * @returns {boolean} If it was successfully destroyed.
    * @example
    * entity.script.destroy('playerController');
    */
  def destroy(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptComponent#get
    * @description Get a script instance (if attached) using name of {@link pc.ScriptType}.
    * @param {string} name - The name of the Script Type.
    * @returns {pc.ScriptType|null} If script is attached, the instance is returned. Otherwise null is returned.
    * @example
    * var controller = entity.script.get('playerController');
    */
  def get(name: String): ScriptType | Null = js.native
  /**
    * @function
    * @name pc.ScriptComponent#has
    * @description Detect if script is attached to an entity using name of {@link pc.ScriptType}.
    * @param {string} name - The name of the Script Type.
    * @returns {boolean} If script is attached to an entity.
    * @example
    * if (entity.script.has('playerController')) {
    *     // entity has script
    * }
    */
  def has(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptComponent#move
    * @description Move script instance to different position to alter update order of scripts within entity.
    * @param {string} name - The name of the Script Type.
    * @param {number} ind - New position index.
    * @returns {boolean} If it was successfully moved.
    * @example
    * entity.script.move('playerController', 0);
    */
  def move(name: String, ind: Double): Boolean = js.native
}

