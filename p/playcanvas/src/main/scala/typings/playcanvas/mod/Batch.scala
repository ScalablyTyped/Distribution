package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds information about batched mesh instances. Created in {@link BatchManager#create}.
  */
@JSImport("playcanvas", "Batch")
@js.native
open class Batch protected () extends StObject {
  /**
    * Create a new Batch instance.
    *
    * @param {import('../mesh-instance.js').MeshInstance[]} meshInstances - The mesh instances to
    * be batched.
    * @param {boolean} dynamic - Whether this batch is dynamic (supports transforming mesh
    * instances at runtime).
    * @param {number} batchGroupId - Link this batch to a specific batch group. This is done
    * automatically with default batches.
    */
  def this(meshInstances: js.Array[MeshInstance], dynamic: Boolean, batchGroupId: Double) = this()
  
  /** @private */
  /* private */ var _aabb: Any = js.native
  
  def addToLayers(scene: Any, layers: Any): Unit = js.native
  
  /**
    * Link this batch to a specific batch group. This is done automatically with default batches.
    *
    * @type {number}
    */
  var batchGroupId: Double = js.native
  
  def destroy(scene: Any, layers: Any): Unit = js.native
  
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    *
    * @type {boolean}
    */
  var dynamic: Boolean = js.native
  
  /**
    * A single combined mesh instance, the result of batching.
    *
    * @type {import('../mesh-instance.js').MeshInstance}
    */
  var meshInstance: MeshInstance = js.native
  
  /**
    * An array of original mesh instances, from which this batch was generated.
    *
    * @type {import('../mesh-instance.js').MeshInstance[]}
    */
  var origMeshInstances: js.Array[MeshInstance] = js.native
  
  def removeFromLayers(scene: Any, layers: Any): Unit = js.native
  
  def updateBoundingBox(): Unit = js.native
}
