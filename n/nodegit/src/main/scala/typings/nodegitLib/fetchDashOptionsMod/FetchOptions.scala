package typings
package nodegitLib.fetchDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var callbacks: js.UndefOr[nodegitLib.remoteDashCallbacksMod.RemoteCallbacks] = js.undefined
  var customHeaders: js.UndefOr[
    nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var downloadTags: js.UndefOr[scala.Double] = js.undefined
  var proxyOpts: js.UndefOr[js.Any] = js.undefined
  var prune: js.UndefOr[scala.Double] = js.undefined
  var updateFetchhead: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks = null,
    customHeaders: nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String] = null,
    downloadTags: scala.Int | scala.Double = null,
    proxyOpts: js.Any = null,
    prune: scala.Int | scala.Double = null,
    updateFetchhead: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (downloadTags != null) __obj.updateDynamic("downloadTags")(downloadTags.asInstanceOf[js.Any])
    if (proxyOpts != null) __obj.updateDynamic("proxyOpts")(proxyOpts)
    if (prune != null) __obj.updateDynamic("prune")(prune.asInstanceOf[js.Any])
    if (updateFetchhead != null) __obj.updateDynamic("updateFetchhead")(updateFetchhead.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

