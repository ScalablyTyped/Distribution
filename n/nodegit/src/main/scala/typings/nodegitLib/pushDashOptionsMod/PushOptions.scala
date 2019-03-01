package typings
package nodegitLib.pushDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var callbacks: js.UndefOr[nodegitLib.remoteDashCallbacksMod.RemoteCallbacks] = js.undefined
  var customHeaders: js.UndefOr[
    nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var pbParallelism: js.UndefOr[scala.Double] = js.undefined
  var proxyOpts: js.UndefOr[nodegitLib.proxyDashOptionsMod.ProxyOptions] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object PushOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks = null,
    customHeaders: nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String] = null,
    pbParallelism: scala.Int | scala.Double = null,
    proxyOpts: nodegitLib.proxyDashOptionsMod.ProxyOptions = null,
    version: scala.Int | scala.Double = null
  ): PushOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (pbParallelism != null) __obj.updateDynamic("pbParallelism")(pbParallelism.asInstanceOf[js.Any])
    if (proxyOpts != null) __obj.updateDynamic("proxyOpts")(proxyOpts)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOptions]
  }
}

