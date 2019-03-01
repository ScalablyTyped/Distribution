package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepUnusedRequests
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var keepUnusedRequests: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_KeepUnusedRequests {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    keepUnusedRequests: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_KeepUnusedRequests = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(keepUnusedRequests)) __obj.updateDynamic("keepUnusedRequests")(keepUnusedRequests)
    __obj.asInstanceOf[Anon_KeepUnusedRequests]
  }
}

