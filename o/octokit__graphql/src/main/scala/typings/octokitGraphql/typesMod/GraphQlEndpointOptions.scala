package typings.octokitGraphql.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Format
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @octokit/types.@octokit/types.EndpointOptions & {  variables :{[key: string] : unknown} | undefined} */
@js.native
trait GraphQlEndpointOptions
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
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GraphQlEndpointOptions {
  @scala.inline
  def apply(method: RequestMethod, url: Url): GraphQlEndpointOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQlEndpointOptions]
  }
  @scala.inline
  implicit class GraphQlEndpointOptionsOps[Self <: GraphQlEndpointOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

