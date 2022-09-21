package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../mesh-instance.js').MeshInstance} MeshInstance */
/**
  * Holds information about batched mesh instances. Created in {@link BatchManager#create}.
  *
  * @property {MeshInstance[]} origMeshInstances An array of original mesh instances, from which
  * this batch was generated.
  * @property {MeshInstance} meshInstance A single combined mesh instance, the result of batching.
  * @property {boolean} dynamic Whether this batch is dynamic (supports transforming mesh instances
  * at runtime).
  * @property {number} [batchGroupId] Link this batch to a specific batch group. This is done
  * automatically with default batches.
  */
@JSImport("playcanvas", "Batch")
@js.native
open class Batch protected () extends StObject {
  /**
    * Create a new Batch instance.
    *
    * @param {MeshInstance[]} meshInstances - The mesh instances to be batched.
    * @param {boolean} dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
    * @param {number} batchGroupId - Link this batch to a specific batch group. This is done automatically with default batches.
    */
  def this(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double) = this()
  
  var _aabb: BoundingBox = js.native
  
  def addToLayers(scene: Any, layers: Any): Unit = js.native
  
  var batchGroupId: Double = js.native
  
  def destroy(scene: Any, layers: Any): Unit = js.native
  
  var dynamic: Boolean = js.native
  
  var meshInstance: Any = js.native
  
  var origMeshInstances: js.Array[MeshInstance] = js.native
  
  def removeFromLayers(scene: Any, layers: Any): Unit = js.native
  
  def updateBoundingBox(): Unit = js.native
}
