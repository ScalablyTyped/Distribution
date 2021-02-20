package typings.nodeZendesk

import typings.nodeZendesk.mod.Tickets.CreateModel
import typings.nodeZendesk.mod.Users._UpdateIdPayload
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var html_body: String = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var scoped_body: js.UndefOr[js.Any] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: String, html_body: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setScoped_body(value: js.Any): Self = StObject.set(x, "scoped_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoped_bodyUndefined: Self = StObject.set(x, "scoped_body", js.undefined)
    }
  }
  
  @js.native
  trait Comment extends StObject {
    
    var comment: Body = js.native
    
    var ticket: CreateModel = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(comment: Body, ticket: CreateModel): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Body): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket(value: CreateModel): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Externalids extends _UpdateIdPayload {
    
    var external_ids: js.Array[ZendeskID] = js.native
  }
  object Externalids {
    
    @scala.inline
    def apply(external_ids: js.Array[ZendeskID]): Externalids = {
      val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Externalids]
    }
    
    @scala.inline
    implicit class ExternalidsMutableBuilder[Self <: Externalids] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternal_ids(value: js.Array[ZendeskID]): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idsVarargs(value: ZendeskID*): Self = StObject.set(x, "external_ids", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Filename extends StObject {
    
    var filename: String = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object Filename {
    
    @scala.inline
    def apply(filename: String): Filename = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit class FilenameMutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait Ids extends _UpdateIdPayload {
    
    var ids: js.Array[ZendeskID] = js.native
  }
  object Ids {
    
    @scala.inline
    def apply(ids: js.Array[ZendeskID]): Ids = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids]
    }
    
    @scala.inline
    implicit class IdsMutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[ZendeskID]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: ZendeskID*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
}
