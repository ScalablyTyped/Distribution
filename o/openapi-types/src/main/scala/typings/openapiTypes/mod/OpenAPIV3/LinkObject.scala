package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkObject extends StObject {
  
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
  implicit class LinkObjectMutableBuilder[Self <: LinkObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setOperationRef(value: String): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationRefUndefined: Self = StObject.set(x, "operationRef", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRequestBody(value: js.Any): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setServer(value: ServerObject): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
