package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  * --------
  * Information about all members in a chat
  */
trait ChatMembersInformation extends StObject {
  
  var members: js.Array[ThreadMember]
}
object ChatMembersInformation {
  
  inline def apply(members: js.Array[ThreadMember]): ChatMembersInformation = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMembersInformation]
  }
  
  extension [Self <: ChatMembersInformation](x: Self) {
    
    inline def setMembers(value: js.Array[ThreadMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: ThreadMember*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
