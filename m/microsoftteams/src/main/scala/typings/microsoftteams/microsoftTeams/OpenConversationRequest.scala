package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs.
  * ------
  */
trait OpenConversationRequest extends StObject {
  
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
  var entityId: String
  
  /**
    * A function that is called if the pane is closed
    */
  var onCloseConversation: js.UndefOr[js.Function1[/* conversationResponse */ ConversationResponse, Unit]] = js.undefined
  
  /**
    * A function that is called once the conversation Id has been created
    */
  var onStartConversation: js.UndefOr[js.Function1[/* conversationResponse */ ConversationResponse, Unit]] = js.undefined
  
  /**
    * The Id of the subEntity where the conversation is taking place
    */
  var subEntityId: String
  
  /**
    * The title of the conversation
    */
  var title: String
}
object OpenConversationRequest {
  
  inline def apply(entityId: String, subEntityId: String, title: String): OpenConversationRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], subEntityId = subEntityId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenConversationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenConversationRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setOnCloseConversation(value: /* conversationResponse */ ConversationResponse => Unit): Self = StObject.set(x, "onCloseConversation", js.Any.fromFunction1(value))
    
    inline def setOnCloseConversationUndefined: Self = StObject.set(x, "onCloseConversation", js.undefined)
    
    inline def setOnStartConversation(value: /* conversationResponse */ ConversationResponse => Unit): Self = StObject.set(x, "onStartConversation", js.Any.fromFunction1(value))
    
    inline def setOnStartConversationUndefined: Self = StObject.set(x, "onStartConversation", js.undefined)
    
    inline def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
