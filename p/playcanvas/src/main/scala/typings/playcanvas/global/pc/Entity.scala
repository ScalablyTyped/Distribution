package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSGlobal("pc.Entity")
@js.native
class Entity ()
  extends typings.playcanvas.pc.Entity {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], app: typings.playcanvas.pc.Application) = this()
  def this(name: String, app: typings.playcanvas.pc.Application) = this()
}
