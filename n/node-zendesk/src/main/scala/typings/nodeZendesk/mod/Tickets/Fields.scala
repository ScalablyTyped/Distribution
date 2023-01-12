package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StringDictionary
import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import typings.nodeZendesk.nodeZendeskBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fields {
  
  trait CreateTicketField
    extends StObject
       with TicketField {
    
    var key: String
  }
  object CreateTicketField {
    
    inline def apply(key: String): CreateTicketField = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTicketField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTicketField] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomFieldOptions = StringDictionary[Any]
  
  @js.native
  trait Methods extends StObject {
    
    def create(field: CreateTicketField): js.Promise[Any] = js.native
    def create(field: CreateTicketField, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def delete(fieldId: ZendeskID): js.Promise[Any] = js.native
    def delete(fieldId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def list(): js.Promise[Any] = js.native
    def list(cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def show(fieldId: ZendeskID): js.Promise[Any] = js.native
    def show(fieldId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def update(fieldId: ZendeskID, field: Any): js.Promise[Any] = js.native
    def update(fieldId: ZendeskID, field: Any, cb: ZendeskCallback[Any, Any]): Any = js.native
  }
  
  /**
    * Represents 'ticket_fields'
    */
  trait TicketField extends StObject {
    
    var active: js.UndefOr[`true`] = js.undefined
    
    var agent_description: js.UndefOr[String] = js.undefined
    
    var collapsed_for_agents: js.UndefOr[Boolean] = js.undefined
    
    var created_at: js.UndefOr[js.Date] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var editable_in_portal: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var raw_description: js.UndefOr[String] = js.undefined
    
    var raw_title: js.UndefOr[String] = js.undefined
    
    var raw_title_in_portal: js.UndefOr[String] = js.undefined
    
    var regexp_for_validation: js.UndefOr[String] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var required_in_portal: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
    
    var title_in_portal: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
    
    var updated_at: js.UndefOr[js.Date] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var visible_in_portal: js.UndefOr[Boolean] = js.undefined
  }
  object TicketField {
    
    inline def apply(): TicketField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TicketField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TicketField] (val x: Self) extends AnyVal {
      
      inline def setActive(value: `true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAgent_description(value: String): Self = StObject.set(x, "agent_description", value.asInstanceOf[js.Any])
      
      inline def setAgent_descriptionUndefined: Self = StObject.set(x, "agent_description", js.undefined)
      
      inline def setCollapsed_for_agents(value: Boolean): Self = StObject.set(x, "collapsed_for_agents", value.asInstanceOf[js.Any])
      
      inline def setCollapsed_for_agentsUndefined: Self = StObject.set(x, "collapsed_for_agents", js.undefined)
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEditable_in_portal(value: Boolean): Self = StObject.set(x, "editable_in_portal", value.asInstanceOf[js.Any])
      
      inline def setEditable_in_portalUndefined: Self = StObject.set(x, "editable_in_portal", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRaw_description(value: String): Self = StObject.set(x, "raw_description", value.asInstanceOf[js.Any])
      
      inline def setRaw_descriptionUndefined: Self = StObject.set(x, "raw_description", js.undefined)
      
      inline def setRaw_title(value: String): Self = StObject.set(x, "raw_title", value.asInstanceOf[js.Any])
      
      inline def setRaw_titleUndefined: Self = StObject.set(x, "raw_title", js.undefined)
      
      inline def setRaw_title_in_portal(value: String): Self = StObject.set(x, "raw_title_in_portal", value.asInstanceOf[js.Any])
      
      inline def setRaw_title_in_portalUndefined: Self = StObject.set(x, "raw_title_in_portal", js.undefined)
      
      inline def setRegexp_for_validation(value: String): Self = StObject.set(x, "regexp_for_validation", value.asInstanceOf[js.Any])
      
      inline def setRegexp_for_validationUndefined: Self = StObject.set(x, "regexp_for_validation", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequired_in_portal(value: Boolean): Self = StObject.set(x, "required_in_portal", value.asInstanceOf[js.Any])
      
      inline def setRequired_in_portalUndefined: Self = StObject.set(x, "required_in_portal", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitle_in_portal(value: String): Self = StObject.set(x, "title_in_portal", value.asInstanceOf[js.Any])
      
      inline def setTitle_in_portalUndefined: Self = StObject.set(x, "title_in_portal", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisible_in_portal(value: Boolean): Self = StObject.set(x, "visible_in_portal", value.asInstanceOf[js.Any])
      
      inline def setVisible_in_portalUndefined: Self = StObject.set(x, "visible_in_portal", js.undefined)
    }
  }
}
