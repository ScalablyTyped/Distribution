package typings.playcanvas.global.pc

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
@JSGlobal("pc.Entity")
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
open class Entity ()
  extends typings.playcanvas.mod.Entity {
  def this(name: String) = this()
  def this(name: String, app: typings.playcanvas.mod.AppBase) = this()
  def this(name: Unit, app: typings.playcanvas.mod.AppBase) = this()
}
