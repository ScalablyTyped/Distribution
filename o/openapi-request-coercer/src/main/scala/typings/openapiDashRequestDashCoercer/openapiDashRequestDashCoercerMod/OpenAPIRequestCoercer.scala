package typings.openapiDashRequestDashCoercer.openapiDashRequestDashCoercerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
  var coerceFormData: js.Any
  var coerceHeaders: js.Any
  var coerceParams: js.Any
  var coerceQuery: js.Any
  var enableObjectCoercion: js.Any
  def coerce(request: js.Any): Unit
}

object OpenAPIRequestCoercer {
  @scala.inline
  def apply(
    coerce: js.Any => Unit,
    coerceFormData: js.Any,
    coerceHeaders: js.Any,
    coerceParams: js.Any,
    coerceQuery: js.Any,
    enableObjectCoercion: js.Any
  ): OpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData, coerceHeaders = coerceHeaders, coerceParams = coerceParams, coerceQuery = coerceQuery, enableObjectCoercion = enableObjectCoercion)
  
    __obj.asInstanceOf[OpenAPIRequestCoercer]
  }
}

