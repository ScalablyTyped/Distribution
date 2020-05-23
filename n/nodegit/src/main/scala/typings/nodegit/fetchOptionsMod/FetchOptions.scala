package typings.nodegit.fetchOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    callbacks: RemoteCallbacks = null,
    customHeaders: Strarray | String | js.Array[String] = null,
    downloadTags: js.UndefOr[Double] = js.undefined,
    proxyOpts: js.Any = null,
    prune: js.UndefOr[Double] = js.undefined,
    updateFetchhead: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(downloadTags)) __obj.updateDynamic("downloadTags")(downloadTags.get.asInstanceOf[js.Any])
    if (proxyOpts != null) __obj.updateDynamic("proxyOpts")(proxyOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(prune)) __obj.updateDynamic("prune")(prune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateFetchhead)) __obj.updateDynamic("updateFetchhead")(updateFetchhead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

