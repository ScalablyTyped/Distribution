package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatePushAction extends js.Object {
  
  var Action: String = js.native
  
  var Alias: String = js.native
  
  var Name: String = js.native
  
  var TemplateId: js.UndefOr[Double] = js.native
}
object TemplatePushAction {
  
  @scala.inline
  def apply(Action: String, Alias: String, Name: String): TemplatePushAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatePushAction]
  }
  
  @scala.inline
  implicit class TemplatePushActionOps[Self <: TemplatePushAction] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: Double): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
  }
}
