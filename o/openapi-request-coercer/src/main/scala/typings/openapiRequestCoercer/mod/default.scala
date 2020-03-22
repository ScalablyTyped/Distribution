package typings.openapiRequestCoercer.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openapi-request-coercer", JSImport.Default)
@js.native
class default protected () extends OpenAPIRequestCoercer {
  def this(args: OpenAPIRequestCoercerArgs) = this()
  /* CompleteClass */
  override var coerceFormData: js.Any = js.native
  /* CompleteClass */
  override var coerceHeaders: js.Any = js.native
  /* CompleteClass */
  override var coerceParams: js.Any = js.native
  /* CompleteClass */
  override var coerceQuery: js.Any = js.native
  /* CompleteClass */
  override def coerce(request: js.Any): Unit = js.native
  /* CompleteClass */
  override def coerce(request: Request): Unit = js.native
}

