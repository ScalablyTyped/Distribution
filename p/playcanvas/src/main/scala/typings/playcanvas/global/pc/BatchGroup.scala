package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds mesh batching settings and a unique id. Created via {@link pc.BatchManager#addGroup}.
  * @property dynamic - Whether objects within this batch group should support transforming at runtime.
  * @property maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @property id - Unique id. Can be assigned to model and element components.
  * @property name - Name of the group.
  * @property [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  * @param id - Unique id. Can be assigned to model and element components.
  * @param name - The name of the group.
  * @param dynamic - Whether objects within this batch group should support transforming at runtime.
  * @param maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @param [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  */
@JSGlobal("pc.BatchGroup")
@js.native
class BatchGroup protected ()
  extends typings.playcanvas.pc.BatchGroup {
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double) = this()
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double, layers: js.Array[Double]) = this()
}

