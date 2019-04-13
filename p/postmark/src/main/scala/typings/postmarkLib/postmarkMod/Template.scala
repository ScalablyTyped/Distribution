package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends TemplateBase {
  var AssociatedServerId: scala.Double
  var HtmlBody: java.lang.String
  var Subject: java.lang.String
  var TextBody: java.lang.String
}

object Template {
  @scala.inline
  def apply(
    Active: scala.Boolean,
    AssociatedServerId: scala.Double,
    HtmlBody: java.lang.String,
    Name: java.lang.String,
    Subject: java.lang.String,
    TemplateId: scala.Double,
    TextBody: java.lang.String
  ): Template = {
    val __obj = js.Dynamic.literal(Active = Active, AssociatedServerId = AssociatedServerId, HtmlBody = HtmlBody, Name = Name, Subject = Subject, TemplateId = TemplateId, TextBody = TextBody)
  
    __obj.asInstanceOf[Template]
  }
}

