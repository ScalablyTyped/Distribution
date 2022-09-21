package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../../math/vec3.js').Vec3} Vec3 */
/** @typedef {import('../../../scene/model.js').Model} Model */
/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').CollisionComponentSystem} CollisionComponentSystem */
/**
  * A collision volume. Use this in conjunction with a {@link RigidBodyComponent} to make a
  * collision volume that can be simulated using the physics engine.
  *
  * If the {@link Entity} does not have a {@link RigidBodyComponent} then this collision volume will
  * act as a trigger volume. When an entity with a dynamic or kinematic body enters or leaves an
  * entity with a trigger volume, both entities will receive trigger events.
  *
  * The following table shows all the events that can be fired between two Entities:
  *
  * |                                       | Rigid Body (Static)                                                   | Rigid Body (Dynamic or Kinematic)                                     | Trigger Volume                                      |
  * | ------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------- |
  * | **Rigid Body (Static)**               |                                                                       | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> |                                                     |
  * | **Rigid Body (Dynamic or Kinematic)** | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> | <ul><li>triggerenter</li><li>triggerleave</li></ul> |
  * | **Trigger Volume**                    |                                                                       | <ul><li>triggerenter</li><li>triggerleave</li></ul>                   |                                                     |
  *
  * @property {string} type The type of the collision volume. Can be:
  *
  * - "box": A box-shaped collision volume.
  * - "capsule": A capsule-shaped collision volume.
  * - "compound": A compound shape. Any descendant entities with a collision component
  * of type box, capsule, cone, cylinder or sphere will be combined into a single, rigid
  * shape.
  * - "cone": A cone-shaped collision volume.
  * - "cylinder": A cylinder-shaped collision volume.
  * - "mesh": A collision volume that uses a model asset as its shape.
  * - "sphere": A sphere-shaped collision volume.
  *
  * Defaults to "box".
  * @property {Vec3} halfExtents The half-extents of the box-shaped collision volume in the x, y and
  * z axes. Defaults to [0.5, 0.5, 0.5].
  * @property {number} radius The radius of the sphere, capsule, cylinder or cone-shaped collision
  * volumes. Defaults to 0.5.
  * @property {number} axis The local space axis with which the capsule, cylinder or cone-shaped
  * collision volume's length is aligned. 0 for X, 1 for Y and 2 for Z. Defaults to 1 (Y-axis).
  * @property {number} height The total height of the capsule, cylinder or cone-shaped collision
  * volume from tip to tip. Defaults to 2.
  * @property {Asset|number} asset The asset for the model of the mesh collision volume - can also
  * be an asset id. Defaults to null.
  * @property {Asset|number} renderAsset The render asset of the mesh collision volume - can also be
  * an asset id. Defaults to null. If not set then the asset property will be checked instead.
  * @property {Model} model The model that is added to the scene graph for the mesh collision
  * volume.
  * @augments Component
  */
@JSImport("playcanvas", "CollisionComponent")
@js.native
open class CollisionComponent protected () extends Component {
  /**
    * Create a new CollisionComponent.
    *
    * @param {CollisionComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: CollisionComponentSystem, entity: Entity) = this()
  
  /** @private */
  /* private */ var _compoundParent: Any = js.native
  
  /**
    * @param {*} shape - Ammo shape.
    * @returns {number|null} The shape's index in the child array of the compound shape.
    * @private
    */
  /* private */ var _getCompoundChildShapeIndex: Any = js.native
  
  /**
    * @param {GraphNode} parent - The parent node.
    * @private
    */
  /* private */ var _onInsert: Any = js.native
  
  /** @private */
  /* private */ var _updateCompound: Any = js.native
  
  var asset: Any = js.native
  
  def axis: Double = js.native
  def axis_=(arg: Double): Unit = js.native
  
  def halfExtents: Vec3 = js.native
  def halfExtents_=(arg: Vec3): Unit = js.native
  
  def height: Double = js.native
  def height_=(arg: Double): Unit = js.native
  
  def model: Model | Null = js.native
  def model_=(arg: Model | Null): Unit = js.native
  
  /**
    * @param {Asset} asset - Asset that was removed.
    * @private
    */
  /* private */ var onAssetRemoved: Any = js.native
  
  /** @private */
  /* private */ var onBeforeRemove: Any = js.native
  
  /**
    * @param {Asset} asset - Asset that was removed.
    * @private
    */
  /* private */ var onRenderAssetRemoved: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetAsset: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetAxis: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetHalfExtents: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetHeight: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetModel: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetRadius: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetRender: Any = js.native
  
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetRenderAsset: Any = js.native
  
  /**
    * The 'contact' event is fired when a contact occurs between two rigid bodies.
    *
    * @event CollisionComponent#contact
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies start touching.
    *
    * @event CollisionComponent#collisionstart
    * @param {ContactResult} result - Details of the contact between the two Entities.
    */
  /**
    * Fired two rigid-bodies stop touching.
    *
    * @event CollisionComponent#collisionend
    * @param {Entity} other - The {@link Entity} that stopped touching this collision volume.
    */
  /**
    * Fired when a rigid body enters a trigger volume.
    *
    * @event CollisionComponent#triggerenter
    * @param {Entity} other - The {@link Entity} that entered this collision volume.
    */
  /**
    * Fired when a rigid body exits a trigger volume.
    *
    * @event CollisionComponent#triggerleave
    * @param {Entity} other - The {@link Entity} that exited this collision volume.
    */
  /**
    * @param {string} name - Property name.
    * @param {*} oldValue - Previous value of the property.
    * @param {*} newValue - New value of the property.
    * @private
    */
  /* private */ var onSetType: Any = js.native
  
  def radius: Double = js.native
  def radius_=(arg: Double): Unit = js.native
  
  var renderAsset: Any = js.native
  
  def `type`: String = js.native
  def type_=(arg: String): Unit = js.native
}
