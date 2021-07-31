package typings.mcustomscrollbar

import typings.jquery.JQueryStatic
import typings.mcustomscrollbar.anon.AlwaysTriggerOffsets
import typings.mcustomscrollbar.anon.AutoExpandHorizontalScroll
import typings.mcustomscrollbar.anon.Axis
import typings.mcustomscrollbar.anon.Enable
import typings.mcustomscrollbar.anon.ScrollAmount
import typings.mcustomscrollbar.mcustomscrollbarStrings.inside
import typings.mcustomscrollbar.mcustomscrollbarStrings.outside
import typings.mcustomscrollbar.mcustomscrollbarStrings.x
import typings.mcustomscrollbar.mcustomscrollbarStrings.y
import typings.mcustomscrollbar.mcustomscrollbarStrings.yx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MCustomScrollbar {
  
  trait CustomScrollbarOptions extends StObject {
    
    var advanced: js.UndefOr[AutoExpandHorizontalScroll] = js.undefined
    
    /**
      * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
      * 0 – disable (default)
      * 1 – keep dragger rail visible
      * 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
      */
    var alwaysShowScrollbar: js.UndefOr[Double] = js.undefined
    
    /**
      * Auto-adjust scrollbar height/width according to content, values: true, false
      */
    var autoDraggerLength: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable auto-expanding the scrollbar when cursor is over or dragging the scrollbar.
      */
    var autoExpandScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically hide the scrollbar when idle or mouse is not over the content
      */
    var autoHideScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define content’s scrolling axis (the type of scrollbars added to the element: vertical and/of horizontal).
      * Available values: "y", "x", "yx". y -vertical, x - horizontal, yx - vertical and horizontal
      */
    var axis: js.UndefOr[x | y | yx] = js.undefined
    
    /**
      * All of the following callbacks option have examples in the callback demo - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/callbacks_example.html
      */
    var callbacks: js.UndefOr[AlwaysTriggerOffsets] = js.undefined
    
    /**
      * Enable or disable content touch-swipe scrolling for touch-enabled devices.
      * To completely disable, set contentTouchScroll: false.
      * Integer values define the axis-specific minimum amount required for scrolling momentum (default: 25).
      */
    var contentTouchScroll: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Enable or disable document touch-swipe scrolling for touch-enabled devices.
      */
    var documentTouchScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keyboard support 
      */
    var keyboard: js.UndefOr[Enable] = js.undefined
    
    /**
      * Enable or disable applying scrollbar(s) on all elements matching the current selector, now and in the future.
      * Set live: true when you need to add scrollbar(s) on elements that do not yet exist in the page. 
      * These could be elements added by other scripts or plugins after some action by the user takes place (e.g. lightbox markup may not exist untill the user clicks a link).
      * If you need at any time to disable or enable the live option, set live: "off" and "on" respectively.
      * You can also tell the script to disable live option after the first invocation by setting live: "once".
      */
    var live: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Set the matching set of elements (instead of the current selector) to add scrollbar(s), now and in the future.
      */
    var liveSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Mouse wheel support
      */
    var mouseWheel: js.UndefOr[Axis] = js.undefined
    
    /**
      * Mouse wheel scrolling pixels amount, value in pixels (integer) or "auto" (script calculates and sets pixels amount according to content length)
      */
    var mouseWheelPixels: js.UndefOr[js.Any] = js.undefined
    
    var scrollButtons: js.UndefOr[ScrollAmount] = js.undefined
    
    /**
      * Scrolling inertia (easing), value in milliseconds (0 for no scrolling inertia)
      */
    var scrollInertia: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the position of scrollbar in relation to content.
      * Available values: "inside", "outside".
      * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element. 
      * Setting scrollbarPosition: "outside" makes scrollbar appear outside the element. 
      * Note that setting the value to "outside" requires your element (or parent elements) 
      * to have CSS position: relative (otherwise the scrollbar will be positioned in relation to document’s root element).
      */
    var scrollbarPosition: js.UndefOr[inside | outside] = js.undefined
    
    /**
      * Set the height of your content (overwirtes CSS height), value in pixels (integer) or percentage (string)
      */
    var setHeight: js.UndefOr[Boolean | Double | String] = js.undefined
    
    /**
      * Set the initial css top property of content, accepts string values (css top position).
      * Example: setTop: "-100px".
      */
    var setLeft: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Set the initial css top property of content, accepts string values (css top position).
      * Example: setTop: "-100px".
      */
    var setTop: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Set the width of your content (overwrites CSS width), value in pixels (integer) or percentage (string)
      */
    var setWidth: js.UndefOr[Boolean | Double | String] = js.undefined
    
    /**
      * Make scrolling snap to a multiple of a fixed number of pixels. Useful in cases like scrolling tabular data, 
      * image thumbnails or slides and you need to prevent scrolling from stopping half-way your elements. 
      * Note that your elements must be of equal width or height in order for this to work properly.
      * To set different values for vertical and horizontal scrolling, use an array: [y,x]
      */
    var snapAmount: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
    
    /**
      * Set an offset (in pixels) for the snapAmount option. Useful when for example you need to offset the 
      * snap amount of table rows by the table header.
      */
    var snapOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Set a scrollbar ready-to-use theme. See themes demo for all themes - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/scrollbar_themes_demo.html
      */
    var theme: js.UndefOr[String] = js.undefined
  }
  object CustomScrollbarOptions {
    
    @scala.inline
    def apply(): CustomScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomScrollbarOptions]
    }
    
    @scala.inline
    implicit class CustomScrollbarOptionsMutableBuilder[Self <: CustomScrollbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvanced(value: AutoExpandHorizontalScroll): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
      
      @scala.inline
      def setAlwaysShowScrollbar(value: Double): Self = StObject.set(x, "alwaysShowScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowScrollbarUndefined: Self = StObject.set(x, "alwaysShowScrollbar", js.undefined)
      
      @scala.inline
      def setAutoDraggerLength(value: Boolean): Self = StObject.set(x, "autoDraggerLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDraggerLengthUndefined: Self = StObject.set(x, "autoDraggerLength", js.undefined)
      
      @scala.inline
      def setAutoExpandScrollbar(value: Boolean): Self = StObject.set(x, "autoExpandScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandScrollbarUndefined: Self = StObject.set(x, "autoExpandScrollbar", js.undefined)
      
      @scala.inline
      def setAutoHideScrollbar(value: Boolean): Self = StObject.set(x, "autoHideScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideScrollbarUndefined: Self = StObject.set(x, "autoHideScrollbar", js.undefined)
      
      @scala.inline
      def setAxis(value: typings.mcustomscrollbar.mcustomscrollbarStrings.x | y | yx): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setCallbacks(value: AlwaysTriggerOffsets): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setContentTouchScroll(value: Boolean | Double): Self = StObject.set(x, "contentTouchScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTouchScrollUndefined: Self = StObject.set(x, "contentTouchScroll", js.undefined)
      
      @scala.inline
      def setDocumentTouchScroll(value: Boolean): Self = StObject.set(x, "documentTouchScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentTouchScrollUndefined: Self = StObject.set(x, "documentTouchScroll", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Enable): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLive(value: String | Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveSelector(value: String): Self = StObject.set(x, "liveSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveSelectorUndefined: Self = StObject.set(x, "liveSelector", js.undefined)
      
      @scala.inline
      def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      @scala.inline
      def setMouseWheel(value: Axis): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelPixels(value: js.Any): Self = StObject.set(x, "mouseWheelPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelPixelsUndefined: Self = StObject.set(x, "mouseWheelPixels", js.undefined)
      
      @scala.inline
      def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
      
      @scala.inline
      def setScrollButtons(value: ScrollAmount): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollButtonsUndefined: Self = StObject.set(x, "scrollButtons", js.undefined)
      
      @scala.inline
      def setScrollInertia(value: Double): Self = StObject.set(x, "scrollInertia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollInertiaUndefined: Self = StObject.set(x, "scrollInertia", js.undefined)
      
      @scala.inline
      def setScrollbarPosition(value: inside | outside): Self = StObject.set(x, "scrollbarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarPositionUndefined: Self = StObject.set(x, "scrollbarPosition", js.undefined)
      
      @scala.inline
      def setSetHeight(value: Boolean | Double | String): Self = StObject.set(x, "setHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetLeft(value: Double | String): Self = StObject.set(x, "setLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      @scala.inline
      def setSetTop(value: Double | String): Self = StObject.set(x, "setTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      @scala.inline
      def setSetWidth(value: Boolean | Double | String): Self = StObject.set(x, "setWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setSnapAmount(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "snapAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapAmountUndefined: Self = StObject.set(x, "snapAmount", js.undefined)
      
      @scala.inline
      def setSnapOffset(value: Double): Self = StObject.set(x, "snapOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapOffsetUndefined: Self = StObject.set(x, "snapOffset", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type Factory = js.Function1[/* jQuery */ JQueryStatic, Unit]
  
  trait ScrollToParameterOptions extends StObject {
    
    /**
      * Trigger user defined callback after scroll-to completes, value: true, false
      */
    var callbacks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
      */
    var moveDragger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
      */
    var scrollEasing: js.UndefOr[String] = js.undefined
    
    /**
      * Scroll-to animation speed, value in milliseconds
      */
    var scrollInertia: js.UndefOr[Double] = js.undefined
    
    /**
      * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ScrollToParameterOptions {
    
    @scala.inline
    def apply(): ScrollToParameterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToParameterOptions]
    }
    
    @scala.inline
    implicit class ScrollToParameterOptionsMutableBuilder[Self <: ScrollToParameterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setMoveDragger(value: Boolean): Self = StObject.set(x, "moveDragger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveDraggerUndefined: Self = StObject.set(x, "moveDragger", js.undefined)
      
      @scala.inline
      def setScrollEasing(value: String): Self = StObject.set(x, "scrollEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEasingUndefined: Self = StObject.set(x, "scrollEasing", js.undefined)
      
      @scala.inline
      def setScrollInertia(value: Double): Self = StObject.set(x, "scrollInertia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollInertiaUndefined: Self = StObject.set(x, "scrollInertia", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
