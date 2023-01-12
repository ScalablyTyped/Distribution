package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarSharingMessage
  extends StObject
     with Message {
  
  var canAccept: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var sharingMessageAction: js.UndefOr[NullableOption[CalendarSharingMessageAction]] = js.undefined
  
  var sharingMessageActions: js.UndefOr[NullableOption[js.Array[CalendarSharingMessageAction]]] = js.undefined
  
  var suggestedCalendarName: js.UndefOr[NullableOption[String]] = js.undefined
}
object CalendarSharingMessage {
  
  inline def apply(): CalendarSharingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarSharingMessage] (val x: Self) extends AnyVal {
    
    inline def setCanAccept(value: NullableOption[Boolean]): Self = StObject.set(x, "canAccept", value.asInstanceOf[js.Any])
    
    inline def setCanAcceptNull: Self = StObject.set(x, "canAccept", null)
    
    inline def setCanAcceptUndefined: Self = StObject.set(x, "canAccept", js.undefined)
    
    inline def setSharingMessageAction(value: NullableOption[CalendarSharingMessageAction]): Self = StObject.set(x, "sharingMessageAction", value.asInstanceOf[js.Any])
    
    inline def setSharingMessageActionNull: Self = StObject.set(x, "sharingMessageAction", null)
    
    inline def setSharingMessageActionUndefined: Self = StObject.set(x, "sharingMessageAction", js.undefined)
    
    inline def setSharingMessageActions(value: NullableOption[js.Array[CalendarSharingMessageAction]]): Self = StObject.set(x, "sharingMessageActions", value.asInstanceOf[js.Any])
    
    inline def setSharingMessageActionsNull: Self = StObject.set(x, "sharingMessageActions", null)
    
    inline def setSharingMessageActionsUndefined: Self = StObject.set(x, "sharingMessageActions", js.undefined)
    
    inline def setSharingMessageActionsVarargs(value: CalendarSharingMessageAction*): Self = StObject.set(x, "sharingMessageActions", js.Array(value*))
    
    inline def setSuggestedCalendarName(value: NullableOption[String]): Self = StObject.set(x, "suggestedCalendarName", value.asInstanceOf[js.Any])
    
    inline def setSuggestedCalendarNameNull: Self = StObject.set(x, "suggestedCalendarName", null)
    
    inline def setSuggestedCalendarNameUndefined: Self = StObject.set(x, "suggestedCalendarName", js.undefined)
  }
}
