package typings
package mcustomscrollbarLib.MCustomScrollbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScrollbarOptions extends js.Object {
  var advanced: js.UndefOr[mcustomscrollbarLib.Anon_AutoAutoExpandHorizontalScroll] = js.undefined
  /**
    * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
    * 0 – disable (default)
    * 1 – keep dragger rail visible
    * 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
    */
  var alwaysShowScrollbar: js.UndefOr[scala.Double] = js.undefined
  /**
    * Auto-adjust scrollbar height/width according to content, values: true, false
    */
  var autoDraggerLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable auto-expanding the scrollbar when cursor is over or dragging the scrollbar.
    */
  var autoExpandScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically hide the scrollbar when idle or mouse is not over the content
    */
  var autoHideScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define content’s scrolling axis (the type of scrollbars added to the element: vertical and/of horizontal).
    * Available values: "y", "x", "yx". y -vertical, x - horizontal, yx - vertical and horizontal
    */
  var axis: js.UndefOr[
    mcustomscrollbarLib.mcustomscrollbarLibStrings.x | mcustomscrollbarLib.mcustomscrollbarLibStrings.y | mcustomscrollbarLib.mcustomscrollbarLibStrings.yx
  ] = js.undefined
  /**
    * All of the following callbacks option have examples in the callback demo - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/callbacks_example.html
    */
  var callbacks: js.UndefOr[mcustomscrollbarLib.Anon_AlwaysTriggerOffsets] = js.undefined
  /**
    * Enable or disable content touch-swipe scrolling for touch-enabled devices.
    * To completely disable, set contentTouchScroll: false.
    * Integer values define the axis-specific minimum amount required for scrolling momentum (default: 25).
    */
  var contentTouchScroll: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Enable or disable document touch-swipe scrolling for touch-enabled devices.
    */
  var documentTouchScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Keyboard support 
    */
  var keyboard: js.UndefOr[mcustomscrollbarLib.Anon_AutoEnable] = js.undefined
  /**
    * Enable or disable applying scrollbar(s) on all elements matching the current selector, now and in the future.
    * Set live: true when you need to add scrollbar(s) on elements that do not yet exist in the page. 
    * These could be elements added by other scripts or plugins after some action by the user takes place (e.g. lightbox markup may not exist untill the user clicks a link).
    * If you need at any time to disable or enable the live option, set live: "off" and "on" respectively.
    * You can also tell the script to disable live option after the first invocation by setting live: "once".
    */
  var live: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Set the matching set of elements (instead of the current selector) to add scrollbar(s), now and in the future.
    */
  var liveSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mouse wheel support
    */
  var mouseWheel: js.UndefOr[mcustomscrollbarLib.Anon_Auto] = js.undefined
  /**
    * Mouse wheel scrolling pixels amount, value in pixels (integer) or "auto" (script calculates and sets pixels amount according to content length)
    */
  var mouseWheelPixels: js.UndefOr[js.Any] = js.undefined
  var scrollButtons: js.UndefOr[mcustomscrollbarLib.Anon_AutoEnableScrollAmount] = js.undefined
  /**
    * Scrolling inertia (easing), value in milliseconds (0 for no scrolling inertia)
    */
  var scrollInertia: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the position of scrollbar in relation to content.
    * Available values: "inside", "outside".
    * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element. 
    * Setting scrollbarPosition: "outside" makes scrollbar appear outside the element. 
    * Note that setting the value to "outside" requires your element (or parent elements) 
    * to have CSS position: relative (otherwise the scrollbar will be positioned in relation to document’s root element).
    */
  var scrollbarPosition: js.UndefOr[
    mcustomscrollbarLib.mcustomscrollbarLibStrings.inside | mcustomscrollbarLib.mcustomscrollbarLibStrings.outside
  ] = js.undefined
  /**
    * Set the height of your content (overwirtes CSS height), value in pixels (integer) or percentage (string)
    */
  var setHeight: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setLeft: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setTop: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Set the width of your content (overwrites CSS width), value in pixels (integer) or percentage (string)
    */
  var setWidth: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  /**
    * Make scrolling snap to a multiple of a fixed number of pixels. Useful in cases like scrolling tabular data, 
    * image thumbnails or slides and you need to prevent scrolling from stopping half-way your elements. 
    * Note that your elements must be of equal width or height in order for this to work properly.
    * To set different values for vertical and horizontal scrolling, use an array: [y,x]
    */
  var snapAmount: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
  /**
    * Set an offset (in pixels) for the snapAmount option. Useful when for example you need to offset the 
    * snap amount of table rows by the table header.
    */
  var snapOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set a scrollbar ready-to-use theme. See themes demo for all themes - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/scrollbar_themes_demo.html
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object CustomScrollbarOptions {
  @scala.inline
  def apply(
    advanced: mcustomscrollbarLib.Anon_AutoAutoExpandHorizontalScroll = null,
    alwaysShowScrollbar: scala.Int | scala.Double = null,
    autoDraggerLength: js.UndefOr[scala.Boolean] = js.undefined,
    autoExpandScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    axis: mcustomscrollbarLib.mcustomscrollbarLibStrings.x | mcustomscrollbarLib.mcustomscrollbarLibStrings.y | mcustomscrollbarLib.mcustomscrollbarLibStrings.yx = null,
    callbacks: mcustomscrollbarLib.Anon_AlwaysTriggerOffsets = null,
    contentTouchScroll: scala.Boolean | scala.Double = null,
    documentTouchScroll: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: mcustomscrollbarLib.Anon_AutoEnable = null,
    live: java.lang.String | scala.Boolean = null,
    liveSelector: java.lang.String = null,
    mouseWheel: mcustomscrollbarLib.Anon_Auto = null,
    mouseWheelPixels: js.Any = null,
    scrollButtons: mcustomscrollbarLib.Anon_AutoEnableScrollAmount = null,
    scrollInertia: scala.Int | scala.Double = null,
    scrollbarPosition: mcustomscrollbarLib.mcustomscrollbarLibStrings.inside | mcustomscrollbarLib.mcustomscrollbarLibStrings.outside = null,
    setHeight: scala.Boolean | scala.Double | java.lang.String = null,
    setLeft: scala.Double | java.lang.String = null,
    setTop: scala.Double | java.lang.String = null,
    setWidth: scala.Boolean | scala.Double | java.lang.String = null,
    snapAmount: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null,
    snapOffset: scala.Int | scala.Double = null,
    theme: java.lang.String = null
  ): CustomScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
    if (alwaysShowScrollbar != null) __obj.updateDynamic("alwaysShowScrollbar")(alwaysShowScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDraggerLength)) __obj.updateDynamic("autoDraggerLength")(autoDraggerLength)
    if (!js.isUndefined(autoExpandScrollbar)) __obj.updateDynamic("autoExpandScrollbar")(autoExpandScrollbar)
    if (!js.isUndefined(autoHideScrollbar)) __obj.updateDynamic("autoHideScrollbar")(autoHideScrollbar)
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (contentTouchScroll != null) __obj.updateDynamic("contentTouchScroll")(contentTouchScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(documentTouchScroll)) __obj.updateDynamic("documentTouchScroll")(documentTouchScroll)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (live != null) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (liveSelector != null) __obj.updateDynamic("liveSelector")(liveSelector)
    if (mouseWheel != null) __obj.updateDynamic("mouseWheel")(mouseWheel)
    if (mouseWheelPixels != null) __obj.updateDynamic("mouseWheelPixels")(mouseWheelPixels)
    if (scrollButtons != null) __obj.updateDynamic("scrollButtons")(scrollButtons)
    if (scrollInertia != null) __obj.updateDynamic("scrollInertia")(scrollInertia.asInstanceOf[js.Any])
    if (scrollbarPosition != null) __obj.updateDynamic("scrollbarPosition")(scrollbarPosition.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight.asInstanceOf[js.Any])
    if (setLeft != null) __obj.updateDynamic("setLeft")(setLeft.asInstanceOf[js.Any])
    if (setTop != null) __obj.updateDynamic("setTop")(setTop.asInstanceOf[js.Any])
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth.asInstanceOf[js.Any])
    if (snapAmount != null) __obj.updateDynamic("snapAmount")(snapAmount.asInstanceOf[js.Any])
    if (snapOffset != null) __obj.updateDynamic("snapOffset")(snapOffset.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CustomScrollbarOptions]
  }
}

