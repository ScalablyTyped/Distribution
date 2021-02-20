package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportHeapSnapshotProgressEventDataType extends StObject {
  
  var done: Double = js.native
  
  var finished: js.UndefOr[Boolean] = js.native
  
  var total: Double = js.native
}
object ReportHeapSnapshotProgressEventDataType {
  
  @scala.inline
  def apply(done: Double, total: Double): ReportHeapSnapshotProgressEventDataType = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportHeapSnapshotProgressEventDataType]
  }
  
  @scala.inline
  implicit class ReportHeapSnapshotProgressEventDataTypeMutableBuilder[Self <: ReportHeapSnapshotProgressEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
