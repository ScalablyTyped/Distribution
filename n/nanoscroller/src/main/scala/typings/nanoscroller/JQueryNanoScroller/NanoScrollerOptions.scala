package typings.nanoscroller.JQueryNanoScroller

import typings.nanoscroller.JQuery
import typings.nanoscroller.nanoscrollerStrings.bottom
import typings.nanoscroller.nanoscrollerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NanoScrollerOptions extends js.Object {
  /**
    *
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'active'
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * Set to true to stop the scrollbar from auto-hiding itself.
    * @default false
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * A classname for your content div.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-content'
    */
  var contentClass: js.UndefOr[String] = js.native
  /**
    * Destroys nanoScroller and restores browser's native scrollbar.
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to disable the resize from nanoscroller.
    * Useful if you want total control of the resize event.
    * If you set this option to true remember to call the reset method so that the scroll don't have strange behavior.
    * @default false
    */
  var disableResize: js.UndefOr[Boolean] = js.native
  /**
    * A classname for scrollbar enabled mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'has-scrollbar'
    */
  var enabledClass: js.UndefOr[String] = js.native
  /**
    * To flash the scrollbar gadget for an amount of time defined in plugin settings (defaults to 1,5s).
    * Useful if you want to show the user that there is more content waiting for them.
    */
  var flash: js.UndefOr[Boolean] = js.native
  /**
    * Use this setting to specify the scrollbar hide delay in milliseconds if you have enabled the flash option.
    * @default 1500
    */
  var flashDelay: js.UndefOr[Double] = js.native
  /**
    * A classname for scrollbar flashed mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'flashed'
    */
  var flashedClass: js.UndefOr[String] = js.native
  /**
    * Set to true if you want to use native scrolling in iOS 5+.
    * This will disable your custom nanoScroller scrollbar in iOS 5+ and use the native one instead.
    * While the native iOS scrollbar usually works much better, there could possibly be bugs in certain situations.
    * @default false
    */
  var iOSNativeScrolling: js.UndefOr[Boolean] = js.native
  /**
    * A classname for scrollbar track element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-pane'
    */
  var paneClass: js.UndefOr[String] = js.native
  /**
    * Set to true to prevent page scrolling when top or bottom inside the content div is reached.
    * @default false
    */
  var preventPageScrolling: js.UndefOr[Boolean] = js.native
  /**
    * To scroll at the top or bottom.
    */
  var scroll: js.UndefOr[top | bottom] = js.native
  /**
    * To scroll at the bottom with an offset value.
    */
  var scrollBottom: js.UndefOr[Double] = js.native
  /**
    * To scroll to an element.
    */
  var scrollTo: js.UndefOr[JQuery] = js.native
  /**
    * To scroll at the top with an offset value.
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * A classname for scrollbar thumb element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-slider'
    */
  var sliderClass: js.UndefOr[String] = js.native
  /**
    * Sets the maximum height of the slider element.
    * @default null
    */
  var sliderMaxHeight: js.UndefOr[Double | Null] = js.native
  /**
    * Sets the minimum height of the slider element.
    * @default 20
    */
  var sliderMinHeight: js.UndefOr[Double] = js.native
  /**
    * To stop the operation.
    * This option will tell the plugin to disable all event bindings and hide the gadget scrollbar from the UI.
    */
  var stop: js.UndefOr[Boolean] = js.native
  /**
    * Set the tab order of the scrollable content.
    * Set to -1 to skip over the scrollable content when tabbing.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object NanoScrollerOptions {
  @scala.inline
  def apply(): NanoScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NanoScrollerOptions]
  }
  @scala.inline
  implicit class NanoScrollerOptionsOps[Self <: NanoScrollerOptions] (val x: Self) extends AnyVal {
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = this.set("alwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysVisible: Self = this.set("alwaysVisible", js.undefined)
    @scala.inline
    def setContentClass(value: String): Self = this.set("contentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClass: Self = this.set("contentClass", js.undefined)
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisableResize(value: Boolean): Self = this.set("disableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableResize: Self = this.set("disableResize", js.undefined)
    @scala.inline
    def setEnabledClass(value: String): Self = this.set("enabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledClass: Self = this.set("enabledClass", js.undefined)
    @scala.inline
    def setFlash(value: Boolean): Self = this.set("flash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlash: Self = this.set("flash", js.undefined)
    @scala.inline
    def setFlashDelay(value: Double): Self = this.set("flashDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashDelay: Self = this.set("flashDelay", js.undefined)
    @scala.inline
    def setFlashedClass(value: String): Self = this.set("flashedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashedClass: Self = this.set("flashedClass", js.undefined)
    @scala.inline
    def setIOSNativeScrolling(value: Boolean): Self = this.set("iOSNativeScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSNativeScrolling: Self = this.set("iOSNativeScrolling", js.undefined)
    @scala.inline
    def setPaneClass(value: String): Self = this.set("paneClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaneClass: Self = this.set("paneClass", js.undefined)
    @scala.inline
    def setPreventPageScrolling(value: Boolean): Self = this.set("preventPageScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventPageScrolling: Self = this.set("preventPageScrolling", js.undefined)
    @scala.inline
    def setScroll(value: top | bottom): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollBottom(value: Double): Self = this.set("scrollBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBottom: Self = this.set("scrollBottom", js.undefined)
    @scala.inline
    def setScrollTo(value: JQuery): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    @scala.inline
    def setSliderClass(value: String): Self = this.set("sliderClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderClass: Self = this.set("sliderClass", js.undefined)
    @scala.inline
    def setSliderMaxHeight(value: Double): Self = this.set("sliderMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderMaxHeight: Self = this.set("sliderMaxHeight", js.undefined)
    @scala.inline
    def setSliderMaxHeightNull: Self = this.set("sliderMaxHeight", null)
    @scala.inline
    def setSliderMinHeight(value: Double): Self = this.set("sliderMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderMinHeight: Self = this.set("sliderMinHeight", js.undefined)
    @scala.inline
    def setStop(value: Boolean): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

