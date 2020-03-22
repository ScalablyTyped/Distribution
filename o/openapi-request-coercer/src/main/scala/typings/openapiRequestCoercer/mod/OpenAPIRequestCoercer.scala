package typings.openapiRequestCoercer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
  var coerceFormData: js.Any
  var coerceHeaders: js.Any
  var coerceParams: js.Any
  var coerceQuery: js.Any
  def coerce(request: js.Any): Unit
}

object OpenAPIRequestCoercer {
  @scala.inline
  def apply(
    coerce: js.Any => Unit,
    coerceFormData: js.Any,
    coerceHeaders: js.Any,
    coerceParams: js.Any,
    coerceQuery: js.Any
  ): OpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenAPIRequestCoercer]
  }
}

