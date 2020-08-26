package typings.octokitTypes.requestRequestOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.octokitTypes.fetchMod.Fetch
import typings.octokitTypes.signalMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRequestOptions
  extends /**
  * Any additional parameter will be passed as follows
  * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
  * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
  * 3. Request body if `parameter` is `'data'`
  * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
  */
/* parameter */ StringDictionary[js.Any] {
  /**
    * Node only. Useful for custom proxy, certificate, or dns lookup.
    */
  var agent: js.UndefOr[Agent] = js.native
  /**
    * Custom replacement for built-in fetch method. Useful for testing or request hooks.
    */
  var fetch: js.UndefOr[Fetch] = js.native
  /**
    * Use an `AbortController` instance to cancel a request. In node you can only cancel streamed requests.
    */
  var signal: js.UndefOr[Signal] = js.native
  /**
    * Node only. Request/response timeout in ms, it resets on redirect. 0 to disable (OS limit applies). `options.request.signal` is recommended instead.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object RequestRequestOptions {
  @scala.inline
  def apply(): RequestRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRequestOptions]
  }
  @scala.inline
  implicit class RequestRequestOptionsOps[Self <: RequestRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setFetch(value: Fetch): Self = this.set("fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setSignal(value: Signal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

