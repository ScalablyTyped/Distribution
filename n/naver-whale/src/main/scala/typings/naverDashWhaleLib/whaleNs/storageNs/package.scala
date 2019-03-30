package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type StorageChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[chromeLib.chromeNs.storageNs.StorageChange], 
      /* areaName */ java.lang.String, 
      scala.Unit
    ]
  ]
}
