package typings.atOctokitRequest.distDashTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOctokitRequest.Anon_Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters
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
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * HTTP headers. Use lowercase keys.
    */
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  /**
    * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
    */
  var mediaType: js.UndefOr[Anon_Format] = js.undefined
  /**
    * Pass custom meta information for the request. The `request` object will be returned as is.
    */
  var request: js.UndefOr[OctokitRequestOptions] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Any additional parameter will be passed as follows
    * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
    * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
    * 3. Request body if `parameter` is `'data'`
    * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
    */
  /* parameter */ StringDictionary[js.Any] = null,
    baseUrl: String = null,
    headers: RequestHeaders = null,
    mediaType: Anon_Format = null,
    request: OctokitRequestOptions = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Parameters]
  }
}

