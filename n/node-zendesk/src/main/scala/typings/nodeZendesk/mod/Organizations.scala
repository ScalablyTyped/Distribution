package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Organizations {
  
  @js.native
  trait Model extends AuditableModel {
    
    var details: js.UndefOr[String | Null] = js.native
    
    var domain_names: js.UndefOr[js.Array[String]] = js.native
    
    var external_id: js.UndefOr[String | Null] = js.native
    
    var group_id: js.UndefOr[Double | Null] = js.native
    
    var name: String = js.native
    
    var notes: js.UndefOr[String | Null] = js.native
    
    var organization_fields: js.UndefOr[js.Object | Null] = js.native
    
    var shared_comments: js.UndefOr[Boolean] = js.native
    
    var shared_tickets: js.UndefOr[Boolean] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    val url: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(created_at: String, id: ZendeskID, name: String): Model = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsNull: Self = StObject.set(x, "details", null)
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDomain_names(value: js.Array[String]): Self = StObject.set(x, "domain_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain_namesUndefined: Self = StObject.set(x, "domain_names", js.undefined)
      
      @scala.inline
      def setDomain_namesVarargs(value: String*): Self = StObject.set(x, "domain_names", js.Array(value :_*))
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idNull: Self = StObject.set(x, "external_id", null)
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup_idNull: Self = StObject.set(x, "group_id", null)
      
      @scala.inline
      def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesNull: Self = StObject.set(x, "notes", null)
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setOrganization_fields(value: js.Object): Self = StObject.set(x, "organization_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization_fieldsNull: Self = StObject.set(x, "organization_fields", null)
      
      @scala.inline
      def setOrganization_fieldsUndefined: Self = StObject.set(x, "organization_fields", js.undefined)
      
      @scala.inline
      def setShared_comments(value: Boolean): Self = StObject.set(x, "shared_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_commentsUndefined: Self = StObject.set(x, "shared_comments", js.undefined)
      
      @scala.inline
      def setShared_tickets(value: Boolean): Self = StObject.set(x, "shared_tickets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_ticketsUndefined: Self = StObject.set(x, "shared_tickets", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
