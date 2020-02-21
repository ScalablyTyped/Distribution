package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Batch
  * @classdesc Holds information about batched mesh instances. Created in {@link pc.BatchManager#create}.
  * @param {pc.MeshInstance[]} meshInstances - The mesh instances to be batched.
  * @param {boolean} dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @param {number} batchGroupId - Link this batch to a specific batch group. This is done automatically with default batches.
  * @property {pc.MeshInstance[]} origMeshInstances An array of original mesh instances, from which this batch was generated.
  * @property {pc.MeshInstance} meshInstance A single combined mesh instance, the result of batching.
  * @property {pc.Model} model A handy model object.
  * @property {boolean} dynamic Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @property {number} [batchGroupId] Link this batch to a specific batch group. This is done automatically with default batches.
  */
@JSGlobal("pc.Batch")
@js.native
class Batch protected () extends js.Object {
  def this(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double) = this()
  /**
    * Link this batch to a specific batch group. This is done automatically with default batches.
    */
  var batchGroupId: js.UndefOr[Double] = js.native
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    */
  var dynamic: Boolean = js.native
  /**
    * A single combined mesh instance, the result of batching.
    */
  var meshInstance: MeshInstance = js.native
  /**
    * A handy model object.
    */
  var model: Model = js.native
  /**
    * An array of original mesh instances, from which this batch was generated.
    */
  var origMeshInstances: js.Array[MeshInstance] = js.native
}

