package typings.photoswipe.mod

import typings.photoswipe.anon.W
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowNoPanText(value: Boolean): Self = this.set("allowNoPanText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNoPanText: Self = this.set("allowNoPanText", js.undefined)
    
    @scala.inline
    def setArrowKeys(value: Boolean): Self = this.set("arrowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowKeys: Self = this.set("arrowKeys", js.undefined)
    
    @scala.inline
    def setBgOpacity(value: Double): Self = this.set("bgOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgOpacity: Self = this.set("bgOpacity", js.undefined)
    
    @scala.inline
    def setCloseOnScroll(value: Boolean): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    
    @scala.inline
    def setCloseOnVerticalDrag(value: Boolean): Self = this.set("closeOnVerticalDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnVerticalDrag: Self = this.set("closeOnVerticalDrag", js.undefined)
    
    @scala.inline
    def setErrorMsg(value: String): Self = this.set("errorMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMsg: Self = this.set("errorMsg", js.undefined)
    
    @scala.inline
    def setEscKey(value: Boolean): Self = this.set("escKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscKey: Self = this.set("escKey", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setGalleryUID(value: Double): Self = this.set("galleryUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGalleryUID: Self = this.set("galleryUID", js.undefined)
    
    @scala.inline
    def setGetDoubleTapZoom(value: (/* isMouseClick */ Boolean, /* item */ Item) => Double): Self = this.set("getDoubleTapZoom", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetDoubleTapZoom: Self = this.set("getDoubleTapZoom", js.undefined)
    
    @scala.inline
    def setGetNumItemsFn(value: () => Double): Self = this.set("getNumItemsFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNumItemsFn: Self = this.set("getNumItemsFn", js.undefined)
    
    @scala.inline
    def setGetThumbBoundsFn(value: /* index */ Double => W): Self = this.set("getThumbBoundsFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetThumbBoundsFn: Self = this.set("getThumbBoundsFn", js.undefined)
    
    @scala.inline
    def setHideAnimationDuration(value: Double): Self = this.set("hideAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAnimationDuration: Self = this.set("hideAnimationDuration", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIsClickableElement(value: /* el */ HTMLElement => Boolean): Self = this.set("isClickableElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsClickableElement: Self = this.set("isClickableElement", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = this.set("mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("mainClass", js.undefined)
    
    @scala.inline
    def setMainScrollEndFriction(value: Double): Self = this.set("mainScrollEndFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainScrollEndFriction: Self = this.set("mainScrollEndFriction", js.undefined)
    
    @scala.inline
    def setMaxSpreadZoom(value: Double): Self = this.set("maxSpreadZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSpreadZoom: Self = this.set("maxSpreadZoom", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMouseUsed(value: Boolean): Self = this.set("mouseUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseUsed: Self = this.set("mouseUsed", js.undefined)
    
    @scala.inline
    def setPanEndFriction(value: Double): Self = this.set("panEndFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanEndFriction: Self = this.set("panEndFriction", js.undefined)
    
    @scala.inline
    def setPinchToClose(value: Boolean): Self = this.set("pinchToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinchToClose: Self = this.set("pinchToClose", js.undefined)
    
    @scala.inline
    def setPreloadVarargs(value: Double*): Self = this.set("preload", js.Array(value :_*))
    
    @scala.inline
    def setPreload(value: js.Array[Double]): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setShowAnimationDuration(value: Double): Self = this.set("showAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAnimationDuration: Self = this.set("showAnimationDuration", js.undefined)
    
    @scala.inline
    def setShowHideOpacity(value: Boolean): Self = this.set("showHideOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHideOpacity: Self = this.set("showHideOpacity", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
