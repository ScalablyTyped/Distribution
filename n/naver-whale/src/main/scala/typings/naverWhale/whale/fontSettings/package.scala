package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettings {
  type DefaultFixedFontSizeChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
  type DefaultFontSizeChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
  type FontChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FullFontDetails, scala.Unit]
  ]
  type MinimumFontSizeChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
}
