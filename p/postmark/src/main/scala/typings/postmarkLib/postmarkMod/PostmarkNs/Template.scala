package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Active")(Active)
    __obj.updateDynamic("AssociatedServerId")(AssociatedServerId)
    __obj.updateDynamic("HtmlBody")(HtmlBody)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("TemplateId")(TemplateId)
    __obj.updateDynamic("TextBody")(TextBody)
    __obj.asInstanceOf[Template]
  }
}

