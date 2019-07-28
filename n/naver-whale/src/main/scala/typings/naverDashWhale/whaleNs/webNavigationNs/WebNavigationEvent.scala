package typings.naverDashWhale.whaleNs.webNavigationNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: typings.chrome.chromeNs.webNavigationNs.WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filters: typings.chrome.chromeNs.webNavigationNs.WebNavigationEventFilter
  ): Unit = js.native
}

