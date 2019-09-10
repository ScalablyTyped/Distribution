package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Entity
  * @extends pc.GraphNode
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
  */
@JSImport("playcanvas", "Entity")
@js.native
class Entity ()
  extends typings.playcanvas.pcNs.Entity {
  def this(name: String) = this()
  def this(name: String, app: typings.playcanvas.pcNs.Application) = this()
}

