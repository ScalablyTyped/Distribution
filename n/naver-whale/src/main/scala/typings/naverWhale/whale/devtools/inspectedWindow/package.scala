package typings.naverWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectedWindow {
  
  type ResourceAddedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, scala.Unit]
  ]
  
  type ResourceContentCommittedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, 
      /* content */ java.lang.String, 
      scala.Unit
    ]
  ]
}
