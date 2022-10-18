package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.Enabled
import typings.playcanvas.anon.TypeofScriptType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').ScriptComponentSystem} ScriptComponentSystem */
/**
  * The ScriptComponent allows you to extend the functionality of an Entity by attaching your own
  * Script Types defined in JavaScript files to be executed with access to the Entity. For more
  * details on scripting see [Scripting](https://developer.playcanvas.com/user-manual/scripting/).
  *
  * @augments Component
  */
@js.native
trait ScriptComponent extends Component {
  
  def _beginLooping(): Boolean = js.native
  
  var _beingEnabled: Boolean = js.native
  
  def _checkState(): Unit = js.native
  
  var _destroyed: Boolean = js.native
  
  var _destroyedScripts: js.Array[Any] = js.native
  
  var _enabled: Boolean = js.native
  
  def _endLooping(wasLoopingBefore: Any): Unit = js.native
  
  var _executionOrder: Double = js.native
  
  /**
    * Inserts script instance into the scripts array at the specified index. Also inserts the
    * script into the update list if it has an update method and the post update list if it has a
    * postUpdate method.
    *
    * @param {object} scriptInstance - The script instance.
    * @param {number} index - The index where to insert the script at. If -1, append it at the end.
    * @param {number} scriptsLength - The length of the scripts array.
    * @private
    */
  /* private */ var _insertScriptInstance: Any = js.native
  
  var _isLoopingThroughScripts: Boolean = js.native
  
  var _oldState: Boolean = js.native
  
  def _onBeforeRemove(): Unit = js.native
  
  def _onInitialize(): Unit = js.native
  
  def _onInitializeAttributes(): Unit = js.native
  
  def _onPostInitialize(): Unit = js.native
  
  def _onPostUpdate(dt: Any): Unit = js.native
  
  def _onSetEnabled(prop: Any, old: Any, value: Any): Unit = js.native
  
  def _onUpdate(dt: Any): Unit = js.native
  
  var _postUpdateList: SortedLoopArray = js.native
  
  def _removeDestroyedScripts(): Unit = js.native
  
  def _removeScriptInstance(scriptInstance: Any): Double = js.native
  
  def _resetExecutionOrder(startIndex: Any, scriptsLength: Any): Unit = js.native
  
  def _resolveEntityScriptAttribute(
    attribute: Any,
    attributeName: Any,
    oldValue: Any,
    useGuid: Any,
    newAttributes: Any,
    duplicatedIdsMap: Any
  ): Unit = js.native
  
  def _scriptMethod(script: Any, method: Any, arg: Any): Unit = js.native
  
  /**
    * Holds all script instances for this component.
    *
    * @type {ScriptType[]}
    * @private
    */
  /* private */ var _scripts: Any = js.native
  
  var _scriptsData: js.Array[ScriptType] = js.native
  
  var _updateList: SortedLoopArray = js.native
  
  def create(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): ScriptType | Null = js.native
  def create(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType]), args: Enabled): ScriptType | Null = js.native
  /**
    * Create a script instance and attach to an entity script component.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @param {object} [args] - Object with arguments for a script.
    * @param {boolean} [args.enabled] - If script instance is enabled after creation. Defaults to
    * true.
    * @param {object} [args.attributes] - Object with values for attributes (if any), where key is
    * name of an attribute.
    * @param {boolean} [args.preloading] - If script instance is created during preload. If true,
    * script and attributes must be initialized manually. Defaults to false.
    * @param {number} [args.ind] - The index where to insert the script instance at. Defaults to
    * -1, which means append it at the end.
    * @returns {ScriptType|null} Returns an instance of a {@link ScriptType} if successfully attached
    * to an entity, or null if it failed because a script with a same name has already been added
    * or if the {@link ScriptType} cannot be found by name in the {@link ScriptRegistry}.
    * @example
    * entity.script.create('playerController', {
    *     attributes: {
    *         speed: 4
    *     }
    * });
    */
  def create(nameOrType: String): ScriptType | Null = js.native
  def create(nameOrType: String, args: Enabled): ScriptType | Null = js.native
  
  def destroy(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Destroy the script instance that is attached to an entity.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {boolean} If it was successfully destroyed.
    * @example
    * entity.script.destroy('playerController');
    */
  def destroy(nameOrType: String): Boolean = js.native
  
  def get(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): ScriptType | Null = js.native
  /**
    * Get a script instance (if attached).
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {ScriptType|null} If script is attached, the instance is returned. Otherwise null
    * is returned.
    * @example
    * var controller = entity.script.get('playerController');
    */
  def get(nameOrType: String): ScriptType | Null = js.native
  
  def has(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Boolean = js.native
  /**
    * Detect if script is attached to an entity.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {boolean} If script is attached to an entity.
    * @example
    * if (entity.script.has('playerController')) {
    *     // entity has script
    * }
    */
  def has(nameOrType: String): Boolean = js.native
  
  def move(nameOrType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType]), ind: Double): Boolean = js.native
  /**
    * Move script instance to different position to alter update order of scripts within entity.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @param {number} ind - New position index.
    * @returns {boolean} If it was successfully moved.
    * @example
    * entity.script.move('playerController', 0);
    */
  def move(nameOrType: String, ind: Double): Boolean = js.native
  
  /**
    * When an entity is cloned and it has entity script attributes that point to other entities in
    * the same subtree that is cloned, then we want the new script attributes to point at the
    * cloned entities. This method remaps the script attributes for this entity and it assumes
    * that this entity is the result of the clone operation.
    *
    * @param {ScriptComponent} oldScriptComponent - The source script component that belongs to
    * the entity that was being cloned.
    * @param {object} duplicatedIdsMap - A dictionary with guid-entity values that contains the
    * entities that were cloned.
    * @private
    */
  /* private */ var resolveDuplicatedEntityReferenceProperties: Any = js.native
  
  def scripts: js.Array[ScriptType] = js.native
  /**
    * Fired when Component becomes enabled. Note: this event does not take in account entity or
    * any of its parent enabled state.
    *
    * @event ScriptComponent#enable
    * @example
    * entity.script.on('enable', function () {
    *     // component is enabled
    * });
    */
  /**
    * Fired when Component becomes disabled. Note: this event does not take in account entity or
    * any of its parent enabled state.
    *
    * @event ScriptComponent#disable
    * @example
    * entity.script.on('disable', function () {
    *     // component is disabled
    * });
    */
  /**
    * Fired when Component changes state to enabled or disabled. Note: this event does not take in
    * account entity or any of its parent enabled state.
    *
    * @event ScriptComponent#state
    * @param {boolean} enabled - True if now enabled, False if disabled.
    * @example
    * entity.script.on('state', function (enabled) {
    *     // component changed state
    * });
    */
  /**
    * Fired when Component is removed from entity.
    *
    * @event ScriptComponent#remove
    * @example
    * entity.script.on('remove', function () {
    *     // entity has no more script component
    * });
    */
  /**
    * Fired when a script instance is created and attached to component.
    *
    * @event ScriptComponent#create
    * @param {string} name - The name of the Script Type.
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been created.
    * @example
    * entity.script.on('create', function (name, scriptInstance) {
    *     // new script instance added to component
    * });
    */
  /**
    * Fired when a script instance is created and attached to component.
    *
    * @event ScriptComponent#create:[name]
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been created.
    * @example
    * entity.script.on('create:playerController', function (scriptInstance) {
    *     // new script instance 'playerController' is added to component
    * });
    */
  /**
    * Fired when a script instance is destroyed and removed from component.
    *
    * @event ScriptComponent#destroy
    * @param {string} name - The name of the Script Type.
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been destroyed.
    * @example
    * entity.script.on('destroy', function (name, scriptInstance) {
    *     // script instance has been destroyed and removed from component
    * });
    */
  /**
    * Fired when a script instance is destroyed and removed from component.
    *
    * @event ScriptComponent#destroy:[name]
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been destroyed.
    * @example
    * entity.script.on('destroy:playerController', function (scriptInstance) {
    *     // script instance 'playerController' has been destroyed and removed from component
    * });
    */
  /**
    * Fired when a script instance is moved in component.
    *
    * @event ScriptComponent#move
    * @param {string} name - The name of the Script Type.
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been moved.
    * @param {number} ind - New position index.
    * @param {number} indOld - Old position index.
    * @example
    * entity.script.on('move', function (name, scriptInstance, ind, indOld) {
    *     // script instance has been moved in component
    * });
    */
  /**
    * Fired when a script instance is moved in component.
    *
    * @event ScriptComponent#move:[name]
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that has been moved.
    * @param {number} ind - New position index.
    * @param {number} indOld - Old position index.
    * @example
    * entity.script.on('move:playerController', function (scriptInstance, ind, indOld) {
    *     // script instance 'playerController' has been moved in component
    * });
    */
  /**
    * Fired when a script instance had an exception.
    *
    * @event ScriptComponent#error
    * @param {ScriptType} scriptInstance - The instance of the {@link ScriptType} that raised the exception.
    * @param {Error} err - Native JS Error object with details of an error.
    * @param {string} method - The method of the script instance that the exception originated from.
    * @example
    * entity.script.on('error', function (scriptInstance, err, method) {
    *     // script instance caught an exception
    * });
    */
  /**
    * An array of all script instances attached to an entity. This array is read-only and should
    * not be modified by developer.
    *
    * @type {ScriptType[]}
    */
  def scripts_=(arg: js.Array[ScriptType]): Unit = js.native
  
  /**
    * Swap the script instance.
    *
    * @param {string|typeof ScriptType} nameOrType - The name or type of {@link ScriptType}.
    * @returns {boolean} If it was successfully swapped.
    * @private
    */
  /* private */ var swap: Any = js.native
}
