package typings.naverDashWhale.whale.webNavigation

import typings.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filters: typings.chrome.chrome.webNavigation.WebNavigationEventFilter
  ): Unit = js.native
}

