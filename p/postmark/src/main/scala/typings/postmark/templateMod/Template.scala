package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var Active: Boolean = js.native
  var Alias: String | Null = js.native
  var AssociatedServerId: Double = js.native
  var HtmlBody: String | Null = js.native
  var LayoutTemplate: String | Null = js.native
  var Name: String = js.native
  var Subject: String = js.native
  var TemplateId: Double = js.native
  var TemplateType: TemplateTypes = js.native
  var TextBody: String | Null = js.native
}

object Template {
  @scala.inline
  def apply(
    Active: Boolean,
    AssociatedServerId: Double,
    Name: String,
    Subject: String,
    TemplateId: Double,
    TemplateType: TemplateTypes
  ): Template = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AssociatedServerId = AssociatedServerId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setAssociatedServerId(value: Double): Self = this.set("AssociatedServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateId(value: Double): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateType(value: TemplateTypes): Self = this.set("TemplateType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: String): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasNull: Self = this.set("Alias", null)
    @scala.inline
    def setHtmlBody(value: String): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlBodyNull: Self = this.set("HtmlBody", null)
    @scala.inline
    def setLayoutTemplate(value: String): Self = this.set("LayoutTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutTemplateNull: Self = this.set("LayoutTemplate", null)
    @scala.inline
    def setTextBody(value: String): Self = this.set("TextBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBodyNull: Self = this.set("TextBody", null)
  }
  
}

