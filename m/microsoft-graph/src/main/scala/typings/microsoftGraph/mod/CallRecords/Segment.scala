package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment extends Entity {
  
  // Endpoint that answered this segment.
  var callee: js.UndefOr[NullableOption[Endpoint]] = js.native
  
  // Endpoint that initiated this segment.
  var caller: js.UndefOr[NullableOption[Endpoint]] = js.native
  
  /**
    * UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.native
  
  // Failure information associated with the segment if it failed.
  var failureInfo: js.UndefOr[NullableOption[FailureInfo]] = js.native
  
  // Media associated with this segment.
  var media: js.UndefOr[NullableOption[js.Array[Media]]] = js.native
  
  /**
    * UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
}
object Segment {
  
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallee(value: NullableOption[Endpoint]): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalleeNull: Self = StObject.set(x, "callee", null)
    
    @scala.inline
    def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    @scala.inline
    def setCaller(value: NullableOption[Endpoint]): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerNull: Self = StObject.set(x, "caller", null)
    
    @scala.inline
    def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setFailureInfo(value: NullableOption[FailureInfo]): Self = StObject.set(x, "failureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureInfoNull: Self = StObject.set(x, "failureInfo", null)
    
    @scala.inline
    def setFailureInfoUndefined: Self = StObject.set(x, "failureInfo", js.undefined)
    
    @scala.inline
    def setMedia(value: NullableOption[js.Array[Media]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaNull: Self = StObject.set(x, "media", null)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
