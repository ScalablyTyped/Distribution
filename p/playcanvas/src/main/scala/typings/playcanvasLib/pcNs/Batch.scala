package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Batch
  * @class Holds information about batched mesh instances. Created in {@link pc.BatchManager#create}.
  * @property {Array} origMeshInstances An array of original mesh instances, from which this batch was generated.
  * @property {pc.MeshInstance} meshInstance A single combined mesh instance, the result of batching.
  * @property {pc.Model} model A handy model object, ready to use in {@link pc.Scene#addModel} and {@link pc.Scene#removeModel}.
  * @property {Boolean} dynamic Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @property {Number} [batchGroupId] Link this batch to a specific batch group. This is done automatically with default batches.
  */
@JSGlobal("pc.Batch")
@js.native
class Batch protected () extends js.Object {
  def this(meshInstances: js.Array[MeshInstance], dynamic: scala.Boolean, batchGroupId: scala.Double) = this()
  var batchGroupId: scala.Double = js.native
  var dynamic: scala.Boolean = js.native
  var meshInstance: MeshInstance = js.native
  var model: Model = js.native
  var origMeshIntances: js.Array[MeshInstance] = js.native
}

