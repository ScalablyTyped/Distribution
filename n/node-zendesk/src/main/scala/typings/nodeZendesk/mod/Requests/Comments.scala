package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.PaginablePayload
import typings.nodeZendesk.mod.PersistableModel
import typings.nodeZendesk.mod.TemporalModel
import typings.nodeZendesk.mod.Tickets.Comments.Metadata
import typings.nodeZendesk.mod.Tickets.Via
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comments {
  
  object CommentsUsers {
    
    trait ResponseModel
      extends StObject
         with PersistableModel {
      
      val agent: Boolean
      
      val name: String
      
      val organization_id: Double | Null
      
      val photo: Model | Null
    }
    object ResponseModel {
      
      inline def apply(agent: Boolean, id: ZendeskID, name: String): typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel = {
        val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization_id = null, photo = null)
        __obj.asInstanceOf[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
      }
      
      extension [Self <: typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel](x: Self) {
        
        inline def setAgent(value: Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
        
        inline def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
        
        inline def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
        
        inline def setPhotoNull: Self = StObject.set(x, "photo", null)
      }
    }
  }
  
  trait CreateModel extends StObject {
    
    var author_id: js.UndefOr[ZendeskID] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var html_body: js.UndefOr[String] = js.undefined
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var request_id: js.UndefOr[Double] = js.undefined
    
    var uploads: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CreateModel {
    
    inline def apply(): typings.nodeZendesk.mod.Requests.Comments.CreateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeZendesk.mod.Requests.Comments.CreateModel]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Requests.Comments.CreateModel](x: Self) {
      
      inline def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
      
      inline def setAuthor_idUndefined: Self = StObject.set(x, "author_id", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      inline def setHtml_bodyUndefined: Self = StObject.set(x, "html_body", js.undefined)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      inline def setUploads(value: js.Array[String]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      inline def setUploadsVarargs(value: String*): Self = StObject.set(x, "uploads", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    var comments: js.Array[typings.nodeZendesk.mod.Requests.Comments.ResponseModel]
    
    var organizations: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]
    
    var users: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
  }
  object ListPayload {
    
    inline def apply(
      comments: js.Array[typings.nodeZendesk.mod.Requests.Comments.ResponseModel],
      count: Double,
      organizations: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel],
      users: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
    ): typings.nodeZendesk.mod.Requests.Comments.ListPayload = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[typings.nodeZendesk.mod.Requests.Comments.ListPayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Requests.Comments.ListPayload](x: Self) {
      
      inline def setComments(value: js.Array[typings.nodeZendesk.mod.Requests.Comments.ResponseModel]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: typings.nodeZendesk.mod.Requests.Comments.ResponseModel*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setOrganizations(value: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      inline def setOrganizationsVarargs(value: typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel*): Self = StObject.set(x, "organizations", js.Array(value*))
      
      inline def setUsers(value: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.Comment
    - typings.nodeZendesk.nodeZendeskStrings.VoiceComment
  */
  trait RequestType extends StObject
  object RequestType {
    
    inline def Comment: typings.nodeZendesk.nodeZendeskStrings.Comment = "Comment".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.Comment]
    
    inline def VoiceComment: typings.nodeZendesk.nodeZendeskStrings.VoiceComment = "VoiceComment".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.VoiceComment]
  }
  
  trait ResponseModel
    extends StObject
       with TemporalModel {
    
    val attachments: js.Array[Model]
    
    val author_id: ZendeskID
    
    val body: String
    
    val html_body: String
    
    val metadata: js.UndefOr[Metadata] = js.undefined
    
    val plain_body: String
    
    val public: Boolean
    
    val request_id: Double
    
    val `type`: RequestType
    
    val url: String
    
    val via: js.UndefOr[Via] = js.undefined
  }
  object ResponseModel {
    
    inline def apply(
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
    ): typings.nodeZendesk.mod.Requests.Comments.ResponseModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Requests.Comments.ResponseModel]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Requests.Comments.ResponseModel](x: Self) {
      
      inline def setAttachments(value: js.Array[Model]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: Model*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPlain_body(value: String): Self = StObject.set(x, "plain_body", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val comment: typings.nodeZendesk.mod.Requests.Comments.ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(comment: typings.nodeZendesk.mod.Requests.Comments.ResponseModel): typings.nodeZendesk.mod.Requests.Comments.ResponsePayload = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Requests.Comments.ResponsePayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Requests.Comments.ResponsePayload](x: Self) {
      
      inline def setComment(value: typings.nodeZendesk.mod.Requests.Comments.ResponseModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    }
  }
}
