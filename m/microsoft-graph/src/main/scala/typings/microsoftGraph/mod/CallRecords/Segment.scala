package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
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
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallee(value: NullableOption[Endpoint]): Self = this.set("callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    
    @scala.inline
    def setCalleeNull: Self = this.set("callee", null)
    
    @scala.inline
    def setCaller(value: NullableOption[Endpoint]): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setCallerNull: Self = this.set("caller", null)
    
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setFailureInfo(value: NullableOption[FailureInfo]): Self = this.set("failureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureInfo: Self = this.set("failureInfo", js.undefined)
    
    @scala.inline
    def setFailureInfoNull: Self = this.set("failureInfo", null)
    
    @scala.inline
    def setMediaVarargs(value: Media*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: NullableOption[js.Array[Media]]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMediaNull: Self = this.set("media", null)
    
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
}
