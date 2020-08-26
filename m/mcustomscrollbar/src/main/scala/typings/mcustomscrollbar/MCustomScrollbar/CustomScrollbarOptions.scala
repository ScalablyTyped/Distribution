package typings.mcustomscrollbar.MCustomScrollbar

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomScrollbarOptions extends js.Object {
  var advanced: js.UndefOr[AutoExpandHorizontalScroll] = js.native
  /**
    * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
    * 0 – disable (default)
    * 1 – keep dragger rail visible
    * 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
    */
  var alwaysShowScrollbar: js.UndefOr[Double] = js.native
  /**
    * Auto-adjust scrollbar height/width according to content, values: true, false
    */
  var autoDraggerLength: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable auto-expanding the scrollbar when cursor is over or dragging the scrollbar.
    */
  var autoExpandScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Automatically hide the scrollbar when idle or mouse is not over the content
    */
  var autoHideScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Define content’s scrolling axis (the type of scrollbars added to the element: vertical and/of horizontal).
    * Available values: "y", "x", "yx". y -vertical, x - horizontal, yx - vertical and horizontal
    */
  var axis: js.UndefOr[x | y | yx] = js.native
  /**
    * All of the following callbacks option have examples in the callback demo - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/callbacks_example.html
    */
  var callbacks: js.UndefOr[AlwaysTriggerOffsets] = js.native
  /**
    * Enable or disable content touch-swipe scrolling for touch-enabled devices.
    * To completely disable, set contentTouchScroll: false.
    * Integer values define the axis-specific minimum amount required for scrolling momentum (default: 25).
    */
  var contentTouchScroll: js.UndefOr[Boolean | Double] = js.native
  /**
    * Enable or disable document touch-swipe scrolling for touch-enabled devices.
    */
  var documentTouchScroll: js.UndefOr[Boolean] = js.native
  /**
    * Keyboard support 
    */
  var keyboard: js.UndefOr[Enable] = js.native
  /**
    * Enable or disable applying scrollbar(s) on all elements matching the current selector, now and in the future.
    * Set live: true when you need to add scrollbar(s) on elements that do not yet exist in the page. 
    * These could be elements added by other scripts or plugins after some action by the user takes place (e.g. lightbox markup may not exist untill the user clicks a link).
    * If you need at any time to disable or enable the live option, set live: "off" and "on" respectively.
    * You can also tell the script to disable live option after the first invocation by setting live: "once".
    */
  var live: js.UndefOr[String | Boolean] = js.native
  /**
    * Set the matching set of elements (instead of the current selector) to add scrollbar(s), now and in the future.
    */
  var liveSelector: js.UndefOr[String] = js.native
  /**
    * Mouse wheel support
    */
  var mouseWheel: js.UndefOr[Axis] = js.native
  /**
    * Mouse wheel scrolling pixels amount, value in pixels (integer) or "auto" (script calculates and sets pixels amount according to content length)
    */
  var mouseWheelPixels: js.UndefOr[js.Any] = js.native
  var scrollButtons: js.UndefOr[ScrollAmount] = js.native
  /**
    * Scrolling inertia (easing), value in milliseconds (0 for no scrolling inertia)
    */
  var scrollInertia: js.UndefOr[Double] = js.native
  /**
    * Set the position of scrollbar in relation to content.
    * Available values: "inside", "outside".
    * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element. 
    * Setting scrollbarPosition: "outside" makes scrollbar appear outside the element. 
    * Note that setting the value to "outside" requires your element (or parent elements) 
    * to have CSS position: relative (otherwise the scrollbar will be positioned in relation to document’s root element).
    */
  var scrollbarPosition: js.UndefOr[inside | outside] = js.native
  /**
    * Set the height of your content (overwirtes CSS height), value in pixels (integer) or percentage (string)
    */
  var setHeight: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setLeft: js.UndefOr[Double | String] = js.native
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setTop: js.UndefOr[Double | String] = js.native
  /**
    * Set the width of your content (overwrites CSS width), value in pixels (integer) or percentage (string)
    */
  var setWidth: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Make scrolling snap to a multiple of a fixed number of pixels. Useful in cases like scrolling tabular data, 
    * image thumbnails or slides and you need to prevent scrolling from stopping half-way your elements. 
    * Note that your elements must be of equal width or height in order for this to work properly.
    * To set different values for vertical and horizontal scrolling, use an array: [y,x]
    */
  var snapAmount: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  /**
    * Set an offset (in pixels) for the snapAmount option. Useful when for example you need to offset the 
    * snap amount of table rows by the table header.
    */
  var snapOffset: js.UndefOr[Double] = js.native
  /**
    * Set a scrollbar ready-to-use theme. See themes demo for all themes - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/scrollbar_themes_demo.html
    */
  var theme: js.UndefOr[String] = js.native
}

object CustomScrollbarOptions {
  @scala.inline
  def apply(): CustomScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomScrollbarOptions]
  }
  @scala.inline
  implicit class CustomScrollbarOptionsOps[Self <: CustomScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvanced(value: AutoExpandHorizontalScroll): Self = this.set("advanced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
    @scala.inline
    def setAlwaysShowScrollbar(value: Double): Self = this.set("alwaysShowScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowScrollbar: Self = this.set("alwaysShowScrollbar", js.undefined)
    @scala.inline
    def setAutoDraggerLength(value: Boolean): Self = this.set("autoDraggerLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDraggerLength: Self = this.set("autoDraggerLength", js.undefined)
    @scala.inline
    def setAutoExpandScrollbar(value: Boolean): Self = this.set("autoExpandScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpandScrollbar: Self = this.set("autoExpandScrollbar", js.undefined)
    @scala.inline
    def setAutoHideScrollbar(value: Boolean): Self = this.set("autoHideScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideScrollbar: Self = this.set("autoHideScrollbar", js.undefined)
    @scala.inline
    def setAxis(value: typings.mcustomscrollbar.mcustomscrollbarStrings.x | y | yx): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCallbacks(value: AlwaysTriggerOffsets): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setContentTouchScroll(value: Boolean | Double): Self = this.set("contentTouchScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTouchScroll: Self = this.set("contentTouchScroll", js.undefined)
    @scala.inline
    def setDocumentTouchScroll(value: Boolean): Self = this.set("documentTouchScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentTouchScroll: Self = this.set("documentTouchScroll", js.undefined)
    @scala.inline
    def setKeyboard(value: Enable): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLive(value: String | Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    @scala.inline
    def setLiveSelector(value: String): Self = this.set("liveSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSelector: Self = this.set("liveSelector", js.undefined)
    @scala.inline
    def setMouseWheel(value: Axis): Self = this.set("mouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheel: Self = this.set("mouseWheel", js.undefined)
    @scala.inline
    def setMouseWheelPixels(value: js.Any): Self = this.set("mouseWheelPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheelPixels: Self = this.set("mouseWheelPixels", js.undefined)
    @scala.inline
    def setScrollButtons(value: ScrollAmount): Self = this.set("scrollButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollButtons: Self = this.set("scrollButtons", js.undefined)
    @scala.inline
    def setScrollInertia(value: Double): Self = this.set("scrollInertia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollInertia: Self = this.set("scrollInertia", js.undefined)
    @scala.inline
    def setScrollbarPosition(value: inside | outside): Self = this.set("scrollbarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarPosition: Self = this.set("scrollbarPosition", js.undefined)
    @scala.inline
    def setSetHeight(value: Boolean | Double | String): Self = this.set("setHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    @scala.inline
    def setSetLeft(value: Double | String): Self = this.set("setLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    @scala.inline
    def setSetTop(value: Double | String): Self = this.set("setTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetTop: Self = this.set("setTop", js.undefined)
    @scala.inline
    def setSetWidth(value: Boolean | Double | String): Self = this.set("setWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    @scala.inline
    def setSnapAmount(value: Double | (js.Tuple2[Double, Double])): Self = this.set("snapAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapAmount: Self = this.set("snapAmount", js.undefined)
    @scala.inline
    def setSnapOffset(value: Double): Self = this.set("snapOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapOffset: Self = this.set("snapOffset", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

