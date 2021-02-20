package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddInspectedHeapObjectParameterType extends StObject {
  
  /**
    * Heap snapshot object id to be accessible by means of $x command line API.
    */
  var heapObjectId: HeapSnapshotObjectId = js.native
}
object AddInspectedHeapObjectParameterType {
  
  @scala.inline
  def apply(heapObjectId: HeapSnapshotObjectId): AddInspectedHeapObjectParameterType = {
    val __obj = js.Dynamic.literal(heapObjectId = heapObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInspectedHeapObjectParameterType]
  }
  
  @scala.inline
  implicit class AddInspectedHeapObjectParameterTypeMutableBuilder[Self <: AddInspectedHeapObjectParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeapObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapObjectId", value.asInstanceOf[js.Any])
  }
}
