package typings.msDashRest.msDashRestMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathTemplateBasedRequestPrepareOptions extends RequestPrepareOptions {
  var pathTemplate: String
}

object PathTemplateBasedRequestPrepareOptions {
  @scala.inline
  def apply(
    deserializationMapper: Mapper,
    method: String,
    pathTemplate: String,
    serializationMapper: Mapper,
    baseUrl: String = null,
    body: js.Any = null,
    bodyIsStream: js.UndefOr[Boolean] = js.undefined,
    disableClientRequestId: js.UndefOr[Boolean] = js.undefined,
    disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined,
    formData: StringDictionary[js.Any] = null,
    headers: StringDictionary[js.Any] = null,
    pathParameters: StringDictionary[js.Any | UrlParameterValue] = null,
    queryParameters: StringDictionary[js.Any | UrlParameterValue] = null
  ): PathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper, method = method, pathTemplate = pathTemplate, serializationMapper = serializationMapper)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(bodyIsStream)) __obj.updateDynamic("bodyIsStream")(bodyIsStream)
    if (!js.isUndefined(disableClientRequestId)) __obj.updateDynamic("disableClientRequestId")(disableClientRequestId)
    if (!js.isUndefined(disableJsonStringifyOnBody)) __obj.updateDynamic("disableJsonStringifyOnBody")(disableJsonStringifyOnBody)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    __obj.asInstanceOf[PathTemplateBasedRequestPrepareOptions]
  }
}

