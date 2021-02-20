package typings.photoswipe

import typings.photoswipe.anon.Bottom
import typings.photoswipe.mod.UI
import typings.photoswipe.mod.UIFramework
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoswipeUiDefaultMod {
  
  /**
    * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
    */
  @JSImport("photoswipe/dist/photoswipe-ui-default", JSImport.Namespace)
  @js.native
  class ^ protected () extends PhotoSwipeUIDefault {
    def this(pswp: typings.photoswipe.mod.^[Options], framework: UIFramework) = this()
  }
  
  @js.native
  trait Item
    extends typings.photoswipe.mod.Item {
    
    /**
      * The caption for this item.
      */
    var title: js.UndefOr[String] = js.native
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
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Options
    extends typings.photoswipe.mod.Options {
    
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
        js.Function3[/* item */ Item, /* captionEl */ HTMLElement, /* isFake */ Boolean, Boolean]
      ] = js.native
    
    /**
      * Whether to show the left/right directional arrows.
      *
      * Default true.
      */
    var arrowEl: js.UndefOr[Boolean] = js.native
    
    /**
      * Size of top & bottom bars in pixels. "bottom" parameter can be 'auto' (will calculate height of caption).
      * Option applies only when mouse is used, or when width of screen is more than 1200px.
      * Also look at `parseVerticalMargin` event.
      *
      * Default {top: 44, bottom: "auto"}.
      */
    var barsSize: js.UndefOr[Bottom] = js.native
    
    /**
      * Whether to show the caption.
      *
      * Default true.
      */
    var captionEl: js.UndefOr[Boolean] = js.native
    
    /**
      * Mouse click on image should close the gallery, only when image is smaller than size of the viewport.
      *
      * Default true.
      */
    var clickToCloseNonZoomable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to show the close button.
      *
      * Default true.
      */
    var closeEl: js.UndefOr[Boolean] = js.native
    
    /**
      * Element classes that should close PhotoSwipe when clicked on.
      * In HTML markup, class should always start with "pswp__", e.g.: "pswp__item", "pswp__caption".
      *
      * "pswp__ui--over-close" class will be added to root element of UI when mouse is over one of these elements
      * By default it's used to highlight the close button.
      *
      * Default ['item', 'caption', 'zoom-wrap', 'ui', 'top-bar'].
      */
    var closeElClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether to show the current image's index in the gallery (located in top-left corner by default).
      *
      * Default true.
      */
    var counterEl: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to show the fullscreen button.
      *
      * Default true.
      */
    var fullscreenEl: js.UndefOr[Boolean] = js.native
    
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
    var getImageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.native
    
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
    var getPageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.native
    
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
    var getTextForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.native
    
    /**
      * Separator for "1 of X" counter.
      *
      * Default ' / '.
      */
    var indexIndicatorSep: js.UndefOr[String] = js.native
    
    /**
      * Delay in milliseconds until loading indicator is displayed.
      *
      * Default 1000.
      */
    var loadingIndicatorDelay: js.UndefOr[Double] = js.native
    
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
        js.Function2[/* shareButtonData */ ShareButtonData, /* shareButtonOut */ String, String]
      ] = js.native
    
    /**
      * Whether to show the preloader element.
      *
      * Default true.
      */
    var preloaderEl: js.UndefOr[Boolean] = js.native
    
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
    var shareButtons: js.UndefOr[js.Array[ShareButtonData]] = js.native
    
    /**
      * Whether to show the share button.
      *
      * Default true.
      */
    var shareEl: js.UndefOr[Boolean] = js.native
    
    /**
      * Tap on sliding area should close gallery.
      *
      * Default false.
      */
    var tapToClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Tap should toggle visibility of controls.
      *
      * Default true.
      */
    var tapToToggleControls: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds class pswp__ui--idle to pswp__ui element when mouse isn't moving for timeToIdle milliseconds.
      *
      * Default 4000.
      */
    var timeToIdle: js.UndefOr[Double] = js.native
    
    /**
      * Adds class pswp__ui--idle to pswp__ui element when mouse leaves the window for timeToIdleOutside milliseconds.
      *
      * Default 1000.
      */
    var timeToIdleOutside: js.UndefOr[Double] = js.native
    
    /**
      * Whether to show the zoom button.
      *
      * Default true.
      */
    var zoomEl: js.UndefOr[Boolean] = js.native
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
      def setAddCaptionHTMLFn(value: (/* item */ Item, /* captionEl */ HTMLElement, /* isFake */ Boolean) => Boolean): Self = StObject.set(x, "addCaptionHTMLFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddCaptionHTMLFnUndefined: Self = StObject.set(x, "addCaptionHTMLFn", js.undefined)
      
      @scala.inline
      def setArrowEl(value: Boolean): Self = StObject.set(x, "arrowEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowElUndefined: Self = StObject.set(x, "arrowEl", js.undefined)
      
      @scala.inline
      def setBarsSize(value: Bottom): Self = StObject.set(x, "barsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarsSizeUndefined: Self = StObject.set(x, "barsSize", js.undefined)
      
      @scala.inline
      def setCaptionEl(value: Boolean): Self = StObject.set(x, "captionEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElUndefined: Self = StObject.set(x, "captionEl", js.undefined)
      
      @scala.inline
      def setClickToCloseNonZoomable(value: Boolean): Self = StObject.set(x, "clickToCloseNonZoomable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickToCloseNonZoomableUndefined: Self = StObject.set(x, "clickToCloseNonZoomable", js.undefined)
      
      @scala.inline
      def setCloseEl(value: Boolean): Self = StObject.set(x, "closeEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseElClasses(value: js.Array[String]): Self = StObject.set(x, "closeElClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseElClassesUndefined: Self = StObject.set(x, "closeElClasses", js.undefined)
      
      @scala.inline
      def setCloseElClassesVarargs(value: String*): Self = StObject.set(x, "closeElClasses", js.Array(value :_*))
      
      @scala.inline
      def setCloseElUndefined: Self = StObject.set(x, "closeEl", js.undefined)
      
      @scala.inline
      def setCounterEl(value: Boolean): Self = StObject.set(x, "counterEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterElUndefined: Self = StObject.set(x, "counterEl", js.undefined)
      
      @scala.inline
      def setFullscreenEl(value: Boolean): Self = StObject.set(x, "fullscreenEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenElUndefined: Self = StObject.set(x, "fullscreenEl", js.undefined)
      
      @scala.inline
      def setGetImageURLForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getImageURLForShare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetImageURLForShareUndefined: Self = StObject.set(x, "getImageURLForShare", js.undefined)
      
      @scala.inline
      def setGetPageURLForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getPageURLForShare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageURLForShareUndefined: Self = StObject.set(x, "getPageURLForShare", js.undefined)
      
      @scala.inline
      def setGetTextForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getTextForShare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTextForShareUndefined: Self = StObject.set(x, "getTextForShare", js.undefined)
      
      @scala.inline
      def setIndexIndicatorSep(value: String): Self = StObject.set(x, "indexIndicatorSep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexIndicatorSepUndefined: Self = StObject.set(x, "indexIndicatorSep", js.undefined)
      
      @scala.inline
      def setLoadingIndicatorDelay(value: Double): Self = StObject.set(x, "loadingIndicatorDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIndicatorDelayUndefined: Self = StObject.set(x, "loadingIndicatorDelay", js.undefined)
      
      @scala.inline
      def setParseShareButtonOut(value: (/* shareButtonData */ ShareButtonData, /* shareButtonOut */ String) => String): Self = StObject.set(x, "parseShareButtonOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseShareButtonOutUndefined: Self = StObject.set(x, "parseShareButtonOut", js.undefined)
      
      @scala.inline
      def setPreloaderEl(value: Boolean): Self = StObject.set(x, "preloaderEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloaderElUndefined: Self = StObject.set(x, "preloaderEl", js.undefined)
      
      @scala.inline
      def setShareButtons(value: js.Array[ShareButtonData]): Self = StObject.set(x, "shareButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareButtonsUndefined: Self = StObject.set(x, "shareButtons", js.undefined)
      
      @scala.inline
      def setShareButtonsVarargs(value: ShareButtonData*): Self = StObject.set(x, "shareButtons", js.Array(value :_*))
      
      @scala.inline
      def setShareEl(value: Boolean): Self = StObject.set(x, "shareEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareElUndefined: Self = StObject.set(x, "shareEl", js.undefined)
      
      @scala.inline
      def setTapToClose(value: Boolean): Self = StObject.set(x, "tapToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapToCloseUndefined: Self = StObject.set(x, "tapToClose", js.undefined)
      
      @scala.inline
      def setTapToToggleControls(value: Boolean): Self = StObject.set(x, "tapToToggleControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapToToggleControlsUndefined: Self = StObject.set(x, "tapToToggleControls", js.undefined)
      
      @scala.inline
      def setTimeToIdle(value: Double): Self = StObject.set(x, "timeToIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToIdleOutside(value: Double): Self = StObject.set(x, "timeToIdleOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToIdleOutsideUndefined: Self = StObject.set(x, "timeToIdleOutside", js.undefined)
      
      @scala.inline
      def setTimeToIdleUndefined: Self = StObject.set(x, "timeToIdle", js.undefined)
      
      @scala.inline
      def setZoomEl(value: Boolean): Self = StObject.set(x, "zoomEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomElUndefined: Self = StObject.set(x, "zoomEl", js.undefined)
    }
  }
  
  /**
    * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
    */
  @js.native
  trait PhotoSwipeUIDefault extends UI[Options] {
    
    /**
      * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
      */
    def update(): Unit = js.native
  }
  object PhotoSwipeUIDefault {
    
    @scala.inline
    def apply(init: () => Unit, update: () => Unit): PhotoSwipeUIDefault = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PhotoSwipeUIDefault]
    }
    
    @scala.inline
    implicit class PhotoSwipeUIDefaultMutableBuilder[Self <: PhotoSwipeUIDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ShareButtonData extends StObject {
    
    /**
      * Whether this link is a direct download button or not.
      *
      * Default false.
      */
    var download: js.UndefOr[Boolean] = js.native
    
    /**
      * An id for this share button entry. The share element associated with this entry will be classed with
      * 'pswp__share--' + id
      */
    var id: String = js.native
    
    /**
      * The user-visible text to display for this entry.
      */
    var label: String = js.native
    
    /**
      * The full sharing endpoint URL for this social media site (e.g. Facebook's is facebook.com/sharer/sharer.php), with URL parameters.
      * PhotoSwipUI_Default treats the URL specially. In the url string, any of the following text is treated specially:
      * '{{url}}', '{{image_url}}, '{{raw_image_url}}, '{{text}}'. PhotoSwipeUI_Default will replace each of them with the following value:
      *
      * {{url}} becomes the (URIEncoded) url to the current "Page" (as returned by getPageURLForShare).
      * {{image_url}} becomes the (URIEncoded) url of the selected image (as returned by getImageURLForShare).
      * {{raw_image_url}} becomes the raw url of the selected image (as returned by getImageURLForShare).
      * {{text}} becomes the (URIEncoded) share text of the selected image (as returned by getTextForShare).
      */
    var url: String = js.native
  }
  object ShareButtonData {
    
    @scala.inline
    def apply(id: String, label: String, url: String): ShareButtonData = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareButtonData]
    }
    
    @scala.inline
    implicit class ShareButtonDataMutableBuilder[Self <: ShareButtonData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
