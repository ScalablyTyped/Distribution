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
  
  inline def apply(): StopTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTrackingHeapObjectsParameterType]
  }
  
  extension [Self <: StopTrackingHeapObjectsParameterType](x: Self) {
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
  }
}
