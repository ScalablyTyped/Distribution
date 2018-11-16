package typings
package nodegitLib.pushDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PushOptions
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var callbacks: js.UndefOr[nodegitLib.remoteDashCallbacksMod.RemoteCallbacks] = js.undefined
  var customHeaders: js.UndefOr[
    nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var pbParallelism: js.UndefOr[scala.Double] = js.undefined
  var proxyOpts: js.UndefOr[nodegitLib.proxyDashOptionsMod.ProxyOptions] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

