package typings.openapiSecurityHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPISecurityHandler extends IOpenAPISecurityHandler {
  
  def handle(request: js.Any): js.Promise[Unit] = js.native
  
  var operationSecurity: js.Any = js.native
  
  var securitySets: js.Any = js.native
}
object OpenAPISecurityHandler {
  
  @scala.inline
  def apply(handle: js.Any => js.Promise[Unit], operationSecurity: js.Any, securitySets: js.Any): OpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISecurityHandler]
  }
  
  @scala.inline
  implicit class OpenAPISecurityHandlerOps[Self <: OpenAPISecurityHandler] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: js.Any => js.Promise[Unit]): Self = this.set("handle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOperationSecurity(value: js.Any): Self = this.set("operationSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuritySets(value: js.Any): Self = this.set("securitySets", value.asInstanceOf[js.Any])
  }
}
