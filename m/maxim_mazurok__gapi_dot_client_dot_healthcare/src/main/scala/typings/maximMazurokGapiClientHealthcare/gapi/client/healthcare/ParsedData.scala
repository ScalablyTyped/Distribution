package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedData extends StObject {
  
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
}
object ParsedData {
  
  inline def apply(): ParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedData] (val x: Self) extends AnyVal {
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
