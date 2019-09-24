package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OctokitRequestOptions
  extends /* option */ StringDictionary[js.Any] {
  /**
    * Node only. Useful for custom proxy, certificate, or dns lookup.
    */
  var agent: js.UndefOr[Agent] = js.undefined
  /**
    * Custom replacement for built-in fetch method. Useful for testing or request hooks.
    */
  var fetch: js.UndefOr[js.Any] = js.undefined
  /**
    * Use an `AbortController` instance to cancel a request. In node you can only cancel streamed requests.
    */
  var signal: js.UndefOr[js.Any] = js.undefined
  /**
    * Node only. Request/response timeout in ms, it resets on redirect. 0 to disable (OS limit applies). `options.request.signal` is recommended instead.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object OctokitRequestOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.Any] = null,
    agent: Agent = null,
    fetch: js.Any = null,
    signal: js.Any = null,
    timeout: Int | Double = null
  ): OctokitRequestOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctokitRequestOptions]
  }
}

