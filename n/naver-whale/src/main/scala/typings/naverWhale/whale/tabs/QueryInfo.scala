package typings.naverWhale.whale.tabs

import typings.naverWhale.naverWhaleStrings.app
import typings.naverWhale.naverWhaleStrings.complete
import typings.naverWhale.naverWhaleStrings.devtools
import typings.naverWhale.naverWhaleStrings.loading
import typings.naverWhale.naverWhaleStrings.normal
import typings.naverWhale.naverWhaleStrings.panel
import typings.naverWhale.naverWhaleStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends StObject {
  
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[loading | complete] = js.native
  
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.native
  
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[normal | popup | panel | app | devtools] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoMutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    @scala.inline
    def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setStatus(value: loading | complete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    
    @scala.inline
    def setWindowType(value: normal | popup | panel | app | devtools): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
  }
}
