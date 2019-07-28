package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettingsNs {
  type DefaultFixedFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ]
  type DefaultFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ]
  type FontChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FullFontDetails, Unit]
  ]
  type MinimumFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chromeNs.fontSettingsNs.FontSizeDetails, Unit]
  ]
}
