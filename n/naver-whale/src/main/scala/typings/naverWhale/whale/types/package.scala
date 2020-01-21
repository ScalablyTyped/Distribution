package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typings.chrome.chrome.events.Event[typings.chrome.chrome.types.DetailsCallback]
  type DetailsCallback = js.Function1[
    /* details */ typings.chrome.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
