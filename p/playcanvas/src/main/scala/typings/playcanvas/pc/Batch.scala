package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds information about batched mesh instances. Created in {@link pc.BatchManager#create}.
  * @property origMeshInstances - An array of original mesh instances, from which this batch was generated.
  * @property meshInstance - A single combined mesh instance, the result of batching.
  * @property model - A handy model object.
  * @property dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @property [batchGroupId] - Link this batch to a specific batch group. This is done automatically with default batches.
  * @param meshInstances - The mesh instances to be batched.
  * @param dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @param batchGroupId - Link this batch to a specific batch group. This is done automatically with default batches.
  */
trait Batch extends js.Object {
  /**
    * Link this batch to a specific batch group. This is done automatically with default batches.
    */
  var batchGroupId: js.UndefOr[Double] = js.undefined
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    */
  var dynamic: Boolean
  /**
    * A single combined mesh instance, the result of batching.
    */
  var meshInstance: MeshInstance
  /**
    * A handy model object.
    */
  var model: Model
  /**
    * An array of original mesh instances, from which this batch was generated.
    */
  var origMeshInstances: js.Array[MeshInstance]
}

object Batch {
  @scala.inline
  def apply(
    dynamic: Boolean,
    meshInstance: MeshInstance,
    model: Model,
    origMeshInstances: js.Array[MeshInstance],
    batchGroupId: js.UndefOr[Double] = js.undefined
  ): Batch = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], origMeshInstances = origMeshInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(batchGroupId)) __obj.updateDynamic("batchGroupId")(batchGroupId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
}

