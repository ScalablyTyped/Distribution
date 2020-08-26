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
@js.native
trait Batch extends js.Object {
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

object Batch {
  @scala.inline
  def apply(
    dynamic: Boolean,
    meshInstance: MeshInstance,
    model: Model,
    origMeshInstances: js.Array[MeshInstance]
  ): Batch = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], origMeshInstances = origMeshInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  @scala.inline
  implicit class BatchOps[Self <: Batch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshInstance(value: MeshInstance): Self = this.set("meshInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigMeshInstancesVarargs(value: MeshInstance*): Self = this.set("origMeshInstances", js.Array(value :_*))
    @scala.inline
    def setOrigMeshInstances(value: js.Array[MeshInstance]): Self = this.set("origMeshInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchGroupId(value: Double): Self = this.set("batchGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchGroupId: Self = this.set("batchGroupId", js.undefined)
  }
  
}

