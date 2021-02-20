package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeHeapSnapshotParameterType extends StObject {
  
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken.
    */
  var reportProgress: js.UndefOr[Boolean] = js.native
}
object TakeHeapSnapshotParameterType {
  
  @scala.inline
  def apply(): TakeHeapSnapshotParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeHeapSnapshotParameterType]
  }
  
  @scala.inline
  implicit class TakeHeapSnapshotParameterTypeMutableBuilder[Self <: TakeHeapSnapshotParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
  }
}
