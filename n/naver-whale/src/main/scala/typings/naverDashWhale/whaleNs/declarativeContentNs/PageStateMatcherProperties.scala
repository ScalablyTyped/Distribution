package typings.naverDashWhale.whaleNs.declarativeContentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.declarativeContent.PageStateMatcherProperties")
@js.native
class PageStateMatcherProperties () extends js.Object {
  /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
  var css: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.
    * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
    * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
    */
  var isBookmarked: js.UndefOr[Boolean] = js.native
  /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
  var pageUrl: js.UndefOr[typings.chrome.chromeNs.declarativeContentNs.PageStateUrlDetails] = js.native
}

