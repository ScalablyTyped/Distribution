package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type TabActivatedEvent = Event[
    js.Function1[/* activeInfo */ typings.chrome.chromeNs.tabsNs.TabActiveInfo, Unit]
  ]
  type TabAttachedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* attachInfo */ typings.chrome.chromeNs.tabsNs.TabAttachInfo, 
      Unit
    ]
  ]
  type TabCreatedEvent = Event[js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]]
  type TabDetachedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* detachInfo */ typings.chrome.chromeNs.tabsNs.TabDetachInfo, 
      Unit
    ]
  ]
  type TabHighlightedEvent = Event[
    js.Function1[/* highlightInfo */ typings.chrome.chromeNs.tabsNs.TabHighlightInfo, Unit]
  ]
  type TabMovedEvent = Event[
    js.Function2[/* tabId */ Double, /* moveInfo */ typings.chrome.chromeNs.tabsNs.TabMoveInfo, Unit]
  ]
  type TabRemovedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* removeInfo */ typings.chrome.chromeNs.tabsNs.TabRemoveInfo, 
      Unit
    ]
  ]
  type TabReplacedEvent = Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]
  type TabSelectedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* selectInfo */ typings.chrome.chromeNs.tabsNs.TabWindowInfo, 
      Unit
    ]
  ]
  type TabUpdatedEvent = Event[
    js.Function3[
      /* tabId */ Double, 
      /* changeInfo */ typings.chrome.chromeNs.tabsNs.TabChangeInfo, 
      /* tab */ typings.chrome.chromeNs.tabsNs.Tab, 
      Unit
    ]
  ]
  type TabZoomChangeEvent = Event[
    js.Function1[/* ZoomChangeInfo */ typings.chrome.chromeNs.tabsNs.ZoomChangeInfo, Unit]
  ]
}
