package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOff
  extends StObject
     with ChangeTrackedEntity {
  
  // The draft version of this timeOff that is viewable by managers. Required.
  var draftTimeOff: js.UndefOr[NullableOption[TimeOffItem]] = js.undefined
  
  // The shared version of this timeOff that is viewable by both employees and managers. Required.
  var sharedTimeOff: js.UndefOr[NullableOption[TimeOffItem]] = js.undefined
  
  // ID of the user assigned to the timeOff. Required.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeOff {
  
  inline def apply(): TimeOff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeOff] (val x: Self) extends AnyVal {
    
    inline def setDraftTimeOff(value: NullableOption[TimeOffItem]): Self = StObject.set(x, "draftTimeOff", value.asInstanceOf[js.Any])
    
    inline def setDraftTimeOffNull: Self = StObject.set(x, "draftTimeOff", null)
    
    inline def setDraftTimeOffUndefined: Self = StObject.set(x, "draftTimeOff", js.undefined)
    
    inline def setSharedTimeOff(value: NullableOption[TimeOffItem]): Self = StObject.set(x, "sharedTimeOff", value.asInstanceOf[js.Any])
    
    inline def setSharedTimeOffNull: Self = StObject.set(x, "sharedTimeOff", null)
    
    inline def setSharedTimeOffUndefined: Self = StObject.set(x, "sharedTimeOff", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
