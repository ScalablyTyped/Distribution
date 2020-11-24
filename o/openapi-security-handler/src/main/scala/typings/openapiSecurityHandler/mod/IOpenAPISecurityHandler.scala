package typings.openapiSecurityHandler.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpenAPISecurityHandler extends js.Object {
  
  def handle(request: Request): js.Promise[Unit] = js.native
}
object IOpenAPISecurityHandler {
  
  @scala.inline
  def apply(handle: Request => js.Promise[Unit]): IOpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[IOpenAPISecurityHandler]
  }
  
  @scala.inline
  implicit class IOpenAPISecurityHandlerOps[Self <: IOpenAPISecurityHandler] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: Request => js.Promise[Unit]): Self = this.set("handle", js.Any.fromFunction1(value))
  }
}
