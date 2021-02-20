package typings.owlCarousel

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OwlCarousel {
  
  type HandlerCallback = js.Function1[/* repeated */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.owlCarousel.owlCarouselStrings.initializeDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.initializedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.resizeDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.resizedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.refreshedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.dragDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.draggedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.translateDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.translatedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.changeDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.changedDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.loadDotowlDotlazy
    - typings.owlCarousel.owlCarouselStrings.loadedDotowlDotlazy
    - typings.owlCarousel.owlCarouselStrings.stopDotowlDotvideo
    - typings.owlCarousel.owlCarouselStrings.playDotowlDotvideo
  */
  trait OnEvent extends StObject
  object OnEvent {
    
    @scala.inline
    def changeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.changeDotowlDotcarousel = "change.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.changeDotowlDotcarousel]
    
    @scala.inline
    def changedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.changedDotowlDotcarousel = "changed.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.changedDotowlDotcarousel]
    
    @scala.inline
    def dragDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.dragDotowlDotcarousel = "drag.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.dragDotowlDotcarousel]
    
    @scala.inline
    def draggedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.draggedDotowlDotcarousel = "dragged.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.draggedDotowlDotcarousel]
    
    @scala.inline
    def initializeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.initializeDotowlDotcarousel = "initialize.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.initializeDotowlDotcarousel]
    
    @scala.inline
    def initializedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.initializedDotowlDotcarousel = "initialized.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.initializedDotowlDotcarousel]
    
    @scala.inline
    def loadDotowlDotlazy: typings.owlCarousel.owlCarouselStrings.loadDotowlDotlazy = "load.owl.lazy".asInstanceOf[typings.owlCarousel.owlCarouselStrings.loadDotowlDotlazy]
    
    @scala.inline
    def loadedDotowlDotlazy: typings.owlCarousel.owlCarouselStrings.loadedDotowlDotlazy = "loaded.owl.lazy".asInstanceOf[typings.owlCarousel.owlCarouselStrings.loadedDotowlDotlazy]
    
    @scala.inline
    def playDotowlDotvideo: typings.owlCarousel.owlCarouselStrings.playDotowlDotvideo = "play.owl.video".asInstanceOf[typings.owlCarousel.owlCarouselStrings.playDotowlDotvideo]
    
    @scala.inline
    def refreshDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel = "refresh.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel]
    
    @scala.inline
    def refreshedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshedDotowlDotcarousel = "refreshed.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshedDotowlDotcarousel]
    
    @scala.inline
    def resizeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.resizeDotowlDotcarousel = "resize.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.resizeDotowlDotcarousel]
    
    @scala.inline
    def resizedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.resizedDotowlDotcarousel = "resized.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.resizedDotowlDotcarousel]
    
    @scala.inline
    def stopDotowlDotvideo: typings.owlCarousel.owlCarouselStrings.stopDotowlDotvideo = "stop.owl.video".asInstanceOf[typings.owlCarousel.owlCarouselStrings.stopDotowlDotvideo]
    
    @scala.inline
    def translateDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.translateDotowlDotcarousel = "translate.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.translateDotowlDotcarousel]
    
    @scala.inline
    def translatedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.translatedDotowlDotcarousel = "translated.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.translatedDotowlDotcarousel]
  }
  
  @js.native
  trait Options extends StObject {
    
    var URLhashListener: js.UndefOr[Boolean] = js.native
    
    var animateIn: js.UndefOr[String | Boolean] = js.native
    
    var animateOut: js.UndefOr[String | Boolean] = js.native
    
    var autoHeight: js.UndefOr[Boolean] = js.native
    
    var autoHeightClass: js.UndefOr[String] = js.native
    
    var autoWidth: js.UndefOr[Boolean] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var autoplayHoverPause: js.UndefOr[Boolean] = js.native
    
    var autoplaySpeed: js.UndefOr[Double | Boolean] = js.native
    
    var autoplayTimeout: js.UndefOr[Double] = js.native
    
    var callbacks: js.UndefOr[Boolean] = js.native
    
    var center: js.UndefOr[Boolean] = js.native
    
    var checkVisible: js.UndefOr[Boolean] = js.native
    
    var controlsClass: js.UndefOr[String] = js.native
    
    var dotClass: js.UndefOr[String] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var dotsClass: js.UndefOr[String] = js.native
    
    var dotsContainer: js.UndefOr[String | Boolean] = js.native
    
    var dotsData: js.UndefOr[Boolean] = js.native
    
    var dotsEach: js.UndefOr[Double | Boolean] = js.native
    
    var dotsSpeed: js.UndefOr[Double | Boolean] = js.native
    
    var dragClass: js.UndefOr[String] = js.native
    
    var dragEndSpeed: js.UndefOr[Double | Boolean] = js.native
    
    var fallbackEasing: js.UndefOr[String] = js.native
    
    var fluidSpeed: js.UndefOr[Double | Boolean] = js.native
    
    var freeDrag: js.UndefOr[Boolean] = js.native
    
    var grabClass: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[HandlerCallback] = js.native
    
    var itemElement: js.UndefOr[String] = js.native
    
    // OPTIONS
    var items: js.UndefOr[Double] = js.native
    
    var lazyLoad: js.UndefOr[Boolean] = js.native
    
    var lazyLoadEager: js.UndefOr[Double] = js.native
    
    var loadedClass: js.UndefOr[String] = js.native
    
    var loadingClass: js.UndefOr[String] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var merge: js.UndefOr[Boolean] = js.native
    
    var mergeFit: js.UndefOr[Boolean] = js.native
    
    var mouseDrag: js.UndefOr[Boolean] = js.native
    
    var nav: js.UndefOr[Boolean] = js.native
    
    var navClass: js.UndefOr[js.Array[String]] = js.native
    
    var navContainer: js.UndefOr[String | Boolean] = js.native
    
    var navContainerClass: js.UndefOr[String] = js.native
    
    var navElement: js.UndefOr[String] = js.native
    
    var navSpeed: js.UndefOr[Double | Boolean] = js.native
    
    var navText: js.UndefOr[js.Array[String]] = js.native
    
    var nestedItemSelector: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[HandlerCallback] = js.native
    
    var onChanged: js.UndefOr[HandlerCallback] = js.native
    
    var onDrag: js.UndefOr[HandlerCallback] = js.native
    
    var onDragged: js.UndefOr[HandlerCallback] = js.native
    
    // EVENTS
    var onInitialize: js.UndefOr[HandlerCallback] = js.native
    
    var onInitialized: js.UndefOr[HandlerCallback] = js.native
    
    var onLoadLazy: js.UndefOr[HandlerCallback] = js.native
    
    var onLoadedLazy: js.UndefOr[HandlerCallback] = js.native
    
    var onPlayVideo: js.UndefOr[HandlerCallback] = js.native
    
    var onRefresh: js.UndefOr[HandlerCallback] = js.native
    
    var onRefreshed: js.UndefOr[HandlerCallback] = js.native
    
    var onResize: js.UndefOr[HandlerCallback] = js.native
    
    var onResized: js.UndefOr[HandlerCallback] = js.native
    
    var onStopVideo: js.UndefOr[HandlerCallback] = js.native
    
    var onTranslate: js.UndefOr[HandlerCallback] = js.native
    
    var onTranslated: js.UndefOr[HandlerCallback] = js.native
    
    var pullDrag: js.UndefOr[Boolean] = js.native
    
    // CLASSES
    var refreshClass: js.UndefOr[String] = js.native
    
    var responsive: js.UndefOr[StringDictionary[Options]] = js.native
    
    var responsiveBaseElement: js.UndefOr[Element] = js.native
    
    var responsiveClass: js.UndefOr[String | Boolean] = js.native
    
    var responsiveRefreshRate: js.UndefOr[Double] = js.native
    
    var rewind: js.UndefOr[Boolean] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var rtlClass: js.UndefOr[String] = js.native
    
    var slideBy: js.UndefOr[Double | String] = js.native
    
    var slideTransition: js.UndefOr[String] = js.native
    
    var smartSpeed: js.UndefOr[Double | Boolean] = js.native
    
    var stageClass: js.UndefOr[String] = js.native
    
    var stageElement: js.UndefOr[String] = js.native
    
    var stageOuterClass: js.UndefOr[String] = js.native
    
    var stagePadding: js.UndefOr[Double] = js.native
    
    var startPosition: js.UndefOr[Double | String] = js.native
    
    var touchDrag: js.UndefOr[Boolean] = js.native
    
    var video: js.UndefOr[Boolean] = js.native
    
    var videoHeight: js.UndefOr[Double | Boolean] = js.native
    
    var videoWidth: js.UndefOr[Double | Boolean] = js.native
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
      def setAnimateIn(value: String | Boolean): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      @scala.inline
      def setAnimateOut(value: String | Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightClass(value: String): Self = StObject.set(x, "autoHeightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightClassUndefined: Self = StObject.set(x, "autoHeightClass", js.undefined)
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayHoverPauseUndefined: Self = StObject.set(x, "autoplayHoverPause", js.undefined)
      
      @scala.inline
      def setAutoplaySpeed(value: Double | Boolean): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      @scala.inline
      def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCheckVisible(value: Boolean): Self = StObject.set(x, "checkVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckVisibleUndefined: Self = StObject.set(x, "checkVisible", js.undefined)
      
      @scala.inline
      def setControlsClass(value: String): Self = StObject.set(x, "controlsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsClassUndefined: Self = StObject.set(x, "controlsClass", js.undefined)
      
      @scala.inline
      def setDotClass(value: String): Self = StObject.set(x, "dotClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotClassUndefined: Self = StObject.set(x, "dotClass", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
      
      @scala.inline
      def setDotsContainer(value: String | Boolean): Self = StObject.set(x, "dotsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsContainerUndefined: Self = StObject.set(x, "dotsContainer", js.undefined)
      
      @scala.inline
      def setDotsData(value: Boolean): Self = StObject.set(x, "dotsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsDataUndefined: Self = StObject.set(x, "dotsData", js.undefined)
      
      @scala.inline
      def setDotsEach(value: Double | Boolean): Self = StObject.set(x, "dotsEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsEachUndefined: Self = StObject.set(x, "dotsEach", js.undefined)
      
      @scala.inline
      def setDotsSpeed(value: Double | Boolean): Self = StObject.set(x, "dotsSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsSpeedUndefined: Self = StObject.set(x, "dotsSpeed", js.undefined)
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      @scala.inline
      def setDragEndSpeed(value: Double | Boolean): Self = StObject.set(x, "dragEndSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragEndSpeedUndefined: Self = StObject.set(x, "dragEndSpeed", js.undefined)
      
      @scala.inline
      def setFallbackEasing(value: String): Self = StObject.set(x, "fallbackEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackEasingUndefined: Self = StObject.set(x, "fallbackEasing", js.undefined)
      
      @scala.inline
      def setFluidSpeed(value: Double | Boolean): Self = StObject.set(x, "fluidSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidSpeedUndefined: Self = StObject.set(x, "fluidSpeed", js.undefined)
      
      @scala.inline
      def setFreeDrag(value: Boolean): Self = StObject.set(x, "freeDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeDragUndefined: Self = StObject.set(x, "freeDrag", js.undefined)
      
      @scala.inline
      def setGrabClass(value: String): Self = StObject.set(x, "grabClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrabClassUndefined: Self = StObject.set(x, "grabClass", js.undefined)
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setItemElement(value: String): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      @scala.inline
      def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadEager(value: Double): Self = StObject.set(x, "lazyLoadEager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadEagerUndefined: Self = StObject.set(x, "lazyLoadEager", js.undefined)
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
      
      @scala.inline
      def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeFit(value: Boolean): Self = StObject.set(x, "mergeFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeFitUndefined: Self = StObject.set(x, "mergeFit", js.undefined)
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      @scala.inline
      def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavClass(value: js.Array[String]): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      @scala.inline
      def setNavClassVarargs(value: String*): Self = StObject.set(x, "navClass", js.Array(value :_*))
      
      @scala.inline
      def setNavContainer(value: String | Boolean): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerClass(value: String): Self = StObject.set(x, "navContainerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerClassUndefined: Self = StObject.set(x, "navContainerClass", js.undefined)
      
      @scala.inline
      def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      @scala.inline
      def setNavElement(value: String): Self = StObject.set(x, "navElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavElementUndefined: Self = StObject.set(x, "navElement", js.undefined)
      
      @scala.inline
      def setNavSpeed(value: Double | Boolean): Self = StObject.set(x, "navSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavSpeedUndefined: Self = StObject.set(x, "navSpeed", js.undefined)
      
      @scala.inline
      def setNavText(value: js.Array[String]): Self = StObject.set(x, "navText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavTextUndefined: Self = StObject.set(x, "navText", js.undefined)
      
      @scala.inline
      def setNavTextVarargs(value: String*): Self = StObject.set(x, "navText", js.Array(value :_*))
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setNestedItemSelector(value: String): Self = StObject.set(x, "nestedItemSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedItemSelectorUndefined: Self = StObject.set(x, "nestedItemSelector", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDragged(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onDragged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDraggedUndefined: Self = StObject.set(x, "onDragged", js.undefined)
      
      @scala.inline
      def setOnInitialize(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitializeUndefined: Self = StObject.set(x, "onInitialize", js.undefined)
      
      @scala.inline
      def setOnInitialized(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      @scala.inline
      def setOnLoadLazy(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onLoadLazy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadLazyUndefined: Self = StObject.set(x, "onLoadLazy", js.undefined)
      
      @scala.inline
      def setOnLoadedLazy(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onLoadedLazy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedLazyUndefined: Self = StObject.set(x, "onLoadedLazy", js.undefined)
      
      @scala.inline
      def setOnPlayVideo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onPlayVideo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayVideoUndefined: Self = StObject.set(x, "onPlayVideo", js.undefined)
      
      @scala.inline
      def setOnRefresh(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      @scala.inline
      def setOnRefreshed(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onRefreshed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRefreshedUndefined: Self = StObject.set(x, "onRefreshed", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnResized(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
      
      @scala.inline
      def setOnStopVideo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onStopVideo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopVideoUndefined: Self = StObject.set(x, "onStopVideo", js.undefined)
      
      @scala.inline
      def setOnTranslate(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTranslate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTranslateUndefined: Self = StObject.set(x, "onTranslate", js.undefined)
      
      @scala.inline
      def setOnTranslated(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onTranslated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTranslatedUndefined: Self = StObject.set(x, "onTranslated", js.undefined)
      
      @scala.inline
      def setPullDrag(value: Boolean): Self = StObject.set(x, "pullDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDragUndefined: Self = StObject.set(x, "pullDrag", js.undefined)
      
      @scala.inline
      def setRefreshClass(value: String): Self = StObject.set(x, "refreshClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshClassUndefined: Self = StObject.set(x, "refreshClass", js.undefined)
      
      @scala.inline
      def setResponsive(value: StringDictionary[Options]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveBaseElement(value: Element): Self = StObject.set(x, "responsiveBaseElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveBaseElementUndefined: Self = StObject.set(x, "responsiveBaseElement", js.undefined)
      
      @scala.inline
      def setResponsiveClass(value: String | Boolean): Self = StObject.set(x, "responsiveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveClassUndefined: Self = StObject.set(x, "responsiveClass", js.undefined)
      
      @scala.inline
      def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlClass(value: String): Self = StObject.set(x, "rtlClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlClassUndefined: Self = StObject.set(x, "rtlClass", js.undefined)
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSlideBy(value: Double | String): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideByUndefined: Self = StObject.set(x, "slideBy", js.undefined)
      
      @scala.inline
      def setSlideTransition(value: String): Self = StObject.set(x, "slideTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideTransitionUndefined: Self = StObject.set(x, "slideTransition", js.undefined)
      
      @scala.inline
      def setSmartSpeed(value: Double | Boolean): Self = StObject.set(x, "smartSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartSpeedUndefined: Self = StObject.set(x, "smartSpeed", js.undefined)
      
      @scala.inline
      def setStageClass(value: String): Self = StObject.set(x, "stageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageClassUndefined: Self = StObject.set(x, "stageClass", js.undefined)
      
      @scala.inline
      def setStageElement(value: String): Self = StObject.set(x, "stageElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageElementUndefined: Self = StObject.set(x, "stageElement", js.undefined)
      
      @scala.inline
      def setStageOuterClass(value: String): Self = StObject.set(x, "stageOuterClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageOuterClassUndefined: Self = StObject.set(x, "stageOuterClass", js.undefined)
      
      @scala.inline
      def setStagePadding(value: Double): Self = StObject.set(x, "stagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagePaddingUndefined: Self = StObject.set(x, "stagePadding", js.undefined)
      
      @scala.inline
      def setStartPosition(value: Double | String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
      
      @scala.inline
      def setURLhashListener(value: Boolean): Self = StObject.set(x, "URLhashListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLhashListenerUndefined: Self = StObject.set(x, "URLhashListener", js.undefined)
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeight(value: Double | Boolean): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoWidth(value: Double | Boolean): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.nextDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.prevDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.toDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.destroyDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.replaceDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.addDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.removeDotowlDotcarousel
    - typings.owlCarousel.owlCarouselStrings.playDotowlDotautoplay
    - typings.owlCarousel.owlCarouselStrings.stopDotowlDotautoplay
  */
  trait TriggerEvent extends StObject
  object TriggerEvent {
    
    @scala.inline
    def addDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.addDotowlDotcarousel = "add.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.addDotowlDotcarousel]
    
    @scala.inline
    def destroyDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.destroyDotowlDotcarousel = "destroy.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.destroyDotowlDotcarousel]
    
    @scala.inline
    def nextDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.nextDotowlDotcarousel = "next.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.nextDotowlDotcarousel]
    
    @scala.inline
    def playDotowlDotautoplay: typings.owlCarousel.owlCarouselStrings.playDotowlDotautoplay = "play.owl.autoplay".asInstanceOf[typings.owlCarousel.owlCarouselStrings.playDotowlDotautoplay]
    
    @scala.inline
    def prevDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.prevDotowlDotcarousel = "prev.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.prevDotowlDotcarousel]
    
    @scala.inline
    def refreshDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel = "refresh.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel]
    
    @scala.inline
    def removeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.removeDotowlDotcarousel = "remove.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.removeDotowlDotcarousel]
    
    @scala.inline
    def replaceDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.replaceDotowlDotcarousel = "replace.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.replaceDotowlDotcarousel]
    
    @scala.inline
    def stopDotowlDotautoplay: typings.owlCarousel.owlCarouselStrings.stopDotowlDotautoplay = "stop.owl.autoplay".asInstanceOf[typings.owlCarousel.owlCarouselStrings.stopDotowlDotautoplay]
    
    @scala.inline
    def toDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.toDotowlDotcarousel = "to.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.toDotowlDotcarousel]
  }
}
