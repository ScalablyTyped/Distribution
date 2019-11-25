package typings.postmark.distClientModelsTemplatesTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var Active: Boolean
  var Alias: String | Null
  var AssociatedServerId: Double
  var HtmlBody: String | Null
  var LayoutTemplate: String | Null
  var Name: String
  var Subject: String
  var TemplateId: Double
  var TemplateType: TemplateTypes
  var TextBody: String | Null
}

object Template {
  @scala.inline
  def apply(
    Active: Boolean,
    AssociatedServerId: Double,
    Name: String,
    Subject: String,
    TemplateId: Double,
    TemplateType: TemplateTypes,
    Alias: String = null,
    HtmlBody: String = null,
    LayoutTemplate: String = null,
    TextBody: String = null
  ): Template = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AssociatedServerId = AssociatedServerId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody.asInstanceOf[js.Any])
    if (LayoutTemplate != null) __obj.updateDynamic("LayoutTemplate")(LayoutTemplate.asInstanceOf[js.Any])
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

