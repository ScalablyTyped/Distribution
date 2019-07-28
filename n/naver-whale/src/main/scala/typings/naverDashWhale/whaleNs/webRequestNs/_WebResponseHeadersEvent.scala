package typings.naverDashWhale.whaleNs.webRequestNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebResponseHeadersEvent[T /* <: typings.chrome.chromeNs.webRequestNs.WebResponseHeadersDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

