package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateInList extends js.Object {
  
  var Active: Boolean = js.native
  
  var Alias: String | Null = js.native
  
  var LayoutTemplate: String | Null = js.native
  
  var Name: String = js.native
  
  var TemplateId: Double = js.native
  
  var TemplateType: TemplateTypes = js.native
}
object TemplateInList {
  
  @scala.inline
  def apply(Active: Boolean, Name: String, TemplateId: Double, TemplateType: TemplateTypes): TemplateInList = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInList]
  }
  
  @scala.inline
  implicit class TemplateInListOps[Self <: TemplateInList] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: Double): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateType(value: TemplateTypes): Self = this.set("TemplateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = this.set("Alias", null)
    
    @scala.inline
    def setLayoutTemplate(value: String): Self = this.set("LayoutTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutTemplateNull: Self = this.set("LayoutTemplate", null)
  }
}
