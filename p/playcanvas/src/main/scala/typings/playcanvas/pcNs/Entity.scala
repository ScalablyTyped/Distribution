package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Entity
  * @classdesc The Entity is the core primitive of a PlayCanvas game. Generally speaking an object in your game will consist of an {@link pc.Entity},
  * and a set of {@link pc.Component}s which are managed by their respective {@link pc.ComponentSystem}s. One of those components maybe a
  * {@link pc.ScriptComponent} which allows you to write custom code to attach to your Entity.
  * <p>
  * The Entity uniquely identifies the object and also provides a transform for position and orientation
  * which it inherits from {@link pc.GraphNode} so can be added into the scene graph.
  * The Component and ComponentSystem provide the logic to give an Entity a specific type of behavior. e.g. the ability to
  * render a model or play a sound. Components are specific to an instance of an Entity and are attached (e.g. `this.entity.model`)
  * ComponentSystems allow access to all Entities and Components and are attached to the {@link pc.Application}.
  * @param {String} [name] The non-unique name of the entity, default is "Untitled".
  * @param {pc.Application} [app] The application the entity belongs to, default is the current application.
  * @property {pc.AnimationComponent} [animation] Gets the {@link pc.AnimationComponent} attached to this entity. [read only]
  * @property {pc.AudioListenerComponent} [audiolistener] Gets the {@link pc.AudioSourceComponent} attached to this entity. [read only]
  * @property {pc.ButtonComponent} [button] Gets the {@link pc.ButtonComponent} attached to this entity. [read only]
  * @property {pc.CameraComponent} [camera] Gets the {@link pc.CameraComponent} attached to this entity. [read only]
  * @property {pc.CollisionComponent} [collision] Gets the {@link pc.CollisionComponent} attached to this entity. [read only]
  * @property {pc.ElementComponent} [element] Gets the {@link pc.ElementComponent} attached to this entity. [read only]
  * @property {pc.LayoutChildComponent} [layoutchild] Gets the {@link pc.LayoutChildComponent} attached to this entity. [read only]
  * @property {pc.LayoutGroupComponent} [layoutgroup] Gets the {@link pc.LayoutGroupComponent} attached to this entity. [read only]
  * @property {pc.LightComponent} [light] Gets the {@link pc.LightComponent} attached to this entity. [read only]
  * @property {pc.ModelComponent} [model] Gets the {@link pc.ModelComponent} attached to this entity. [read only]
  * @property {pc.ParticleSystemComponent} [particlesystem] Gets the {@link pc.ParticleSystemComponent} attached to this entity. [read only]
  * @property {pc.RigidBodyComponent} [rigidbody] Gets the {@link pc.RigidBodyComponent} attached to this entity. [read only]
  * @property {pc.ScreenComponent} [screen] Gets the {@link pc.ScreenComponent} attached to this entity. [read only]
  * @property {pc.ScriptComponent} [script] Gets the {@link pc.ScriptComponent} attached to this entity. [read only]
  * @property {pc.ScrollViewComponent} [scrollview] Gets the {@link pc.ScrollViewComponent} attached to this entity. [read only]
  * @property {pc.SoundComponent} [sound] Gets the {@link pc.SoundComponent} attached to this entity. [read only]
  * @property {pc.SpriteComponent} [sprite] Gets the {@link pc.SpriteComponent} attached to this entity. [read only]
  * @example
  * var app = ... // Get the pc.Application
  *
  * var entity = new pc.Entity();
  *
  * // Add a Component to the Entity
  * entity.addComponent("camera", {
  *   fov: 45,
  *   nearClip: 1,
  *   farClip: 10000
  * });
  *
  * // Add the Entity into the scene graph
  * app.root.addChild(entity);
  *
  * // Move the entity
  * entity.translate(10, 0, 0);
  *
  * // Or translate it by setting it's position directly
  * var p = entity.getPosition();
  * entity.setPosition(p.x + 10, p.y, p.z);
  *
  * // Change the entity's rotation in local space
  * var e = entity.getLocalEulerAngles();
  * entity.setLocalEulerAngles(e.x, e.y + 90, e.z);
  *
  * // Or use rotateLocal
  * entity.rotateLocal(0, 90, 0);
  *
  * @extends pc.GraphNode
  */
@JSGlobal("pc.Entity")
@js.native
class Entity () extends GraphNode {
  def this(name: String) = this()
  def this(name: String, app: Application) = this()
  /**
    * Gets the {@link pc.AnimationComponent} attached to this entity. [read only]
    */
  var animation: js.UndefOr[AnimationComponent] = js.native
  /**
    * Gets the {@link pc.AudioSourceComponent} attached to this entity. [read only]
    */
  var audiolistener: js.UndefOr[AudioListenerComponent] = js.native
  /**
    * Gets the {@link pc.ButtonComponent} attached to this entity. [read only]
    */
  var button: js.UndefOr[ButtonComponent] = js.native
  /**
    * Gets the {@link pc.CameraComponent} attached to this entity. [read only]
    */
  var camera: js.UndefOr[CameraComponent] = js.native
  /**
    * Gets the {@link pc.CollisionComponent} attached to this entity. [read only]
    */
  var collision: js.UndefOr[CollisionComponent] = js.native
  /**
    * Gets the {@link pc.ElementComponent} attached to this entity. [read only]
    */
  var element: js.UndefOr[ElementComponent] = js.native
  /**
    * Gets the {@link pc.LayoutChildComponent} attached to this entity. [read only]
    */
  var layoutchild: js.UndefOr[LayoutChildComponent] = js.native
  /**
    * Gets the {@link pc.LayoutGroupComponent} attached to this entity. [read only]
    */
  var layoutgroup: js.UndefOr[LayoutGroupComponent] = js.native
  /**
    * Gets the {@link pc.LightComponent} attached to this entity. [read only]
    */
  var light: js.UndefOr[LightComponent] = js.native
  /**
    * Gets the {@link pc.ModelComponent} attached to this entity. [read only]
    */
  var model: js.UndefOr[ModelComponent] = js.native
  /**
    * Gets the {@link pc.ParticleSystemComponent} attached to this entity. [read only]
    */
  var particlesystem: js.UndefOr[ParticleSystemComponent] = js.native
  /**
    * Gets the {@link pc.RigidBodyComponent} attached to this entity. [read only]
    */
  var rigidbody: js.UndefOr[RigidBodyComponent] = js.native
  /**
    * Gets the {@link pc.ScreenComponent} attached to this entity. [read only]
    */
  var screen: js.UndefOr[ScreenComponent] = js.native
  /**
    * Gets the {@link pc.ScriptComponent} attached to this entity. [read only]
    */
  var script: js.UndefOr[ScriptComponent] = js.native
  /**
    * Gets the {@link pc.ScrollViewComponent} attached to this entity. [read only]
    */
  var scrollview: js.UndefOr[ScrollViewComponent] = js.native
  /**
    * Gets the {@link pc.SoundComponent} attached to this entity. [read only]
    */
  var sound: js.UndefOr[SoundComponent] = js.native
  /**
    * Gets the {@link pc.SpriteComponent} attached to this entity. [read only]
    */
  var sprite: js.UndefOr[SpriteComponent] = js.native
  /**
    * @function
    * @name pc.Entity#addComponent
    * @description Create a new component and add it to the entity.
    * Use this to add functionality to the entity like rendering a model, playing sounds and so on.
    * @param {String} type The name of the component to add. Valid strings are:
    * <ul>
    *   <li>"animation" - see {@link pc.AnimationComponent}</li>
    *   <li>"audiolistener" - see {@link pc.AudioListenerComponent}</li>
    *   <li>"button" - see {@link pc.ButtonComponent}</li>
    *   <li>"camera" - see {@link pc.CameraComponent}</li>
    *   <li>"collision" - see {@link pc.CollisionComponent}</li>
    *   <li>"element" - see {@link pc.ElementComponent}</li>
    *   <li>"layoutchild" - see {@link pc.LayoutChildComponent}</li>
    *   <li>"layoutgroup" - see {@link pc.LayoutGroupComponent}</li>
    *   <li>"light" - see {@link pc.LightComponent}</li>
    *   <li>"model" - see {@link pc.ModelComponent}</li>
    *   <li>"particlesystem" - see {@link pc.ParticleSystemComponent}</li>
    *   <li>"rigidbody" - see {@link pc.RigidBodyComponent}</li>
    *   <li>"screen" - see {@link pc.ScreenComponent}</li>
    *   <li>"script" - see {@link pc.ScriptComponent}</li>
    *   <li>"scrollbar" - see {@link pc.ScrollbarComponent}</li>
    *   <li>"scrollview" - see {@link pc.ScrollViewComponent}</li>
    *   <li>"sound" - see {@link pc.SoundComponent}</li>
    *   <li>"sprite" - see {@link pc.SpriteComponent}</li>
    * </ul>
    * @param {Object} data The initialization data for the specific component type. Refer to each
    * specific component's API reference page for details on valid values for this parameter.
    * @returns {pc.Component} The new Component that was attached to the entity or null if there
    * was an error.
    * @example
    * var entity = new pc.Entity();
    * entity.addComponent("light"); // Add a light component with default properties
    * entity.addComponent("camera", { // Add a camera component with some specified properties
    *   fov: 45,
    *   clearColor: new pc.Color(1,0,0),
    * });
    */
  def addComponent(`type`: String, data: js.Any): Component = js.native
  /**
    * @function
    * @name pc.Entity#destroy
    * @description Remove all components from the Entity and detach it from the Entity hierarchy. Then recursively destroy all ancestor Entities
    * @example
    * var firstChild = this.entity.children[0];
    * firstChild.destroy(); // delete child, all components and remove from hierarchy
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Entity#findByGuid
    * @description Find a descendant of this Entity with the GUID
    * @param {String} guid The GUID to search for.
    * @returns {pc.Entity} The Entity with the GUID or null
    */
  def findByGuid(guid: String): Entity = js.native
  /**
    * @function
    * @name pc.Entity#findComponent
    * @description Search the entity and all of its descendants for the first component of specified type.
    * @param {String} type The name of the component type to retrieve.
    * @returns {pc.Component} A component of specified type, if the entity or any of its descendants has
    * one. Returns undefined otherwise.
    * @example
    * // Get the first found light component in the hierarchy tree that starts with this entity
    * var light = entity.findComponent("light");
    */
  def findComponent(`type`: String): Component = js.native
  /**
    * @function
    * @name pc.Entity#findComponents
    * @description Search the entity and all of its descendants for all components of specified type.
    * @param {String} type The name of the component type to retrieve.
    * @returns {pc.Component} All components of specified type in the entity or any of its descendants.
    * Returns empty array if none found.
    * @example
    * // Get all light components in the hierarchy tree that starts with this entity
    * var lights = entity.findComponents("light");
    */
  def findComponents(`type`: String): Component = js.native
  /**
    * @function
    * @name pc.Entity#removeComponent
    * @description Remove a component from the Entity.
    * @param {String} type The name of the Component type
    * @example
    * var entity = new pc.Entity();
    * entity.addComponent("light"); // add new light component
    * //...
    * entity.removeComponent("light"); // remove light component
    */
  def removeComponent(`type`: String): Unit = js.native
}

