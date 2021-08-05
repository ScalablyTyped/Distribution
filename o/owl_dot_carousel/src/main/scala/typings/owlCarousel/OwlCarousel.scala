package typings.owlCarousel

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OwlCarousel {
  
  @js.native
  trait HandlerCallback extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
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
    
    inline def changeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.changeDotowlDotcarousel = "change.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.changeDotowlDotcarousel]
    
    inline def changedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.changedDotowlDotcarousel = "changed.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.changedDotowlDotcarousel]
    
    inline def dragDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.dragDotowlDotcarousel = "drag.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.dragDotowlDotcarousel]
    
    inline def draggedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.draggedDotowlDotcarousel = "dragged.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.draggedDotowlDotcarousel]
    
    inline def initializeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.initializeDotowlDotcarousel = "initialize.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.initializeDotowlDotcarousel]
    
    inline def initializedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.initializedDotowlDotcarousel = "initialized.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.initializedDotowlDotcarousel]
    
    inline def loadDotowlDotlazy: typings.owlCarousel.owlCarouselStrings.loadDotowlDotlazy = "load.owl.lazy".asInstanceOf[typings.owlCarousel.owlCarouselStrings.loadDotowlDotlazy]
    
    inline def loadedDotowlDotlazy: typings.owlCarousel.owlCarouselStrings.loadedDotowlDotlazy = "loaded.owl.lazy".asInstanceOf[typings.owlCarousel.owlCarouselStrings.loadedDotowlDotlazy]
    
    inline def playDotowlDotvideo: typings.owlCarousel.owlCarouselStrings.playDotowlDotvideo = "play.owl.video".asInstanceOf[typings.owlCarousel.owlCarouselStrings.playDotowlDotvideo]
    
    inline def refreshDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel = "refresh.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel]
    
    inline def refreshedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshedDotowlDotcarousel = "refreshed.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshedDotowlDotcarousel]
    
    inline def resizeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.resizeDotowlDotcarousel = "resize.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.resizeDotowlDotcarousel]
    
    inline def resizedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.resizedDotowlDotcarousel = "resized.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.resizedDotowlDotcarousel]
    
    inline def stopDotowlDotvideo: typings.owlCarousel.owlCarouselStrings.stopDotowlDotvideo = "stop.owl.video".asInstanceOf[typings.owlCarousel.owlCarouselStrings.stopDotowlDotvideo]
    
    inline def translateDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.translateDotowlDotcarousel = "translate.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.translateDotowlDotcarousel]
    
    inline def translatedDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.translatedDotowlDotcarousel = "translated.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.translatedDotowlDotcarousel]
  }
  
  trait Options extends StObject {
    
    var URLhashListener: js.UndefOr[Boolean] = js.undefined
    
    var animateIn: js.UndefOr[String | Boolean] = js.undefined
    
    var animateOut: js.UndefOr[String | Boolean] = js.undefined
    
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    var autoHeightClass: js.UndefOr[String] = js.undefined
    
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
    
    var autoplaySpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var autoplayTimeout: js.UndefOr[Double] = js.undefined
    
    var callbacks: js.UndefOr[Boolean] = js.undefined
    
    var center: js.UndefOr[Boolean] = js.undefined
    
    var checkVisible: js.UndefOr[Boolean] = js.undefined
    
    var controlsClass: js.UndefOr[String] = js.undefined
    
    var dotClass: js.UndefOr[String] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var dotsClass: js.UndefOr[String] = js.undefined
    
    var dotsContainer: js.UndefOr[String | Boolean] = js.undefined
    
    var dotsData: js.UndefOr[Boolean] = js.undefined
    
    var dotsEach: js.UndefOr[Double | Boolean] = js.undefined
    
    var dotsSpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var dragClass: js.UndefOr[String] = js.undefined
    
    var dragEndSpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var fallbackEasing: js.UndefOr[String] = js.undefined
    
    var fluidSpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var freeDrag: js.UndefOr[Boolean] = js.undefined
    
    var grabClass: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[HandlerCallback] = js.undefined
    
    var itemElement: js.UndefOr[String] = js.undefined
    
    // OPTIONS
    var items: js.UndefOr[Double] = js.undefined
    
    var lazyLoad: js.UndefOr[Boolean] = js.undefined
    
    var lazyLoadEager: js.UndefOr[Double] = js.undefined
    
    var loadedClass: js.UndefOr[String] = js.undefined
    
    var loadingClass: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var merge: js.UndefOr[Boolean] = js.undefined
    
    var mergeFit: js.UndefOr[Boolean] = js.undefined
    
    var mouseDrag: js.UndefOr[Boolean] = js.undefined
    
    var nav: js.UndefOr[Boolean] = js.undefined
    
    var navClass: js.UndefOr[js.Array[String]] = js.undefined
    
    var navContainer: js.UndefOr[String | Boolean] = js.undefined
    
    var navContainerClass: js.UndefOr[String] = js.undefined
    
    var navElement: js.UndefOr[String] = js.undefined
    
    var navSpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var navText: js.UndefOr[js.Array[String]] = js.undefined
    
    var nestedItemSelector: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[HandlerCallback] = js.undefined
    
    var onChanged: js.UndefOr[HandlerCallback] = js.undefined
    
    var onDrag: js.UndefOr[HandlerCallback] = js.undefined
    
    var onDragged: js.UndefOr[HandlerCallback] = js.undefined
    
    // EVENTS
    var onInitialize: js.UndefOr[HandlerCallback] = js.undefined
    
    var onInitialized: js.UndefOr[HandlerCallback] = js.undefined
    
    var onLoadLazy: js.UndefOr[HandlerCallback] = js.undefined
    
    var onLoadedLazy: js.UndefOr[HandlerCallback] = js.undefined
    
    var onPlayVideo: js.UndefOr[HandlerCallback] = js.undefined
    
    var onRefresh: js.UndefOr[HandlerCallback] = js.undefined
    
    var onRefreshed: js.UndefOr[HandlerCallback] = js.undefined
    
    var onResize: js.UndefOr[HandlerCallback] = js.undefined
    
    var onResized: js.UndefOr[HandlerCallback] = js.undefined
    
    var onStopVideo: js.UndefOr[HandlerCallback] = js.undefined
    
    var onTranslate: js.UndefOr[HandlerCallback] = js.undefined
    
    var onTranslated: js.UndefOr[HandlerCallback] = js.undefined
    
    var pullDrag: js.UndefOr[Boolean] = js.undefined
    
    // CLASSES
    var refreshClass: js.UndefOr[String] = js.undefined
    
    var responsive: js.UndefOr[StringDictionary[Options]] = js.undefined
    
    var responsiveBaseElement: js.UndefOr[Element] = js.undefined
    
    var responsiveClass: js.UndefOr[String | Boolean] = js.undefined
    
    var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
    
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var rtlClass: js.UndefOr[String] = js.undefined
    
    var slideBy: js.UndefOr[Double | String] = js.undefined
    
    var slideTransition: js.UndefOr[String] = js.undefined
    
    var smartSpeed: js.UndefOr[Double | Boolean] = js.undefined
    
    var stageClass: js.UndefOr[String] = js.undefined
    
    var stageElement: js.UndefOr[String] = js.undefined
    
    var stageOuterClass: js.UndefOr[String] = js.undefined
    
    var stagePadding: js.UndefOr[Double] = js.undefined
    
    var startPosition: js.UndefOr[Double | String] = js.undefined
    
    var touchDrag: js.UndefOr[Boolean] = js.undefined
    
    var video: js.UndefOr[Boolean] = js.undefined
    
    var videoHeight: js.UndefOr[Double | Boolean] = js.undefined
    
    var videoWidth: js.UndefOr[Double | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimateIn(value: String | Boolean): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      inline def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      inline def setAnimateOut(value: String | Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      inline def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightClass(value: String): Self = StObject.set(x, "autoHeightClass", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightClassUndefined: Self = StObject.set(x, "autoHeightClass", js.undefined)
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      inline def setAutoplayHoverPauseUndefined: Self = StObject.set(x, "autoplayHoverPause", js.undefined)
      
      inline def setAutoplaySpeed(value: Double | Boolean): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      inline def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCheckVisible(value: Boolean): Self = StObject.set(x, "checkVisible", value.asInstanceOf[js.Any])
      
      inline def setCheckVisibleUndefined: Self = StObject.set(x, "checkVisible", js.undefined)
      
      inline def setControlsClass(value: String): Self = StObject.set(x, "controlsClass", value.asInstanceOf[js.Any])
      
      inline def setControlsClassUndefined: Self = StObject.set(x, "controlsClass", js.undefined)
      
      inline def setDotClass(value: String): Self = StObject.set(x, "dotClass", value.asInstanceOf[js.Any])
      
      inline def setDotClassUndefined: Self = StObject.set(x, "dotClass", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
      
      inline def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
      
      inline def setDotsContainer(value: String | Boolean): Self = StObject.set(x, "dotsContainer", value.asInstanceOf[js.Any])
      
      inline def setDotsContainerUndefined: Self = StObject.set(x, "dotsContainer", js.undefined)
      
      inline def setDotsData(value: Boolean): Self = StObject.set(x, "dotsData", value.asInstanceOf[js.Any])
      
      inline def setDotsDataUndefined: Self = StObject.set(x, "dotsData", js.undefined)
      
      inline def setDotsEach(value: Double | Boolean): Self = StObject.set(x, "dotsEach", value.asInstanceOf[js.Any])
      
      inline def setDotsEachUndefined: Self = StObject.set(x, "dotsEach", js.undefined)
      
      inline def setDotsSpeed(value: Double | Boolean): Self = StObject.set(x, "dotsSpeed", value.asInstanceOf[js.Any])
      
      inline def setDotsSpeedUndefined: Self = StObject.set(x, "dotsSpeed", js.undefined)
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      inline def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      inline def setDragEndSpeed(value: Double | Boolean): Self = StObject.set(x, "dragEndSpeed", value.asInstanceOf[js.Any])
      
      inline def setDragEndSpeedUndefined: Self = StObject.set(x, "dragEndSpeed", js.undefined)
      
      inline def setFallbackEasing(value: String): Self = StObject.set(x, "fallbackEasing", value.asInstanceOf[js.Any])
      
      inline def setFallbackEasingUndefined: Self = StObject.set(x, "fallbackEasing", js.undefined)
      
      inline def setFluidSpeed(value: Double | Boolean): Self = StObject.set(x, "fluidSpeed", value.asInstanceOf[js.Any])
      
      inline def setFluidSpeedUndefined: Self = StObject.set(x, "fluidSpeed", js.undefined)
      
      inline def setFreeDrag(value: Boolean): Self = StObject.set(x, "freeDrag", value.asInstanceOf[js.Any])
      
      inline def setFreeDragUndefined: Self = StObject.set(x, "freeDrag", js.undefined)
      
      inline def setGrabClass(value: String): Self = StObject.set(x, "grabClass", value.asInstanceOf[js.Any])
      
      inline def setGrabClassUndefined: Self = StObject.set(x, "grabClass", js.undefined)
      
      inline def setInfo(value: HandlerCallback): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setItemElement(value: String): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadEager(value: Double): Self = StObject.set(x, "lazyLoadEager", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadEagerUndefined: Self = StObject.set(x, "lazyLoadEager", js.undefined)
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
      
      inline def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
      
      inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeFit(value: Boolean): Self = StObject.set(x, "mergeFit", value.asInstanceOf[js.Any])
      
      inline def setMergeFitUndefined: Self = StObject.set(x, "mergeFit", js.undefined)
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
      
      inline def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
      
      inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavClass(value: js.Array[String]): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      inline def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      inline def setNavClassVarargs(value: String*): Self = StObject.set(x, "navClass", js.Array(value :_*))
      
      inline def setNavContainer(value: String | Boolean): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      inline def setNavContainerClass(value: String): Self = StObject.set(x, "navContainerClass", value.asInstanceOf[js.Any])
      
      inline def setNavContainerClassUndefined: Self = StObject.set(x, "navContainerClass", js.undefined)
      
      inline def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      inline def setNavElement(value: String): Self = StObject.set(x, "navElement", value.asInstanceOf[js.Any])
      
      inline def setNavElementUndefined: Self = StObject.set(x, "navElement", js.undefined)
      
      inline def setNavSpeed(value: Double | Boolean): Self = StObject.set(x, "navSpeed", value.asInstanceOf[js.Any])
      
      inline def setNavSpeedUndefined: Self = StObject.set(x, "navSpeed", js.undefined)
      
      inline def setNavText(value: js.Array[String]): Self = StObject.set(x, "navText", value.asInstanceOf[js.Any])
      
      inline def setNavTextUndefined: Self = StObject.set(x, "navText", js.undefined)
      
      inline def setNavTextVarargs(value: String*): Self = StObject.set(x, "navText", js.Array(value :_*))
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setNestedItemSelector(value: String): Self = StObject.set(x, "nestedItemSelector", value.asInstanceOf[js.Any])
      
      inline def setNestedItemSelectorUndefined: Self = StObject.set(x, "nestedItemSelector", js.undefined)
      
      inline def setOnChange(value: HandlerCallback): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChanged(value: HandlerCallback): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
      
      inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      inline def setOnDrag(value: HandlerCallback): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDragged(value: HandlerCallback): Self = StObject.set(x, "onDragged", value.asInstanceOf[js.Any])
      
      inline def setOnDraggedUndefined: Self = StObject.set(x, "onDragged", js.undefined)
      
      inline def setOnInitialize(value: HandlerCallback): Self = StObject.set(x, "onInitialize", value.asInstanceOf[js.Any])
      
      inline def setOnInitializeUndefined: Self = StObject.set(x, "onInitialize", js.undefined)
      
      inline def setOnInitialized(value: HandlerCallback): Self = StObject.set(x, "onInitialized", value.asInstanceOf[js.Any])
      
      inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      inline def setOnLoadLazy(value: HandlerCallback): Self = StObject.set(x, "onLoadLazy", value.asInstanceOf[js.Any])
      
      inline def setOnLoadLazyUndefined: Self = StObject.set(x, "onLoadLazy", js.undefined)
      
      inline def setOnLoadedLazy(value: HandlerCallback): Self = StObject.set(x, "onLoadedLazy", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedLazyUndefined: Self = StObject.set(x, "onLoadedLazy", js.undefined)
      
      inline def setOnPlayVideo(value: HandlerCallback): Self = StObject.set(x, "onPlayVideo", value.asInstanceOf[js.Any])
      
      inline def setOnPlayVideoUndefined: Self = StObject.set(x, "onPlayVideo", js.undefined)
      
      inline def setOnRefresh(value: HandlerCallback): Self = StObject.set(x, "onRefresh", value.asInstanceOf[js.Any])
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnRefreshed(value: HandlerCallback): Self = StObject.set(x, "onRefreshed", value.asInstanceOf[js.Any])
      
      inline def setOnRefreshedUndefined: Self = StObject.set(x, "onRefreshed", js.undefined)
      
      inline def setOnResize(value: HandlerCallback): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnResized(value: HandlerCallback): Self = StObject.set(x, "onResized", value.asInstanceOf[js.Any])
      
      inline def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
      
      inline def setOnStopVideo(value: HandlerCallback): Self = StObject.set(x, "onStopVideo", value.asInstanceOf[js.Any])
      
      inline def setOnStopVideoUndefined: Self = StObject.set(x, "onStopVideo", js.undefined)
      
      inline def setOnTranslate(value: HandlerCallback): Self = StObject.set(x, "onTranslate", value.asInstanceOf[js.Any])
      
      inline def setOnTranslateUndefined: Self = StObject.set(x, "onTranslate", js.undefined)
      
      inline def setOnTranslated(value: HandlerCallback): Self = StObject.set(x, "onTranslated", value.asInstanceOf[js.Any])
      
      inline def setOnTranslatedUndefined: Self = StObject.set(x, "onTranslated", js.undefined)
      
      inline def setPullDrag(value: Boolean): Self = StObject.set(x, "pullDrag", value.asInstanceOf[js.Any])
      
      inline def setPullDragUndefined: Self = StObject.set(x, "pullDrag", js.undefined)
      
      inline def setRefreshClass(value: String): Self = StObject.set(x, "refreshClass", value.asInstanceOf[js.Any])
      
      inline def setRefreshClassUndefined: Self = StObject.set(x, "refreshClass", js.undefined)
      
      inline def setResponsive(value: StringDictionary[Options]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveBaseElement(value: Element): Self = StObject.set(x, "responsiveBaseElement", value.asInstanceOf[js.Any])
      
      inline def setResponsiveBaseElementUndefined: Self = StObject.set(x, "responsiveBaseElement", js.undefined)
      
      inline def setResponsiveClass(value: String | Boolean): Self = StObject.set(x, "responsiveClass", value.asInstanceOf[js.Any])
      
      inline def setResponsiveClassUndefined: Self = StObject.set(x, "responsiveClass", js.undefined)
      
      inline def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
      
      inline def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlClass(value: String): Self = StObject.set(x, "rtlClass", value.asInstanceOf[js.Any])
      
      inline def setRtlClassUndefined: Self = StObject.set(x, "rtlClass", js.undefined)
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSlideBy(value: Double | String): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      inline def setSlideByUndefined: Self = StObject.set(x, "slideBy", js.undefined)
      
      inline def setSlideTransition(value: String): Self = StObject.set(x, "slideTransition", value.asInstanceOf[js.Any])
      
      inline def setSlideTransitionUndefined: Self = StObject.set(x, "slideTransition", js.undefined)
      
      inline def setSmartSpeed(value: Double | Boolean): Self = StObject.set(x, "smartSpeed", value.asInstanceOf[js.Any])
      
      inline def setSmartSpeedUndefined: Self = StObject.set(x, "smartSpeed", js.undefined)
      
      inline def setStageClass(value: String): Self = StObject.set(x, "stageClass", value.asInstanceOf[js.Any])
      
      inline def setStageClassUndefined: Self = StObject.set(x, "stageClass", js.undefined)
      
      inline def setStageElement(value: String): Self = StObject.set(x, "stageElement", value.asInstanceOf[js.Any])
      
      inline def setStageElementUndefined: Self = StObject.set(x, "stageElement", js.undefined)
      
      inline def setStageOuterClass(value: String): Self = StObject.set(x, "stageOuterClass", value.asInstanceOf[js.Any])
      
      inline def setStageOuterClassUndefined: Self = StObject.set(x, "stageOuterClass", js.undefined)
      
      inline def setStagePadding(value: Double): Self = StObject.set(x, "stagePadding", value.asInstanceOf[js.Any])
      
      inline def setStagePaddingUndefined: Self = StObject.set(x, "stagePadding", js.undefined)
      
      inline def setStartPosition(value: Double | String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      inline def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
      
      inline def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
      
      inline def setURLhashListener(value: Boolean): Self = StObject.set(x, "URLhashListener", value.asInstanceOf[js.Any])
      
      inline def setURLhashListenerUndefined: Self = StObject.set(x, "URLhashListener", js.undefined)
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoHeight(value: Double | Boolean): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      inline def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setVideoWidth(value: Double | Boolean): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      inline def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
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
    
    inline def addDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.addDotowlDotcarousel = "add.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.addDotowlDotcarousel]
    
    inline def destroyDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.destroyDotowlDotcarousel = "destroy.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.destroyDotowlDotcarousel]
    
    inline def nextDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.nextDotowlDotcarousel = "next.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.nextDotowlDotcarousel]
    
    inline def playDotowlDotautoplay: typings.owlCarousel.owlCarouselStrings.playDotowlDotautoplay = "play.owl.autoplay".asInstanceOf[typings.owlCarousel.owlCarouselStrings.playDotowlDotautoplay]
    
    inline def prevDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.prevDotowlDotcarousel = "prev.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.prevDotowlDotcarousel]
    
    inline def refreshDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel = "refresh.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.refreshDotowlDotcarousel]
    
    inline def removeDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.removeDotowlDotcarousel = "remove.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.removeDotowlDotcarousel]
    
    inline def replaceDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.replaceDotowlDotcarousel = "replace.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.replaceDotowlDotcarousel]
    
    inline def stopDotowlDotautoplay: typings.owlCarousel.owlCarouselStrings.stopDotowlDotautoplay = "stop.owl.autoplay".asInstanceOf[typings.owlCarousel.owlCarouselStrings.stopDotowlDotautoplay]
    
    inline def toDotowlDotcarousel: typings.owlCarousel.owlCarouselStrings.toDotowlDotcarousel = "to.owl.carousel".asInstanceOf[typings.owlCarousel.owlCarouselStrings.toDotowlDotcarousel]
  }
}
