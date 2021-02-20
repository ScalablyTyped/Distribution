package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTrackingHeapObjectsParameterType extends StObject {
  
  var trackAllocations: js.UndefOr[Boolean] = js.native
}
object StartTrackingHeapObjectsParameterType {
  
  @scala.inline
  def apply(): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
  
  @scala.inline
  implicit class StartTrackingHeapObjectsParameterTypeMutableBuilder[Self <: StartTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackAllocations(value: Boolean): Self = StObject.set(x, "trackAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackAllocationsUndefined: Self = StObject.set(x, "trackAllocations", js.undefined)
  }
}
