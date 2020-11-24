package typings.openapiJsonschemaParameters.mod

import typings.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIParametersAsJSONSchema extends js.Object {
  
  var body: js.UndefOr[IJsonSchema] = js.native
  
  var cookie: js.UndefOr[IJsonSchema] = js.native
  
  var formData: js.UndefOr[IJsonSchema] = js.native
  
  var headers: js.UndefOr[IJsonSchema] = js.native
  
  var path: js.UndefOr[IJsonSchema] = js.native
  
  var query: js.UndefOr[IJsonSchema] = js.native
}
object OpenAPIParametersAsJSONSchema {
  
  @scala.inline
  def apply(): OpenAPIParametersAsJSONSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenAPIParametersAsJSONSchema]
  }
  
  @scala.inline
  implicit class OpenAPIParametersAsJSONSchemaOps[Self <: OpenAPIParametersAsJSONSchema] (val x: Self) extends AnyVal {
    
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
    def setBody(value: IJsonSchema): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCookie(value: IJsonSchema): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setFormData(value: IJsonSchema): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHeaders(value: IJsonSchema): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPath(value: IJsonSchema): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setQuery(value: IJsonSchema): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
