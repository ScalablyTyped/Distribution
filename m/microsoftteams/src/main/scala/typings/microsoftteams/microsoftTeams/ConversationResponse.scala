package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs.
  * ------
  */
trait ConversationResponse extends StObject {
  
  /**
    * The Id of the channel. This is optional and should be specified whenever a conversation is started or opened in a personal app scope
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The Id of the conversation. This is optional and should be specified whenever a previous conversation about a specific sub-entity has already been started before
    */
  var conversationId: js.UndefOr[String] = js.undefined
  
  /**
    * The entity Id of the tab
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * The Id of the subEntity where the conversation is taking place
    */
  var subEntityId: String
}
object ConversationResponse {
  
  inline def apply(subEntityId: String): ConversationResponse = {
    val __obj = js.Dynamic.literal(subEntityId = subEntityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationResponse]
  }
  
  extension [Self <: ConversationResponse](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
  }
}
