package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOff extends ChangeTrackedEntity {
  
  // The draft version of this timeOff that is viewable by managers. Required.
  var draftTimeOff: js.UndefOr[NullableOption[TimeOffItem]] = js.native
  
  // The shared version of this timeOff that is viewable by both employees and managers. Required.
  var sharedTimeOff: js.UndefOr[NullableOption[TimeOffItem]] = js.native
  
  // ID of the user assigned to the timeOff. Required.
  var userId: js.UndefOr[NullableOption[String]] = js.native
}
object TimeOff {
  
  @scala.inline
  def apply(): TimeOff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOff]
  }
  
  @scala.inline
  implicit class TimeOffMutableBuilder[Self <: TimeOff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraftTimeOff(value: NullableOption[TimeOffItem]): Self = StObject.set(x, "draftTimeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftTimeOffNull: Self = StObject.set(x, "draftTimeOff", null)
    
    @scala.inline
    def setDraftTimeOffUndefined: Self = StObject.set(x, "draftTimeOff", js.undefined)
    
    @scala.inline
    def setSharedTimeOff(value: NullableOption[TimeOffItem]): Self = StObject.set(x, "sharedTimeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTimeOffNull: Self = StObject.set(x, "sharedTimeOff", null)
    
    @scala.inline
    def setSharedTimeOffUndefined: Self = StObject.set(x, "sharedTimeOff", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
