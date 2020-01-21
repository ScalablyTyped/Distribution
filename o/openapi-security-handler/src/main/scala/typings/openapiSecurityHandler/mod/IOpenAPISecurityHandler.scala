package typings.openapiSecurityHandler.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPISecurityHandler extends js.Object {
  def handle(request: Request): js.Promise[Unit]
}

object IOpenAPISecurityHandler {
  @scala.inline
  def apply(handle: Request => js.Promise[Unit]): IOpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
  
    __obj.asInstanceOf[IOpenAPISecurityHandler]
  }
}

