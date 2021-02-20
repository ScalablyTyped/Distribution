package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.PaginablePayload
import typings.nodeZendesk.mod.PersistableModel
import typings.nodeZendesk.mod.Requests.Comments.RequestType
import typings.nodeZendesk.mod.Users.Role
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comments {
  
  object CommentsUsers {
    
    @js.native
    trait ResponseModel
      extends typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel {
      
      val role: Role = js.native
    }
    object ResponseModel {
      
      @scala.inline
      def apply(agent: Boolean, id: ZendeskID, name: String, role: Role): typings.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel = {
        val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel]
      }
      
      @scala.inline
      implicit class ResponseModelMutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ListPayload extends PaginablePayload {
    
    var comments: js.Array[typings.nodeZendesk.mod.Tickets.Comments.ResponseModel] = js.native
  }
  object ListPayload {
    
    @scala.inline
    def apply(comments: js.Array[typings.nodeZendesk.mod.Tickets.Comments.ResponseModel], count: Double): typings.nodeZendesk.mod.Tickets.Comments.ListPayload = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Comments.ListPayload]
    }
    
    @scala.inline
    implicit class ListPayloadMutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Comments.ListPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: js.Array[typings.nodeZendesk.mod.Tickets.Comments.ResponseModel]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: typings.nodeZendesk.mod.Tickets.Comments.ResponseModel*): Self = StObject.set(x, "comments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Metadata extends StObject {
    
    var flag_options: js.Any = js.native
    
    var flags: js.UndefOr[js.Array[Double]] = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(flag_options: js.Any): Metadata = {
      val __obj = js.Dynamic.literal(flag_options = flag_options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlag_options(value: js.Any): Self = StObject.set(x, "flag_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: js.Array[Double]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: Double*): Self = StObject.set(x, "flags", js.Array(value :_*))
    }
  }
  
  object Organizations {
    
    @js.native
    trait ResponseModel extends PersistableModel {
      
      val name: String = js.native
    }
    object ResponseModel {
      
      @scala.inline
      def apply(id: ZendeskID, name: String): typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]
      }
      
      @scala.inline
      implicit class ResponseModelMutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ResponseModel
    extends typings.nodeZendesk.mod.Requests.Comments.ResponseModel
  object ResponseModel {
    
    @scala.inline
    def apply(
      attachments: js.Array[Model],
      author_id: ZendeskID,
      body: String,
      created_at: String,
      html_body: String,
      id: ZendeskID,
      plain_body: String,
      public: Boolean,
      request_id: Double,
      `type`: RequestType,
      url: String
    ): typings.nodeZendesk.mod.Tickets.Comments.ResponseModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Comments.ResponseModel]
    }
  }
}
