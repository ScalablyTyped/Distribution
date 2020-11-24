package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiRootUrl extends js.Object {
  
  var apiRootUrl: String = js.native
}
object ApiRootUrl {
  
  @scala.inline
  def apply(apiRootUrl: String): ApiRootUrl = {
    val __obj = js.Dynamic.literal(apiRootUrl = apiRootUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRootUrl]
  }
  
  @scala.inline
  implicit class ApiRootUrlOps[Self <: ApiRootUrl] (val x: Self) extends AnyVal {
    
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
    def setApiRootUrl(value: String): Self = this.set("apiRootUrl", value.asInstanceOf[js.Any])
  }
}
