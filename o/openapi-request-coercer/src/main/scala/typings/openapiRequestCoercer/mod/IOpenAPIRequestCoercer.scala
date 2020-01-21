package typings.openapiRequestCoercer.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIRequestCoercer extends js.Object {
  def coerce(request: Request): Unit
}

object IOpenAPIRequestCoercer {
  @scala.inline
  def apply(coerce: Request => Unit): IOpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
  
    __obj.asInstanceOf[IOpenAPIRequestCoercer]
  }
}

