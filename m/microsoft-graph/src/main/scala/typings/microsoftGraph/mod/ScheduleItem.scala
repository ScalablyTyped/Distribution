package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleItem extends StObject {
  
  // The date, time, and time zone that the corresponding event ends.
  var end: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
  var isPrivate: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The location where the corresponding event is held or attended from. Optional.
  var location: js.UndefOr[NullableOption[String]] = js.native
  
  // The date, time, and time zone that the corresponding event starts.
  var start: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  /**
    * The availability status of the user or resource during the corresponding event. The possible values are: free,
    * tentative, busy, oof, workingElsewhere, unknown.
    */
  var status: js.UndefOr[NullableOption[FreeBusyStatus]] = js.native
  
  // The corresponding event's subject line. Optional.
  var subject: js.UndefOr[NullableOption[String]] = js.native
}
object ScheduleItem {
  
  @scala.inline
  def apply(): ScheduleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleItem]
  }
  
  @scala.inline
  implicit class ScheduleItemMutableBuilder[Self <: ScheduleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNull: Self = StObject.set(x, "end", null)
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setIsPrivate(value: NullableOption[Boolean]): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateNull: Self = StObject.set(x, "isPrivate", null)
    
    @scala.inline
    def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    @scala.inline
    def setLocation(value: NullableOption[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStart(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = StObject.set(x, "start", null)
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
