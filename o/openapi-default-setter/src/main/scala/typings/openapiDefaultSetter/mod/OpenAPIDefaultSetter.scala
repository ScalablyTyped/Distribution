package typings.openapiDefaultSetter.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIDefaultSetter extends IOpenAPIDefaultSetter {
  
  var headersDefaults: js.Any = js.native
  
  var queryDefaults: js.Any = js.native
}
object OpenAPIDefaultSetter {
  
  @scala.inline
  def apply(handle: Request => Unit, headersDefaults: js.Any, queryDefaults: js.Any): OpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIDefaultSetter]
  }
  
  @scala.inline
  implicit class OpenAPIDefaultSetterOps[Self <: OpenAPIDefaultSetter] (val x: Self) extends AnyVal {
    
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
    def setHeadersDefaults(value: js.Any): Self = this.set("headersDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefaults(value: js.Any): Self = this.set("queryDefaults", value.asInstanceOf[js.Any])
  }
}
