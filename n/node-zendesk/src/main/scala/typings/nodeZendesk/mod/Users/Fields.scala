package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StringDictionary
import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fields {
  
  @js.native
  trait CreateUserField extends UserField {
    
    @JSName("key")
    var key_CreateUserField: String = js.native
  }
  object CreateUserField {
    
    @scala.inline
    def apply(key: String, title: String): CreateUserField = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUserField]
    }
    
    @scala.inline
    implicit class CreateUserFieldMutableBuilder[Self <: CreateUserField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomFieldOptions = StringDictionary[js.Any]
  
  @js.native
  trait Methods extends StObject {
    
    def create(field: CreateUserField): js.Promise[_] = js.native
    def create(field: CreateUserField, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def delete(fieldId: ZendeskID): js.Promise[_] = js.native
    def delete(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def list(): js.Promise[_] = js.native
    def list(cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def show(fieldId: ZendeskID): js.Promise[_] = js.native
    def show(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def update(fieldId: ZendeskID, field: js.Any): js.Promise[_] = js.native
    def update(fieldId: ZendeskID, field: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  }
  
  /**
    * Represents 'user_field'
    */
  @js.native
  trait UserField extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var created_at: js.UndefOr[Date] = js.native
    
    var custom_field_options: js.UndefOr[js.Array[CustomFieldOptions]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var raw_description: js.UndefOr[String] = js.native
    
    var raw_title: js.UndefOr[String] = js.native
    
    var regexp_for_validation: js.UndefOr[String] = js.native
    
    val system: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var title: String = js.native
    
    val `type`: js.UndefOr[UserFieldType] = js.native
    
    var updated_at: js.UndefOr[Date] = js.native
    
    val url: js.UndefOr[String] = js.native
  }
  object UserField {
    
    @scala.inline
    def apply(title: String): UserField = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserField]
    }
    
    @scala.inline
    implicit class UserFieldMutableBuilder[Self <: UserField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      @scala.inline
      def setCustom_field_options(value: js.Array[CustomFieldOptions]): Self = StObject.set(x, "custom_field_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_field_optionsUndefined: Self = StObject.set(x, "custom_field_options", js.undefined)
      
      @scala.inline
      def setCustom_field_optionsVarargs(value: CustomFieldOptions*): Self = StObject.set(x, "custom_field_options", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRaw_description(value: String): Self = StObject.set(x, "raw_description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_descriptionUndefined: Self = StObject.set(x, "raw_description", js.undefined)
      
      @scala.inline
      def setRaw_title(value: String): Self = StObject.set(x, "raw_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_titleUndefined: Self = StObject.set(x, "raw_title", js.undefined)
      
      @scala.inline
      def setRegexp_for_validation(value: String): Self = StObject.set(x, "regexp_for_validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexp_for_validationUndefined: Self = StObject.set(x, "regexp_for_validation", js.undefined)
      
      @scala.inline
      def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: UserFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdated_at(value: Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * Types of custom fields that can be created
    * @default 'text'
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.text
    - typings.nodeZendesk.nodeZendeskStrings.textarea
    - typings.nodeZendesk.nodeZendeskStrings.checkbox
    - typings.nodeZendesk.nodeZendeskStrings.date
    - typings.nodeZendesk.nodeZendeskStrings.integer
    - typings.nodeZendesk.nodeZendeskStrings.decimal
    - typings.nodeZendesk.nodeZendeskStrings.regexp
    - typings.nodeZendesk.nodeZendeskStrings.tagger
  */
  trait UserFieldType extends StObject
  object UserFieldType {
    
    @scala.inline
    def checkbox: typings.nodeZendesk.nodeZendeskStrings.checkbox = "checkbox".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.checkbox]
    
    @scala.inline
    def date: typings.nodeZendesk.nodeZendeskStrings.date = "date".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.date]
    
    @scala.inline
    def decimal: typings.nodeZendesk.nodeZendeskStrings.decimal = "decimal".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.decimal]
    
    @scala.inline
    def integer: typings.nodeZendesk.nodeZendeskStrings.integer = "integer".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.integer]
    
    @scala.inline
    def regexp: typings.nodeZendesk.nodeZendeskStrings.regexp = "regexp".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.regexp]
    
    @scala.inline
    def tagger: typings.nodeZendesk.nodeZendeskStrings.tagger = "tagger".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.tagger]
    
    @scala.inline
    def text: typings.nodeZendesk.nodeZendeskStrings.text = "text".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.text]
    
    @scala.inline
    def textarea: typings.nodeZendesk.nodeZendeskStrings.textarea = "textarea".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.textarea]
  }
}
