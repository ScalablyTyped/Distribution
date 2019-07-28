package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.BatchGroup
  * @class Holds mesh batching settings and a unique id. Created via {@link pc.BatchManager#addGroup}.
  * @property {Boolean} dynamic Whether objects within this batch group should support transforming at runtime.
  * @property {Number} maxAabbSize Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @property {Number} id Unique id. Can be assigned to model and element components.
  * @property {String} name Name of the group.
  */
@JSGlobal("pc.BatchGroup")
@js.native
class BatchGroup protected () extends js.Object {
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double) = this()
  var dynamic: Boolean = js.native
  var id: Double = js.native
  var maxAabbSize: Double = js.native
  var name: String = js.native
}

