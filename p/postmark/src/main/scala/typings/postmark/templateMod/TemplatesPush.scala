package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesPush extends js.Object {
  var Templates: js.Array[TemplatePushAction] = js.native
  var TotalCount: Double = js.native
}

object TemplatesPush {
  @scala.inline
  def apply(Templates: js.Array[TemplatePushAction], TotalCount: Double): TemplatesPush = {
    val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesPush]
  }
  @scala.inline
  implicit class TemplatesPushOps[Self <: TemplatesPush] (val x: Self) extends AnyVal {
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
    def setTemplatesVarargs(value: TemplatePushAction*): Self = this.set("Templates", js.Array(value :_*))
    @scala.inline
    def setTemplates(value: js.Array[TemplatePushAction]): Self = this.set("Templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
  
}

