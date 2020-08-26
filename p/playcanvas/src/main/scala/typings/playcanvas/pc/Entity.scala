package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Entity is the core primitive of a PlayCanvas game. Generally speaking an object in your game will consist of an {@link pc.Entity},
  * and a set of {@link pc.Component}s which are managed by their respective {@link pc.ComponentSystem}s. One of those components maybe a
  * {@link pc.ScriptComponent} which allows you to write custom code to attach to your Entity.
  * <p>
  * The Entity uniquely identifies the object and also provides a transform for position and orientation
  * which it inherits from {@link pc.GraphNode} so can be added into the scene graph.
  * The Component and ComponentSystem provide the logic to give an Entity a specific type of behavior. e.g. the ability to
  * render a model or play a sound. Components are specific to an instance of an Entity and are attached (e.g. `this.entity.model`)
  * ComponentSystems allow access to all Entities and Components and are attached to the {@link pc.Application}.
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
  * @property [animation] - Gets the {@link pc.AnimationComponent} attached to this entity. [read only]
  * @property [audiolistener] - Gets the {@link pc.AudioSourceComponent} attached to this entity. [read only]
  * @property [button] - Gets the {@link pc.ButtonComponent} attached to this entity. [read only]
  * @property [camera] - Gets the {@link pc.CameraComponent} attached to this entity. [read only]
  * @property [collision] - Gets the {@link pc.CollisionComponent} attached to this entity. [read only]
  * @property [element] - Gets the {@link pc.ElementComponent} attached to this entity. [read only]
  * @property [layoutchild] - Gets the {@link pc.LayoutChildComponent} attached to this entity. [read only]
  * @property [layoutgroup] - Gets the {@link pc.LayoutGroupComponent} attached to this entity. [read only]
  * @property [light] - Gets the {@link pc.LightComponent} attached to this entity. [read only]
  * @property [model] - Gets the {@link pc.ModelComponent} attached to this entity. [read only]
  * @property [particlesystem] - Gets the {@link pc.ParticleSystemComponent} attached to this entity. [read only]
  * @property [rigidbody] - Gets the {@link pc.RigidBodyComponent} attached to this entity. [read only]
  * @property [screen] - Gets the {@link pc.ScreenComponent} attached to this entity. [read only]
  * @property [script] - Gets the {@link pc.ScriptComponent} attached to this entity. [read only]
  * @property [scrollview] - Gets the {@link pc.ScrollViewComponent} attached to this entity. [read only]
  * @property [sound] - Gets the {@link pc.SoundComponent} attached to this entity. [read only]
  * @property [sprite] - Gets the {@link pc.SpriteComponent} attached to this entity. [read only]
  * @param [name] - The non-unique name of the entity, default is "Untitled".
  * @param [app] - The application the entity belongs to, default is the current application.
  */
@js.native
trait Entity extends GraphNode {
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
    * Create a new component and add it to the entity.
    * Use this to add functionality to the entity like rendering a model, playing sounds and so on.
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
    * @param type - The name of the component to add. Valid strings are:
    *
    * * "animation" - see {@link pc.AnimationComponent}
    * * "audiolistener" - see {@link pc.AudioListenerComponent}
    * * "button" - see {@link pc.ButtonComponent}
    * * "camera" - see {@link pc.CameraComponent}
    * * "collision" - see {@link pc.CollisionComponent}
    * * "element" - see {@link pc.ElementComponent}
    * * "layoutchild" - see {@link pc.LayoutChildComponent}
    * * "layoutgroup" - see {@link pc.LayoutGroupComponent}
    * * "light" - see {@link pc.LightComponent}
    * * "model" - see {@link pc.ModelComponent}
    * * "particlesystem" - see {@link pc.ParticleSystemComponent}
    * * "rigidbody" - see {@link pc.RigidBodyComponent}
    * * "screen" - see {@link pc.ScreenComponent}
    * * "script" - see {@link pc.ScriptComponent}
    * * "scrollbar" - see {@link pc.ScrollbarComponent}
    * * "scrollview" - see {@link pc.ScrollViewComponent}
    * * "sound" - see {@link pc.SoundComponent}
    * * "sprite" - see {@link pc.SpriteComponent}
    * @param [data] - The initialization data for the specific component type. Refer to each
    * specific component's API reference page for details on valid values for this parameter.
    * @returns The new Component that was attached to the entity or null if there
    * was an error.
    */
  def addComponent(`type`: String): Component = js.native
  def addComponent(`type`: String, data: js.Any): Component = js.native
  /**
    * Remove all components from the Entity and detach it from the Entity hierarchy. Then recursively destroy all ancestor Entities.
    * @example
    * var firstChild = this.entity.children[0];
    * firstChild.destroy(); // delete child, all components and remove from hierarchy
    */
  def destroy(): Unit = js.native
  /**
    * Find a descendant of this Entity with the GUID.
    * @param guid - The GUID to search for.
    * @returns The Entity with the GUID or null.
    */
  def findByGuid(guid: String): Entity = js.native
  /**
    * Search the entity and all of its descendants for the first component of specified type.
    * @example
    * // Get the first found light component in the hierarchy tree that starts with this entity
    * var light = entity.findComponent("light");
    * @param type - The name of the component type to retrieve.
    * @returns A component of specified type, if the entity or any of its descendants has
    * one. Returns undefined otherwise.
    */
  def findComponent(`type`: String): Component = js.native
  /**
    * Search the entity and all of its descendants for all components of specified type.
    * @example
    * // Get all light components in the hierarchy tree that starts with this entity
    * var lights = entity.findComponents("light");
    * @param type - The name of the component type to retrieve.
    * @returns All components of specified type in the entity or any of its descendants.
    * Returns empty array if none found.
    */
  def findComponents(`type`: String): Component = js.native
  /**
    * Remove a component from the Entity.
    * @example
    * var entity = new pc.Entity();
    * entity.addComponent("light"); // add new light component
    *
    * entity.removeComponent("light"); // remove light component
    * @param type - The name of the Component type.
    */
  def removeComponent(`type`: String): Unit = js.native
}

