package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTrackingHeapObjectsParameterType extends StObject {
  
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken when the tracking is stopped.
    */
  var reportProgress: js.UndefOr[Boolean] = js.undefined
}
object StopTrackingHeapObjectsParameterType {
  
  @scala.inline
  def apply(): StopTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTrackingHeapObjectsParameterType]
  }
  
  @scala.inline
  implicit class StopTrackingHeapObjectsParameterTypeMutableBuilder[Self <: StopTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
  }
}
