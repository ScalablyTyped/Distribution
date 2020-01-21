package typings.openapiSecurityHandler.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openapi-security-handler", JSImport.Default)
@js.native
class default protected () extends OpenAPISecurityHandler {
  def this(args: OpenAPISecurityHandlerArgs) = this()
  /* CompleteClass */
  override var operationSecurity: js.Any = js.native
  /* CompleteClass */
  override var securitySets: js.Any = js.native
  /* CompleteClass */
  override def handle(request: js.Any): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def handle(request: Request): js.Promise[Unit] = js.native
}

