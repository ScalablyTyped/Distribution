package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typings.chrome.chrome.events.Event

  type ChromeSettingChangedEvent = Event[typings.chrome.chrome.types.DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ typings.chrome.chrome.types.ChromeSettingGetResultDetails, Unit]
}
