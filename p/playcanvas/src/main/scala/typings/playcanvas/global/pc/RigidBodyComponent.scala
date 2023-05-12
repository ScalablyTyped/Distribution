package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rigidbody component, when combined with a {@link CollisionComponent}, allows your entities
  * to be simulated using realistic physics. A rigidbody component will fall under gravity and
  * collide with other rigid bodies. Using scripts, you can apply forces and impulses to rigid
  * bodies.
  *
  * You should never need to use the RigidBodyComponent constructor. To add an RigidBodyComponent to
  * a {@link Entity}, use {@link Entity#addComponent}:
  *
  * ```javascript
  * // Create a static 1x1x1 box-shaped rigid body
  * const entity = pc.Entity();
  * entity.addComponent("rigidbody"); // Without options, this defaults to a 'static' body
  * entity.addComponent("collision"); // Without options, this defaults to a 1x1x1 box shape
  * ```
  *
  * To create a dynamic sphere with mass of 10, do:
  *
  * ```javascript
  * const entity = pc.Entity();
  * entity.addComponent("rigidbody", {
  *     type: pc.BODYTYPE_DYNAMIC,
  *     mass: 10
  * });
  * entity.addComponent("collision", {
  *     type: "sphere"
  * });
  * ```
  *
  * Relevant 'Engine-only' examples:
  *
  * - [Falling shapes](http://playcanvas.github.io/#physics/falling-shapes)
  * - [Vehicle physics](http://playcanvas.github.io/#physics/vehicle)
  *
  * @augments Component
  */
@JSGlobal("pc.RigidBodyComponent")
@js.native
open class RigidBodyComponent protected ()
  extends typings.playcanvas.mod.RigidBodyComponent {
  /**
    * Create a new RigidBodyComponent instance.
    *
    * @param {import('./system.js').RigidBodyComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity this component is attached to.
    */
  def this(system: typings.playcanvas.mod.RigidBodyComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
object RigidBodyComponent {
  
  @JSGlobal("pc.RigidBodyComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when a contact occurs between two rigid bodies.
    *
    * @event RigidBodyComponent#contact
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies start touching.
    *
    * @event RigidBodyComponent#collisionstart
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies stop touching.
    *
    * @event RigidBodyComponent#collisionend
    * @param {import('../../entity.js').Entity} other - The {@link Entity} that stopped touching this rigid body.
    */
  /**
    * Fired when a rigid body enters a trigger volume.
    *
    * @event RigidBodyComponent#triggerenter
    * @param {import('../../entity.js').Entity} other - The {@link Entity} with trigger volume that this rigid body entered.
    */
  /**
    * Fired when a rigid body exits a trigger volume.
    *
    * @event RigidBodyComponent#triggerleave
    * @param {import('../../entity.js').Entity} other - The {@link Entity} with trigger volume that this rigid body exited.
    */
  /** @ignore */
  /* static member */
  inline def onLibraryLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLibraryLoaded")().asInstanceOf[Unit]
}
