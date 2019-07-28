package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = Event[typings.chrome.chromeNs.typesNs.DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ typings.chrome.chromeNs.typesNs.ChromeSettingGetResultDetails, Unit]
}
