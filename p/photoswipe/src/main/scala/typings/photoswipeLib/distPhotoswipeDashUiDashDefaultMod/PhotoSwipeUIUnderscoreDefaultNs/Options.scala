package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod.PhotoSwipeUIUnderscoreDefaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends photoswipeLib.photoswipeMod.PhotoSwipeNs.Options {
  /**
    * Function to build caption markup. The function takes three parameters:
    *
    * item      - slide object
    * captionEl - caption DOM element
    * isFake    - true when content is added to fake caption container
    *             (used to get size of next or previous caption)
    *
    * Return whether to show the caption or not.
    *
    * Default is:
    *
    * function(item, captionEl, isFake) {
    *     if(!item.title) {
    *         captionEl.children[0].innerHTML = '';
    *         return false;
    *     }
    *     captionEl.children[0].innerHTML = item.title;
    *     return true;
    * }
    *
    */
  var addCaptionHTMLFn: js.UndefOr[
    js.Function3[
      /* item */ Item, 
      /* captionEl */ stdLib.HTMLElement, 
      /* isFake */ scala.Boolean, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Whether to show the left/right directional arrows.
    *
    * Default true.
    */
  var arrowEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of top & bottom bars in pixels. "bottom" parameter can be 'auto' (will calculate height of caption).
    * Option applies only when mouse is used, or when width of screen is more than 1200px.
    * Also look at `parseVerticalMargin` event.
    *
    * Default {top: 44, bottom: "auto"}.
    */
  var barsSize: js.UndefOr[photoswipeLib.Anon_BottomTop] = js.undefined
  /**
    * Whether to show the caption.
    *
    * Default true.
    */
  var captionEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Mouse click on image should close the gallery, only when image is smaller than size of the viewport.
    *
    * Default true.
    */
  var clickToCloseNonZoomable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the close button.
    *
    * Default true.
    */
  var closeEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Element classes that should close PhotoSwipe when clicked on.
    * In HTML markup, class should always start with "pswp__", e.g.: "pswp__item", "pswp__caption".
    *
    * "pswp__ui--over-close" class will be added to root element of UI when mouse is over one of these elements
    * By default it's used to highlight the close button.
    *
    * Default ['item', 'caption', 'zoom-wrap', 'ui', 'top-bar'].
    */
  var closeElClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether to show the current image's index in the gallery (located in top-left corner by default).
    *
    * Default true.
    */
  var counterEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the fullscreen button.
    *
    * Default true.
    */
  var fullscreenEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback that should return the URL for the currently selected image. The callback is passed
    * the shareButtonData entry that was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     // `shareButtonData` - object from shareButtons array
    *     //
    *     // `pswp` is the gallery instance object,
    *     // you should define it by yourself
    *     //
    *     return pswp.currItem.src || '';
    * }
    *
    */
  var getImageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * A callback that should return the "Page" associated with the selected image. (e.g. on Facebook, the shared
    * content will be associated with the returned page). The callback is passed the shareButtonData entry that
    * was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     return window.location.href;
    * }
    *
    */
  var getPageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * A callback that should return the Text associated with the selected image. The callback is passed
    * the shareButtonData entry that was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     return pswp.currItem.title || '';
    * }
    *
    */
  var getTextForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * Separator for "1 of X" counter.
    *
    * Default ' / '.
    */
  var indexIndicatorSep: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delay in milliseconds until loading indicator is displayed.
    *
    * Default 1000.
    */
  var loadingIndicatorDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * A final output callback that you can use to further modify the share button's HTML. The callback is passed
    * (1) the shareButtonData entry being generated, and (2) the default HTML generated by PhotoSwipUI_Default.
    *
    * Default is:
    *
    * function(shareButtonData, shareButtonOut) {
    *     return shareButtonOut;
    * }
    *
    */
  var parseShareButtonOut: js.UndefOr[
    js.Function2[
      /* shareButtonData */ ShareButtonData, 
      /* shareButtonOut */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Whether to show the preloader element.
    *
    * Default true.
    */
  var preloaderEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The entries that show up when you click the Share button.
    *
    * Default is:
    *
    * [
    *     {id:'facebook', label:'Share on Facebook', url:'https://www.facebook.com/sharer/sharer.php?u='},
    *     {id:'twitter', label:'Tweet', url:'https://twitter.com/intent/tweet?text=&url='},
    *     {id:'pinterest', label:'Pin it', url:'http://www.pinterest.com/pin/create/button/?url=&media=&description='},
    *     {id:'download', label:'Download image', url:'', download:true}
    * ]
    *
    */
  var shareButtons: js.UndefOr[js.Array[ShareButtonData]] = js.undefined
  /**
    * Whether to show the share button.
    *
    * Default true.
    */
  var shareEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tap on sliding area should close gallery.
    *
    * Default false.
    */
  var tapToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tap should toggle visibility of controls.
    *
    * Default true.
    */
  var tapToToggleControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds class pswp__ui--idle to pswp__ui element when mouse isn't moving for timeToIdle milliseconds.
    *
    * Default 4000.
    */
  var timeToIdle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Adds class pswp__ui--idle to pswp__ui element when mouse leaves the window for timeToIdleOutside milliseconds.
    *
    * Default 1000.
    */
  var timeToIdleOutside: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show the zoom button.
    *
    * Default true.
    */
  var zoomEl: js.UndefOr[scala.Boolean] = js.undefined
}

