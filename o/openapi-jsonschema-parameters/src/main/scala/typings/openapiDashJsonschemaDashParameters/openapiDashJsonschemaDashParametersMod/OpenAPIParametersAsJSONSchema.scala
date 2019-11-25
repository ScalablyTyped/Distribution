package typings.openapiDashJsonschemaDashParameters.openapiDashJsonschemaDashParametersMod

import typings.openapiDashTypes.openapiDashTypesMod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIParametersAsJSONSchema extends js.Object {
  var body: js.UndefOr[IJsonSchema] = js.undefined
  var formData: js.UndefOr[IJsonSchema] = js.undefined
  var headers: js.UndefOr[IJsonSchema] = js.undefined
  var path: js.UndefOr[IJsonSchema] = js.undefined
  var query: js.UndefOr[IJsonSchema] = js.undefined
}

object OpenAPIParametersAsJSONSchema {
  @scala.inline
  def apply(
    body: IJsonSchema = null,
    formData: IJsonSchema = null,
    headers: IJsonSchema = null,
    path: IJsonSchema = null,
    query: IJsonSchema = null
  ): OpenAPIParametersAsJSONSchema = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIParametersAsJSONSchema]
  }
}

