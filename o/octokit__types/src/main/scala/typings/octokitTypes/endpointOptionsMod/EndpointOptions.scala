package typings.octokitTypes.endpointOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Format
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters & {  method :@octokit/types.@octokit/types/dist-types/RequestMethod.RequestMethod,   url :@octokit/types.@octokit/types/dist-types/Url.Url} */
@js.native
trait EndpointOptions
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
  var baseUrl: js.UndefOr[Url] = js.native
  /**
    * HTTP headers. Use lowercase keys.
    */
  var headers: js.UndefOr[RequestHeaders] = js.native
  /**
    * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
    */
  var mediaType: js.UndefOr[Format] = js.native
  var method: RequestMethod = js.native
  /**
    * Pass custom meta information for the request. The `request` object will be returned as is.
    */
  var request: js.UndefOr[RequestRequestOptions] = js.native
  var url: Url = js.native
}

object EndpointOptions {
  @scala.inline
  def apply(method: RequestMethod, url: Url): EndpointOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
  @scala.inline
  implicit class EndpointOptionsOps[Self <: EndpointOptions] (val x: Self) extends AnyVal {
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
    def setMethod(value: RequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Url): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUrl(value: Url): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMediaType(value: Format): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

