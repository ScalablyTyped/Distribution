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

