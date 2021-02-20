package typings.naverWhale.whale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tabs {
  
  type TabActivatedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* activeInfo */ typings.chrome.chrome.tabs.TabActiveInfo, scala.Unit]
  ]
  
  type TabAttachedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* attachInfo */ typings.chrome.chrome.tabs.TabAttachInfo, 
      scala.Unit
    ]
  ]
  
  type TabCreatedEvent = typings.chrome.chrome.events.Event[js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, scala.Unit]]
  
  type TabDetachedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* detachInfo */ typings.chrome.chrome.tabs.TabDetachInfo, 
      scala.Unit
    ]
  ]
  
  type TabHighlightedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* highlightInfo */ typings.chrome.chrome.tabs.TabHighlightInfo, scala.Unit]
  ]
  
  type TabMovedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* moveInfo */ typings.chrome.chrome.tabs.TabMoveInfo, 
      scala.Unit
    ]
  ]
  
  type TabRemovedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* removeInfo */ typings.chrome.chrome.tabs.TabRemoveInfo, 
      scala.Unit
    ]
  ]
  
  type TabReplacedEvent = typings.chrome.chrome.events.Event[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ]
  
  type TabSelectedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* selectInfo */ typings.chrome.chrome.tabs.TabWindowInfo, 
      scala.Unit
    ]
  ]
  
  type TabUpdatedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* tabId */ scala.Double, 
      /* changeInfo */ typings.chrome.chrome.tabs.TabChangeInfo, 
      /* tab */ typings.chrome.chrome.tabs.Tab, 
      scala.Unit
    ]
  ]
  
  type TabZoomChangeEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* ZoomChangeInfo */ typings.chrome.chrome.tabs.ZoomChangeInfo, scala.Unit]
  ]
}
