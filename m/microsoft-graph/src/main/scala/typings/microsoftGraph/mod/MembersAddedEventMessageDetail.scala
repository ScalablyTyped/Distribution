package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersAddedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // List of members added.
  var members: js.UndefOr[NullableOption[js.Array[TeamworkUserIdentity]]] = js.undefined
  
  // The timestamp that denotes how far back a conversation's history is shared with the conversation members.
  var visibleHistoryStartDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object MembersAddedEventMessageDetail {
  
  inline def apply(): MembersAddedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembersAddedEventMessageDetail]
  }
  
  extension [Self <: MembersAddedEventMessageDetail](x: Self) {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[TeamworkUserIdentity]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: TeamworkUserIdentity*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setVisibleHistoryStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "visibleHistoryStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setVisibleHistoryStartDateTimeNull: Self = StObject.set(x, "visibleHistoryStartDateTime", null)
    
    inline def setVisibleHistoryStartDateTimeUndefined: Self = StObject.set(x, "visibleHistoryStartDateTime", js.undefined)
  }
}
