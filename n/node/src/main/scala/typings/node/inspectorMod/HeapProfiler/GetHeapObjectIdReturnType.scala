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
  
  inline def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdReturnType]
  }
  
  extension [Self <: GetHeapObjectIdReturnType](x: Self) {
    
    inline def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
}
