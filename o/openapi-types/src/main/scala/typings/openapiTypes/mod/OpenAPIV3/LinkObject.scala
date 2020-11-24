package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkObject extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var operationRef: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var requestBody: js.UndefOr[js.Any] = js.native
  
  var server: js.UndefOr[ServerObject] = js.native
}
object LinkObject {
  
  @scala.inline
  def apply(): LinkObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkObject]
  }
  
  @scala.inline
  implicit class LinkObjectOps[Self <: LinkObject] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setOperationRef(value: String): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationRef: Self = this.set("operationRef", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setRequestBody(value: js.Any): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setServer(value: ServerObject): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
