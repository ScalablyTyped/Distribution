package typings.microsoftteams.microsoftTeams

import typings.microsoftteams.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with bots using the SDK.
  */
object bot {
  
  @js.native
  sealed trait ResponseType extends StObject
  @JSGlobal("microsoftTeams.bot.ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @js.native
    sealed trait Auth
      extends StObject
         with ResponseType
    
    @js.native
    sealed trait Results
      extends StObject
         with ResponseType
  }
  
  trait Attachment extends StObject {
    
    var card: Any
    
    var previewCard: Any
    
    var previewRawPayload: Any
    
    var rawPayload: Any
  }
  object Attachment {
    
    inline def apply(card: Any, previewCard: Any, previewRawPayload: Any, rawPayload: Any): Attachment = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], previewCard = previewCard.asInstanceOf[js.Any], previewRawPayload = previewRawPayload.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setPreviewCard(value: Any): Self = StObject.set(x, "previewCard", value.asInstanceOf[js.Any])
      
      inline def setPreviewRawPayload(value: Any): Self = StObject.set(x, "previewRawPayload", value.asInstanceOf[js.Any])
      
      inline def setRawPayload(value: Any): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
    }
  }
  
  trait Auth extends StObject {
    
    var title: String
    
    var url: String
  }
  object Auth {
    
    inline def apply(title: String, url: String): Auth = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthQueryRequest
    extends StObject
       with QueryRequest {
    
    var url: String
  }
  object AuthQueryRequest {
    
    inline def apply(query: String, url: String): AuthQueryRequest = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthQueryRequest]
    }
    
    extension [Self <: AuthQueryRequest](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    var id: String
    
    var initialRun: Boolean
    
    var title: String
  }
  object Command {
    
    inline def apply(id: String, initialRun: Boolean, title: String): Command = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initialRun = initialRun.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialRun(value: Boolean): Self = StObject.set(x, "initialRun", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryRequest extends StObject {
    
    var commandId: js.UndefOr[String] = js.undefined
    
    var option: js.UndefOr[Count] = js.undefined
    
    /**
      * Query to search for
      */
    var query: String
  }
  object QueryRequest {
    
    inline def apply(query: String): QueryRequest = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRequest]
    }
    
    extension [Self <: QueryRequest](x: Self) {
      
      inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
      
      inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
      
      inline def setOption(value: Count): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryResponse extends StObject {
    
    var data: Results | Auth
    
    var `type`: ResponseType
  }
  object QueryResponse {
    
    inline def apply(data: Results | Auth, `type`: ResponseType): QueryResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResponse]
    }
    
    extension [Self <: QueryResponse](x: Self) {
      
      inline def setData(value: Results | Auth): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var attachments: js.Array[Attachment]
    
    var botId: String
    
    var layout: Any
  }
  object Results {
    
    inline def apply(attachments: js.Array[Attachment], botId: String, layout: Any): Results = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBotId(value: String): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
}
