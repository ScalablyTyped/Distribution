package typings.nodegit.fetchDashOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.remoteDashCallbacksMod.RemoteCallbacks
import typings.nodegit.strDashArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions
  extends /* key */ StringDictionary[js.Any] {
  var callbacks: js.UndefOr[RemoteCallbacks] = js.undefined
  var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
  var downloadTags: js.UndefOr[Double] = js.undefined
  var proxyOpts: js.UndefOr[js.Any] = js.undefined
  var prune: js.UndefOr[Double] = js.undefined
  var updateFetchhead: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    callbacks: RemoteCallbacks = null,
    customHeaders: Strarray | String | js.Array[String] = null,
    downloadTags: Int | Double = null,
    proxyOpts: js.Any = null,
    prune: Int | Double = null,
    updateFetchhead: Int | Double = null,
    version: Int | Double = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (downloadTags != null) __obj.updateDynamic("downloadTags")(downloadTags.asInstanceOf[js.Any])
    if (proxyOpts != null) __obj.updateDynamic("proxyOpts")(proxyOpts.asInstanceOf[js.Any])
    if (prune != null) __obj.updateDynamic("prune")(prune.asInstanceOf[js.Any])
    if (updateFetchhead != null) __obj.updateDynamic("updateFetchhead")(updateFetchhead.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

