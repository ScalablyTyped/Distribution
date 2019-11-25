package typings.msDashRest.msDashRestMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPrepareOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var bodyIsStream: js.UndefOr[Boolean] = js.undefined
  var deserializationMapper: Mapper
  var disableClientRequestId: js.UndefOr[Boolean] = js.undefined
  var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var method: String
  var pathParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.undefined
  var queryParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.undefined
  var serializationMapper: Mapper
}

object RequestPrepareOptions {
  @scala.inline
  def apply(
    deserializationMapper: Mapper,
    method: String,
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
  ): RequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyIsStream)) __obj.updateDynamic("bodyIsStream")(bodyIsStream.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClientRequestId)) __obj.updateDynamic("disableClientRequestId")(disableClientRequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableJsonStringifyOnBody)) __obj.updateDynamic("disableJsonStringifyOnBody")(disableJsonStringifyOnBody.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPrepareOptions]
  }
}

