package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedData extends StObject {
  
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
}
object ParsedData {
  
  @scala.inline
  def apply(): ParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedData]
  }
  
  @scala.inline
  implicit class ParsedDataMutableBuilder[Self <: ParsedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
