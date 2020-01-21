package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplatePushAction extends js.Object {
  var Action: String
  var Alias: String
  var Name: String
  var TemplateId: js.UndefOr[Double] = js.undefined
}

object TemplatePushAction {
  @scala.inline
  def apply(Action: String, Alias: String, Name: String, TemplateId: Int | Double = null): TemplatePushAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatePushAction]
  }
}

