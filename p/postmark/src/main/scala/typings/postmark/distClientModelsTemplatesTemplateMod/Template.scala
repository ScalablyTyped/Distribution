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
    val __obj = js.Dynamic.literal(Active = Active, AssociatedServerId = AssociatedServerId, Name = Name, Subject = Subject, TemplateId = TemplateId, TemplateType = TemplateType)
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    if (LayoutTemplate != null) __obj.updateDynamic("LayoutTemplate")(LayoutTemplate)
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody)
    __obj.asInstanceOf[Template]
  }
}

