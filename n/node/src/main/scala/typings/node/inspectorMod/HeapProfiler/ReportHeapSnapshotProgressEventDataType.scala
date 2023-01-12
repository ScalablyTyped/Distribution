package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportHeapSnapshotProgressEventDataType extends StObject {
  
  var done: Double
  
  var finished: js.UndefOr[Boolean] = js.undefined
  
  var total: Double
}
object ReportHeapSnapshotProgressEventDataType {
  
  inline def apply(done: Double, total: Double): ReportHeapSnapshotProgressEventDataType = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportHeapSnapshotProgressEventDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportHeapSnapshotProgressEventDataType] (val x: Self) extends AnyVal {
    
    inline def setDone(value: Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
