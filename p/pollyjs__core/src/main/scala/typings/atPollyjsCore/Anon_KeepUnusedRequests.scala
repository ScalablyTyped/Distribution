package typings.atPollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepUnusedRequests
  extends /* key */ StringDictionary[js.Any] {
  var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
}

object Anon_KeepUnusedRequests {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
  ): Anon_KeepUnusedRequests = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(keepUnusedRequests)) __obj.updateDynamic("keepUnusedRequests")(keepUnusedRequests)
    __obj.asInstanceOf[Anon_KeepUnusedRequests]
  }
}

