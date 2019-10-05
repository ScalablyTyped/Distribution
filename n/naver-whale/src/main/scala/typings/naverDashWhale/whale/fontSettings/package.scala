package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettings {
  import typings.chrome.chrome.events.Event

  type DefaultFixedFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
  type DefaultFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
  type FontChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FullFontDetails, Unit]
  ]
  type MinimumFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
}
