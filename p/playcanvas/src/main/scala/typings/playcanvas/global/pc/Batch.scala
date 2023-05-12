package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds information about batched mesh instances. Created in {@link BatchManager#create}.
  */
@JSGlobal("pc.Batch")
@js.native
open class Batch protected ()
  extends typings.playcanvas.mod.Batch {
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
  def this(
    meshInstances: js.Array[typings.playcanvas.mod.MeshInstance],
    dynamic: Boolean,
    batchGroupId: Double
  ) = this()
}
