package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTrackingHeapObjectsParameterType extends StObject {
  
  var trackAllocations: js.UndefOr[Boolean] = js.undefined
}
object StartTrackingHeapObjectsParameterType {
  
  inline def apply(): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
    
    inline def setTrackAllocations(value: Boolean): Self = StObject.set(x, "trackAllocations", value.asInstanceOf[js.Any])
    
    inline def setTrackAllocationsUndefined: Self = StObject.set(x, "trackAllocations", js.undefined)
  }
}
