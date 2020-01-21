package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  type StorageChangedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[typings.chrome.chrome.storage.StorageChange], 
      /* areaName */ java.lang.String, 
      scala.Unit
    ]
  ]
}
