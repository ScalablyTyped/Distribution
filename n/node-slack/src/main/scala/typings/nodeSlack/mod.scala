package typings.nodeSlack

import typings.request.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-slack", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Slack {
    def this(hookUrl: String) = this()
    def this(hookUrl: String, option: Option) = this()
  }
  
  trait Message extends StObject {
    
    var attachments: js.UndefOr[js.Array[Any]] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var icon_emoji: js.UndefOr[String] = js.undefined
    
    var link_names: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var unfurl_links: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    inline def apply(text: String): Message = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setAttachments(value: js.Array[Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Any*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setIcon_emoji(value: String): Self = StObject.set(x, "icon_emoji", value.asInstanceOf[js.Any])
      
      inline def setIcon_emojiUndefined: Self = StObject.set(x, "icon_emoji", js.undefined)
      
      inline def setLink_names(value: Double): Self = StObject.set(x, "link_names", value.asInstanceOf[js.Any])
      
      inline def setLink_namesUndefined: Self = StObject.set(x, "link_names", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUnfurl_links(value: Boolean): Self = StObject.set(x, "unfurl_links", value.asInstanceOf[js.Any])
      
      inline def setUnfurl_linksUndefined: Self = StObject.set(x, "unfurl_links", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var proxy: String
  }
  object Option {
    
    inline def apply(proxy: String): Option = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    var channel_id: js.UndefOr[String] = js.undefined
    
    var channel_name: js.UndefOr[String] = js.undefined
    
    var team_id: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var user_id: js.UndefOr[String] = js.undefined
    
    var user_name: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    inline def apply(text: String): Query = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      inline def setChannel_idUndefined: Self = StObject.set(x, "channel_id", js.undefined)
      
      inline def setChannel_name(value: String): Self = StObject.set(x, "channel_name", value.asInstanceOf[js.Any])
      
      inline def setChannel_nameUndefined: Self = StObject.set(x, "channel_name", js.undefined)
      
      inline def setTeam_id(value: String): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
      
      inline def setTeam_idUndefined: Self = StObject.set(x, "team_id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
      
      inline def setUser_name(value: String): Self = StObject.set(x, "user_name", value.asInstanceOf[js.Any])
      
      inline def setUser_nameUndefined: Self = StObject.set(x, "user_name", js.undefined)
    }
  }
  
  type ResponseCallback = js.Function2[/* err */ Any, /* query */ Query, Any]
  
  type SendCallback = js.Function2[/* err */ Any, /* body */ Any, Any]
  
  @js.native
  trait Slack extends StObject {
    
    def respond(query: Query): TextResponse = js.native
    def respond(query: Query, callback: ResponseCallback): TextResponse = js.native
    
    def send(message: Message): Any = js.native
    //TODO: Here comes deferred's promise as a return type
    def send(message: Message, callback: SendCallback): Request = js.native
  }
  
  trait TextResponse extends StObject {
    
    var text: String
  }
  object TextResponse {
    
    inline def apply(text: String): TextResponse = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextResponse]
    }
    
    extension [Self <: TextResponse](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
