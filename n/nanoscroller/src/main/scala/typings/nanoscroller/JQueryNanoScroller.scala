package typings.nanoscroller

import typings.nanoscroller.nanoscrollerStrings.bottom
import typings.nanoscroller.nanoscrollerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryNanoScroller {
  
  trait NanoScrollerOptions extends StObject {
    
    /**
      *
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'active'
      */
    var activeClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to true to stop the scrollbar from auto-hiding itself.
      * @default false
      */
    var alwaysVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A classname for your content div.
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'nano-content'
      */
    var contentClass: js.UndefOr[String] = js.undefined
    
    /**
      * Destroys nanoScroller and restores browser's native scrollbar.
      */
    var destroy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to disable the resize from nanoscroller.
      * Useful if you want total control of the resize event.
      * If you set this option to true remember to call the reset method so that the scroll don't have strange behavior.
      * @default false
      */
    var disableResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A classname for scrollbar enabled mode.
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'has-scrollbar'
      */
    var enabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * To flash the scrollbar gadget for an amount of time defined in plugin settings (defaults to 1,5s).
      * Useful if you want to show the user that there is more content waiting for them.
      */
    var flash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this setting to specify the scrollbar hide delay in milliseconds if you have enabled the flash option.
      * @default 1500
      */
    var flashDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * A classname for scrollbar flashed mode.
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'flashed'
      */
    var flashedClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to true if you want to use native scrolling in iOS 5+.
      * This will disable your custom nanoScroller scrollbar in iOS 5+ and use the native one instead.
      * While the native iOS scrollbar usually works much better, there could possibly be bugs in certain situations.
      * @default false
      */
    var iOSNativeScrolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A classname for scrollbar track element.
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'nano-pane'
      */
    var paneClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to true to prevent page scrolling when top or bottom inside the content div is reached.
      * @default false
      */
    var preventPageScrolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To scroll at the top or bottom.
      */
    var scroll: js.UndefOr[top | bottom] = js.undefined
    
    /**
      * To scroll at the bottom with an offset value.
      */
    var scrollBottom: js.UndefOr[Double] = js.undefined
    
    /**
      * To scroll to an element.
      */
    var scrollTo: js.UndefOr[JQuery] = js.undefined
    
    /**
      * To scroll at the top with an offset value.
      */
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    /**
      * A classname for scrollbar thumb element.
      * If you change this setting, you also have to change it in the plugin's CSS file.
      * @default 'nano-slider'
      */
    var sliderClass: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the maximum height of the slider element.
      * @default null
      */
    var sliderMaxHeight: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Sets the minimum height of the slider element.
      * @default 20
      */
    var sliderMinHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * To stop the operation.
      * This option will tell the plugin to disable all event bindings and hide the gadget scrollbar from the UI.
      */
    var stop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the tab order of the scrollable content.
      * Set to -1 to skip over the scrollable content when tabbing.
      * @default 0
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object NanoScrollerOptions {
    
    inline def apply(): NanoScrollerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NanoScrollerOptions]
    }
    
    extension [Self <: NanoScrollerOptions](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
      
      inline def setContentClass(value: String): Self = StObject.set(x, "contentClass", value.asInstanceOf[js.Any])
      
      inline def setContentClassUndefined: Self = StObject.set(x, "contentClass", js.undefined)
      
      inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisableResize(value: Boolean): Self = StObject.set(x, "disableResize", value.asInstanceOf[js.Any])
      
      inline def setDisableResizeUndefined: Self = StObject.set(x, "disableResize", js.undefined)
      
      inline def setEnabledClass(value: String): Self = StObject.set(x, "enabledClass", value.asInstanceOf[js.Any])
      
      inline def setEnabledClassUndefined: Self = StObject.set(x, "enabledClass", js.undefined)
      
      inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
      
      inline def setFlashDelay(value: Double): Self = StObject.set(x, "flashDelay", value.asInstanceOf[js.Any])
      
      inline def setFlashDelayUndefined: Self = StObject.set(x, "flashDelay", js.undefined)
      
      inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      inline def setFlashedClass(value: String): Self = StObject.set(x, "flashedClass", value.asInstanceOf[js.Any])
      
      inline def setFlashedClassUndefined: Self = StObject.set(x, "flashedClass", js.undefined)
      
      inline def setIOSNativeScrolling(value: Boolean): Self = StObject.set(x, "iOSNativeScrolling", value.asInstanceOf[js.Any])
      
      inline def setIOSNativeScrollingUndefined: Self = StObject.set(x, "iOSNativeScrolling", js.undefined)
      
      inline def setPaneClass(value: String): Self = StObject.set(x, "paneClass", value.asInstanceOf[js.Any])
      
      inline def setPaneClassUndefined: Self = StObject.set(x, "paneClass", js.undefined)
      
      inline def setPreventPageScrolling(value: Boolean): Self = StObject.set(x, "preventPageScrolling", value.asInstanceOf[js.Any])
      
      inline def setPreventPageScrollingUndefined: Self = StObject.set(x, "preventPageScrolling", js.undefined)
      
      inline def setScroll(value: top | bottom): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollBottom(value: Double): Self = StObject.set(x, "scrollBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollBottomUndefined: Self = StObject.set(x, "scrollBottom", js.undefined)
      
      inline def setScrollTo(value: JQuery): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSliderClass(value: String): Self = StObject.set(x, "sliderClass", value.asInstanceOf[js.Any])
      
      inline def setSliderClassUndefined: Self = StObject.set(x, "sliderClass", js.undefined)
      
      inline def setSliderMaxHeight(value: Double): Self = StObject.set(x, "sliderMaxHeight", value.asInstanceOf[js.Any])
      
      inline def setSliderMaxHeightNull: Self = StObject.set(x, "sliderMaxHeight", null)
      
      inline def setSliderMaxHeightUndefined: Self = StObject.set(x, "sliderMaxHeight", js.undefined)
      
      inline def setSliderMinHeight(value: Double): Self = StObject.set(x, "sliderMinHeight", value.asInstanceOf[js.Any])
      
      inline def setSliderMinHeightUndefined: Self = StObject.set(x, "sliderMinHeight", js.undefined)
      
      inline def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
