package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddInspectedHeapObjectParameterType extends js.Object {
  /**
    * Heap snapshot object id to be accessible by means of $x command line API.
    */
  var heapObjectId: HeapSnapshotObjectId
}

object AddInspectedHeapObjectParameterType {
  @scala.inline
  def apply(heapObjectId: HeapSnapshotObjectId): AddInspectedHeapObjectParameterType = {
    val __obj = js.Dynamic.literal(heapObjectId = heapObjectId)
  
    __obj.asInstanceOf[AddInspectedHeapObjectParameterType]
  }
}

