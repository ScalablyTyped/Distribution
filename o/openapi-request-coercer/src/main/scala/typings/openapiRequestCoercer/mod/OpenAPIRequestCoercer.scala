package typings.openapiRequestCoercer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
  
  def coerce(request: js.Any): Unit = js.native
  
  var coerceFormData: js.Any = js.native
  
  var coerceHeaders: js.Any = js.native
  
  var coerceParams: js.Any = js.native
  
  var coerceQuery: js.Any = js.native
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
  
  @scala.inline
  implicit class OpenAPIRequestCoercerOps[Self <: OpenAPIRequestCoercer] (val x: Self) extends AnyVal {
    
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
    def setCoerce(value: js.Any => Unit): Self = this.set("coerce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCoerceFormData(value: js.Any): Self = this.set("coerceFormData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceHeaders(value: js.Any): Self = this.set("coerceHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceParams(value: js.Any): Self = this.set("coerceParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoerceQuery(value: js.Any): Self = this.set("coerceQuery", value.asInstanceOf[js.Any])
  }
}
