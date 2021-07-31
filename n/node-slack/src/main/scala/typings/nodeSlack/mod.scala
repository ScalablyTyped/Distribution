package typings.nodeSlack

import typings.request.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-slack", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Slack {
    def this(hookUrl: String) = this()
    def this(hookUrl: String, option: Option) = this()
  }
  
  trait Message extends StObject {
    
    var attachments: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var icon_emoji: js.UndefOr[String] = js.undefined
    
    var link_names: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var unfurl_links: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(text: String): Message = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[js.Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setIcon_emoji(value: String): Self = StObject.set(x, "icon_emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_emojiUndefined: Self = StObject.set(x, "icon_emoji", js.undefined)
      
      @scala.inline
      def setLink_names(value: Double): Self = StObject.set(x, "link_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_namesUndefined: Self = StObject.set(x, "link_names", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfurl_links(value: Boolean): Self = StObject.set(x, "unfurl_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfurl_linksUndefined: Self = StObject.set(x, "unfurl_links", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var proxy: String
  }
  object Option {
    
    @scala.inline
    def apply(proxy: String): Option = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(text: String): Query = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_idUndefined: Self = StObject.set(x, "channel_id", js.undefined)
      
      @scala.inline
      def setChannel_name(value: String): Self = StObject.set(x, "channel_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_nameUndefined: Self = StObject.set(x, "channel_name", js.undefined)
      
      @scala.inline
      def setTeam_id(value: String): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam_idUndefined: Self = StObject.set(x, "team_id", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
      
      @scala.inline
      def setUser_name(value: String): Self = StObject.set(x, "user_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_nameUndefined: Self = StObject.set(x, "user_name", js.undefined)
    }
  }
  
  type ResponseCallback = js.Function2[/* err */ js.Any, /* query */ Query, js.Any]
  
  type SendCallback = js.Function2[/* err */ js.Any, /* body */ js.Any, js.Any]
  
  @js.native
  trait Slack extends StObject {
    
    def respond(query: Query): TextResponse = js.native
    def respond(query: Query, callback: ResponseCallback): TextResponse = js.native
    
    def send(message: Message): js.Any = js.native
    //TODO: Here comes deferred's promise as a return type
    def send(message: Message, callback: SendCallback): Request = js.native
  }
  
  trait TextResponse extends StObject {
    
    var text: String
  }
  object TextResponse {
    
    @scala.inline
    def apply(text: String): TextResponse = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextResponse]
    }
    
    @scala.inline
    implicit class TextResponseMutableBuilder[Self <: TextResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
