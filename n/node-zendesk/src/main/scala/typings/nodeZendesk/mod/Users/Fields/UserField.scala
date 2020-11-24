package typings.nodeZendesk.mod.Users.Fields

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents 'user_field'
  */
@js.native
trait UserField extends js.Object {
  
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
  implicit class UserFieldOps[Self <: UserField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    
    @scala.inline
    def setCustom_field_optionsVarargs(value: CustomFieldOptions*): Self = this.set("custom_field_options", js.Array(value :_*))
    
    @scala.inline
    def setCustom_field_options(value: js.Array[CustomFieldOptions]): Self = this.set("custom_field_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_field_options: Self = this.set("custom_field_options", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRaw_description(value: String): Self = this.set("raw_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw_description: Self = this.set("raw_description", js.undefined)
    
    @scala.inline
    def setRaw_title(value: String): Self = this.set("raw_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw_title: Self = this.set("raw_title", js.undefined)
    
    @scala.inline
    def setRegexp_for_validation(value: String): Self = this.set("regexp_for_validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp_for_validation: Self = this.set("regexp_for_validation", js.undefined)
    
    @scala.inline
    def setSystem(value: Boolean): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setType(value: UserFieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
