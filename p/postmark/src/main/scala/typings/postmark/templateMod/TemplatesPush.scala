package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplatesPush extends js.Object {
  var Templates: js.Array[TemplatePushAction]
  var TotalCount: Double
}

object TemplatesPush {
  @scala.inline
  def apply(Templates: js.Array[TemplatePushAction], TotalCount: Double): TemplatesPush = {
    val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplatesPush]
  }
}

