package typings.octokitTypes.endpointDefaultsMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Format
import typings.octokitTypes.anon.Previews
import typings.octokitTypes.anon.RequestHeadersacceptstrin
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters & {  baseUrl  :@octokit/types.@octokit/types/dist-types/Url.Url,   method  :@octokit/types.@octokit/types/dist-types/RequestMethod.RequestMethod,   url ? :@octokit/types.@octokit/types/dist-types/Url.Url,   headers  :@octokit/types.@octokit/types/dist-types/RequestHeaders.RequestHeaders & {  accept  :string,   user-agent  :string},   mediaType  :{  format  :string,   previews  :std.Array<string>}} */
trait EndpointDefaults
  extends /**
  * Any additional parameter will be passed as follows
  * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
  * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
  * 3. Request body if `parameter` is `'data'`
  * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
  */
/* parameter */ StringDictionary[js.Any] {
  /**
    * Base URL to be used when a relative URL is passed, such as `/orgs/:org`.
    * If `baseUrl` is `https://enterprise.acme-inc.com/api/v3`, then the request
    * will be sent to `https://enterprise.acme-inc.com/api/v3/orgs/:org`.
    */
  var baseUrl: js.UndefOr[Url] = js.undefined
  /**
    * HTTP headers. Use lowercase keys.
    */
  var headers: js.UndefOr[RequestHeaders with RequestHeadersacceptstrin] = js.undefined
  /**
    * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
    */
  var mediaType: js.UndefOr[Format with Previews] = js.undefined
  var method: RequestMethod
  /**
    * Pass custom meta information for the request. The `request` object will be returned as is.
    */
  var request: js.UndefOr[RequestRequestOptions] = js.undefined
  var url: js.UndefOr[Url] = js.undefined
}

object EndpointDefaults {
  @scala.inline
  def apply(
    method: RequestMethod,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    baseUrl: Url = null,
    headers: RequestHeaders with RequestHeadersacceptstrin = null,
    mediaType: Format with Previews = null,
    request: RequestRequestOptions = null,
    url: Url = null
  ): EndpointDefaults = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDefaults]
  }
}

