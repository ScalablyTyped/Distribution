package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Windows
////////////////////
/**
  * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
  * @since Chrome 5.
  */
object windows {
  
  @js.native
  trait CreateData extends StObject {
    
    /**
      * Optional. If true, opens an active window. If false, opens an inactive window.
      * @since Chrome 12.
      */
    var focused: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional.
      * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Optional. Whether the new window should be an incognito window. */
    var incognito: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional.
      * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * Optional. The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
      * @since Chrome 44.
      */
    var state: js.UndefOr[String] = js.native
    
    /**
      * Optional. The id of the tab for which you want to adopt to the new window.
      * @since Chrome 10.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * Optional.
      * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.native
    
    /**
      * Optional. Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
      * One of: "normal", "popup", "panel", or "detached_panel"
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Optional.
      * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
      */
    var url: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Optional.
      * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CreateData {
    
    @scala.inline
    def apply(): CreateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateData]
    }
    
    @scala.inline
    implicit class CreateDataMutableBuilder[Self <: CreateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait GetInfo extends StObject {
    
    /**
      * Optional.
      * If true, the windows.Window object will have a tabs property that contains a list of the tabs.Tab objects. The Tab objects only contain the url, title and favIconUrl properties if the extension's manifest file includes the "tabs" permission.
      */
    var populate: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, the windows.Window returned will be filtered based on its type. If unset the default filter is set to ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
      * Each one of: "normal", "popup", "panel", "app", or "devtools"
      * @since Chrome 46. Warning: this is the current Beta channel.
      */
    var windowTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetInfo {
    
    @scala.inline
    def apply(): GetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInfo]
    }
    
    @scala.inline
    implicit class GetInfoMutableBuilder[Self <: GetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      @scala.inline
      def setWindowTypes(value: js.Array[String]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      @scala.inline
      def setWindowTypesVarargs(value: String*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateInfo extends StObject {
    
    /**
      * Optional. If true, causes the window to be displayed in a manner that draws the user's attention to the window, without changing the focused window. The effect lasts until the user changes focus to the window. This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
      * @since Chrome 14.
      */
    var drawAttention: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional. If true, brings the window to the front. If false, brings the next window in the z-order to the front.
      * @since Chrome 8.
      */
    var focused: js.UndefOr[Boolean] = js.native
    
    /** Optional. The height to resize the window to in pixels. This value is ignored for panels. */
    var height: js.UndefOr[Double] = js.native
    
    /** Optional. The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels. */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * Optional. The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
      * @since Chrome 17.
      */
    var state: js.UndefOr[String] = js.native
    
    /** Optional. The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels. */
    var top: js.UndefOr[Double] = js.native
    
    /** Optional. The width to resize the window to in pixels. This value is ignored for panels. */
    var width: js.UndefOr[Double] = js.native
  }
  object UpdateInfo {
    
    @scala.inline
    def apply(): UpdateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateInfo]
    }
    
    @scala.inline
    implicit class UpdateInfoMutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawAttention(value: Boolean): Self = StObject.set(x, "drawAttention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawAttentionUndefined: Self = StObject.set(x, "drawAttention", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /**
      * Whether the window is set to be always on top.
      * @since Chrome 19.
      */
    var alwaysOnTop: Boolean = js.native
    
    /** Whether the window is currently the focused window. */
    var focused: Boolean = js.native
    
    /** Optional. The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the sessions API. */
    var height: js.UndefOr[Double] = js.native
    
    /** Optional. The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the sessions API, in which case a session ID may be present. */
    var id: Double = js.native
    
    /** Whether the window is incognito. */
    var incognito: Boolean = js.native
    
    /** Optional. The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the sessions API. */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * The session ID used to uniquely identify a Window obtained from the sessions API.
      * @since Chrome 31.
      */
    var sessionId: js.UndefOr[String] = js.native
    
    /**
      * The state of this browser window.
      * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
      * @since Chrome 17.
      */
    var state: String = js.native
    
    /** Array of tabs.Tab objects representing the current tabs in the window. */
    var tabs: js.UndefOr[js.Array[Tab]] = js.native
    
    /** Optional. The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the sessions API. */
    var top: js.UndefOr[Double] = js.native
    
    /**
      * The type of browser window this is.
      * One of: "normal", "popup", "panel", "app", or "devtools"
      */
    var `type`: String = js.native
    
    /** Optional. The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the sessions API. */
    var width: js.UndefOr[Double] = js.native
  }
  object Window {
    
    @scala.inline
    def apply(
      alwaysOnTop: Boolean,
      focused: Boolean,
      id: Double,
      incognito: Boolean,
      state: String,
      `type`: String
    ): Window = {
      val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait WindowEventFilter extends StObject {
    
    /**
      * Conditions that the window's type being created must satisfy. By default it will satisfy ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
      * Each one of: "normal", "popup", "panel", "app", or "devtools"
      */
    var windowTypes: js.Array[String] = js.native
  }
  object WindowEventFilter {
    
    @scala.inline
    def apply(windowTypes: js.Array[String]): WindowEventFilter = {
      val __obj = js.Dynamic.literal(windowTypes = windowTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowEventFilter]
    }
    
    @scala.inline
    implicit class WindowEventFilterMutableBuilder[Self <: WindowEventFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindowTypes(value: js.Array[String]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTypesVarargs(value: String*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
    }
  }
  
  type WindowIdEvent = Event[
    js.Function2[
      /* windowId */ Double, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
  
  type WindowReferenceEvent = Event[
    js.Function2[
      /* window */ typings.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
}
