package typings
package nanoscrollerLib.JQueryNanoScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NanoScrollerOptions extends js.Object {
  /**
    *
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'active'
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to true to stop the scrollbar from auto-hiding itself.
    * @default false
    */
  var alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A classname for your content div.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-content'
    */
  var contentClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Destroys nanoScroller and restores browser's native scrollbar.
    */
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to disable the resize from nanoscroller.
    * Useful if you want total control of the resize event.
    * If you set this option to true remember to call the reset method so that the scroll don't have strange behavior.
    * @default false
    */
  var disableResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A classname for scrollbar enabled mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'has-scrollbar'
    */
  var enabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To flash the scrollbar gadget for an amount of time defined in plugin settings (defaults to 1,5s).
    * Useful if you want to show the user that there is more content waiting for him.
    */
  var flash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use this setting to specify the scrollbar hide delay in milliseconds if you have enabled the flash option.
    * @default 1500
    */
  var flashDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * A classname for scrollbar flashed mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'flashed'
    */
  var flashedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to true if you want to use native scrolling in iOS 5+.
    * This will disable your custom nanoScroller scrollbar in iOS 5+ and use the native one instead.
    * While the native iOS scrollbar usually works much better, there could possibly be bugs in certain situations.
    * @default false
    */
  var iOSNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A classname for scrollbar track element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-pane'
    */
  var paneClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to true to prevent page scrolling when top or bottom inside the content div is reached.
    * @default false
    */
  var preventPageScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * To scroll at the top or bottom.
    */
  var scroll: js.UndefOr[
    nanoscrollerLib.nanoscrollerLibStrings.top | nanoscrollerLib.nanoscrollerLibStrings.bottom
  ] = js.undefined
  /**
    * To scroll at the bottom with an offset value.
    */
  var scrollBottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * To scroll to an element.
    */
  var scrollTo: js.UndefOr[nanoscrollerLib.JQuery] = js.undefined
  /**
    * To scroll at the top with an offset value.
    */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * A classname for scrollbar thumb element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-slider'
    */
  var sliderClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the maximum height of the slider element.
    * @default null
    */
  var sliderMaxHeight: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Sets the minimum height of the slider element.
    * @default 20
    */
  var sliderMinHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * To stop the operation.
    * This option will tell the plugin to disable all event bindings and hide the gadget scrollbar from the UI.
    */
  var stop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the tab order of the scrollable content.
    * Set to -1 to skip over the scrollable content when tabbing.
    * @default 0
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object NanoScrollerOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    contentClass: java.lang.String = null,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    disableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enabledClass: java.lang.String = null,
    flash: js.UndefOr[scala.Boolean] = js.undefined,
    flashDelay: scala.Int | scala.Double = null,
    flashedClass: java.lang.String = null,
    iOSNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    paneClass: java.lang.String = null,
    preventPageScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: nanoscrollerLib.nanoscrollerLibStrings.top | nanoscrollerLib.nanoscrollerLibStrings.bottom = null,
    scrollBottom: scala.Int | scala.Double = null,
    scrollTo: nanoscrollerLib.JQuery = null,
    scrollTop: scala.Int | scala.Double = null,
    sliderClass: java.lang.String = null,
    sliderMaxHeight: scala.Int | scala.Double = null,
    sliderMinHeight: scala.Int | scala.Double = null,
    stop: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null
  ): NanoScrollerOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible)
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(disableResize)) __obj.updateDynamic("disableResize")(disableResize)
    if (enabledClass != null) __obj.updateDynamic("enabledClass")(enabledClass)
    if (!js.isUndefined(flash)) __obj.updateDynamic("flash")(flash)
    if (flashDelay != null) __obj.updateDynamic("flashDelay")(flashDelay.asInstanceOf[js.Any])
    if (flashedClass != null) __obj.updateDynamic("flashedClass")(flashedClass)
    if (!js.isUndefined(iOSNativeScrolling)) __obj.updateDynamic("iOSNativeScrolling")(iOSNativeScrolling)
    if (paneClass != null) __obj.updateDynamic("paneClass")(paneClass)
    if (!js.isUndefined(preventPageScrolling)) __obj.updateDynamic("preventPageScrolling")(preventPageScrolling)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollBottom != null) __obj.updateDynamic("scrollBottom")(scrollBottom.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo)
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sliderClass != null) __obj.updateDynamic("sliderClass")(sliderClass)
    if (sliderMaxHeight != null) __obj.updateDynamic("sliderMaxHeight")(sliderMaxHeight.asInstanceOf[js.Any])
    if (sliderMinHeight != null) __obj.updateDynamic("sliderMinHeight")(sliderMinHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(stop)) __obj.updateDynamic("stop")(stop)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NanoScrollerOptions]
  }
}

