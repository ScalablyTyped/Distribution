package typings
package photoswipeLib.photoswipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Allow swipe navigation to next/prev item when current item is zoomed.
    * Option is always false on devices that don't have hardware touch support.
    *
    * Default true.
    */
  var allowNoPanText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Keyboard left or right arrow key navigation. Option can be changed dynamically (yourPhotoSwipeInstance.options.arrowKeys = false;).
    *
    * Default true.
    */
  var arrowKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Background (.pswp__bg) opacity.
    * Should be a number from 0 to 1, e.g. 0.7.
    * This style is defined via JS, not via CSS, as this value is used for a few gesture-based transitions.
    *
    * Default 1.
    */
  var bgOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Close gallery on page scroll. Option works just for devices without hardware touch support.
    *
    * Default true.
    */
  var closeOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Close gallery when dragging vertically and when image is not zoomed. Always false when mouse is used.
    *
    * Default true.
    */
  var closeOnVerticalDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Error message when image was not loaded. %url% will be replaced by URL of image.
    *
    * Default is:
    *
    * <div class="pswp__error-msg"><a href="%url%" target="_blank">The image</a> could not be loaded.</div>
    */
  var errorMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * esc keyboard key to close PhotoSwipe. Option can be changed dynamically (yourPhotoSwipeInstance.options.escKey = false;).
    *
    * Default true.
    */
  var escKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will set focus on PhotoSwipe element after it's open.
    *
    * Default true.
    */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Gallery unique ID. Used by History module when forming URL. For example, second picture of gallery with UID 1 will have URL: http://example.com/#&gid=1&pid=2.
    *
    * Default 1.
    */
  var galleryUID: js.UndefOr[scala.Double] = js.undefined
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
  var getDoubleTapZoom: js.UndefOr[js.Function2[/* isMouseClick */ scala.Boolean, /* item */ Item, scala.Double]] = js.undefined
  /**
    * Function that should return total number of items in gallery. Don't put very complex code here, function is executed very often.
    *
    * By default it returns length of slides array.
    */
  var getNumItemsFn: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /**
    * Function should return an object with coordinates from which initial zoom-in animation will start (or zoom-out animation will end).
    * Object should contain three properties: x (X position, relative to document), y (Y position, relative to document), w (width of the element).
    * Height will be calculated automatically based on size of large image.
    * For example if you return {x:0,y:0,w:50} zoom animation will start in top left corner of your page.
    * Function has one argument - index of the item that is opening or closing.
    *
    * Default undefined.
    */
  var getThumbBoundsFn: js.UndefOr[js.Function1[/* index */ scala.Double, photoswipeLib.Anon_W]] = js.undefined
  /**
    * The same as the previous option, just for closing (zoom-out) transition.
    * After PhotoSwipe is opened pswp--open class will be added to the root element, you may use it to apply different transition duration in CSS.
    *
    * Default 333.
    */
  var hideAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to false disables history module (back button to close gallery, unique URL for each slide). You can also just exclude history.js module from your build.
    *
    * Default true.
    */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Start slide index. 0 is the first slide. Must be integer, not a string.
    *
    * Default 0.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
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
  var isClickableElement: js.UndefOr[js.Function1[/* el */ stdLib.HTMLElement, scala.Boolean]] = js.undefined
  /**
    * Loop slides when using swipe gesture.If set to true you'll be able to swipe from last to first image.
    * Option is always false when there are less than 3 slides.
    * This option has no relation to arrows navigation. Arrows loop is turned on permanently. You can modify this behavior by making custom UI.
    *
    * Default true.
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String with name of class that will be added to root element of PhotoSwipe (.pswp). Can contain multiple classes separated by space.
    */
  var mainClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * NOTE: this property will be ignored in future versions of PhotoSwipe.
    *
    * @deprecated
    */
  var mainScrollEndFriction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum zoom level when performing spread (zoom) gesture. 2 means that image can be zoomed 2x from original size.
    * Try to avoid huge values here, as too big image may cause memory issues on mobile (especially on iOS).
    *
    * Default 2.
    */
  var maxSpreadZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls whether PhotoSwipe should expand to take up the entire viewport.
    * If false, the PhotoSwipe element will take the size of the positioned parent of the template. Take a look at the FAQ for more
    * information.
    */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Option allows you to predefine if mouse was used or not.
    * Some PhotoSwipe feature depend on it, for example default UI left/right arrows will be displayed only after mouse is used.
    * If set to false, PhotoSwipe will start detecting when mouse is used by itself, mouseUsed event triggers when mouse is found.
    *
    * default false.
    */
  var mouseUsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * NOTE: this property will be ignored in future versions of PhotoSwipe.
    *
    * @deprecated
    */
  var panEndFriction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pinch to close gallery gesture. The gallery’s background will gradually fade out as the user zooms out. When the gesture is complete, the gallery will close.
    *
    * Default true.
    */
  var pinchToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Lazy loading of nearby slides based on direction of movement.
    * Should be an array with two integers, first one - number of items to preload before current image, second one - after the current image.
    * E.g. if you set it to [1,3], it'll load 1 image before the current, and 3 images after current. Values can not be less than 1.
    *
    * Default [1, 1].
    */
  var preload: js.UndefOr[js.Array[scala.Double]] = js.undefined
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
  var showAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to false background opacity and image scale will be animated (image opacity is always 1).
    * If set to true root PhotoSwipe element opacity and image scale will be animated.
    * Enable it when dimensions of your small thumbnail don't match dimensions of large image.
    *
    * Default false.
    */
  var showHideOpacity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Spacing ratio between slides. For example, 0.12 will render as a 12% of sliding viewport width (rounded).
    *
    * Default 0.12.
    */
  var spacing: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowNoPanText: js.UndefOr[scala.Boolean] = js.undefined,
    arrowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    bgOpacity: scala.Int | scala.Double = null,
    closeOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnVerticalDrag: js.UndefOr[scala.Boolean] = js.undefined,
    errorMsg: java.lang.String = null,
    escKey: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    galleryUID: scala.Int | scala.Double = null,
    getDoubleTapZoom: (/* isMouseClick */ scala.Boolean, /* item */ Item) => scala.Double = null,
    getNumItemsFn: () => scala.Double = null,
    getThumbBoundsFn: /* index */ scala.Double => photoswipeLib.Anon_W = null,
    hideAnimationDuration: scala.Int | scala.Double = null,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    isClickableElement: /* el */ stdLib.HTMLElement => scala.Boolean = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mainClass: java.lang.String = null,
    mainScrollEndFriction: scala.Int | scala.Double = null,
    maxSpreadZoom: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    mouseUsed: js.UndefOr[scala.Boolean] = js.undefined,
    panEndFriction: scala.Int | scala.Double = null,
    pinchToClose: js.UndefOr[scala.Boolean] = js.undefined,
    preload: js.Array[scala.Double] = null,
    showAnimationDuration: scala.Int | scala.Double = null,
    showHideOpacity: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoPanText)) __obj.updateDynamic("allowNoPanText")(allowNoPanText)
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys)
    if (bgOpacity != null) __obj.updateDynamic("bgOpacity")(bgOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnScroll)) __obj.updateDynamic("closeOnScroll")(closeOnScroll)
    if (!js.isUndefined(closeOnVerticalDrag)) __obj.updateDynamic("closeOnVerticalDrag")(closeOnVerticalDrag)
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg)
    if (!js.isUndefined(escKey)) __obj.updateDynamic("escKey")(escKey)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (galleryUID != null) __obj.updateDynamic("galleryUID")(galleryUID.asInstanceOf[js.Any])
    if (getDoubleTapZoom != null) __obj.updateDynamic("getDoubleTapZoom")(js.Any.fromFunction2(getDoubleTapZoom))
    if (getNumItemsFn != null) __obj.updateDynamic("getNumItemsFn")(js.Any.fromFunction0(getNumItemsFn))
    if (getThumbBoundsFn != null) __obj.updateDynamic("getThumbBoundsFn")(js.Any.fromFunction1(getThumbBoundsFn))
    if (hideAnimationDuration != null) __obj.updateDynamic("hideAnimationDuration")(hideAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (isClickableElement != null) __obj.updateDynamic("isClickableElement")(js.Any.fromFunction1(isClickableElement))
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (mainScrollEndFriction != null) __obj.updateDynamic("mainScrollEndFriction")(mainScrollEndFriction.asInstanceOf[js.Any])
    if (maxSpreadZoom != null) __obj.updateDynamic("maxSpreadZoom")(maxSpreadZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(mouseUsed)) __obj.updateDynamic("mouseUsed")(mouseUsed)
    if (panEndFriction != null) __obj.updateDynamic("panEndFriction")(panEndFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchToClose)) __obj.updateDynamic("pinchToClose")(pinchToClose)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (showAnimationDuration != null) __obj.updateDynamic("showAnimationDuration")(showAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(showHideOpacity)) __obj.updateDynamic("showHideOpacity")(showHideOpacity)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

