package typings.owlcarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOwlCarouselOptions extends StObject {
  
  var addClassActive: js.UndefOr[Boolean] = js.undefined
  
  var afterAction: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterLazyLoad: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[js.Any] = js.undefined
  
  var baseClass: js.UndefOr[String] = js.undefined
  
  var beforeInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // callbacks
  var beforeUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var dragBeforeAnimFinish: js.UndefOr[Boolean] = js.undefined
  
  // options
  var items: js.UndefOr[Double] = js.undefined
  
  var itemsCustom: js.UndefOr[js.Any] = js.undefined
  
  var itemsDesktop: js.UndefOr[js.Array[Double]] = js.undefined
  
  var itemsDesktopSmall: js.UndefOr[js.Array[Double]] = js.undefined
  
  var itemsMobile: js.UndefOr[js.Array[Double]] = js.undefined
  
  var itemsScaleUp: js.UndefOr[Boolean] = js.undefined
  
  var itemsTablet: js.UndefOr[js.Array[Double]] = js.undefined
  
  var itemsTabletSmall: js.UndefOr[js.Any] = js.undefined
  
  var jsonPath: js.UndefOr[js.Any] = js.undefined
  
  var jsonSuccess: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  
  var lazyEffect: js.UndefOr[js.Any] = js.undefined
  
  var lazyFollow: js.UndefOr[Boolean] = js.undefined
  
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  
  var nav: js.UndefOr[Boolean] = js.undefined
  
  var navigation: js.UndefOr[Boolean] = js.undefined
  
  var navigationText: js.UndefOr[js.Any] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  var paginationNumbers: js.UndefOr[Boolean] = js.undefined
  
  var paginationSpeed: js.UndefOr[Double] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var responsiveBaseWidth: js.UndefOr[JQuery | String] = js.undefined
  
  var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
  
  var rewindNav: js.UndefOr[Boolean] = js.undefined
  
  var rewindSpeed: js.UndefOr[Double] = js.undefined
  
  var scrollPerPage: js.UndefOr[Boolean] = js.undefined
  
  var singleItem: js.UndefOr[Boolean] = js.undefined
  
  var slideSpeed: js.UndefOr[Double] = js.undefined
  
  var startDragging: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var stopOnHover: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var touchDrag: js.UndefOr[Boolean] = js.undefined
  
  var transitionStyle: js.UndefOr[js.Any] = js.undefined
}
object IOwlCarouselOptions {
  
  inline def apply(): IOwlCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOwlCarouselOptions]
  }
  
  extension [Self <: IOwlCarouselOptions](x: Self) {
    
    inline def setAddClassActive(value: Boolean): Self = StObject.set(x, "addClassActive", value.asInstanceOf[js.Any])
    
    inline def setAddClassActiveUndefined: Self = StObject.set(x, "addClassActive", js.undefined)
    
    inline def setAfterAction(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterAction", js.Any.fromFunction1(value))
    
    inline def setAfterActionUndefined: Self = StObject.set(x, "afterAction", js.undefined)
    
    inline def setAfterInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setAfterLazyLoad(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterLazyLoad", js.Any.fromFunction1(value))
    
    inline def setAfterLazyLoadUndefined: Self = StObject.set(x, "afterLazyLoad", js.undefined)
    
    inline def setAfterMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterMove", js.Any.fromFunction1(value))
    
    inline def setAfterMoveUndefined: Self = StObject.set(x, "afterMove", js.undefined)
    
    inline def setAfterUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    inline def setAutoPlay(value: js.Any): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    inline def setBeforeInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1(value))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setBeforeMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeMove", js.Any.fromFunction1(value))
    
    inline def setBeforeMoveUndefined: Self = StObject.set(x, "beforeMove", js.undefined)
    
    inline def setBeforeUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setDragBeforeAnimFinish(value: Boolean): Self = StObject.set(x, "dragBeforeAnimFinish", value.asInstanceOf[js.Any])
    
    inline def setDragBeforeAnimFinishUndefined: Self = StObject.set(x, "dragBeforeAnimFinish", js.undefined)
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsCustom(value: js.Any): Self = StObject.set(x, "itemsCustom", value.asInstanceOf[js.Any])
    
    inline def setItemsCustomUndefined: Self = StObject.set(x, "itemsCustom", js.undefined)
    
    inline def setItemsDesktop(value: js.Array[Double]): Self = StObject.set(x, "itemsDesktop", value.asInstanceOf[js.Any])
    
    inline def setItemsDesktopSmall(value: js.Array[Double]): Self = StObject.set(x, "itemsDesktopSmall", value.asInstanceOf[js.Any])
    
    inline def setItemsDesktopSmallUndefined: Self = StObject.set(x, "itemsDesktopSmall", js.undefined)
    
    inline def setItemsDesktopSmallVarargs(value: Double*): Self = StObject.set(x, "itemsDesktopSmall", js.Array(value :_*))
    
    inline def setItemsDesktopUndefined: Self = StObject.set(x, "itemsDesktop", js.undefined)
    
    inline def setItemsDesktopVarargs(value: Double*): Self = StObject.set(x, "itemsDesktop", js.Array(value :_*))
    
    inline def setItemsMobile(value: js.Array[Double]): Self = StObject.set(x, "itemsMobile", value.asInstanceOf[js.Any])
    
    inline def setItemsMobileUndefined: Self = StObject.set(x, "itemsMobile", js.undefined)
    
    inline def setItemsMobileVarargs(value: Double*): Self = StObject.set(x, "itemsMobile", js.Array(value :_*))
    
    inline def setItemsScaleUp(value: Boolean): Self = StObject.set(x, "itemsScaleUp", value.asInstanceOf[js.Any])
    
    inline def setItemsScaleUpUndefined: Self = StObject.set(x, "itemsScaleUp", js.undefined)
    
    inline def setItemsTablet(value: js.Array[Double]): Self = StObject.set(x, "itemsTablet", value.asInstanceOf[js.Any])
    
    inline def setItemsTabletSmall(value: js.Any): Self = StObject.set(x, "itemsTabletSmall", value.asInstanceOf[js.Any])
    
    inline def setItemsTabletSmallUndefined: Self = StObject.set(x, "itemsTabletSmall", js.undefined)
    
    inline def setItemsTabletUndefined: Self = StObject.set(x, "itemsTablet", js.undefined)
    
    inline def setItemsTabletVarargs(value: Double*): Self = StObject.set(x, "itemsTablet", js.Array(value :_*))
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setJsonPath(value: js.Any): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
    
    inline def setJsonSuccess(value: /* data */ js.Any => Unit): Self = StObject.set(x, "jsonSuccess", js.Any.fromFunction1(value))
    
    inline def setJsonSuccessUndefined: Self = StObject.set(x, "jsonSuccess", js.undefined)
    
    inline def setLazyEffect(value: js.Any): Self = StObject.set(x, "lazyEffect", value.asInstanceOf[js.Any])
    
    inline def setLazyEffectUndefined: Self = StObject.set(x, "lazyEffect", js.undefined)
    
    inline def setLazyFollow(value: Boolean): Self = StObject.set(x, "lazyFollow", value.asInstanceOf[js.Any])
    
    inline def setLazyFollowUndefined: Self = StObject.set(x, "lazyFollow", js.undefined)
    
    inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
    
    inline def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
    
    inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationText(value: js.Any): Self = StObject.set(x, "navigationText", value.asInstanceOf[js.Any])
    
    inline def setNavigationTextUndefined: Self = StObject.set(x, "navigationText", js.undefined)
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationNumbers(value: Boolean): Self = StObject.set(x, "paginationNumbers", value.asInstanceOf[js.Any])
    
    inline def setPaginationNumbersUndefined: Self = StObject.set(x, "paginationNumbers", js.undefined)
    
    inline def setPaginationSpeed(value: Double): Self = StObject.set(x, "paginationSpeed", value.asInstanceOf[js.Any])
    
    inline def setPaginationSpeedUndefined: Self = StObject.set(x, "paginationSpeed", js.undefined)
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveBaseWidth(value: JQuery | String): Self = StObject.set(x, "responsiveBaseWidth", value.asInstanceOf[js.Any])
    
    inline def setResponsiveBaseWidthUndefined: Self = StObject.set(x, "responsiveBaseWidth", js.undefined)
    
    inline def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
    
    inline def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRewindNav(value: Boolean): Self = StObject.set(x, "rewindNav", value.asInstanceOf[js.Any])
    
    inline def setRewindNavUndefined: Self = StObject.set(x, "rewindNav", js.undefined)
    
    inline def setRewindSpeed(value: Double): Self = StObject.set(x, "rewindSpeed", value.asInstanceOf[js.Any])
    
    inline def setRewindSpeedUndefined: Self = StObject.set(x, "rewindSpeed", js.undefined)
    
    inline def setScrollPerPage(value: Boolean): Self = StObject.set(x, "scrollPerPage", value.asInstanceOf[js.Any])
    
    inline def setScrollPerPageUndefined: Self = StObject.set(x, "scrollPerPage", js.undefined)
    
    inline def setSingleItem(value: Boolean): Self = StObject.set(x, "singleItem", value.asInstanceOf[js.Any])
    
    inline def setSingleItemUndefined: Self = StObject.set(x, "singleItem", js.undefined)
    
    inline def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    inline def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
    
    inline def setStartDragging(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "startDragging", js.Any.fromFunction1(value))
    
    inline def setStartDraggingUndefined: Self = StObject.set(x, "startDragging", js.undefined)
    
    inline def setStopOnHover(value: Boolean): Self = StObject.set(x, "stopOnHover", value.asInstanceOf[js.Any])
    
    inline def setStopOnHoverUndefined: Self = StObject.set(x, "stopOnHover", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
    
    inline def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
    
    inline def setTransitionStyle(value: js.Any): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
    
    inline def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
  }
}
