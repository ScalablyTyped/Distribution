package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTemplate extends js.Object {
  
  var getAllTemplates: `710` = js.native
  
  var getTemplate: `711` = js.native
}
object GetTemplate {
  
  @scala.inline
  def apply(getAllTemplates: `710`, getTemplate: `711`): GetTemplate = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplate]
  }
  
  @scala.inline
  implicit class GetTemplateOps[Self <: GetTemplate] (val x: Self) extends AnyVal {
    
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
    def setGetAllTemplates(value: `710`): Self = this.set("getAllTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTemplate(value: `711`): Self = this.set("getTemplate", value.asInstanceOf[js.Any])
  }
}
