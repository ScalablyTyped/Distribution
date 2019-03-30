package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsNs {
  type TabActivatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* activeInfo */ chromeLib.chromeNs.tabsNs.TabActiveInfo, scala.Unit]
  ]
  type TabAttachedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* attachInfo */ chromeLib.chromeNs.tabsNs.TabAttachInfo, 
      scala.Unit
    ]
  ]
  type TabCreatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]]
  type TabDetachedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* detachInfo */ chromeLib.chromeNs.tabsNs.TabDetachInfo, 
      scala.Unit
    ]
  ]
  type TabHighlightedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* highlightInfo */ chromeLib.chromeNs.tabsNs.TabHighlightInfo, scala.Unit]
  ]
  type TabMovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* moveInfo */ chromeLib.chromeNs.tabsNs.TabMoveInfo, 
      scala.Unit
    ]
  ]
  type TabRemovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* removeInfo */ chromeLib.chromeNs.tabsNs.TabRemoveInfo, 
      scala.Unit
    ]
  ]
  type TabReplacedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ]
  type TabSelectedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* selectInfo */ chromeLib.chromeNs.tabsNs.TabWindowInfo, 
      scala.Unit
    ]
  ]
  type TabUpdatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* tabId */ scala.Double, 
      /* changeInfo */ chromeLib.chromeNs.tabsNs.TabChangeInfo, 
      /* tab */ chromeLib.chromeNs.tabsNs.Tab, 
      scala.Unit
    ]
  ]
  type TabZoomChangeEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* ZoomChangeInfo */ chromeLib.chromeNs.tabsNs.ZoomChangeInfo, scala.Unit]
  ]
}
