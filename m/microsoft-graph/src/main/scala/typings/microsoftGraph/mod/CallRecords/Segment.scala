package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment
  extends StObject
     with Entity {
  
  // Endpoint that answered this segment.
  var callee: js.UndefOr[NullableOption[Endpoint]] = js.undefined
  
  // Endpoint that initiated this segment.
  var caller: js.UndefOr[NullableOption[Endpoint]] = js.undefined
  
  /**
    * UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.undefined
  
  // Failure information associated with the segment if it failed.
  var failureInfo: js.UndefOr[NullableOption[FailureInfo]] = js.undefined
  
  // Media associated with this segment.
  var media: js.UndefOr[NullableOption[js.Array[Media]]] = js.undefined
  
  /**
    * UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.undefined
}
object Segment {
  
  inline def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  extension [Self <: Segment](x: Self) {
    
    inline def setCallee(value: NullableOption[Endpoint]): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setCalleeNull: Self = StObject.set(x, "callee", null)
    
    inline def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    inline def setCaller(value: NullableOption[Endpoint]): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerNull: Self = StObject.set(x, "caller", null)
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFailureInfo(value: NullableOption[FailureInfo]): Self = StObject.set(x, "failureInfo", value.asInstanceOf[js.Any])
    
    inline def setFailureInfoNull: Self = StObject.set(x, "failureInfo", null)
    
    inline def setFailureInfoUndefined: Self = StObject.set(x, "failureInfo", js.undefined)
    
    inline def setMedia(value: NullableOption[js.Array[Media]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
