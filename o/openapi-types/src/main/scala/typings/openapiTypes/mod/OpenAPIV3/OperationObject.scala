package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPI.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationObject extends Operation {
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  var operationId: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.native
  var requestBody: js.UndefOr[ReferenceObject | RequestBodyObject] = js.native
  var responses: js.UndefOr[ResponsesObject] = js.native
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.native
  var servers: js.UndefOr[js.Array[ServerObject]] = js.native
  var summary: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object OperationObject {
  @scala.inline
  def apply(): OperationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationObject]
  }
  @scala.inline
  implicit class OperationObjectOps[Self <: OperationObject] (val x: Self) extends AnyVal {
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

