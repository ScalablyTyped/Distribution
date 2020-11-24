package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevertTemplateResponse extends js.Object {
  
  /**
    * Template as it appears in the latest container version since the last workspace synchronization operation. If no template is present, that means the template was deleted in the
    * latest container version.
    */
  var template: js.UndefOr[CustomTemplate] = js.native
}
object RevertTemplateResponse {
  
  @scala.inline
  def apply(): RevertTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertTemplateResponse]
  }
  
  @scala.inline
  implicit class RevertTemplateResponseOps[Self <: RevertTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: CustomTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
