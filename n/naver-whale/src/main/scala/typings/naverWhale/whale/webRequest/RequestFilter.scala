package typings.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFilter extends js.Object {
  /** Optional. */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * A list of request types. Requests that cannot match any of the types will be filtered out.
    */
  var types: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.ResourceType]] = js.undefined
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[String]
  /** Optional. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object RequestFilter {
  @scala.inline
  def apply(
    urls: js.Array[String],
    tabId: js.UndefOr[Double] = js.undefined,
    types: js.Array[typings.chrome.chrome.webRequest.ResourceType] = null,
    windowId: js.UndefOr[Double] = js.undefined
  ): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFilter]
  }
}

