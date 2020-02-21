package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BatchGroup
  * @classdesc Holds mesh batching settings and a unique id. Created via {@link pc.BatchManager#addGroup}.
  * @param {number} id - Unique id. Can be assigned to model and element components.
  * @param {string} name - The name of the group.
  * @param {boolean} dynamic - Whether objects within this batch group should support transforming at runtime.
  * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @param {number[]} [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  * @property {boolean} dynamic Whether objects within this batch group should support transforming at runtime.
  * @property {number} maxAabbSize Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @property {number} id Unique id. Can be assigned to model and element components.
  * @property {string} name Name of the group.
  * @property {number[]} [layers] Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  */
@JSGlobal("pc.BatchGroup")
@js.native
class BatchGroup protected () extends js.Object {
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double) = this()
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double, layers: js.Array[Double]) = this()
  /**
    * Whether objects within this batch group should support transforming at runtime.
    */
  var dynamic: Boolean = js.native
  /**
    * Unique id. Can be assigned to model and element components.
    */
  var id: Double = js.native
  /**
    * Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
    * to these layers. Layers of source models will be ignored.
    */
  var layers: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Maximum size of any dimension of a bounding box around batched objects.
    * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    */
  var maxAabbSize: Double = js.native
  /**
    * Name of the group.
    */
  var name: String = js.native
}

