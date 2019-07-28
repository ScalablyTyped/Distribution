package typings.naverDashWhale.whaleNs.webRequestNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestBodyEvent
  extends Event[
      js.Function1[/* details */ typings.chrome.chromeNs.webRequestNs.WebRequestBodyDetails, Unit]
    ] {
  def addListener(
    callback: js.Function1[/* details */ typings.chrome.chromeNs.webRequestNs.WebRequestBodyDetails, Unit],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ typings.chrome.chromeNs.webRequestNs.WebRequestBodyDetails, Unit],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

