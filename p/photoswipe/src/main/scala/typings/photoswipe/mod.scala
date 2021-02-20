package typings.photoswipe

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.photoswipe.anon.Prevent
import typings.photoswipe.anon.Top
import typings.photoswipe.anon.W
import typings.photoswipe.anon.X
import typings.photoswipe.photoswipeStrings.afterChange
import typings.photoswipe.photoswipeStrings.beforeChange
import typings.photoswipe.photoswipeStrings.close
import typings.photoswipe.photoswipeStrings.destroy
import typings.photoswipe.photoswipeStrings.gettingData
import typings.photoswipe.photoswipeStrings.imageLoadComplete
import typings.photoswipe.photoswipeStrings.initialZoomIn
import typings.photoswipe.photoswipeStrings.initialZoomInEnd
import typings.photoswipe.photoswipeStrings.initialZoomOut
import typings.photoswipe.photoswipeStrings.initialZoomOutEnd
import typings.photoswipe.photoswipeStrings.mouseUsed
import typings.photoswipe.photoswipeStrings.parseVerticalMargin
import typings.photoswipe.photoswipeStrings.preventDragEvent
import typings.photoswipe.photoswipeStrings.resize
import typings.photoswipe.photoswipeStrings.unbindEvents
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
    */
  @JSImport("photoswipe", JSImport.Namespace)
  @js.native
  class ^[T /* <: Options */] protected () extends PhotoSwipe[T] {
    /**
      * Constructs a PhotoSwipe.
      *
      * Note: By default Typescript will not correctly typecheck the options parameter. Make sure to
      * explicitly annotate the type of options being passed into the constructor like so:
      *
      * new PhotoSwipe<PhotoSwipeUI_Default.Options>( element, PhotoSwipeUI_Default, items, options );
      *
      * It accepts 4 arguments:
      *
      * (1) PhotoSwipe element (it must be added to DOM).
      * (2) PhotoSwipe UI class. If you included default photoswipe-ui-default.js, class will be PhotoSwipeUI_Default. Can be "false".
      * (3) Array with objects (slides).
      * (4) Options.
      */
    def this(
      pswpElement: HTMLElement,
      uiConstructor: Instantiable2[/* pswp */ PhotoSwipe[T], /* framework */ UIFramework, UI[T]],
      items: js.Array[Item],
      options: T
    ) = this()
    def this(pswpElement: HTMLElement, uiConstructor: Boolean, items: js.Array[Item], options: T) = this()
  }
  
  @js.native
  trait Item extends StObject {
    
    /**
      * Internal property added by PhotoSwipe.
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /**
      * Internal property added by PhotoSwipe.
      * This number is computed to be this item's smaller dimension divided by the larger dimension.
      */
    var fitRatio: js.UndefOr[Double] = js.native
    
    /**
      * The height of this image.
      */
    var h: js.UndefOr[Double] = js.native
    
    /**
      * HTML content instead of image.
      */
    var html: js.UndefOr[String] = js.native
    
    /**
      * Internal property added by PhotoSwipe.
      */
    var initialPosition: js.UndefOr[js.Any] = js.native
    
    /**
      * Internal property added by PhotoSwipe.
      */
    var initialZoomLevel: js.UndefOr[Double] = js.native
    
    /**
      * Internal property added by PhotoSwipe.
      */
    var loadError: js.UndefOr[Boolean] = js.native
    
    /**
      * The url to small image placeholder, large image will be loaded on top
      */
    var msrc: js.UndefOr[String] = js.native
    
    /**
      * The url of this image.
      */
    var src: js.UndefOr[String] = js.native
    
    /**
      * Internal property added by PhotoSwipe.
      */
    var vGap: js.UndefOr[Top] = js.native
    
    /**
      * The width of this image.
      */
    var w: js.UndefOr[Double] = js.native
  }
  object Item {
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setFitRatio(value: Double): Self = StObject.set(x, "fitRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitRatioUndefined: Self = StObject.set(x, "fitRatio", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setInitialPosition(value: js.Any): Self = StObject.set(x, "initialPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPositionUndefined: Self = StObject.set(x, "initialPosition", js.undefined)
      
      @scala.inline
      def setInitialZoomLevel(value: Double): Self = StObject.set(x, "initialZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialZoomLevelUndefined: Self = StObject.set(x, "initialZoomLevel", js.undefined)
      
      @scala.inline
      def setLoadError(value: Boolean): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
      
      @scala.inline
      def setMsrc(value: String): Self = StObject.set(x, "msrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsrcUndefined: Self = StObject.set(x, "msrc", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setVGap(value: Top): Self = StObject.set(x, "vGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVGapUndefined: Self = StObject.set(x, "vGap", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Allow swipe navigation to next/prev item when current item is zoomed.
      * Option is always false on devices that don't have hardware touch support.
      *
      * Default true.
      */
    var allowNoPanText: js.UndefOr[Boolean] = js.native
    
    /**
      * Keyboard left or right arrow key navigation. Option can be changed dynamically (yourPhotoSwipeInstance.options.arrowKeys = false;).
      *
      * Default true.
      */
    var arrowKeys: js.UndefOr[Boolean] = js.native
    
    /**
      * Background (.pswp__bg) opacity.
      * Should be a number from 0 to 1, e.g. 0.7.
      * This style is defined via JS, not via CSS, as this value is used for a few gesture-based transitions.
      *
      * Default 1.
      */
    var bgOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Close gallery on page scroll. Option works just for devices without hardware touch support.
      *
      * Default true.
      */
    var closeOnScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Close gallery when dragging vertically and when image is not zoomed. Always false when mouse is used.
      *
      * Default true.
      */
    var closeOnVerticalDrag: js.UndefOr[Boolean] = js.native
    
    /**
      * Error message when image was not loaded. %url% will be replaced by URL of image.
      *
      * Default is:
      *
      * <div class="pswp__error-msg"><a href="%url%" target="_blank">The image</a> could not be loaded.</div>
      */
    var errorMsg: js.UndefOr[String] = js.native
    
    /**
      * esc keyboard key to close PhotoSwipe. Option can be changed dynamically (yourPhotoSwipeInstance.options.escKey = false;).
      *
      * Default true.
      */
    var escKey: js.UndefOr[Boolean] = js.native
    
    /**
      * Will set focus on PhotoSwipe element after it's open.
      *
      * Default true.
      */
    var focus: js.UndefOr[Boolean] = js.native
    
    /**
      * Gallery unique ID. Used by History module when forming URL. For example, second picture of gallery with UID 1 will have URL: http://example.com/#&gid=1&pid=2.
      *
      * Default 1.
      */
    var galleryUID: js.UndefOr[Double] = js.native
    
    /**
      * Function should return zoom level to which image will be zoomed after double-tap gesture, or when user clicks on zoom icon, or mouse-click on image itself.
      * If you return 1 image will be zoomed to its original size.
      * Function is called each time zoom-in animation is initiated. So feel free to return different values for different images based on their size or screen DPI.
      *
      * Default is:
      *
      * function(isMouseClick, item) {
      *
      *     // isMouseClick          - true if mouse, false if double-tap
      *     // item                  - slide object that is zoomed, usually current
      *     // item.initialZoomLevel - initial scale ratio of image
      *     //                         e.g. if viewport is 700px and image is 1400px,
      *     //                              initialZoomLevel will be 0.5
      *
      *     if(isMouseClick) {
      *
      *         // is mouse click on image or zoom icon
      *
      *         // zoom to original
      *         return 1;
      *
      *         // e.g. for 1400px image:
      *         // 0.5 - zooms to 700px
      *         // 2   - zooms to 2800px
      *
      *     } else {
      *
      *         // is double-tap
      *
      *         // zoom to original if initial zoom is less than 0.7x,
      *         // otherwise to 1.5x, to make sure that double-tap gesture always zooms image
      *         return item.initialZoomLevel < 0.7 ? 1 : 1.5;
      *     }
      * }
      */
    var getDoubleTapZoom: js.UndefOr[js.Function2[/* isMouseClick */ Boolean, /* item */ Item, Double]] = js.native
    
    /**
      * Function that should return total number of items in gallery. Don't put very complex code here, function is executed very often.
      *
      * By default it returns length of slides array.
      */
    var getNumItemsFn: js.UndefOr[js.Function0[Double]] = js.native
    
    /**
      * Function should return an object with coordinates from which initial zoom-in animation will start (or zoom-out animation will end).
      * Object should contain three properties: x (X position, relative to document), y (Y position, relative to document), w (width of the element).
      * Height will be calculated automatically based on size of large image.
      * For example if you return {x:0,y:0,w:50} zoom animation will start in top left corner of your page.
      * Function has one argument - index of the item that is opening or closing.
      *
      * Default undefined.
      */
    var getThumbBoundsFn: js.UndefOr[js.Function1[/* index */ Double, W]] = js.native
    
    /**
      * The same as the previous option, just for closing (zoom-out) transition.
      * After PhotoSwipe is opened pswp--open class will be added to the root element, you may use it to apply different transition duration in CSS.
      *
      * Default 333.
      */
    var hideAnimationDuration: js.UndefOr[Double] = js.native
    
    /**
      * If set to false disables history module (back button to close gallery, unique URL for each slide). You can also just exclude history.js module from your build.
      *
      * Default true.
      */
    var history: js.UndefOr[Boolean] = js.native
    
    /**
      * Start slide index. 0 is the first slide. Must be integer, not a string.
      *
      * Default 0.
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Function should check if the element (el) is clickable.
      * If it is – PhotoSwipe will not call preventDefault and click event will pass through.
      * Function should be as light is possible, as it's executed multiple times on drag start and drag release.
      *
      * Default is:
      *
      * function(el) {
      *     return el.tagName === 'A';
      * }
      */
    var isClickableElement: js.UndefOr[js.Function1[/* el */ HTMLElement, Boolean]] = js.native
    
    /**
      * Loop slides when using swipe gesture.If set to true you'll be able to swipe from last to first image.
      * Option is always false when there are less than 3 slides.
      * This option has no relation to arrows navigation. Arrows loop is turned on permanently. You can modify this behavior by making custom UI.
      *
      * Default true.
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * String with name of class that will be added to root element of PhotoSwipe (.pswp). Can contain multiple classes separated by space.
      */
    var mainClass: js.UndefOr[String] = js.native
    
    /**
      * NOTE: this property will be ignored in future versions of PhotoSwipe.
      *
      * @deprecated
      */
    var mainScrollEndFriction: js.UndefOr[Double] = js.native
    
    /**
      * Maximum zoom level when performing spread (zoom) gesture. 2 means that image can be zoomed 2x from original size.
      * Try to avoid huge values here, as too big image may cause memory issues on mobile (especially on iOS).
      *
      * Default 2.
      */
    var maxSpreadZoom: js.UndefOr[Double] = js.native
    
    /**
      * Controls whether PhotoSwipe should expand to take up the entire viewport.
      * If false, the PhotoSwipe element will take the size of the positioned parent of the template. Take a look at the FAQ for more
      * information.
      */
    var modal: js.UndefOr[Boolean] = js.native
    
    /**
      * Option allows you to predefine if mouse was used or not.
      * Some PhotoSwipe feature depend on it, for example default UI left/right arrows will be displayed only after mouse is used.
      * If set to false, PhotoSwipe will start detecting when mouse is used by itself, mouseUsed event triggers when mouse is found.
      *
      * default false.
      */
    var mouseUsed: js.UndefOr[Boolean] = js.native
    
    /**
      * NOTE: this property will be ignored in future versions of PhotoSwipe.
      *
      * @deprecated
      */
    var panEndFriction: js.UndefOr[Double] = js.native
    
    /**
      * Pinch to close gallery gesture. The gallery’s background will gradually fade out as the user zooms out. When the gesture is complete, the gallery will close.
      *
      * Default true.
      */
    var pinchToClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Lazy loading of nearby slides based on direction of movement.
      * Should be an array with two integers, first one - number of items to preload before current image, second one - after the current image.
      * E.g. if you set it to [1,3], it'll load 1 image before the current, and 3 images after current. Values can not be less than 1.
      *
      * Default [1, 1].
      */
    var preload: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Initial zoom-in transition duration in milliseconds. Set to 0 to disable. Besides this JS option, you need also to change transition duration in PhotoSwipe CSS file:
      * .pswp--animate_opacity,
      * .pswp__bg,
      * .pswp__caption,
      * .pswp__top-bar,
      * .pswp--has_mouse .pswp__button--arrow--left,
      * .pswp--has_mouse .pswp__button--arrow--right{
      *     -webkit-transition: opacity 333ms cubic-bezier(.4,0,.22,1);
      *     transition: opacity 333ms cubic-bezier(.4,0,.22,1);
      * }
      *
      * Default 333.
      */
    var showAnimationDuration: js.UndefOr[Double] = js.native
    
    /**
      * If set to false background opacity and image scale will be animated (image opacity is always 1).
      * If set to true root PhotoSwipe element opacity and image scale will be animated.
      * Enable it when dimensions of your small thumbnail don't match dimensions of large image.
      *
      * Default false.
      */
    var showHideOpacity: js.UndefOr[Boolean] = js.native
    
    /**
      * Spacing ratio between slides. For example, 0.12 will render as a 12% of sliding viewport width (rounded).
      *
      * Default 0.12.
      */
    var spacing: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNoPanText(value: Boolean): Self = StObject.set(x, "allowNoPanText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNoPanTextUndefined: Self = StObject.set(x, "allowNoPanText", js.undefined)
      
      @scala.inline
      def setArrowKeys(value: Boolean): Self = StObject.set(x, "arrowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowKeysUndefined: Self = StObject.set(x, "arrowKeys", js.undefined)
      
      @scala.inline
      def setBgOpacity(value: Double): Self = StObject.set(x, "bgOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgOpacityUndefined: Self = StObject.set(x, "bgOpacity", js.undefined)
      
      @scala.inline
      def setCloseOnScroll(value: Boolean): Self = StObject.set(x, "closeOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnScrollUndefined: Self = StObject.set(x, "closeOnScroll", js.undefined)
      
      @scala.inline
      def setCloseOnVerticalDrag(value: Boolean): Self = StObject.set(x, "closeOnVerticalDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnVerticalDragUndefined: Self = StObject.set(x, "closeOnVerticalDrag", js.undefined)
      
      @scala.inline
      def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMsgUndefined: Self = StObject.set(x, "errorMsg", js.undefined)
      
      @scala.inline
      def setEscKey(value: Boolean): Self = StObject.set(x, "escKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscKeyUndefined: Self = StObject.set(x, "escKey", js.undefined)
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setGalleryUID(value: Double): Self = StObject.set(x, "galleryUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryUIDUndefined: Self = StObject.set(x, "galleryUID", js.undefined)
      
      @scala.inline
      def setGetDoubleTapZoom(value: (/* isMouseClick */ Boolean, /* item */ Item) => Double): Self = StObject.set(x, "getDoubleTapZoom", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDoubleTapZoomUndefined: Self = StObject.set(x, "getDoubleTapZoom", js.undefined)
      
      @scala.inline
      def setGetNumItemsFn(value: () => Double): Self = StObject.set(x, "getNumItemsFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumItemsFnUndefined: Self = StObject.set(x, "getNumItemsFn", js.undefined)
      
      @scala.inline
      def setGetThumbBoundsFn(value: /* index */ Double => W): Self = StObject.set(x, "getThumbBoundsFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetThumbBoundsFnUndefined: Self = StObject.set(x, "getThumbBoundsFn", js.undefined)
      
      @scala.inline
      def setHideAnimationDuration(value: Double): Self = StObject.set(x, "hideAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideAnimationDurationUndefined: Self = StObject.set(x, "hideAnimationDuration", js.undefined)
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIsClickableElement(value: /* el */ HTMLElement => Boolean): Self = StObject.set(x, "isClickableElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsClickableElementUndefined: Self = StObject.set(x, "isClickableElement", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
      
      @scala.inline
      def setMainScrollEndFriction(value: Double): Self = StObject.set(x, "mainScrollEndFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainScrollEndFrictionUndefined: Self = StObject.set(x, "mainScrollEndFriction", js.undefined)
      
      @scala.inline
      def setMaxSpreadZoom(value: Double): Self = StObject.set(x, "maxSpreadZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSpreadZoomUndefined: Self = StObject.set(x, "maxSpreadZoom", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setMouseUsed(value: Boolean): Self = StObject.set(x, "mouseUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseUsedUndefined: Self = StObject.set(x, "mouseUsed", js.undefined)
      
      @scala.inline
      def setPanEndFriction(value: Double): Self = StObject.set(x, "panEndFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanEndFrictionUndefined: Self = StObject.set(x, "panEndFriction", js.undefined)
      
      @scala.inline
      def setPinchToClose(value: Boolean): Self = StObject.set(x, "pinchToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchToCloseUndefined: Self = StObject.set(x, "pinchToClose", js.undefined)
      
      @scala.inline
      def setPreload(value: js.Array[Double]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setPreloadVarargs(value: Double*): Self = StObject.set(x, "preload", js.Array(value :_*))
      
      @scala.inline
      def setShowAnimationDuration(value: Double): Self = StObject.set(x, "showAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAnimationDurationUndefined: Self = StObject.set(x, "showAnimationDuration", js.undefined)
      
      @scala.inline
      def setShowHideOpacity(value: Boolean): Self = StObject.set(x, "showHideOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHideOpacityUndefined: Self = StObject.set(x, "showHideOpacity", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  /**
    * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
    */
  @js.native
  trait PhotoSwipe[T /* <: Options */] extends StObject {
    
    /**
      * Apply zoom and pan to the current slide
      *
      * @param   {number} `zoomLevel`
      * @param   {int}    `panX`
      * @param   {int}    `panY`
      *
      * For example: `pswp.applyZoomPan(1, 0, 0)`
      * will zoom current image to the original size
      * and will place it on top left corner.
      *
      */
    def applyZoomPan(zoomLevel: Double, panX: Double, panY: Double): Unit = js.native
    
    /**
      * The background element (with class .pswp__bg).
      */
    var bg: HTMLElement = js.native
    
    /**
      * Close gallery. Calls destroy() after closing.
      */
    def close(): Unit = js.native
    
    /**
      * The container element (with class .pswp__container).
      */
    var container: HTMLElement = js.native
    
    /**
      * Current slide object.
      */
    var currItem: Item = js.native
    
    /**
      * Destroy gallery (unbind listeners, free memory). Automatically called after close().
      */
    def destroy(): Unit = js.native
    
    /**
      * The Framework. Holds utility methods.
      */
    var framework: UIFramework = js.native
    
    /**
      * Current item index.
      */
    def getCurrentIndex(): Double = js.native
    
    /**
      * Current zoom level.
      */
    def getZoomLevel(): Double = js.native
    
    /**
      * Go to slide by index.
      */
    def goTo(index: Double): Unit = js.native
    
    /**
      * Initialize and open gallery (you can bind events before this method).
      */
    def init(): Unit = js.native
    
    /**
      * Call this method after dynamically modifying the current, next, or previous slide in the items array.
      */
    def invalidateCurrItems(): Unit = js.native
    
    /**
      * Whether one (or more) pointer is used.
      */
    def isDragging(): Boolean = js.native
    
    /**
      * true wehn transition between is running (after swipe).
      */
    def isMainScrollAnimating(): Boolean = js.native
    
    /**
      * Whether two (or more) pointers are used.
      */
    def isZooming(): Boolean = js.native
    
    /**
      * Items in this gallery. PhotoSwipe will (almost) dynamically respond to changes in this array.
      * To add, edit, or remove slides after PhotoSwipe is opened, you just need to modify the items array.
      *
      * For example, you can push new slide objects into the items array:
      *
      * pswp.items.push({
      *     src: "path/to/image.jpg",
      *     w:1200,
      *     h:500
      * });
      *
      * If you changed slide that is CURRENT, NEXT or PREVIOUS (which you should try to avoid) – you need to call method that will update their content:
      *
      * // sets a flag that slides should be updated
      * pswp.invalidateCurrItems();
      * // updates the content of slides
      * pswp.updateSize(true);
      *
      * If you're using the DefaultUI, call pswp.ui.update() to update that as well. Also note:
      *
      * (1) You can't reassign whole array, you can only modify it (e.g. use splice to remove elements).
      * (2) If you're going to remove current slide – call goTo method before.
      * (3) There must be at least one slide.
      * (4) This technique is used to serve responsive images.
      */
    var items: js.Array[Item] = js.native
    
    /**
      * PhotoSwipe uses very simple Event/Messaging system.
      * It has two methods shout (triggers event) and listen (handles event).
      * For now there is no method to unbind listener, but all of them are cleared when PhotoSwipe is closed.
      */
    def listen(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    /**
      * Called after slides change (after content has changed).
      */
    @JSName("listen")
    def listen_afterChange(eventName: afterChange, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called before slides change (before the content is changed ,but after navigation). Update UI here.
      */
    @JSName("listen")
    def listen_beforeChange(eventName: beforeChange, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called when the gallery starts closing.
      */
    @JSName("listen")
    def listen_close(eventName: close, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called after the gallery is closed and the closing animation finishes.
      * Clean up your stuff here.
      */
    @JSName("listen")
    def listen_destroy(eventName: destroy, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Triggers when PhotoSwipe reads slide object data, which happens before content is set, or before lazy-loading is initiated.
      * Use it to dynamically change properties of the slide object.
      */
    @JSName("listen")
    def listen_gettingData(eventName: gettingData, callback: js.Function2[/* index */ Double, /* item */ Item, Unit]): Unit = js.native
    /**
      * Called when an image is loaded.
      */
    @JSName("listen")
    def listen_imageLoadComplete(eventName: imageLoadComplete, callback: js.Function2[/* index */ Double, /* item */ Item, Unit]): Unit = js.native
    /**
      * Called when opening zoom in animation starting.
      */
    @JSName("listen")
    def listen_initialZoomIn(eventName: initialZoomIn, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called when opening zoom in animation finished.
      */
    @JSName("listen")
    def listen_initialZoomInEnd(eventName: initialZoomInEnd, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called when closing zoom out animation started.
      */
    @JSName("listen")
    def listen_initialZoomOut(eventName: initialZoomOut, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called when closing zoom out animation finished.
      */
    @JSName("listen")
    def listen_initialZoomOutEnd(eventName: initialZoomOutEnd, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Called when mouse is first used (triggers only once).
      */
    @JSName("listen")
    def listen_mouseUsed(eventName: mouseUsed, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Allows overriding vertical margin for individual items.
      *
      * Example:
      *
      * pswp.listen('parseVerticalMargin', function(item) {
      *     var gap = item.vGap;
      *
      *     gap.top = 50; // There will be 50px gap from top of viewport
      *     gap.bottom = 100; // and 100px gap from the bottom
      * });
      */
    @JSName("listen")
    def listen_parseVerticalMargin(eventName: parseVerticalMargin, callback: js.Function1[/* item */ Item, Unit]): Unit = js.native
    /**
      * Allow to call preventDefault on down and up events.
      */
    @JSName("listen")
    def listen_preventDragEvent(
      eventName: preventDragEvent,
      callback: js.Function3[/* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent, Unit]
    ): Unit = js.native
    /**
      * Called when the viewport size changes.
      */
    @JSName("listen")
    def listen_resize(eventName: resize, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Gallery unbinds events (triggers before closing animation).
      */
    @JSName("listen")
    def listen_unbindEvents(eventName: unbindEvents, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Go to the next slide.
      */
    def next(): Unit = js.native
    
    /**
      * Options for this PhotoSwipe. This object is a copy of the options parameter passed into the constructor.
      * Some properties in options are dynamically modifiable.
      */
    var options: T = js.native
    
    /**
      * Go to the previous slide.
      */
    def prev(): Unit = js.native
    
    /**
      * Triggers eventName event with args passed through to listeners.
      */
    def shout(eventName: String, args: js.Any*): Unit = js.native
    
    /**
      * The ui instance constructed by PhotoSwipe.
      */
    var ui: UI[T] = js.native
    
    /**
      * Update gallery size
      * @param  {boolean} `force` If you set it to `true`, size of the gallery will be updated even if viewport size hasn't changed.
      */
    def updateSize(force: Boolean): Unit = js.native
    
    /**
      * Size of the current viewport.
      */
    var viewportSize: X = js.native
    
    /**
      * Zoom in/out the current slide to a specified zoom level, optionally with animation.
      *
      * @param  {number}   `destZoomLevel` Destination scale number. Set to 1 for unzoomed.
      *                                    Use `pswp.currItem.fitRatio - image` to zoom the image to perfectly fit into the viewport.
      * @param  {object}   `centerPoint`   The center of the zoom, relative to viewport.
      * @param  {number}   `speed`         Animation duration in milliseconds. Can be 0.
      * @param  {function} `easingFn`      Easing function (optional). Set to false to use default easing.
      *                                    This method is passed in the percentage that the animation is finished (from 0 to 1) and should return an eased value (which should be 0 at the start and 1 at the end).
      * @param  {function} `updateFn`      Function will be called on each update frame (optional).
      *                                    This method is passed the eased zoom level.
      *
      * Example below will 2x zoom to center of slide:
      *
      * pswp.zoomTo(2, {x:pswp.viewportSize.x/2,y:pswp.viewportSize.y/2}, 2000, false, function(now) {});
      *
      */
    def zoomTo(destZoomLevel: Double, centerPoint: X, speed: Double): Unit = js.native
    def zoomTo(
      destZoomLevel: Double,
      centerPoint: X,
      speed: Double,
      easingFn: js.UndefOr[scala.Nothing],
      updateFn: js.Function1[/* now */ Double, Unit]
    ): Unit = js.native
    def zoomTo(
      destZoomLevel: Double,
      centerPoint: X,
      speed: Double,
      easingFn: js.Function1[/* k */ Double, Double]
    ): Unit = js.native
    def zoomTo(
      destZoomLevel: Double,
      centerPoint: X,
      speed: Double,
      easingFn: js.Function1[/* k */ Double, Double],
      updateFn: js.Function1[/* now */ Double, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait UI[T /* <: Options */] extends StObject {
    
    /**
      * Called by PhotoSwipe after it constructs the UI.
      */
    def init(): Unit = js.native
  }
  object UI {
    
    @scala.inline
    def apply[T /* <: Options */](init: () => Unit): UI[T] = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
      __obj.asInstanceOf[UI[T]]
    }
    
    @scala.inline
    implicit class UIMutableBuilder[Self <: UI[_], T /* <: Options */] (val x: Self with UI[T]) extends AnyVal {
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  type UIFramework = StringDictionary[js.Any]
}
