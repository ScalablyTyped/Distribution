package typings.mcustomscrollbar

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typings.mcustomscrollbar.mcustomscrollbarStrings.stepped
import typings.mcustomscrollbar.mcustomscrollbarStrings.x
import typings.mcustomscrollbar.mcustomscrollbarStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlwaysTriggerOffsets extends StObject {
    
    /**
      * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
      * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
      * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
      */
    var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.native
    
    /**
      * A function to call right before scrollbar(s) are updated.
      */
    var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when plugin markup is created.
      */
    var onCreate: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
      */
    var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when scrollbars have initialized
      */
    var onInit: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when content becomes wide enough and horizontal scrollbar is added.
      */
    var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
      */
    var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when content becomes long enough and vertical scrollbar is added.
      */
    var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when content becomes short enough and vertical scrollbar is removed.
      */
    var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
      */
    var onScroll: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
      */
    var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
      */
    var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
      */
    var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
      */
    var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Set an offset for which the onTotalScrollBack callback is triggered.
      * Its value is in pixels
      */
    var onTotalScrollBackOffset: js.UndefOr[Double] = js.native
    
    /**
      * Set an offset for which the onTotalScroll callback is triggered.
      * Its value is in pixels.
      */
    var onTotalScrollOffset: js.UndefOr[Double] = js.native
    
    /**
      * A function to call when scrollbar(s) are updated.
      */
    var onUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * User defined callback function, triggered while scrolling
      */
    var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object AlwaysTriggerOffsets {
    
    @scala.inline
    def apply(): AlwaysTriggerOffsets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysTriggerOffsets]
    }
    
    @scala.inline
    implicit class AlwaysTriggerOffsetsMutableBuilder[Self <: AlwaysTriggerOffsets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysTriggerOffsets(value: Boolean): Self = StObject.set(x, "alwaysTriggerOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysTriggerOffsetsUndefined: Self = StObject.set(x, "alwaysTriggerOffsets", js.undefined)
      
      @scala.inline
      def setOnBeforeUpdate(value: () => Unit): Self = StObject.set(x, "onBeforeUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeUpdateUndefined: Self = StObject.set(x, "onBeforeUpdate", js.undefined)
      
      @scala.inline
      def setOnCreate(value: () => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      @scala.inline
      def setOnImageLoad(value: () => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      @scala.inline
      def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnOverflowX(value: () => Unit): Self = StObject.set(x, "onOverflowX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOverflowXNone(value: () => Unit): Self = StObject.set(x, "onOverflowXNone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOverflowXNoneUndefined: Self = StObject.set(x, "onOverflowXNone", js.undefined)
      
      @scala.inline
      def setOnOverflowXUndefined: Self = StObject.set(x, "onOverflowX", js.undefined)
      
      @scala.inline
      def setOnOverflowY(value: () => Unit): Self = StObject.set(x, "onOverflowY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOverflowYNone(value: () => Unit): Self = StObject.set(x, "onOverflowYNone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOverflowYNoneUndefined: Self = StObject.set(x, "onOverflowYNone", js.undefined)
      
      @scala.inline
      def setOnOverflowYUndefined: Self = StObject.set(x, "onOverflowY", js.undefined)
      
      @scala.inline
      def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollStart(value: () => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelectorChange(value: () => Unit): Self = StObject.set(x, "onSelectorChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectorChangeUndefined: Self = StObject.set(x, "onSelectorChange", js.undefined)
      
      @scala.inline
      def setOnTotalScroll(value: () => Unit): Self = StObject.set(x, "onTotalScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTotalScrollBack(value: () => Unit): Self = StObject.set(x, "onTotalScrollBack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTotalScrollBackOffset(value: Double): Self = StObject.set(x, "onTotalScrollBackOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTotalScrollBackOffsetUndefined: Self = StObject.set(x, "onTotalScrollBackOffset", js.undefined)
      
      @scala.inline
      def setOnTotalScrollBackUndefined: Self = StObject.set(x, "onTotalScrollBack", js.undefined)
      
      @scala.inline
      def setOnTotalScrollOffset(value: Double): Self = StObject.set(x, "onTotalScrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTotalScrollOffsetUndefined: Self = StObject.set(x, "onTotalScrollOffset", js.undefined)
      
      @scala.inline
      def setOnTotalScrollUndefined: Self = StObject.set(x, "onTotalScroll", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setWhileScrolling(value: () => Unit): Self = StObject.set(x, "whileScrolling", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWhileScrollingUndefined: Self = StObject.set(x, "whileScrolling", js.undefined)
    }
  }
  
  @js.native
  trait AutoExpandHorizontalScroll extends StObject {
    
    /**
      * Auto-expanding content's width on horizontal scrollbars, values: true, false. Set to true if you have horizontal scrollbr on content that change on-the-fly. Demo contains
      * blocks with images and horizontal scrollbars that use this option parameter
      */
    var autoExpandHorizontalScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the list of elements/selectors that will auto-scroll content to their position when focused.
      * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content 
      * will scroll to its top/left position (same bahavior with browser’s native scrollbar).
      * To completely disable this functionality, set autoScrollOnFocus: false.
      * Default:
      *   "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
      */
    var autoScrollOnFocus: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Set the auto-update timeout in milliseconds.
      * Default timeout: 60
      */            
    var autoUpdateTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Add extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
      * Example: extraDraggableSelectors: ".myClass, #myID"
      */
    var extraDraggableSelectors: js.UndefOr[String] = js.native
    
    /**
      * Normalize mouse wheel delta (-1/1), values: true, false
      */
    var normalizeMouseWheelDelta: js.UndefOr[Boolean] = js.native
    
    /**
      * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
      * Example: releaseDraggableSelectors: ".myClass, #myID"
      */
    var releaseDraggableSelectors: js.UndefOr[String] = js.native
    
    /**
      * Update scrollbars on browser resize (for fluid content blocks and layouts based on percentages), values: true, false. Set to false only when you content has fixed dimensions
      */
    var updateOnBrowserResize: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto-update scrollbars on content resize (useful when adding/changing content progrmatically), value: true, false. Setting this to true makes the script check for content
      * length changes (every few milliseconds) and automatically call plugin's update method to adjust the scrollbar accordingly
      */
    var updateOnContentResize: js.UndefOr[Boolean] = js.native
    
    /**
      * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
      * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
      * The value should be true when your content contains images and you need the function to trigger on any axis.
      */
    var updateOnImageLoad: js.UndefOr[auto | Boolean] = js.native
    
    /**
      * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
      * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
      * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
      * Setting the value to true, will update scrollbars each time any element is changed.
      * To disable (default) set to false.
      */
    var updateOnSelectorChange: js.UndefOr[String | Boolean] = js.native
  }
  object AutoExpandHorizontalScroll {
    
    @scala.inline
    def apply(): AutoExpandHorizontalScroll = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoExpandHorizontalScroll]
    }
    
    @scala.inline
    implicit class AutoExpandHorizontalScrollMutableBuilder[Self <: AutoExpandHorizontalScroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoExpandHorizontalScroll(value: Boolean): Self = StObject.set(x, "autoExpandHorizontalScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandHorizontalScrollUndefined: Self = StObject.set(x, "autoExpandHorizontalScroll", js.undefined)
      
      @scala.inline
      def setAutoScrollOnFocus(value: Boolean | String): Self = StObject.set(x, "autoScrollOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollOnFocusUndefined: Self = StObject.set(x, "autoScrollOnFocus", js.undefined)
      
      @scala.inline
      def setAutoUpdateTimeout(value: Double): Self = StObject.set(x, "autoUpdateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdateTimeoutUndefined: Self = StObject.set(x, "autoUpdateTimeout", js.undefined)
      
      @scala.inline
      def setExtraDraggableSelectors(value: String): Self = StObject.set(x, "extraDraggableSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDraggableSelectorsUndefined: Self = StObject.set(x, "extraDraggableSelectors", js.undefined)
      
      @scala.inline
      def setNormalizeMouseWheelDelta(value: Boolean): Self = StObject.set(x, "normalizeMouseWheelDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeMouseWheelDeltaUndefined: Self = StObject.set(x, "normalizeMouseWheelDelta", js.undefined)
      
      @scala.inline
      def setReleaseDraggableSelectors(value: String): Self = StObject.set(x, "releaseDraggableSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseDraggableSelectorsUndefined: Self = StObject.set(x, "releaseDraggableSelectors", js.undefined)
      
      @scala.inline
      def setUpdateOnBrowserResize(value: Boolean): Self = StObject.set(x, "updateOnBrowserResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnBrowserResizeUndefined: Self = StObject.set(x, "updateOnBrowserResize", js.undefined)
      
      @scala.inline
      def setUpdateOnContentResize(value: Boolean): Self = StObject.set(x, "updateOnContentResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnContentResizeUndefined: Self = StObject.set(x, "updateOnContentResize", js.undefined)
      
      @scala.inline
      def setUpdateOnImageLoad(value: auto | Boolean): Self = StObject.set(x, "updateOnImageLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnImageLoadUndefined: Self = StObject.set(x, "updateOnImageLoad", js.undefined)
      
      @scala.inline
      def setUpdateOnSelectorChange(value: String | Boolean): Self = StObject.set(x, "updateOnSelectorChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnSelectorChangeUndefined: Self = StObject.set(x, "updateOnSelectorChange", js.undefined)
    }
  }
  
  @js.native
  trait Axis extends StObject {
    
    /**
      * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
      * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
      */
    var axis: js.UndefOr[x | y] = js.native
    
    /**
      * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
      */
    var deltaFactor: js.UndefOr[Double] = js.native
    
    /**
      * Set the tags that disable mouse-wheel when cursor is over them.
      * Default value: ["select","option","keygen","datalist","textarea"]
      */
    var disableOver: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Enable or disable content scrolling via mouse-wheel.
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /**
      * Invert mouse-wheel scrolling direction.
      * Set to true to scroll down or right when mouse-wheel is turned upwards.
      */
    var invert: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable mouse-wheel (delta) acceleration.
      * Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
      */
    var normalizeDelta: js.UndefOr[Boolean] = js.native
    
    /**
      * Prevent the default behaviour which automatically scrolls the parent element when end
      * or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
      */
    var preventDefault: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the mouse-wheel scrolling amount (in pixels).
      * The default value "auto" adjusts scrolling amount according to scrollable content length.
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.native
  }
  object Axis {
    
    @scala.inline
    def apply(): Axis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typings.mcustomscrollbar.mcustomscrollbarStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setDeltaFactor(value: Double): Self = StObject.set(x, "deltaFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaFactorUndefined: Self = StObject.set(x, "deltaFactor", js.undefined)
      
      @scala.inline
      def setDisableOver(value: js.Array[String]): Self = StObject.set(x, "disableOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableOverUndefined: Self = StObject.set(x, "disableOver", js.undefined)
      
      @scala.inline
      def setDisableOverVarargs(value: String*): Self = StObject.set(x, "disableOver", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      @scala.inline
      def setNormalizeDelta(value: Boolean): Self = StObject.set(x, "normalizeDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeDeltaUndefined: Self = StObject.set(x, "normalizeDelta", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
    }
  }
  
  @js.native
  trait Enable extends StObject {
    
    /**
      * Enable or disable content scrolling via keyboard.
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the keyboard arrows scrolling amount (in pixels). 
      * The default value "auto" adjusts scrolling amount according to scrollable content length.
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.native
    
    /**
      * Define the buttons scrolling type/behavior.
      * scrollType: "stepless" – continuously scroll content while pressing the button (default)
      * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
      */
    var scrollType: js.UndefOr[stepless | stepped] = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
      
      @scala.inline
      def setScrollType(value: stepless | stepped): Self = StObject.set(x, "scrollType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTypeUndefined: Self = StObject.set(x, "scrollType", js.undefined)
    }
  }
  
  @js.native
  trait ScrollAmount extends StObject {
    
    /**
      * Enable or disable scroll buttons.
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /**
      * Scroll buttons pixels scrolling amount, value in pixels or "auto"
      */
    var scrollAmount: js.UndefOr[auto | Double] = js.native
    
    /**
      * Define the buttons scrolling type/behavior.
      * scrollType: "stepless" – continuously scroll content while pressing the button (default)
      * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
      */
    var scrollType: js.UndefOr[stepless | stepped] = js.native
    
    /**
      * Set a tabindex value for the buttons.
      */
    var tabindex: js.UndefOr[Double] = js.native
  }
  object ScrollAmount {
    
    @scala.inline
    def apply(): ScrollAmount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAmount]
    }
    
    @scala.inline
    implicit class ScrollAmountMutableBuilder[Self <: ScrollAmount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setScrollAmount(value: auto | Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAmountUndefined: Self = StObject.set(x, "scrollAmount", js.undefined)
      
      @scala.inline
      def setScrollType(value: stepless | stepped): Self = StObject.set(x, "scrollType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTypeUndefined: Self = StObject.set(x, "scrollType", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    }
  }
}
