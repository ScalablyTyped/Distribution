package typings.naverWhale.whale.tabs

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type TabActivatedEvent = Event[js.Function1[/* activeInfo */ typings.chrome.chrome.tabs.TabActiveInfo, Unit]]

type TabAttachedEvent = Event[
js.Function2[/* tabId */ Double, /* attachInfo */ typings.chrome.chrome.tabs.TabAttachInfo, Unit]]

type TabCreatedEvent = Event[js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, Unit]]

type TabDetachedEvent = Event[
js.Function2[/* tabId */ Double, /* detachInfo */ typings.chrome.chrome.tabs.TabDetachInfo, Unit]]

type TabHighlightedEvent = Event[
js.Function1[/* highlightInfo */ typings.chrome.chrome.tabs.TabHighlightInfo, Unit]]

type TabMovedEvent = Event[
js.Function2[/* tabId */ Double, /* moveInfo */ typings.chrome.chrome.tabs.TabMoveInfo, Unit]]

type TabRemovedEvent = Event[
js.Function2[/* tabId */ Double, /* removeInfo */ typings.chrome.chrome.tabs.TabRemoveInfo, Unit]]

type TabReplacedEvent = Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]

type TabSelectedEvent = Event[
js.Function2[/* tabId */ Double, /* selectInfo */ typings.chrome.chrome.tabs.TabWindowInfo, Unit]]

type TabUpdatedEvent = Event[
js.Function3[
  /* tabId */ Double, 
  /* changeInfo */ typings.chrome.chrome.tabs.TabChangeInfo, 
  /* tab */ typings.chrome.chrome.tabs.Tab, 
  Unit
]]

type TabZoomChangeEvent = Event[
js.Function1[/* ZoomChangeInfo */ typings.chrome.chrome.tabs.ZoomChangeInfo, Unit]]
