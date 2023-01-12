package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Groups {
  
  /**
    * @see {@link https://developer.zendesk.com/rest_api/docs/support/groups#create-group|Zendesk Groups Create}
    */
  trait CreateModel extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
  }
  object CreateModel {
    
    inline def apply(): CreateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateModel] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait CreatePayload extends StObject {
    
    val group: CreateModel
  }
  object CreatePayload {
    
    inline def apply(group: CreateModel): CreatePayload = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreatePayload] (val x: Self) extends AnyVal {
      
      inline def setGroup(value: CreateModel): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    val groups: js.Array[ResponseModel]
  }
  object ListPayload {
    
    inline def apply(count: Double, groups: js.Array[ResponseModel]): ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[ListPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListPayload] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: js.Array[ResponseModel]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: ResponseModel*): Self = StObject.set(x, "groups", js.Array(value*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    /** Viewing Groups */
    def assignable(): js.Promise[ListPayload] = js.native
    def assignable(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    /** Creating Groups */
    def create(group: CreatePayload): js.Promise[ResponsePayload] = js.native
    def create(group: CreatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
    
    /** Deleting Groups */
    def delete(groupID: GroupID): js.Promise[Any] = js.native
    def delete(groupID: GroupID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    /** Listing Groups */
    def list(): js.Promise[ListPayload] = js.native
    def list(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    def show(groupId: GroupID): js.Promise[ListPayload] = js.native
    def show(groupId: GroupID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
    
    /** Updating Groups */
    def update(groupID: GroupID, group: UpdatePayload): js.Promise[ResponsePayload] = js.native
    def update(groupID: GroupID, group: UpdatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  }
  
  /**
    * @see {@link https://developer.zendesk.com/rest_api/docs/support/groups/#json-format|Zendesk Groups JSON Format}
    */
  trait ResponseModel
    extends StObject
       with AuditableModel {
    
    val default: Boolean
    
    val deleted: Boolean
    
    val description: String
    
    val name: String | Null
    
    val url: String | Null
  }
  object ResponseModel {
    
    inline def apply(created_at: String, default: Boolean, deleted: Boolean, description: String, id: ZendeskID): ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = null, updated_at = null, url = null)
      __obj.asInstanceOf[ResponseModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseModel] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val group: ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(group: ResponseModel): ResponsePayload = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsePayload] (val x: Self) extends AnyVal {
      
      inline def setGroup(value: ResponseModel): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link https://developer.zendesk.com/rest_api/docs/support/groups#update-group|Zendesk Groups Update}
    */
  trait UpdateModel extends StObject {
    
    var description: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object UpdateModel {
    
    inline def apply(): UpdateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateModel] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait UpdatePayload extends StObject {
    
    val group: UpdateModel
  }
  object UpdatePayload {
    
    inline def apply(group: UpdateModel): UpdatePayload = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdatePayload] (val x: Self) extends AnyVal {
      
      inline def setGroup(value: UpdateModel): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
}
