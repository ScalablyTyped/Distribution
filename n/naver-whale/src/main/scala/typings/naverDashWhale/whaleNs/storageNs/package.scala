package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.chrome.chromeNs.eventsNs.Event

  type StorageChangedEvent = Event[
    js.Function2[
      /* changes */ StringDictionary[typings.chrome.chromeNs.storageNs.StorageChange], 
      /* areaName */ String, 
      Unit
    ]
  ]
}
