package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new CollisionComponent.
  * @property type - The type of the collision volume. Can be:
  *
  * * "box": A box-shaped collision volume.
  * * "capsule": A capsule-shaped collision volume.
  * * "compound": A compound shape. Any descendent entities with a collision component
  * of type box, capsule, cone, cylinder or sphere will be combined into a single, rigid
  * shape.
  * * "cone": A cone-shaped collision volume.
  * * "cylinder": A cylinder-shaped collision volume.
  * * "mesh": A collision volume that uses a model asset as its shape.
  * * "sphere": A sphere-shaped collision volume.
  *
  * Defaults to "box".
  * @property halfExtents - The half-extents of the box-shaped collision volume in the
  * x, y and z axes. Defaults to [0.5, 0.5, 0.5].
  * @property radius - The radius of the sphere, capsule, cylinder or cone-shaped collision
  * volumes. Defaults to 0.5.
  * @property axis - The local space axis with which the capsule, cylinder or cone-shaped
  * collision volume's length is aligned. 0 for X, 1 for Y and 2 for Z. Defaults to 1 (Y-axis).
  * @property height - The total height of the capsule, cylinder or cone-shaped collision
  * volume from tip to tip. Defaults to 2.
  * @property asset - The asset for the model of the mesh collision volume - can also be
  * an asset id. Defaults to null.
  * @property model - The model that is added to the scene graph for the mesh collision
  * volume.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.CollisionComponent")
@js.native
class CollisionComponent protected ()
  extends typings.playcanvas.pc.CollisionComponent {
  def this(system: typings.playcanvas.pc.CollisionComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

