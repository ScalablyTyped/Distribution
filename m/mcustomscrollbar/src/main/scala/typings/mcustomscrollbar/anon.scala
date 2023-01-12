package typings.mcustomscrollbar

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import typings.mcustomscrollbar.mcustomscrollbarStrings.x
import typings.mcustomscrollbar.mcustomscrollbarStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysTriggerOffsets extends StObject {
    
    /**
      * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
      * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
      * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
      */
    var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to call right before scrollbar(s) are updated.
      */
    var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when plugin markup is created.
      */
    var onCreate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
      */
    var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when scrollbars have initialized
      */
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when content becomes wide enough and horizontal scrollbar is added.
      */
    var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
      */
    var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when content becomes long enough and vertical scrollbar is added.
      */
    var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when content becomes short enough and vertical scrollbar is removed.
      */
    var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
      */
    var onScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
      */
    var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
      */
    var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
      */
    var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
      */
    var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Set an offset for which the onTotalScrollBack callback is triggered.
      * Its value is in pixels
      */
    var onTotalScrollBackOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Set an offset for which the onTotalScroll callback is triggered.
      * Its value is in pixels.
      */
    var onTotalScrollOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * A function to call when scrollbar(s) are updated.
      */
    var onUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * User defined callback function, triggered while scrolling
      */
    var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AlwaysTriggerOffsets {
    
    inline def apply(): AlwaysTriggerOffsets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysTriggerOffsets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlwaysTriggerOffsets] (val x: Self) extends AnyVal {
      
      inline def setAlwaysTriggerOffsets(value: Boolean): Self = StObject.set(x, "alwaysTriggerOffsets", value.asInstanceOf[js.Any])
      
      inline def setAlwaysTriggerOffsetsUndefined: Self = StObject.set(x, "alwaysTriggerOffsets", js.undefined)
      
      inline def setOnBeforeUpdate(value: () => Unit): Self = StObject.set(x, "onBeforeUpdate", js.Any.fromFunction0(value))
      
      inline def setOnBeforeUpdateUndefined: Self = StObject.set(x, "onBeforeUpdate", js.undefined)
      
      inline def setOnCreate(value: () => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction0(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      inline def setOnImageLoad(value: () => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction0(value))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnOverflowX(value: () => Unit): Self = StObject.set(x, "onOverflowX", js.Any.fromFunction0(value))
      
      inline def setOnOverflowXNone(value: () => Unit): Self = StObject.set(x, "onOverflowXNone", js.Any.fromFunction0(value))
      
      inline def setOnOverflowXNoneUndefined: Self = StObject.set(x, "onOverflowXNone", js.undefined)
      
      inline def setOnOverflowXUndefined: Self = StObject.set(x, "onOverflowX", js.undefined)
      
      inline def setOnOverflowY(value: () => Unit): Self = StObject.set(x, "onOverflowY", js.Any.fromFunction0(value))
      
      inline def setOnOverflowYNone(value: () => Unit): Self = StObject.set(x, "onOverflowYNone", js.Any.fromFunction0(value))
      
      inline def setOnOverflowYNoneUndefined: Self = StObject.set(x, "onOverflowYNone", js.undefined)
      
      inline def setOnOverflowYUndefined: Self = StObject.set(x, "onOverflowY", js.undefined)
      
      inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
      
      inline def setOnScrollStart(value: () => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction0(value))
      
      inline def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelectorChange(value: () => Unit): Self = StObject.set(x, "onSelectorChange", js.Any.fromFunction0(value))
      
      inline def setOnSelectorChangeUndefined: Self = StObject.set(x, "onSelectorChange", js.undefined)
      
      inline def setOnTotalScroll(value: () => Unit): Self = StObject.set(x, "onTotalScroll", js.Any.fromFunction0(value))
      
      inline def setOnTotalScrollBack(value: () => Unit): Self = StObject.set(x, "onTotalScrollBack", js.Any.fromFunction0(value))
      
      inline def setOnTotalScrollBackOffset(value: Double): Self = StObject.set(x, "onTotalScrollBackOffset", value.asInstanceOf[js.Any])
      
      inline def setOnTotalScrollBackOffsetUndefined: Self = StObject.set(x, "onTotalScrollBackOffset", js.undefined)
      
      inline def setOnTotalScrollBackUndefined: Self = StObject.set(x, "onTotalScrollBack", js.undefined)
      
      inline def setOnTotalScrollOffset(value: Double): Self = StObject.set(x, "onTotalScrollOffset", value.asInstanceOf[js.Any])
      
      inline def setOnTotalScrollOffsetUndefined: Self = StObject.set(x, "onTotalScrollOffset", js.undefined)
      
      inline def setOnTotalScrollUndefined: Self = StObject.set(x, "onTotalScroll", js.undefined)
      
      inline def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setWhileScrolling(value: () => Unit): Self = StObject.set(x, "whileScrolling", js.Any.fromFunction0(value))
      
      inline def setWhileScrollingUndefined: Self = StObject.set(x, "whileScrolling", js.undefined)
    }
  }
  
  trait AutoExpandHorizontalScroll extends StObject {
    
    /**
      * Auto-expanding content's width on horizontal scrollbars, values: true, false. Set to true if you have horizontal scrollbr on content that change on-the-fly. Demo contains
      * blocks with images and horizontal scrollbars that use this option parameter
      */
    var autoExpandHorizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the list of elements/selectors that will auto-scroll content to their position when focused.
      * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content 
      * will scroll to its top/left position (same bahavior with browser’s native scrollbar).
      * To completely disable this functionality, set autoScrollOnFocus: false.
      * Default:
      *   "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
      */
    var autoScrollOnFocus: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Set the auto-update timeout in milliseconds.
      * Default timeout: 60
      */            
    var autoUpdateTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Add extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
      * Example: extraDraggableSelectors: ".myClass, #myID"
      */
    var extraDraggableSelectors: js.UndefOr[String] = js.undefined
    
    /**
      * Normalize mouse wheel delta (-1/1), values: true, false
      */
    var normalizeMouseWheelDelta: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
      * Example: releaseDraggableSelectors: ".myClass, #myID"
      */
    var releaseDraggableSelectors: js.UndefOr[String] = js.undefined
    
    /**
      * Update scrollbars on browser resize (for fluid content blocks and layouts based on percentages), values: true, false. Set to false only when you content has fixed dimensions
      */
    var updateOnBrowserResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto-update scrollbars on content resize (useful when adding/changing content progrmatically), value: true, false. Setting this to true makes the script check for content
      * length changes (every few milliseconds) and automatically call plugin's update method to adjust the scrollbar accordingly
      */
    var updateOnContentResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
      * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
      * The value should be true when your content contains images and you need the function to trigger on any axis.
      */
    var updateOnImageLoad: js.UndefOr[auto | Boolean] = js.undefined
    
    /**
      * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
      * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
      * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
      * Setting the value to true, will update scrollbars each time any element is changed.
      * To disable (default) set to false.
      */
    var updateOnSelectorChange: js.UndefOr[String | Boolean] = js.undefined
  }
  object AutoExpandHorizontalScroll {
    
    inline def apply(): AutoExpandHorizontalScroll = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoExpandHorizontalScroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoExpandHorizontalScroll] (val x: Self) extends AnyVal {
      
      inline def setAutoExpandHorizontalScroll(value: Boolean): Self = StObject.set(x, "autoExpandHorizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandHorizontalScrollUndefined: Self = StObject.set(x, "autoExpandHorizontalScroll", js.undefined)
      
      inline def setAutoScrollOnFocus(value: Boolean | String): Self = StObject.set(x, "autoScrollOnFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollOnFocusUndefined: Self = StObject.set(x, "autoScrollOnFocus", js.undefined)
      
      inline def setAutoUpdateTimeout(value: Double): Self = StObject.set(x, "autoUpdateTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdateTimeoutUndefined: Self = StObject.set(x, "autoUpdateTimeout", js.undefined)
      
      inline def setExtraDraggableSelectors(value: String): Self = StObject.set(x, "extraDraggableSelectors", value.asInstanceOf[js.Any])
      
      inline def setExtraDraggableSelectorsUndefined: Self = StObject.set(x, "extraDraggableSelectors", js.undefined)
      
      inline def setNormalizeMouseWheelDelta(value: Boolean): Self = StObject.set(x, "normalizeMouseWheelDelta", value.asInstanceOf[js.Any])
      
      inline def setNormalizeMouseWheelDeltaUndefined: Self = StObject.set(x, "normalizeMouseWheelDelta", js.undefined)
      
      inline def setReleaseDraggableSelectors(value: String): Self = StObject.set(x, "releaseDraggableSelectors", value.asInstanceOf[js.Any])
      
      inline def setReleaseDraggableSelectorsUndefined: Self = StObject.set(x, "releaseDraggableSelectors", js.undefined)
      
      inline def setUpdateOnBrowserResize(value: Boolean): Self = StObject.set(x, "updateOnBrowserResize", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnBrowserResizeUndefined: Self = StObject.set(x, "updateOnBrowserResize", js.undefined)
      
      inline def setUpdateOnContentResize(value: Boolean): Self = StObject.set(x, "updateOnContentResize", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnContentResizeUndefined: Self = StObject.set(x, "updateOnContentResize", js.undefined)
      
      inline def setUpdateOnImageLoad(value: auto | Boolean): Self = StObject.set(x, "updateOnImageLoad", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnImageLoadUndefined: Self = StObject.set(x, "updateOnImageLoad", js.undefined)
      
      inline def setUpdateOnSelectorChange(value: String | Boolean): Self = StObject.set(x, "updateOnSelectorChange", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnSelectorChangeUndefined: Self = StObject.set(x, "updateOnSelectorChange", js.undefined)
    }
  }
  
  trait Axis extends StObject {
    
    /**
      * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
      * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
      */
    var axis: js.UndefOr[x | y] = js.undefined
    
    /**
      * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
      */
    var deltaFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the tags that disable mouse-wheel when cursor is over them.
      * Default value: ["select","option","keygen","datalist","textarea"]
      */
    var disableOver: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Enable or disable content scrolling via mouse-wheel.
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Invert mouse-wheel scrolling direction.
      * Set to true to scroll down or right when mouse-wheel is turned upwards.
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable mouse-wheel (delta) acceleration.
      * Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
      */
    var normalizeDelta: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent the default behaviour which automatically scrolls the parent element when end
      * or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
      */
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the mouse-wheel scrolling amount (in pixels).
      * The default value "auto" adjusts scrolling amount according to scrollable content length.
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.undefined
  }
  object Axis {
    
    inline def apply(): Axis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: typings.mcustomscrollbar.mcustomscrollbarStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDeltaFactor(value: Double): Self = StObject.set(x, "deltaFactor", value.asInstanceOf[js.Any])
      
      inline def setDeltaFactorUndefined: Self = StObject.set(x, "deltaFactor", js.undefined)
      
      inline def setDisableOver(value: js.Array[String]): Self = StObject.set(x, "disableOver", value.asInstanceOf[js.Any])
      
      inline def setDisableOverUndefined: Self = StObject.set(x, "disableOver", js.undefined)
      
      inline def setDisableOverVarargs(value: String*): Self = StObject.set(x, "disableOver", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setNormalizeDelta(value: Boolean): Self = StObject.set(x, "normalizeDelta", value.asInstanceOf[js.Any])
      
      inline def setNormalizeDeltaUndefined: Self = StObject.set(x, "normalizeDelta", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      inline def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
    }
  }
  
  trait Enable extends StObject {
    
    /**
      * Enable or disable content scrolling via keyboard.
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the keyboard arrows scrolling amount (in pixels). 
      * The default value "auto" adjusts scrolling amount according to scrollable content length.
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.undefined
    
    /**
      * Define the buttons scrolling type/behavior.
      * scrollType: "stepless" – continuously scroll content while pressing the button (default)
      * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
      */
    var scrollType: js.UndefOr[stepless | stepped] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      inline def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
      
      inline def setScrollType(value: stepless | stepped): Self = StObject.set(x, "scrollType", value.asInstanceOf[js.Any])
      
      inline def setScrollTypeUndefined: Self = StObject.set(x, "scrollType", js.undefined)
    }
  }
  
  trait ScrollAmount extends StObject {
    
    /**
      * Enable or disable scroll buttons.
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scroll buttons pixels scrolling amount, value in pixels or "auto"
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.undefined
    
    /**
      * Define the buttons scrolling type/behavior.
      * scrollType: "stepless" – continuously scroll content while pressing the button (default)
      * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
      */
    var scrollType: js.UndefOr[stepless | stepped] = js.undefined
    
    /**
      * Set a tabindex value for the buttons.
      */
    var tabindex: js.UndefOr[Double] = js.undefined
  }
  object ScrollAmount {
    
    inline def apply(): ScrollAmount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAmount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollAmount] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      inline def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
      
      inline def setScrollType(value: stepless | stepped): Self = StObject.set(x, "scrollType", value.asInstanceOf[js.Any])
      
      inline def setScrollTypeUndefined: Self = StObject.set(x, "scrollType", js.undefined)
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    }
  }
}
