package typings
package naverDashWhaleLib.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: chromeLib.chromeNs.webNavigationNs.WebNavigationCallbackDetails */]
  extends chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ T, scala.Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, scala.Unit],
    filters: chromeLib.chromeNs.webNavigationNs.WebNavigationEventFilter
  ): scala.Unit = js.native
}

