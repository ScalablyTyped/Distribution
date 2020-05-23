package typings.playcanvas.global.pc

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
@JSGlobal("pc.Batch")
@js.native
class Batch protected ()
  extends typings.playcanvas.pc.Batch {
  def this(
    meshInstances: js.Array[typings.playcanvas.pc.MeshInstance],
    dynamic: Boolean,
    batchGroupId: Double
  ) = this()
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    */
  /* CompleteClass */
  override var dynamic: Boolean = js.native
  /**
    * A single combined mesh instance, the result of batching.
    */
  /* CompleteClass */
  override var meshInstance: typings.playcanvas.pc.MeshInstance = js.native
  /**
    * A handy model object.
    */
  /* CompleteClass */
  override var model: typings.playcanvas.pc.Model = js.native
  /**
    * An array of original mesh instances, from which this batch was generated.
    */
  /* CompleteClass */
  override var origMeshInstances: js.Array[typings.playcanvas.pc.MeshInstance] = js.native
}

