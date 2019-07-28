package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends TemplateBase {
  var AssociatedServerId: Double
  var HtmlBody: String
  var Subject: String
  var TextBody: String
}

object Template {
  @scala.inline
  def apply(
    Active: Boolean,
    AssociatedServerId: Double,
    HtmlBody: String,
    Name: String,
    Subject: String,
    TemplateId: Double,
    TextBody: String
  ): Template = {
    val __obj = js.Dynamic.literal(Active = Active, AssociatedServerId = AssociatedServerId, HtmlBody = HtmlBody, Name = Name, Subject = Subject, TemplateId = TemplateId, TextBody = TextBody)
  
    __obj.asInstanceOf[Template]
  }
}

