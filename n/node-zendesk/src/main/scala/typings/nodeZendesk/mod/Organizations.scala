package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Organizations {
  
  trait CreateManyPayload extends StObject {
    
    val organizations: js.Array[CreateModel]
  }
  object CreateManyPayload {
    
    inline def apply(organizations: js.Array[CreateModel]): CreateManyPayload = {
      val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateManyPayload]
    }
    
    extension [Self <: CreateManyPayload](x: Self) {
      
      inline def setOrganizations(value: js.Array[CreateModel]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      inline def setOrganizationsVarargs(value: CreateModel*): Self = StObject.set(x, "organizations", js.Array(value*))
    }
  }
  
  trait CreateModel extends StObject {
    
    var name: String
  }
  object CreateModel {
    
    inline def apply(name: String): CreateModel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateModel]
    }
    
    extension [Self <: CreateModel](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreatePayload extends StObject {
    
    val organization: CreateModel
  }
  object CreatePayload {
    
    inline def apply(organization: CreateModel): CreatePayload = {
      val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePayload]
    }
    
    extension [Self <: CreatePayload](x: Self) {
      
      inline def setOrganization(value: CreateModel): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    val organizations: js.Array[ResponseModel]
  }
  object ListPayload {
    
    inline def apply(count: Double, organizations: js.Array[ResponseModel]): ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[ListPayload]
    }
    
    extension [Self <: ListPayload](x: Self) {
      
      inline def setOrganizations(value: js.Array[ResponseModel]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      inline def setOrganizationsVarargs(value: ResponseModel*): Self = StObject.set(x, "organizations", js.Array(value*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def autocomplete(params: Any): js.Promise[ListPayload] = js.native
    def autocomplete(params: Any, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    def create(organization: CreatePayload): js.Promise[ResponsePayload] = js.native
    /** Creating Organizations */
    def create(organization: CreatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
    
    def createMany(organizations: CreateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
    def createMany(organizations: CreateManyPayload, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
    
    def delete(organizationId: ZendeskID): js.Promise[Any] = js.native
    /** Deleting Organizations */
    def delete(organizationId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def list(): js.Promise[ListPayload] = js.native
    /** Listing Organizations */
    def list(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    def search(params: Any): js.Promise[ListPayload] = js.native
    /** Searching Organizations */
    def search(params: Any, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    def show(organizationId: ZendeskID): js.Promise[ResponsePayload] = js.native
    /** Showing Organizations */
    def show(organizationId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
    
    def update(organizationId: ZendeskID, organization: UpdatePayload): js.Promise[ResponsePayload] = js.native
    /** Updating Organizations */
    def update(organizationId: ZendeskID, organization: UpdatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
    
    def updateMany(organizations: UpdateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
    def updateMany(organizations: UpdateManyPayload, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  }
  
  trait ResponseModel
    extends StObject
       with AuditableModel {
    
    var details: js.UndefOr[String | Null] = js.undefined
    
    var domain_names: js.UndefOr[js.Array[String]] = js.undefined
    
    var external_id: js.UndefOr[String | Null] = js.undefined
    
    var group_id: js.UndefOr[Double | Null] = js.undefined
    
    var name: String
    
    var notes: js.UndefOr[String | Null] = js.undefined
    
    var organization_fields: js.UndefOr[js.Object | Null] = js.undefined
    
    var shared_comments: js.UndefOr[Boolean] = js.undefined
    
    var shared_tickets: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object ResponseModel {
    
    inline def apply(created_at: String, id: ZendeskID, name: String): ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = null)
      __obj.asInstanceOf[ResponseModel]
    }
    
    extension [Self <: ResponseModel](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsNull: Self = StObject.set(x, "details", null)
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDomain_names(value: js.Array[String]): Self = StObject.set(x, "domain_names", value.asInstanceOf[js.Any])
      
      inline def setDomain_namesUndefined: Self = StObject.set(x, "domain_names", js.undefined)
      
      inline def setDomain_namesVarargs(value: String*): Self = StObject.set(x, "domain_names", js.Array(value*))
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
      
      inline def setGroup_idNull: Self = StObject.set(x, "group_id", null)
      
      inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesNull: Self = StObject.set(x, "notes", null)
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setOrganization_fields(value: js.Object): Self = StObject.set(x, "organization_fields", value.asInstanceOf[js.Any])
      
      inline def setOrganization_fieldsNull: Self = StObject.set(x, "organization_fields", null)
      
      inline def setOrganization_fieldsUndefined: Self = StObject.set(x, "organization_fields", js.undefined)
      
      inline def setShared_comments(value: Boolean): Self = StObject.set(x, "shared_comments", value.asInstanceOf[js.Any])
      
      inline def setShared_commentsUndefined: Self = StObject.set(x, "shared_comments", js.undefined)
      
      inline def setShared_tickets(value: Boolean): Self = StObject.set(x, "shared_tickets", value.asInstanceOf[js.Any])
      
      inline def setShared_ticketsUndefined: Self = StObject.set(x, "shared_tickets", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val organization: ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(organization: ResponseModel): ResponsePayload = {
      val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePayload]
    }
    
    extension [Self <: ResponsePayload](x: Self) {
      
      inline def setOrganization(value: ResponseModel): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateManyModel
    extends StObject
       with UpdateModel {
    
    var id: ZendeskID
  }
  object UpdateManyModel {
    
    inline def apply(id: ZendeskID, notes: String): UpdateManyModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateManyModel]
    }
    
    extension [Self <: UpdateManyModel](x: Self) {
      
      inline def setId(value: ZendeskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateManyPayload extends StObject {
    
    val organizations: js.Array[UpdateManyModel]
  }
  object UpdateManyPayload {
    
    inline def apply(organizations: js.Array[UpdateManyModel]): UpdateManyPayload = {
      val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateManyPayload]
    }
    
    extension [Self <: UpdateManyPayload](x: Self) {
      
      inline def setOrganizations(value: js.Array[UpdateManyModel]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      inline def setOrganizationsVarargs(value: UpdateManyModel*): Self = StObject.set(x, "organizations", js.Array(value*))
    }
  }
  
  trait UpdateModel extends StObject {
    
    var notes: String
  }
  object UpdateModel {
    
    inline def apply(notes: String): UpdateModel = {
      val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateModel]
    }
    
    extension [Self <: UpdateModel](x: Self) {
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatePayload extends StObject {
    
    val organization: UpdateModel
  }
  object UpdatePayload {
    
    inline def apply(organization: UpdateModel): UpdatePayload = {
      val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePayload]
    }
    
    extension [Self <: UpdatePayload](x: Self) {
      
      inline def setOrganization(value: UpdateModel): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    }
  }
}
