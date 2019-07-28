package typings.naverDashWhale.whaleNs

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type StorageChangedEvent = Event[
    js.Function2[
      /* changes */ StringDictionary[typings.chrome.chromeNs.storageNs.StorageChange], 
      /* areaName */ String, 
      Unit
    ]
  ]
}
