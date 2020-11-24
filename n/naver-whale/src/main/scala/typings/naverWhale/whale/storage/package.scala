package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storage {
  
  type StorageChangedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[typings.chrome.chrome.storage.StorageChange], 
      /* areaName */ typings.chrome.chrome.storage.AreaName, 
      scala.Unit
    ]
  ]
}
