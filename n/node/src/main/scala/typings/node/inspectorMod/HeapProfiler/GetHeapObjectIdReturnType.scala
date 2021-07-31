package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeapObjectIdReturnType extends StObject {
  
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId
}
object GetHeapObjectIdReturnType {
  
  @scala.inline
  def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdReturnType]
  }
  
  @scala.inline
  implicit class GetHeapObjectIdReturnTypeMutableBuilder[Self <: GetHeapObjectIdReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
}
