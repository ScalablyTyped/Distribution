package typings.nodegit.pushOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.proxyOptionsMod.ProxyOptions
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushOptions
  extends /* key */ StringDictionary[js.Any] {
  var callbacks: js.UndefOr[RemoteCallbacks] = js.undefined
  var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
  var pbParallelism: js.UndefOr[Double] = js.undefined
  var proxyOpts: js.UndefOr[ProxyOptions] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object PushOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    callbacks: RemoteCallbacks = null,
    customHeaders: Strarray | String | js.Array[String] = null,
    pbParallelism: Int | Double = null,
    proxyOpts: ProxyOptions = null,
    version: Int | Double = null
  ): PushOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (pbParallelism != null) __obj.updateDynamic("pbParallelism")(pbParallelism.asInstanceOf[js.Any])
    if (proxyOpts != null) __obj.updateDynamic("proxyOpts")(proxyOpts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOptions]
  }
}

