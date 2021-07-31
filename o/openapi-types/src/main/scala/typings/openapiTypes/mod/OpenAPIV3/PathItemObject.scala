package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathItemObject extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var delete: js.UndefOr[OperationObject] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var get: js.UndefOr[OperationObject] = js.undefined
  
  var head: js.UndefOr[OperationObject] = js.undefined
  
  var options: js.UndefOr[OperationObject] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  
  var patch: js.UndefOr[OperationObject] = js.undefined
  
  var post: js.UndefOr[OperationObject] = js.undefined
  
  var put: js.UndefOr[OperationObject] = js.undefined
  
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var trace: js.UndefOr[OperationObject] = js.undefined
}
object PathItemObject {
  
  @scala.inline
  def apply(): PathItemObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathItemObject]
  }
  
  @scala.inline
  implicit class PathItemObjectMutableBuilder[Self <: PathItemObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setDelete(value: OperationObject): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGet(value: OperationObject): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHead(value: OperationObject): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    @scala.inline
    def setOptions(value: OperationObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setPatch(value: OperationObject): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPost(value: OperationObject): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPut(value: OperationObject): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    @scala.inline
    def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTrace(value: OperationObject): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
