package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Entity is the core primitive of a PlayCanvas game. Generally speaking an object in your game
  * will consist of an {@link Entity}, and a set of {@link Component}s which are managed by their
  * respective {@link ComponentSystem}s. One of those components maybe a {@link ScriptComponent}
  * which allows you to write custom code to attach to your Entity.
  *
  * The Entity uniquely identifies the object and also provides a transform for position and
  * orientation which it inherits from {@link GraphNode} so can be added into the scene graph. The
  * Component and ComponentSystem provide the logic to give an Entity a specific type of behavior.
  * e.g. the ability to render a model or play a sound. Components are specific to an instance of an
  * Entity and are attached (e.g. `this.entity.model`) ComponentSystems allow access to all Entities
  * and Components and are attached to the {@link AppBase}.
  *
  * @augments GraphNode
  */
@JSImport("playcanvas", "Entity")
@js.native
/**
  * Create a new Entity.
  *
  * @param {string} [name] - The non-unique name of the entity, default is "Untitled".
  * @param {AppBase} [app] - The application the entity belongs to, default is the current application.
  * @example
  * var entity = new pc.Entity();
  *
  * // Add a Component to the Entity
  * entity.addComponent("camera", {
  *     fov: 45,
  *     nearClip: 1,
  *     farClip: 10000
  * });
  *
  * // Add the Entity into the scene graph
  * app.root.addChild(entity);
  *
  * // Move the entity
  * entity.translate(10, 0, 0);
  *
  * // Or translate it by setting its position directly
  * var p = entity.getPosition();
  * entity.setPosition(p.x + 10, p.y, p.z);
  *
  * // Change the entity's rotation in local space
  * var e = entity.getLocalEulerAngles();
  * entity.setLocalEulerAngles(e.x, e.y + 90, e.z);
  *
  * // Or use rotateLocal
  * entity.rotateLocal(0, 90, 0);
  */
open class Entity () extends GraphNode {
  def this(name: String) = this()
  def this(name: String, app: AppBase) = this()
  def this(name: Unit, app: AppBase) = this()
  
  /**
    * @type {AppBase}
    * @private
    */
  /* private */ var _app: Any = js.native
  
  /**
    * @param {Object<string, Entity>} duplicatedIdsMap - A map of original entity GUIDs to cloned
    * entities.
    * @returns {this} A new Entity which is a deep copy of the original.
    * @private
    */
  /* private */ var _cloneRecursively: Any = js.native
  
  /**
    * Used by component systems to speed up destruction.
    *
    * @type {boolean}
    * @ignore
    */
  var _destroying: Boolean = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var _guid: Any = js.native
  
  /** @private */
  /* private */ var _onHierarchyStatePostChanged: Any = js.native
  
  /**
    * Used to differentiate between the entities of a template root instance, which have it set to
    * true, and the cloned instance entities (set to false).
    *
    * @type {boolean}
    * @ignore
    */
  var _template: Boolean = js.native
  
  /**
    * Create a new component and add it to the entity. Use this to add functionality to the entity
    * like rendering a model, playing sounds and so on.
    *
    * @param {string} type - The name of the component to add. Valid strings are:
    *
    * - "anim" - see {@link AnimComponent}
    * - "animation" - see {@link AnimationComponent}
    * - "audiolistener" - see {@link AudioListenerComponent}
    * - "button" - see {@link ButtonComponent}
    * - "camera" - see {@link CameraComponent}
    * - "collision" - see {@link CollisionComponent}
    * - "element" - see {@link ElementComponent}
    * - "layoutchild" - see {@link LayoutChildComponent}
    * - "layoutgroup" - see {@link LayoutGroupComponent}
    * - "light" - see {@link LightComponent}
    * - "model" - see {@link ModelComponent}
    * - "particlesystem" - see {@link ParticleSystemComponent}
    * - "render" - see {@link RenderComponent}
    * - "rigidbody" - see {@link RigidBodyComponent}
    * - "screen" - see {@link ScreenComponent}
    * - "script" - see {@link ScriptComponent}
    * - "scrollbar" - see {@link ScrollbarComponent}
    * - "scrollview" - see {@link ScrollViewComponent}
    * - "sound" - see {@link SoundComponent}
    * - "sprite" - see {@link SpriteComponent}
    *
    * @param {object} [data] - The initialization data for the specific component type. Refer to
    * each specific component's API reference page for details on valid values for this parameter.
    * @returns {Component|null} The new Component that was attached to the entity or null if there
    * was an error.
    * @example
    * var entity = new pc.Entity();
    *
    * // Add a light component with default properties
    * entity.addComponent("light");
    *
    * // Add a camera component with some specified properties
    * entity.addComponent("camera", {
    *     fov: 45,
    *     clearColor: new pc.Color(1, 0, 0)
    * });
    */
  def addComponent(`type`: String): Component | Null = js.native
  def addComponent(`type`: String, data: js.Object): Component | Null = js.native
  
  /**
    * Gets the {@link AnimComponent} attached to this entity.
    *
    * @type {AnimComponent|undefined}
    * @readonly
    */
  val anim: js.UndefOr[AnimComponent] = js.native
  
  /**
    * Gets the {@link AnimationComponent} attached to this entity.
    *
    * @type {AnimationComponent|undefined}
    * @readonly
    */
  val animation: js.UndefOr[AnimationComponent] = js.native
  
  /**
    * Gets the {@link AudioListenerComponent} attached to this entity.
    *
    * @type {AudioListenerComponent|undefined}
    * @readonly
    */
  val audiolistener: js.UndefOr[AudioListenerComponent] = js.native
  
  /**
    * Gets the {@link ButtonComponent} attached to this entity.
    *
    * @type {ButtonComponent|undefined}
    * @readonly
    */
  val button: js.UndefOr[ButtonComponent] = js.native
  
  /**
    * Component storage.
    *
    * @type {Object<string, Component>}
    * @ignore
    */
  var c: StringDictionary[Component] = js.native
  
  /**
    * Gets the {@link CameraComponent} attached to this entity.
    *
    * @type {CameraComponent|undefined}
    * @readonly
    */
  val camera: js.UndefOr[CameraComponent] = js.native
  
  /**
    * Gets the {@link CollisionComponent} attached to this entity.
    *
    * @type {CollisionComponent|undefined}
    * @readonly
    */
  val collision: js.UndefOr[CollisionComponent] = js.native
  
  /**
    * Remove all components from the Entity and detach it from the Entity hierarchy. Then
    * recursively destroy all ancestor Entities.
    *
    * @example
    * var firstChild = this.entity.children[0];
    * firstChild.destroy(); // delete child, all components and remove from hierarchy
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the {@link ElementComponent} attached to this entity.
    *
    * @type {ElementComponent|undefined}
    * @readonly
    */
  val element: js.UndefOr[ElementComponent] = js.native
  
  /**
    * Find a descendant of this entity with the GUID.
    *
    * @param {string} guid - The GUID to search for.
    * @returns {Entity|null} The entity with the matching GUID or null if no entity is found.
    */
  def findByGuid(guid: String): Entity | Null = js.native
  
  /**
    * Search the entity and all of its descendants for the first component of specified type.
    *
    * @param {string} type - The name of the component type to retrieve.
    * @returns {Component} A component of specified type, if the entity or any of its descendants
    * has one. Returns undefined otherwise.
    * @example
    * // Get the first found light component in the hierarchy tree that starts with this entity
    * var light = entity.findComponent("light");
    */
  def findComponent(`type`: String): Component = js.native
  
  /**
    * Search the entity and all of its descendants for all components of specified type.
    *
    * @param {string} type - The name of the component type to retrieve.
    * @returns {Component[]} All components of specified type in the entity or any of its
    * descendants. Returns empty array if none found.
    * @example
    * // Get all light components in the hierarchy tree that starts with this entity
    * var lights = entity.findComponents("light");
    */
  def findComponents(`type`: String): js.Array[Component] = js.native
  
  /**
    * Get the GUID value for this Entity.
    *
    * @returns {string} The GUID of the Entity.
    * @ignore
    */
  def getGuid(): String = js.native
  
  /**
    * Gets the {@link LayoutChildComponent} attached to this entity.
    *
    * @type {LayoutChildComponent|undefined}
    * @readonly
    */
  val layoutchild: js.UndefOr[LayoutChildComponent] = js.native
  
  /**
    * Gets the {@link LayoutGroupComponent} attached to this entity.
    *
    * @type {LayoutGroupComponent|undefined}
    * @readonly
    */
  val layoutgroup: js.UndefOr[LayoutGroupComponent] = js.native
  
  /**
    * Gets the {@link LightComponent} attached to this entity.
    *
    * @type {LightComponent|undefined}
    * @readonly
    */
  val light: js.UndefOr[LightComponent] = js.native
  
  /**
    * Gets the {@link ModelComponent} attached to this entity.
    *
    * @type {ModelComponent|undefined}
    * @readonly
    */
  val model: js.UndefOr[ModelComponent] = js.native
  
  /**
    * Gets the {@link ParticleSystemComponent} attached to this entity.
    *
    * @type {ParticleSystemComponent|undefined}
    * @readonly
    */
  val particlesystem: js.UndefOr[ParticleSystemComponent] = js.native
  
  /**
    * Remove a component from the Entity.
    *
    * @param {string} type - The name of the Component type.
    * @example
    * var entity = new pc.Entity();
    * entity.addComponent("light"); // add new light component
    *
    * entity.removeComponent("light"); // remove light component
    */
  def removeComponent(`type`: String): Unit = js.native
  
  /**
    * Gets the {@link RenderComponent} attached to this entity.
    *
    * @type {RenderComponent|undefined}
    * @readonly
    */
  val render: js.UndefOr[RenderComponent] = js.native
  
  /**
    * Gets the {@link RigidBodyComponent} attached to this entity.
    *
    * @type {RigidBodyComponent|undefined}
    * @readonly
    */
  val rigidbody: js.UndefOr[RigidBodyComponent] = js.native
  
  /**
    * Gets the {@link ScreenComponent} attached to this entity.
    *
    * @type {ScreenComponent|undefined}
    * @readonly
    */
  val screen: js.UndefOr[ScreenComponent] = js.native
  
  /**
    * Gets the {@link ScriptComponent} attached to this entity.
    *
    * @type {ScriptComponent|undefined}
    * @readonly
    */
  val script: js.UndefOr[ScriptComponent] = js.native
  
  /**
    * Gets the {@link ScrollbarComponent} attached to this entity.
    *
    * @type {ScrollbarComponent|undefined}
    * @readonly
    */
  val scrollbar: js.UndefOr[ScrollbarComponent] = js.native
  
  /**
    * Gets the {@link ScrollViewComponent} attached to this entity.
    *
    * @type {ScrollViewComponent|undefined}
    * @readonly
    */
  val scrollview: js.UndefOr[ScrollViewComponent] = js.native
  
  /**
    * Set the GUID value for this Entity. Note that it is unlikely that you should need to change
    * the GUID value of an Entity at run-time. Doing so will corrupt the graph this Entity is in.
    *
    * @param {string} guid - The GUID to assign to the Entity.
    * @ignore
    */
  def setGuid(guid: String): Unit = js.native
  
  /**
    * Gets the {@link SoundComponent} attached to this entity.
    *
    * @type {SoundComponent|undefined}
    * @readonly
    */
  val sound: js.UndefOr[SoundComponent] = js.native
  
  /**
    * Gets the {@link SpriteComponent} attached to this entity.
    *
    * @type {SpriteComponent|undefined}
    * @readonly
    */
  val sprite: js.UndefOr[SpriteComponent] = js.native
}
