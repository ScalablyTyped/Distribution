package typings.openapiTypes.mod.OpenAPI

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPIV3.CallbackObject
import typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.openapiTypes.mod.OpenAPIV3.ResponsesObject
import typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.OperationObject
  - typings.openapiTypes.mod.OpenAPIV3.OperationObject
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRequestBody(value: ReferenceObject | RequestBodyObject): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setResponses(value: ResponsesObject): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = this.set("security", js.Array(value :_*))
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setServersVarargs(value: ServerObject*): Self = this.set("servers", js.Array(value :_*))
    @scala.inline
    def setServers(value: js.Array[ServerObject]): Self = this.set("servers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

